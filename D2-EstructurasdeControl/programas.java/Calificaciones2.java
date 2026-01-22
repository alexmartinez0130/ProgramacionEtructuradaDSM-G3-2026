import javax.swing.JOptionPane;

public class Calificaciones2 {
    public static void main(String[] args){
        double calif1,calif2,calif3,promedio;
        final int NUM_CALIF=3;

        calif1= Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion1"));
        calif2= Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion2"));
        calif3= Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion3"));

        //proceso : calculo del rpomedio
        promedio=(calif1 + calif2 +calif3 )/ NUM_CALIF;

        //COMPARACION CON UNA ESTRUCTURA SELECTIVA DOUBLE
        if(promedio<=7.0){
            JOptionPane.showMessageDialog(null,"NO APROBADO" );

        }//cierra el if 


    }//cierra eel main

    
}//cierra la clase
