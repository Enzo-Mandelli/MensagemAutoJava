/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package msg.mensagemauto;
import HorarioManager.ObterHorarios;
import Dados.Csv;
import Interfaces.Home;
import Interfaces.Telas;
import com.opencsv.exceptions.CsvException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import msg.mensagemauto.Mensagem;
import msg.mensagemauto.UtillMsg;
/**
 *
 * @author Mandelli
 */
public class AdminForever implements Runnable{
    public static int posMensagem = 0;
    public static int posPessoa = 1;
    public static int posHorario = 2;
    public static int posWeek = 3;
    public boolean horarioCerto = false;
    public boolean refresh = false;
    public  List<String[]> dados;
    boolean reconectar = false;
    public boolean ligado = false;
    public int aux = -1;
    @Override
    public void run(){
        try {
            String horario;
            dados = lerDados();
            int i = UtillMsg.idNextHorario(dados);
            horario = dados.get(i)[posHorario];
            String horarioAtual;
            while(true){
                Telas.monitoria.statusMainLoop(true);
                Telas.monitoria.statusThread(ligado);
                while(ligado){
                    i = UtillMsg.idNextHorario(dados);
                    horarioAtual = ObterHorarios.shorarioFormatado();
                    horario = dados.get(i)[posHorario];
                    if(UtillMsg.validDayWeek(dados.get(i)[posWeek])){
                        Telas.monitoria.setIndex(String.valueOf(i));
                        Telas.monitoria.setNextMsg(dados.get(i)[posMensagem]);
                        Telas.monitoria.setHorarioAtual(horarioAtual);
                        Telas.monitoria.setHorarioMsg(horario);
                        Telas.monitoria.statusDayWeek(UtillMsg.validDayWeek(dados.get(i)[posWeek]));
                        Telas.monitoria.statusHorario(horario.equals(horarioAtual));
                    }
                    if(refresh){
                        refresh = false;
                        dados = lerDados();
                        i = UtillMsg.idNextHorario(dados);
                        horario = dados.get(i)[posHorario];
                    }
                    
                    if(horario.equals(horarioAtual) && aux != i){
                        if(reconectar){
                            Mensagem.mandaMensagemReconnect(dados.get(i)[posPessoa],dados.get(i)[posMensagem]);
                        }else{
                            Mensagem.mandaMensagem(dados.get(i)[posPessoa],dados.get(i)[posMensagem]);
                        }
                        
                        aux = i;
                    }

                    if(i == dados.size()-1) i = 0;
                    Thread.sleep(20000);
                    
                }
                Telas.monitoria.statusMainLoop(false);
                Thread.sleep(20000);
            }
                   
        }catch (IOException ex) {
            Telas.falha.setVisible(true);
        } catch (CsvException ex) {
            Telas.falha.setVisible(true);
            Logger.getLogger(AdminForever.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(AdminForever.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public List<String[]> lerDados() throws IOException, CsvException{
        dados = Csv.sreaderCsv(Home.caminho);
        dados = UtillMsg.ordenarPorHorario(dados);
        return dados;
    }

    public void reconnect() {
         reconectar = !reconectar;
    }
    
}

