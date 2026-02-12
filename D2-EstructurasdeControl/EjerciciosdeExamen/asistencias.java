/*4. Solicita el número de alumnos de un grupo y 
registra si cada uno está Presente (P) o
Ausente (A). Muestra el porcentaje de asistencia. */



import javax.swing.JOptionPane;

public class asistencias {
    public static void main(String[] args) {
        //DECLARA VARIABLES 
        int numAlumnos=0,presente =0, ausente=0, porcentaje, asistencia;

        //PIDE AL USUSARIO INGRESA EL NUMERO 
        numAlumnos=Integer.parseInt(JOptionPane.showInputDialog("INGRESA EL NUMERO DE ALUMNOS"));

        //CICLO FOR DETERMINADO POR LA VARIABLE NUMALUMNOS Y LA VARIABLE ENTERA I =1 CON INCREMENTO DE I=I+1
        for (int i=1;i<=numAlumnos;i++){

            //LA VARIABLE ASISTENCIA PIDE SI ASISTIO O NO DETERMINADO COMO PRESENTE = 1 Y AUSENTE=0 OCUALQUIER 
            // OTRO NUMERO QUE NO SEA 1 Y EL I ES PARA CADA QUE PASE AL SIGUIEMTE INCREMENTE EL NUM DE ALUMNO  
            asistencia=Integer.parseInt(JOptionPane.showInputDialog("ALUMNO:\n"+ i+"\n1 = PRESENTE: \nO \n0 = AUSENTE:"));
            //SI ASISTENCIA ES LO MISMO QUE 1
            if (asistencia ==1){
                //ENTONCES SERA PRESENTE = PRESENTE + 1
                presente ++;
            //PERO SI ES OTRO NUMERO     
            }else{
            //SERIA AUSENTE = AUSENTE + 1
            ausente++;
        }
    }
        //OPERACION PATRA DETERMINAR EL PORCENTAJE 
        porcentaje=(presente*100)/numAlumnos;

        //IMPRIME EL TOTAL DE ALUMNOS -SALTO DE LINIA-  + LA VARIABLE NUMALUMNOS Y ASI LO MISMO CON TODOS 
        JOptionPane.showMessageDialog(null,"TOTAL DE ALUMNOS:\n" + numAlumnos + 
        "\nALUMNOS PRESENTES:\n" + presente + "\nPORCENTAJE DE ASISTENCIA:\n"  + porcentaje + 
        "\nAUSENTES:\n" + ausente );

    }
            
}