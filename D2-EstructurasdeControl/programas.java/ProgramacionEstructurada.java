import javax.swing.JOptionPane;

public class ProgramacionEstructurada {
    /**
     * @param args
     */
    public static void main(String[] args){
        //declaracion de variables
        /* 
        *En esta parte del codigo se van a declarar varios tipos de variables
        */
       int suma ;
       int resta;
       int multi,div, mod, area; 
       double resultado = 0.0, potencia;
       boolean valor = true, valor2 = false;
       float f1 = 8.9f;
       double d1= 12;

       //Definir una constante  simepre en mayusculas 
       final double PI=3.1416;
       String salida = "";

       //Expreciones aritmeticas
       suma =3+5; 
       resta = 10-12;
       multi=24*23;
       div=10 /2;
       mod = 10 % 2; 
       potencia = Math.pow(4,2);

       valor =4 +5> 23;
       System.out.println(valor); 
       
       //salida= "===== Expreciones Aritmeticas =====" + 
       //"\nLa suma es:" + suma +
       //"\nLa resta es:" + resta +
       //"\nLa multiplicacion es:" + multi +
      // "\nLa Divicion es:" + div +
       //"\nLa modulo es:" + mod +
       //"\nLa potencia es:" + potencia;

       //JOptionPane.showMessageDialog(null, salida);
       
    } 
}