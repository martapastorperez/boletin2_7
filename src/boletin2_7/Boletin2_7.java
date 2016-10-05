
package boletin2_7;

import javax.swing.JOptionPane;


public class Boletin2_7 {

   
    public static void main(String[] args) {
        float n,i,t,im,tm,rendaMensual;
        n=Float.parseFloat(JOptionPane.showInputDialog("nominal"));
        i=Float.parseFloat(JOptionPane.showInputDialog("interes"));
        t=Float.parseFloat(JOptionPane.showInputDialog("tempo"));    
       
        tm=t*12;
        im=i/1200;
        double auxiliar= Math.pow((im+1),tm);
        rendaMensual=(float)((n* auxiliar*im)/(auxiliar-1));
        JOptionPane.showMessageDialog(null, "a renda menusal="+rendaMensual);
                
    }
    
}
