
package com.mycompany.exercicios.util;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ValidaCampos {
    
    public boolean validaTextField(JTextField campo, 
            String texto){
        if(campo.getText().equals(texto)){   
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
    }
    
    public boolean validaPasswordField(JPasswordField campo, 
            String texto){
        if(String.valueOf(campo.getPassword()).equals(texto)){   
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
    }
    
    public boolean confirmarSenha(JPasswordField senha, JPasswordField confirmarSenha) {
        String vSenha = String.valueOf(senha.getPassword());
        String vConfirmarSenha = String.valueOf(confirmarSenha.getPassword());
        
        if (!vSenha.equals(vConfirmarSenha)) {
            senha.setBorder(new LineBorder(Color.RED,2));
            confirmarSenha.setBorder(new LineBorder(Color.RED,2));
            return true;
        } else {
            senha.setBorder(new LineBorder(Color.GRAY,1));
            confirmarSenha.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
    }
    
    public boolean validaFuncao(JRadioButton rdb1, JRadioButton rdb2, JRadioButton rdb3, JRadioButton rdb4) {
        if (!rdb1.isSelected() && !rdb2.isSelected() && !rdb3.isSelected() && !rdb4.isSelected()) {
            rdb1.setBorder(new LineBorder(Color.RED,2));
            rdb1.setBorderPainted(true);
            
            rdb2.setBorder(new LineBorder(Color.RED,2));
            rdb2.setBorderPainted(true);
            
            rdb3.setBorder(new LineBorder(Color.RED,2));
            rdb3.setBorderPainted(true);
            
            rdb4.setBorder(new LineBorder(Color.RED,2));
            rdb4.setBorderPainted(true);
            return true;
        } else {
            rdb1.setBorder(new LineBorder(Color.GRAY,1));
            rdb1.setBorderPainted(false);
            
            rdb2.setBorder(new LineBorder(Color.GRAY,1));
            rdb2.setBorderPainted(false);
            
            rdb3.setBorder(new LineBorder(Color.GRAY,1));
            rdb3.setBorderPainted(false);
            
            rdb4.setBorder(new LineBorder(Color.GRAY,1));
            rdb4.setBorderPainted(false);
            
            return false;
        }
    }
}
