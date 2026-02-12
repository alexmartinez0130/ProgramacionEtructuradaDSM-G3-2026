/*3. Muestra un menú para convertir temperaturas de 
Celsius a Fahrenheit y de Fahrenheit a
Celsius. */

import javax.swing.JOptionPane;

public class temperaturas {
    public static void main(String[] args) {
        //VARIABLES PARA EL MENU Y LA OPCION ELEJIDA 
        String Menu="", Opccion="";
        //VARIABLE BOOLEAN PARA CONTROLAR EL CICLO TRUE SIGUE, FALSE TERMINA 
        boolean sentinel = true;
        //VARIABLES QUE GUARDAN LOS GRADOS 
        double  x=0.0,y=0.0;

        //CREAR LA CADENA DE TEXTO PARA LAS OPCCIONES DEL MENU
        //USAMOS EL CICLO DO WHILE PORQUE EL MENU TIENE QUE ENTRAR AL MENOS UNA VEZ Y 
        //DE AHI YA SE CICLA MIENTRAS SEA TRUE 
        Menu= "=========== MENU ==========\n" +
            "1)CONVERTIR A C \n" +
            "2)CONVERTIR A F \n" +
            "3)SALIR   \n" + 
            " \nELEGIR OPCCION:";

            //INICIO DEL DO WHILE SE REPETIRA MIENTRAS SENTINEL SEA TRUE 
            do{
            //MOSTRAR EL MENU
            Opccion= JOptionPane.showInputDialog(null,Menu, null, 1);

            //EVALUA LA OPCCION ELEJIDA 
            switch (Opccion) {
                case "1":
                //PEDIR GRADOS FAHRENHEIT UTILIZAMOS DOUBLE.PARSEDOUBLE PORQUE PUEDE SER UN TIPO DE DATO DECIMAL Y ENTERO 
                x=Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESA GRADOS FAHRENHEIT"));
                //FORMULA PARA CONVERTIR A CELSIUS C = (F - 32) / 1.8
                x=(x-32)/1.8;
                //MOSTRAR RESULTADO USANDO SHOWMESSAGEDIALOG QUE SE USA PARA IMPRIMIR SOLAMENTE + LA VARIABLE X QUE 
                //ES EL RESULTANTE DE LA OPERACION 
                JOptionPane.showMessageDialog(null,"GRADOS CELSIUS" + x);
                    //REGRESA AL MENU 
                    break;
                case "2":
                //PEDIR GRADOS CELSIUS     
                y=Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESA GRADOS CELSIUS "));
                //FORMULA PARA CONVERTIR A FAHRENHEIT  F = (C * 1.8) + 32
                y=(y*1.8)+32;
                //MOSTRAR RESULTADO 
                JOptionPane.showMessageDialog(null,"GRADOS FAHRENHEIT" + y);
                    break;
                case "3":
                //MUESTRA MENSAJE DE SALIDA 
                JOptionPane.showMessageDialog(null, "EL MENU HA TERMINADO");
                //CAMBIAR EL SENTINEL AL FALSE PARA SALIR DEL CICLO 
                sentinel= false;
                    break;
                //AQUI ENTRAN LAS OPCIONES NO VALIDAS 
                default:
                //SI EL USUARIO ESCRIBE ALGO DIFERENTE EN EL MENU IMPRIME ESE MENSAJE 
                JOptionPane.showMessageDialog(null, "OPCION NO VALIDA");
            }
            //EL CICLO SE REPITE MIENTRAS SENTINEL SEA TRUE 
        }while (sentinel) ;
            
    }
                
}

