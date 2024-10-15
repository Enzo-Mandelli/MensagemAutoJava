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
public class Escrever  {
    public static int delayTime = 150;
    
    public static void write(String frase){
        try{
            
            Robot robot = new Robot();
            char[] letras = frase.toLowerCase().toCharArray();
            for(int i = 0; i < letras.length; i++){
                robot.delay(delayTime);
                switch(letras[i]){
                    case ' ' -> {
                        robot.keyPress(KeyEvent.VK_SPACE);
                        robot.keyRelease(KeyEvent.VK_SPACE);

                    }
                    case 'a' -> {
                        robot.keyPress(KeyEvent.VK_A);
                        robot.keyRelease(KeyEvent.VK_A);
                    }
                    case 'b' -> {
                        robot.keyPress(KeyEvent.VK_B);
                        robot.keyRelease(KeyEvent.VK_B);
                    }
                    case 'c' -> {
                        robot.keyPress(KeyEvent.VK_C);
                        robot.keyRelease(KeyEvent.VK_C);
                    }
                    case 'd' -> {
                        robot.keyPress(KeyEvent.VK_D);
                        robot.keyRelease(KeyEvent.VK_D);
                    }
                    case 'e' -> {
                        robot.keyPress(KeyEvent.VK_E);
                        robot.keyRelease(KeyEvent.VK_E);
                    }
                    case 'f' -> {
                        robot.keyPress(KeyEvent.VK_F);
                        robot.keyRelease(KeyEvent.VK_F);
                    }
                    case 'g' -> {
                        robot.keyPress(KeyEvent.VK_G);
                        robot.keyRelease(KeyEvent.VK_G);
                    }
                    case 'h' -> {
                        robot.keyPress(KeyEvent.VK_H);
                        robot.keyRelease(KeyEvent.VK_H);
                    }
                    case 'i' -> {
                        robot.keyPress(KeyEvent.VK_I);
                        robot.keyRelease(KeyEvent.VK_I);
                    }
                    case 'j' -> {
                        robot.keyPress(KeyEvent.VK_J);
                        robot.keyRelease(KeyEvent.VK_J);
                    }
                    case 'k' -> {
                        robot.keyPress(KeyEvent.VK_K);
                        robot.keyRelease(KeyEvent.VK_K);
                    }
                    case 'l' -> {
                        robot.keyPress(KeyEvent.VK_L);
                        robot.keyRelease(KeyEvent.VK_L);
                    }
                    case 'm' -> {
                        robot.keyPress(KeyEvent.VK_M);
                        robot.keyRelease(KeyEvent.VK_M);
                    }
                    case 'n' -> {
                        robot.keyPress(KeyEvent.VK_N);
                        robot.keyRelease(KeyEvent.VK_N);
                    }
                    case 'o' -> {
                        robot.keyPress(KeyEvent.VK_O);
                        robot.keyRelease(KeyEvent.VK_O);
                    }
                    case 'p' -> {
                        robot.keyPress(KeyEvent.VK_P);
                        robot.keyRelease(KeyEvent.VK_P);
                    }
                    case 'q' -> {
                        robot.keyPress(KeyEvent.VK_Q);
                        robot.keyRelease(KeyEvent.VK_Q);
                    }
                    case 'r' -> {
                        robot.keyPress(KeyEvent.VK_R);
                        robot.keyRelease(KeyEvent.VK_R);
                    }
                    case 's' -> {
                        robot.keyPress(KeyEvent.VK_S);
                        robot.keyRelease(KeyEvent.VK_S);
                    }
                    case 't' -> {
                        robot.keyPress(KeyEvent.VK_T);
                        robot.keyRelease(KeyEvent.VK_T);
                    }
                    case 'u' -> {
                        robot.keyPress(KeyEvent.VK_U);
                        robot.keyRelease(KeyEvent.VK_U);
                    }
                    case 'v' -> {
                        robot.keyPress(KeyEvent.VK_V);
                        robot.keyRelease(KeyEvent.VK_V);
                    }
                    case 'w' -> {
                        robot.keyPress(KeyEvent.VK_W);
                        robot.keyRelease(KeyEvent.VK_W);
                    }
                    case 'x' -> {
                        robot.keyPress(KeyEvent.VK_X);
                        robot.keyRelease(KeyEvent.VK_X);
                    }
                    case 'y' -> {
                        robot.keyPress(KeyEvent.VK_Y);
                        robot.keyRelease(KeyEvent.VK_Y);
                    }
                    case 'z' -> {
                        robot.keyPress(KeyEvent.VK_Z);
                        robot.keyRelease(KeyEvent.VK_Z);
                    }
                    case '0' -> {
                        robot.keyPress(KeyEvent.VK_0);
                        robot.keyRelease(KeyEvent.VK_0);
                    }
                    case '1' -> {
                        robot.keyPress(KeyEvent.VK_1);
                        robot.keyRelease(KeyEvent.VK_1);
                    }
                    case '2' -> {
                        robot.keyPress(KeyEvent.VK_2);
                        robot.keyRelease(KeyEvent.VK_2);
                    }
                    case '3' -> {
                        robot.keyPress(KeyEvent.VK_3);
                        robot.keyRelease(KeyEvent.VK_3);
                    }
                    case '4' -> {
                        robot.keyPress(KeyEvent.VK_4);
                        robot.keyRelease(KeyEvent.VK_4);
                    }
                    case '5' -> {
                        robot.keyPress(KeyEvent.VK_5);
                        robot.keyRelease(KeyEvent.VK_5);
                    }
                    case '6' -> {
                        robot.keyPress(KeyEvent.VK_6);
                        robot.keyRelease(KeyEvent.VK_6);
                    }
                    case '7' -> {
                        robot.keyPress(KeyEvent.VK_7);
                        robot.keyRelease(KeyEvent.VK_7);
                    }
                    case '8' -> {
                        robot.keyPress(KeyEvent.VK_8);
                        robot.keyRelease(KeyEvent.VK_8);
                    }
                    case '9' -> {
                        robot.keyPress(KeyEvent.VK_9);
                        robot.keyRelease(KeyEvent.VK_9);
                    }
                    case '?' -> {
                       
                        robot.delay(delayTime);
                        robot.keyPress(KeyEvent.VK_ALT);
                        robot.delay(delayTime);
                        robot.keyPress(KeyEvent.VK_CONTROL); 
                        robot.keyPress(KeyEvent.VK_W);
                        robot.delay(900);
                        robot.keyRelease(KeyEvent.VK_W);
                        robot.delay(delayTime);
                        robot.keyRelease(KeyEvent.VK_ALT);
                        robot.delay(delayTime);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.delay(delayTime);
                    }
                }
                robot.delay(delayTime);
            }
        }catch(AWTException e){
            e.printStackTrace();
        }
    }
    
    public static void enter(){
        try{
            Robot robot = new Robot();
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(200);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        }catch(AWTException e){
            e.printStackTrace();
        }
    }
    
    public static void tab(){
        try{
            Robot robot = new Robot();
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.delay(200);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.delay(200);
        }catch(AWTException e){
            e.printStackTrace();
        }
    }
    
    public static void windowsKey(){
        try {
            
            Robot robot = new Robot();
            // Cria um delay de 5 seguno    dos de modo que você possa abrir o notepad antes da execução do código a seguir
            // Robot começa a escrever  
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.delay(delayTime);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            robot.delay(delayTime);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    public static void altF4(){
        try {
            
            Robot robot = new Robot();
            // Cria um delay de 5 seguno    dos de modo que você possa abrir o notepad antes da execução do código a seguir
            // Robot começa a escrever  
            robot.keyPress(KeyEvent.VK_ALT);
            robot.delay(delayTime);
            robot.keyPress(KeyEvent.VK_F4);
            robot.delay(delayTime);
            robot.keyRelease(KeyEvent.VK_ALT);
            robot.delay(delayTime);
            robot.keyRelease(KeyEvent.VK_F4);
            robot.delay(delayTime);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    public static void delay(int ms){
        try {
            
            Robot robot = new Robot();
            robot.delay(ms);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
        
}
