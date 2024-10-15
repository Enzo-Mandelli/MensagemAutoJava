/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package msg.mensagemauto;
import HorarioManager.*;
import java.util.List;
/**
 *
 * @author Mandelli
 */
public class UtillMsg{
    public static int posHorario = 2;
    public static int posWeek = 3;
    public static List<String[]> ordenarPorHorario(List<String[]> dados){
        for(int i = 0; i < dados.size(); i++){
            for(int j = 0; j < dados.size(); j++){
                if(UtilidadesHorario.comparaMenor(dados.get(i)[posHorario], dados.get(j)[posHorario])){
                    String[] aux = dados.get(j);
                    dados.set(j, dados.get(i));
                    dados.set(i, aux);
                }
            }
        }
        return dados;
    }
    
    public static int idNextHorario(List<String[]> dados){
        dados = ordenarPorHorario(dados);
        int outputID = 0;
        for(int i = 0; i < dados.size(); i++){
            outputID = i;
            if(UtilidadesHorario.comparaMaiorIgual(dados.get(i)[posHorario], ObterHorarios.shorarioFormatado()) 
                    && validDayWeek(dados.get(i)[posWeek])) break;
            if(outputID >= dados.size()) outputID--;
        }
        return outputID;
    }
    public static int idNextHorarioExclusivo(List<String[]> dados, int idAtual){
        dados = ordenarPorHorario(dados);
        int outputID = 0;
        for(int i = 0; i < dados.size(); i++){
            outputID = i;
            if(UtilidadesHorario.comparaMaiorIgual(dados.get(i)[posHorario], ObterHorarios.shorarioFormatado()) 
                    && validDayWeek(dados.get(i)[posWeek]) && i != idAtual) break;
            System.out.println(validDayWeek(dados.get(i)[posWeek]));
            if(outputID >= dados.size()) outputID--;
        }
        return outputID;
    }
    
    public static boolean validDayWeek(String hashWeek){
        String diaAtual = ObterHorarios.obterDiaDaSemana();
        String[] hashSliced = hashWeek.split("");
        boolean output = false;
        for(int i = 0; i < hashSliced.length; i++){
            if(hashSliced[i].equals(diaAtual)){
                output = true;
            }
        }
        return output;
    }
    
}
