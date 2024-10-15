/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;
import Interfaces.Telas;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mandelli
 */
//id, mensagem, pessoa, horario, week
public class Csv {
    public String nomeArquivo = "C:\\Users\\Mandelli\\Documents\\NetBeansProjects\\MensagemAuto\\src\\main\\java\\Dados\\msgs.csv";
    public static String snomeArquivo = "C:\\Users\\Mandelli\\Documents\\NetBeansProjects\\MensagemAuto\\src\\main\\java\\Dados\\msgs.csv";
    public void writerCSV(String caminho, String[] dados) {
        try {
            List<String[]> linhas = readerCsv(caminho);
            CSVWriter writer = new CSVWriter(new FileWriter(nomeArquivo));
            writer.writeAll(linhas);
            writer.writeNext(dados);
            writer.close();
            System.out.println("Arquivo CSV criado com sucesso!");
        } catch (IOException ex) {
            Telas.falha.setVisible(true);
            Logger.getLogger(Csv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void swriterCSV(String caminho, String[] dados) {
        try {
            snomeArquivo = caminho;
            List<String[]> linhas = sreaderCsv(caminho);
            CSVWriter writer = new CSVWriter(new FileWriter(snomeArquivo));
            writer.writeAll(linhas);
            writer.writeNext(dados);
            writer.close();
            System.out.println("Arquivo CSV criado com sucesso!");
        } catch (Exception e) {
            Telas.falha.setVisible(true);
        }
    }
     public static void sPureWriterCSV(String caminho){
        snomeArquivo = caminho;
        try{
            List<String[]> linhas = sreaderCsv(caminho);
            CSVWriter writer = new CSVWriter(new FileWriter(snomeArquivo));
            writer.writeAll(linhas);
            writer.close();
        }catch(Exception e){
            try {
                String[] dados = {" ", " ", "-1:-1", "0000000"};
                CSVWriter writer = new CSVWriter(new FileWriter(snomeArquivo));
                writer.writeNext(dados);
                writer.close();
                System.out.println("Arquivo CSV criado com sucesso!");
            } catch (IOException ex) {
                Telas.falha.setVisible(true);
            }
        }
        
    }
    

    public static List sreaderCsv(String caminho) {
        snomeArquivo = caminho;
        List<String[]> linhas = null;
        try (CSVReader reader = new CSVReaderBuilder(new FileReader(snomeArquivo))
                .build()) {
            linhas = reader.readAll();
        } catch (Exception e) {
            Telas.falha.setVisible(true);
        }
        return linhas;
    }
    
    public static boolean sreaderCsvIsPossible(String caminho) {
        snomeArquivo = caminho;
        List<String[]> linhas = null;
        try (CSVReader reader = new CSVReaderBuilder(new FileReader(snomeArquivo))
                .build()) {
            linhas = reader.readAll();
            return true;
        } catch (Exception e) {
            Telas.falha.setVisible(true);
            return false;
        }
    }

    public List readerCsv(String caminho) {
        List<String[]> linhas = null;
        try {
            CSVReader reader = new CSVReaderBuilder(new FileReader(nomeArquivo))
                    .build();
            linhas = reader.readAll();
            reader.close();
            return linhas;
         } catch (Exception e) {
            Telas.falha.setVisible(true);
        }
        return linhas;
    }
    
    public static void sRemove(List<String[]> lista,int indexRemove, String caminho){
        try {
            snomeArquivo = caminho;
            CSVWriter writer = new CSVWriter(new FileWriter(snomeArquivo));
            for(int i = 0; i < lista.size(); i++){
                if(i != indexRemove) writer.writeNext(lista.get(i));
            }
            writer.close();
            System.out.println("linha CSV deletado");
        } catch (IOException ex) {
            Telas.falha.setVisible(true);
            Logger.getLogger(Csv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Remove(String caminho, int indexRemove){
        try {
            List<String[]> linhas = sreaderCsv(caminho);
            CSVWriter writer = new CSVWriter(new FileWriter(snomeArquivo));
            for(int i = 0; i < linhas.size(); i++){
                if(i != indexRemove) writer.writeNext(linhas.get(i));
            }
            writer.close();
            System.out.println("Arquivo CSV criado com sucesso!");
        } catch (IOException ex) {
            Telas.falha.setVisible(true);
            Logger.getLogger(Csv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}



