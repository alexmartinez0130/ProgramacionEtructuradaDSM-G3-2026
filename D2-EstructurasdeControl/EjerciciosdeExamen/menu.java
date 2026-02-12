/*2. Muestra un menú con opciones para sumar,  
restar y multiplicar dos números. El menú
se repite hasta que el usuario decida salir. */


import javax.swing.JOptionPane;

public class menu {
    public static void main(String[] args) {
        //DECLARAR VARIABLES
        //STRING PARA IMPRIMIR 
        String Menu="", Opccion="";
        //BOOLEAN PARA VERDADERO O FALSO
        boolean sentinel = true;
        //INT PARA NUM ENTEROS 
        int a=0, b=0, total;

        //CREAR LA CADENA DE TEXTO PARA LAS OPCCIONES DEL MENU
        Menu= "=========== MENU ==========\n" +
            "1)SUMAR  \n" +
            "2)RESTAR \n" +
            "3)MULTIPLICAR \n" +
            "4)SALIR  \n" + 
            " \nELEGIR OPCION:";

            //CICLO DO WHILE 
            do{
            //MOSTRAR EL MENU
            Opccion= JOptionPane.showInputDialog(null,Menu, null, 1);

            //EL TOUPPERCASE SIRVE PARA LAS MINUSCULAS
            switch (Opccion.toUpperCase()) {
                //NO QUIERO PONER UN 1 QUIERO UN A O a ENTONCES PARA ESO SIRVE EL OPCION.TOUPERCASE() 
                case "1":
                    //PEDIR VALORES DE A Y B EN INTEGER.PARSEINT PORQUE ES UN TIPO DE DATO ENTERO
                    a=Integer.parseInt(JOptionPane.showInputDialog("INGRESA 1° VALOR"));
                    b=Integer.parseInt(JOptionPane.showInputDialog("INGRESA 2° VALOR"));
                    //OPERACION DE SUMA 
                    total=a+b;
                    //IMPRIMIR LA SUMA ES + EL TOTAL
                    JOptionPane.showMessageDialog(null,"LA SUMA ES:" + total );
                    //PARA REGRESAR AL MENU 
                    break;
                case "2":
                    a=Integer.parseInt(JOptionPane.showInputDialog("INGRESA 1° VALOR"));
                    b=Integer.parseInt(JOptionPane.showInputDialog("INGRESA 2° VALOR"));

                    total=a-b;
                    JOptionPane.showMessageDialog(null,"LA RESTA ES:" + total );
                    break;
                case "3":
                    a=Integer.parseInt(JOptionPane.showInputDialog("INGRESA 1° VALOR"));
                    b=Integer.parseInt(JOptionPane.showInputDialog("INGRESA 2° VALOR"));

                    total=a*b;
                    JOptionPane.showMessageDialog(null,"LA MULTIPLICACION ES:" + total );
                    break;
                case "4":
                //IMPRIME MENSAJE DE EL MENU AH TERMINADO CUANDO PONES EL 4 EN MENU
                JOptionPane.showMessageDialog(null, "EL MENU HA TERMINADO");
                //TIPO DE DATO BOOLEAN FALSE
                sentinel= false;
                    break;
                default:
                //SI EN EL MENU PONES UN NUMERO QUE NO ES IMPRIME OPCION NO VALIDA 
                JOptionPane.showMessageDialog(null, "OPCION NO VALIDA");
            }
        //FIN DEL CICLO    
        }while (sentinel) ;
            
    }
                
}
    

