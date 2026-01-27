import javax.swing.JOptionPane;

public class Fruteria {
    public static void main(String[] args) {
        //declaracion de variables
        double numKilos, precio, subTotal, descuento, total;
        String porcentaje, salida; 
        //entrada 
        numKilos = Double.parseDouble(JOptionPane.showInputDialog("introduce el numero de kilos" ));
        precio = Double.parseDouble(JOptionPane.showInputDialog("introduce el precio" ));
        //operacion
        if (numKilos>0.0){
            subTotal = numKilos* precio;
            if (numKilos >= 0.0 && numKilos<=2.0){
                total = subTotal;
                porcentaje = "0.0%";
                descuento = 0.0;
            }
            else if (numKilos>=2.01 && numKilos <=5.0){
                descuento = subTotal*0.10;
                total =subTotal- descuento;
                porcentaje = "10%";
            }else if (numKilos>=5.01 && numKilos <=10.0){
                descuento = subTotal*0.15;
                total =subTotal- descuento;
                porcentaje = "15%";
        }else{
                descuento = subTotal*0.20;
                total =subTotal- descuento;
                porcentaje = "20%";
        }
        salida ="subTotal:"+subTotal +
"descuento:"+ descuento +
"porcentaje:"+porcentaje +
"total:"+total ;
        
JOptionPane.showMessageDialog(null, salida);

    }else{
JOptionPane.showMessageDialog(null, "los kilos se ganan facil");
    }

    }
    
    }
