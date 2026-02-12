/*1. Solicita números enteros hasta que el usuario 
ingrese un número negativo. Muestra la
suma total y cuántos números válidos se ingresaron. */


import javax.swing.JOptionPane;

public class enteros {
    public static void main(String[] args){
        //VARIABLES X = NUMERO ENTERO, SUMA = LA SUMA TOTAL DE LOS NUMEROS INGRESADOS 
        //CONTADOR = NUMEROS VALIDOS QUE SE INGRESARON 
        int x=0,suma=0, contador=0;
        //PEDIR UNA VEZ EL NUMERO PARA QUE ARRANQUE EL CICLO 
        x=Integer.parseInt(JOptionPane.showInputDialog("INGRESA NUMEROS ENTEROS Y SALES SON NUM NEGATIVO"));

        //SI X ES MAYOR O IGUAL A 0
        while(x>=0){
        x=Integer.parseInt(JOptionPane.showInputDialog("INGRESA NUMEROS ENTEROS Y SALES SON NUM NEGATIVO"));
        //SUMA = SUMA + X 
        suma+=x;
        //CONTADOR = CONTADOR + 1
        contador++;

        //SI X ES MENOR A 0 IMPRIME LA SUMA TOTAL Y EL TOTAL DE NUM VALIDOS 
        if (x<0){
        JOptionPane.showMessageDialog(null,"SUMA TOTAL: "  + suma + "\nTOTAL DE NUM VALIDOS:"  + contador);

        }
            
        }
    }
    
}
