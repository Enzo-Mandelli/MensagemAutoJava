/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package msg.mensagemauto;

/**
 *
 * @author Mandelli
 */
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MensagemDagao implements Runnable {
    public static String pessoa = "piquitita";
    public static boolean ligado = false;
    public static boolean end = true;
    @Override
    public void run() {
        while(true){
            int cont = 0;
            while(ligado){
                if(cont == 0){
                    teste();
                    Escrever.write("on");
                    cont++;
                }
                ZonedDateTime horarioAtual = obterHorarioBrasilia();
                DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm");
                String horarioFormatado = horarioAtual.format(formatador);
                switch(horarioCorreto(horarioFormatado)){
                    case 0 -> {

                        processoWpp();
                        Escrever.write("tomou cafe da manha?");
                        enter();
                        Escrever.write("lembra do remedinho");
                        enter();
                        Escrever.write("lembrou de fazer a marmitinha?");
                        enter();
                        delay();
                    }
                    case 1 -> {
                        processoWpp();
                        Escrever.write("almocou?");
                        enter();
                        Escrever.write("toma o remedio do ferro");
                        enter();
                        delay();
                    }
                    case 2 -> {
                        processoWpp();
                        Escrever.write("jantou?");
                        enter();
                        Escrever.write("lembra de fazer a marmitinha");
                        enter();
                        delay();
                    }
                    case 3 -> {
                        processoWpp();
                        Escrever.write("teste?");
                        enter();
                        delay();
                    }
                }
            }
            if(end){
                teste();
                Escrever.write("off");
                end = false;
            }
        }
    }
    public static void processoWpp(){
        try {
            
            Robot robot = new Robot();
            // Cria um delay de 5 seguno    dos de modo que você possa abrir o notepad antes da execução do código a seguir
            // Robot começa a escrever
            abreWpp();
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_F4);
            robot.keyRelease(KeyEvent.VK_ALT);
            robot.keyRelease(KeyEvent.VK_F4);
            abreWpp();
            robot.delay(2000);
            for(int i = 0; i < 6; i++){
                tab();
            }
            enter();
            enter();
            tab();
            Escrever.write(pessoa);
            tab();
            enter();
            
            
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    public static void teste(){
        try {
            
            Robot robot = new Robot();
            // Cria um delay de 5 seguno    dos de modo que você possa abrir o notepad antes da execução do código a seguir
            // Robot começa a escrever  
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            robot.delay(500);
            Escrever.write("bloco");
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(500);
            Escrever.write("teste?");
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    public static void abreWpp(){
        try {
            
            Robot robot = new Robot();
            // Cria um delay de 5 seguno    dos de modo que você possa abrir o notepad antes da execução do código a seguir
            // Robot começa a escrever  
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            robot.delay(500);
            Escrever.write("wha");
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    public static void tab(){
        try{
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_TAB);
            robot.delay(600);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.delay(600);
        }catch(AWTException e){
            e.printStackTrace();
        }
    }
    
    public static void delay(){
        try{
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
            robot.delay(55000);
        }catch(AWTException e){
            e.printStackTrace();
        }
    }
    
    
    public static void enter(){
        try{
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(500);
        }catch(AWTException e){
            e.printStackTrace();
        }
    }
 
    
 
    
     public static ZonedDateTime obterHorarioBrasilia() {
        // Fuso horário de Brasília (UTC-3)
        ZoneId zonaHorariaBrasilia = ZoneId.of("America/Sao_Paulo");

        // Obter a data e hora atual no fuso horário de Brasília
        ZonedDateTime agoraBrasilia = ZonedDateTime.now(zonaHorariaBrasilia);
                
                

        return agoraBrasilia;
    }
     
     public static int horarioCorreto(String horarioFormatado){
         int op = 0;
         op = switch (horarioFormatado) {
            case "05:45" -> 0;
            case "12:30" -> 1;
            case "20:00" -> 2;
            case "17:-29" -> 3;
            default -> 21;
        };
         return op;
     }
     
}