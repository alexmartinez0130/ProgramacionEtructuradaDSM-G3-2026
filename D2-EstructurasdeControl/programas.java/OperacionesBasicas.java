import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class OperacionesBasicas {
    public static void main(String[] args) {
        //declaraciondes de variables 
        String menu, opcion;
        double valor1, valor2;

        //crear un menu}
        menu = "===== MENU DE OPERACIONES =====\n"
        +"1) Suma\n" +
        "2) resta\n" +
        "3) Multiplicacion\n" +
        "4) Divicion\n" +
        "5) Modulo\n" +
        "6) Potencia\n" +
        "7) raiz cuadrada\n"+
        "elejir Opccion:";

        //elejir opccion
        opcion = JOptionPane.showInputDialog(menu);
        //aplicar las opcciones
    switch(opcion) {
        case "1": 
        //suma
            valor1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valol 1"));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valol 2"));
        JOptionPane.showMessageDialog(null,valor1 + valor2);
        break;
        case "2":
             valor1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valol 1"));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valol 2"));
        JOptionPane.showMessageDialog(null,valor1 - valor2);
        break;
        case"3":
         valor1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valol 1"));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valol 2"));
        JOptionPane.showMessageDialog(null,valor1 * valor2);
        break;
        case"4":
         valor1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valol 1"));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valol 2"));
        if (valor2 !=0.0){
            JOptionPane.showMessageDialog(null,valor1 / valor2);
        }
            else{
                JOptionPane.showMessageDialog(null,"el denominador no puede ser cero");
            }
            break;
            case "5": // Módulo
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 1"));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 2"));
                JOptionPane.showMessageDialog(null, "Resultado: " + (valor1 % valor2));
                break;

            case "6": // Potencia
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base"));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el exponente"));
                JOptionPane.showMessageDialog(null, "Resultado: " + Math.pow(valor1, valor2));
                break;

            case "7": // Raíz cuadrada
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número"));
                if (valor1 >= 0) {
                    JOptionPane.showMessageDialog(null, "Resultado: " + Math.sqrt(valor1));
                } else {
                    JOptionPane.showMessageDialog(null, "Error: no existe raíz real de números negativos");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
    }
   
    }

}
