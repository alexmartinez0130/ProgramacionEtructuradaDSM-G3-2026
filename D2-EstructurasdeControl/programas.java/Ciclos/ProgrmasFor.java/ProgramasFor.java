/*
1.Calcular el promedio de un alumno que tine 
n. calificaciones
en la materia de programcion */


import javax.swing.JOptionPane;

public class ProgramasFor {
    public static void main(String[] args) {

        String Menu="", Opccion="";
        boolean sentinel = true;
        int n=0;
        double promedio =0.0, calif =0.0;

        //CREAR LA CADENA DE TEXTO PARA LAS OPCCIONES DEL MENU
        Menu= "=========== MENU ==========\n" +
            "1)Calcular promedio   1\n" +
            "2)OPCCION 2\n" +
            "3)OPCCION 3\n" +
            "4)SALIR" + 
            " \nELEGIR OPCCION:";

            do{
            //MOSTRAR EL MENU
            Opccion= JOptionPane.showInputDialog(null,Menu, null, 1);

            //EL TOUPPERCASE SIRVE PARA LAS MINUSCULAS
            switch (Opccion.toUpperCase()) {
                case "1":
                //no quiero poner un 1 quiero un A, pero en mi nusvula no jala
                //case "A":       case "a": no jala 
                n= Integer.parseInt(JOptionPane.showInputDialog(null, "introduce el nu mero de calificacion"));
                if (n>0){
                    promedio =0.0;
                    for (int i= 1;i<=n;i++){
                        calif = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificacion " + i ));
                        if (calif >=0.0 && calif <=10.0){
                        promedio+=calif; // promedio = promedio +calif;
                        }else {
                            JOptionPane.showMessageDialog(null," LA CALIFICACION NO ES VALIDA ");
                            i--;
                            continue;
                        }
                    }
                    promedio /=n ; //promedio =promedio +calof; 
                    JOptionPane.showMessageDialog(null,"EL PROMEDIO:" + promedio);

                }else {
                    JOptionPane.showMessageDialog(null, "el numero de calificaciones");
                }
                    break;
                case "2":
                JOptionPane.showMessageDialog(null, "opccion2");
                    break;
                case "3":
                JOptionPane.showMessageDialog(null, "opccion3");
                    break;
                case "4":
                JOptionPane.showMessageDialog(null, "Elmenu ha terminado");
                sentinel= false;
                    break;
                default:
                JOptionPane.showMessageDialog(null, "opccion no valida");
            }
        }while (sentinel) ;
            
    }
                
}
