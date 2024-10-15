/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HorarioManager;

/**
 *
 * @author Mandelli
 */
public class UtilidadesHorario {
    public static boolean comparaMaior(String horario1, String horario2){
        int hora1 = formataHorario(horario1)[0];
        int minuto1 = formataHorario(horario1)[1];
        int hora2 = formataHorario(horario2)[0];
        int minuto2 = formataHorario(horario2)[1];
        if(hora1 > hora2){
            return true;
        }else if(hora1 < hora2){
            return false;
        }else{
            if(minuto1 > minuto2){
                return true;
            }else{
                return false;
            }
        }
    }
    public static boolean comparaMaiorIgual(String horario1, String horario2){
        int hora1 = formataHorario(horario1)[0];
        int minuto1 = formataHorario(horario1)[1];
        int hora2 = formataHorario(horario2)[0];
        int minuto2 = formataHorario(horario2)[1];
        if(hora1 > hora2){
            return true;
        }else if(hora1 < hora2){
            return false;
        }else{
            if(minuto1 >= minuto2){
                return true;
            }else{
                return false;
            }
        }
    }
    
    public static boolean comparaMenor(String horario1, String horario2){
        int hora1 = formataHorario(horario1)[0];
        int minuto1 = formataHorario(horario1)[1];
        int hora2 = formataHorario(horario2)[0];
        int minuto2 = formataHorario(horario2)[1];
        if(hora1 > hora2){
            return false;
        }else if(hora1 < hora2){
            return true;
        }else{
            if(minuto1 > minuto2){
                return false;
            }else{
                return true;
            }
        }
    }
    public static boolean comparaMenorIgual(String horario1, String horario2){
        int hora1 = formataHorario(horario1)[0];
        int minuto1 = formataHorario(horario1)[1];
        int hora2 = formataHorario(horario2)[0];
        int minuto2 = formataHorario(horario2)[1];
        if(hora1 > hora2){
            return false;
        }else if(hora1 <= hora2){
            return true;
        }else{
            if(minuto1 > minuto2){
                return false;
            }else{
                return true;
            }
        }
    }
    
    public static void sumHora(String horarioNFormatado, String horarioNFormatadoSum){
        int[] horario = formataHorario(horarioNFormatado);
        int[] horario2 = formataHorario(horarioNFormatadoSum);
        if(horario[1] + horario2[1] > 60){
            horario[0]++;
            horario[1] = horario[1] + horario2[1] - 60;
        }else{
            horario[1] = horario[1] + horario2[1];
        }
        if(horario[0] + horario2[0] > 23){
            horario[1] = horario[0] + horario2[0] - 24;
        }else{
            horario[1] = horario[0] + horario2[0];
        }
    }
    
    public static void subtractHora(String horarioNFormatado, String horarioNFormatadoSum){
        int[] horario = formataHorario(horarioNFormatado);
        int[] horario2 = formataHorario(horarioNFormatadoSum);
        if(horario[1] - horario2[1] < 00){
            horario[0]--;
            horario[1] = horario[1] - horario2[1] + 60;
        }else{
            horario[1] = horario[1] - horario2[1];
        }
        if(horario[0] - horario2[0] < 00 ){
            horario[1] = horario[0] - horario2[0] + 23;
        }else{
            horario[1] = horario[0] - horario2[0];
        }
    }
    public boolean checkValid(String horario){
        boolean output = true;
        int[] hora = formataHorario(horario);
        if(hora[0] > 23) output = false;
        if(hora[1] > 60) output = false;
        return output;
    }
    
    public static boolean scheckValid(String horario){
        boolean output = true;
        int[] hora = formataHorario(horario);
        if(hora[0] > 23) output = false;
        if(hora[1] > 60) output = false;
        return output;
    }
    
    public static int[] formataHorario(String horario){
        String hora = horario.charAt(0) + "" + horario.charAt(1);
        String minuto = horario.charAt(3) + "" + horario.charAt(4);
        int[] horarioFormatado = new int[2];
        horarioFormatado[0] = Integer.parseInt(hora);
        horarioFormatado[1] = Integer.parseInt(minuto);
        return horarioFormatado;
    }
    
}
