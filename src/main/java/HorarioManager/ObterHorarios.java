/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HorarioManager;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import static msg.mensagemauto.MensagemDagao.obterHorarioBrasilia;
/**
 *
 * @author Mandelli
 */
public class ObterHorarios {
    public static int obterHoraAtual() {
        // Obtém a data e hora atual no fuso horário de Brasília (America/Sao_Paulo)
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        return zdt.getHour();
    }
    
    public int nobterHoraAtual() {
        // Obtém a data e hora atual no fuso horário de Brasília (America/Sao_Paulo)
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        return zdt.getHour();
    }

    public static int obterMinutosAtual() {
        // Obtém a data e hora atual no fuso horário de Brasília (America/Sao_Paulo)
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        return zdt.getMinute();
    }
    
    public int nobterMinutosAtual() {
        // Obtém a data e hora atual no fuso horário de Brasília (America/Sao_Paulo)
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        return zdt.getMinute();
    }
    
    public static String obterDiaDaSemana() {
        // Cria um objeto LocalDate representando a data
        LocalDate data = LocalDate.of(Integer.parseInt(date()[2]),
        Integer.parseInt(date()[1]), Integer.parseInt(date()[0]));

        // Obtém o dia da semana como um enum DayOfWeek
        DayOfWeek diaSemana = data.getDayOfWeek();

        // Converte o enum para uma string com o nome do dia da semana em português
        String nomeDiaSemana = switch (diaSemana) {
            case MONDAY ->  "1";
            case TUESDAY -> "2";
            case WEDNESDAY -> "3";
            case THURSDAY -> "4";
            case FRIDAY -> "5";
            case SATURDAY -> "6";
            case SUNDAY -> "7";
                
        };
        return nomeDiaSemana;
    }
    
    public static String[] date(){
     LocalDate hoje = LocalDate.now();

        int dia = hoje.getDayOfMonth();
        int mes = hoje.getMonthValue();
        int ano = hoje.getYear();
        String[] data = new String[3];
        data[0] = String.valueOf(dia);
        data[1] = String.valueOf(mes);
        data[2] = String.valueOf(ano);
        return data;
    }
    
    public static ZonedDateTime obterHorarioBrasilia() {
        // Fuso horário de Brasília (UTC-3)
        ZoneId zonaHorariaBrasilia = ZoneId.of("America/Sao_Paulo");
        // Obter a data e hora atual no fuso horário de Brasília
        ZonedDateTime agoraBrasilia = ZonedDateTime.now(zonaHorariaBrasilia);
        return agoraBrasilia;
    }
    
    public static String shorarioFormatado(){
        ZonedDateTime horarioAtual = obterHorarioBrasilia();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm");
        String horarioFormatado = horarioAtual.format(formatador);
        return horarioFormatado;
    }
    
        public String horarioFormatado(){
        ZonedDateTime horarioAtual = obterHorarioBrasilia();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm");
        String horarioFormatado = horarioAtual.format(formatador);
        return horarioFormatado;
    }

}
