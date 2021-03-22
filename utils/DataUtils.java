
package utils;

// @author rogeria
import java.util.Date;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.DAY_OF_WEEK;
public class DataUtils {
    //Retorna a data enviada por parâmetro com a adição dos dias
    //desejados. A data pode estar no futuro (dias>0) ou no passado (dias<0)    
    public static Date adicionarDias(Date data, int dias){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(DAY_OF_MONTH, dias);
        return calendar.getTime();
    }
    
    //Retorna a data atual com a diferença de dias enviados por parâmetro
    //a Data pode estar no futuro (parâmetro positivo) ou no passado (parâmetro negativo)
    public static Date obterDataComDiferencaDias(int dias){
        return adicionarDias(new Date(),dias);
    }        
    
    //Retorna um instância de <code>Date</code> refletindo os valores passados por parâmetro
    public static Date obterData(int dia, int mes, int ano){
        Calendar calendar = Calendar.getInstance();
        calendar.set(DAY_OF_MONTH, dia);
        calendar.set(MONTH, mes-1);
        calendar.set(YEAR, ano);
        return(calendar.getTime());
    }
    
    //Verifica se uma data é igual a outra, considerando apenas dia, mês e ano
    public static boolean isMesmaData(Date data1, Date data2) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(data1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(data2);
        return (calendar1.get(DAY_OF_MONTH) == calendar2.get(DAY_OF_MONTH))
                && (calendar1.get(MONTH) ==  calendar2.get(MONTH))
                && (calendar1.get(YEAR) == calendar2.get(YEAR));	
    }

    //Verifica se uma determinada data é o dia da semana desejado
    public static boolean verificarDiaSemana(Date data, int diaSemana) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        return calendar.get(DAY_OF_WEEK) == diaSemana;
    }    
}

