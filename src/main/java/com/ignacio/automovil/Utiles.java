package com.ignacio.automovil;   

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Utiles {

    public static void mostrarMensaje(String mensaje, String tipo, String titulo) {
        
        int messageType = JOptionPane.PLAIN_MESSAGE; // valor por defecto

        if (tipo.equalsIgnoreCase("Info") || tipo.equalsIgnoreCase("Informacion")) {
            messageType = JOptionPane.INFORMATION_MESSAGE;
        } 
        else if (tipo.equalsIgnoreCase("Error")) {
            messageType = JOptionPane.ERROR_MESSAGE;
        } 
        else if (tipo.equalsIgnoreCase("Warning") || tipo.equalsIgnoreCase("Advertencia")) {
            messageType = JOptionPane.WARNING_MESSAGE;
        } 
        else if (tipo.equalsIgnoreCase("Question") || tipo.equalsIgnoreCase("Pregunta")) {
            messageType = JOptionPane.QUESTION_MESSAGE;
        }

        JOptionPane optionPane = new JOptionPane(mensaje, messageType);
        JDialog dialog = optionPane.createDialog(titulo);
        
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}