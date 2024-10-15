/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package msg.mensagemauto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author Mandelli
 */
public class Mensagem extends Escrever{
    public static void abreWpp(){
        try {
            Robot robot = new Robot();
            windowsKey();
            Escrever.write("whatsapp");
            enter();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    public static void abreWppDefault(){
        try {
            Robot robot = new Robot();
            windowsKey();
            Escrever.write("whatsapp");
            enter();
            altF4();
            windowsKey();
            Escrever.write("whatsapp");
            enter();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    public static void reconnect(){
        for(int i = 0; i < 6; i++){
            tab();
        }
        enter();
        enter();
    }
    
    public static void mandaMensagemReconnect(String pessoa, String mensagem){
        abreWppDefault();
        delay(5000);
        reconnect();
        tab();
        write(pessoa);
        tab();
        enter();
        write(mensagem);
        enter();
    }
    
    public static void mandaMensagem(String pessoa, String mensagem){
        abreWppDefault();
        write(pessoa);
        tab();
        enter();
        write(mensagem);
        enter();
    }
    
    
    
}
