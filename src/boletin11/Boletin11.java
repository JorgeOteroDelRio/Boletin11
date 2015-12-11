/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Apartado1: Calcular tiempo de diferencia entre dos fechas tipo Date
        Date fechaActual = new Date();
        Date miCumple = new Date(96,7,20);
        System.out.println(fechaActual.toString());
        System.out.println(miCumple.toString());
        long diferenciaEn_ms = fechaActual.getTime()-miCumple.getTime(); //Calculo los milisegundos de diferencia entre ambas fechas
        long dias = diferenciaEn_ms / (1000 * 60 * 60 * 24); //Convierto los milisegundos en dias
        System.out.println(dias + " dias de diferencia hay entre las dos fechas");
        
        Date tiempoInicial = new Date();
        String frase = JOptionPane.showInputDialog("ESCRIBE A SEGUINTE FRASE : \nA documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática");
        if(frase.equalsIgnoreCase("A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática")){
            Date tiempoFinal = new Date(); 
            long tiempoTranscurrido = (tiempoFinal.getTime()-tiempoInicial.getTime());
            JOptionPane.showMessageDialog(null, "Tardaste " + tiempoTranscurrido/1000 + "s en escribir la frase");
        }else{
            JOptionPane.showMessageDialog(null, "Frase mal escrita");
        }
    }
    
}
