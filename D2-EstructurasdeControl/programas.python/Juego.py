#*En un juego de preguntas en las que se responde si o no gana qquien responda las 3 
#preguuntas si se responde mal a cualquiera ya no se pregunta la sig y termnina el juego
#colon descubrio america?
#la independencia de mexico fue en el año 1810?
#the dors fue un grupo de rock americano? 

package mx.edu.uttt;
import javax .swing.JOptionPane;

public class Juego {
    public static void  main(String[] args){
        // declarar variables
        String pregunta1, pregunta2, pregunta3;
        // engtradas 
        pregunta1 = JOptionPane.showInputDialog("colon descubrio america?");
        // operacion
        if (pregunta1.equalsIgnoreCase("si") ){

        }else{
            JOptionPane.showMessageDialog(null,  "Perdiste");

        }
        pregunta2 = JOptionPane.showInputDialog("la independencia de mexico fue en el año 1810?");
            if (pregunta2.equalsIgnoreCase("si") ){
                }else{
            JOptionPane.showMessageDialog(null,  "Perdiste");

        }
            pregunta3 = JOptionPane.showInputDialog("the dors fue un grupo de rock americano?");
            if (pregunta3.equalsIgnoreCase("si") ){
                 }else{
            JOptionPane.showMessageDialog(null,  "Perdiste");

        }
        JOptionPane.showMessageDialog(null,  "Ganaste");
            }
    }
    
