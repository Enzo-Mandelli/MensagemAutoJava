package Interfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mandelli
 */
public class Telas {
    public static Home home = new Home();
    
    public static SelectMsg select = new SelectMsg();
    public static SetMsgs setMsg = new SetMsgs();
    public static Sucess sucesso = new Sucess();
    public static Fail falha = new Fail();
    public static MonitorDebugger monitoria = new MonitorDebugger();
    public static void addItemCbBox(String item){
        select.setMensagens(item);
    }
    
    
}
