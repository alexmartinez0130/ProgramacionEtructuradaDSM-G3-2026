/*5. Solicita un número entero positivo y determina si es primo. */

import javax.swing.JOptionPane;

public class numPrimo {
    public static void main(String[] args) {
        //DECLARAR VARIABLES ENTERO BOOLEAN PARA SAVER SI ES TRUE O FLASE 
        int x=0;
        boolean primo=true;

        //SE GUARDA EN VARIABLE X Y PIDE EL NUMERO 
        x=Integer.parseInt(JOptionPane.showInputDialog("INGRESA NUMERO ENTERO Y POSITIVO"));

        //SI X ES MENOR O IGUAL A 0 IMPRIME EL NUM NO ES VALIDO 
        if (x<=0){
            JOptionPane.showMessageDialog(null, "EL NUM NO ES VALIDO DEBE DE SER POSITIVO");
        }
        //SI X ES LO MISMO QUE 1 ENTONCES NO ES PRIMO 
        if (x==1){
            primo=false;
        }
        //CICLO FOR I = 2 PRIMER DIVISOR POSIBLE, I <= X / 2 UN NUMERO JAMAS TENDRA UN DIVISOR MAYOR A SU MITAD
        //EXCEPTO POR SI MISMO Y AHI SABREMOS CUAL ES EL NUMERO PRIMO Y EL I++ EL INCREMENTO DE UNO EN UNO 
        for (int i = 2; i <= x / 2; i++) {
            //SI X MODULO I OSEA EL RESIDUO DE X  ES == 0 NO ES PRIMO 
            if (x % i == 0) {
                primo = false;
                break;
            }
        }
        //SEGUN SI PRIMO QUEDO EN TRUE O FALSE SE MOSTRARA UN MENSAJE U OTRO 
        if (primo) {
            JOptionPane.showMessageDialog(null, x + " ES UN NÚMERO PRIMO");
        } else {
            JOptionPane.showMessageDialog(null, x + " NO ES PRIMO");
        }

    }
}
