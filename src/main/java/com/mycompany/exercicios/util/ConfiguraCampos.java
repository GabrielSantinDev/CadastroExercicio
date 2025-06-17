
package com.mycompany.exercicios.util;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ConfiguraCampos {
    
    public void configPasswordField(JPasswordField componente, 
            String texto){
        componente.setText(texto);
        componente.setForeground(Color.GRAY);
        componente.setEchoChar((char) 0);
        
        componente.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {       
                if(String.valueOf(componente.getPassword()).equals(texto)){
                    componente.setText("");
                    componente.setForeground(Color.BLACK);
                    componente.setEchoChar('*');
                }
            }
            
            @Override
            public void focusLost(FocusEvent e) {
               if(String.valueOf(componente.getPassword()).equals("")){
                   componente.setText(texto);
                   componente.setForeground(Color.GRAY);
                   componente.setEchoChar((char) 0);
               }  
            }
        });
    }
    
    public void configTextField(JTextField componente, String texto){
       componente.setText(texto);
       componente.setForeground(Color.GRAY);
       
       componente.addFocusListener(new FocusAdapter() {
           @Override
           public void focusGained(FocusEvent e) {
               if(componente.getText().equals(texto)){
                   componente.setText("");
                   componente.setForeground(Color.BLACK);
               }
           }

           @Override
           public void focusLost(FocusEvent e) {
               if(componente.getText().equals("")){
                   componente.setText(texto);
                   componente.setForeground(Color.GRAY);
               }
           }
           
       });
    }
    
}
