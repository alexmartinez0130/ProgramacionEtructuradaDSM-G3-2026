/*. En una tienda de descuento las personas que van a pagar el importe de su compra
llegan a  la caja y sacan una bolita de color, que les dirá que descuento tendrán 
sobre el total de su  compra. Determinar la cantidad que pagara cada cliente desde que 
la tienda abre hasta que  cierra. Se sabe que si el color de la bolita es roja el cliente 
obtendrá un 40% de descuento;  si es amarilla un 25% y si es blanca no obtendrá descuento. 
 */

package Ciclos.ProgramasDoWhile;
import javax.swing.JOptionPane;

public class programasConDoWhile {
    public static void main(String[] args) {

        String opcion = "   ";
        boolean sentinel= true ;
        do { 
        opcion = obtenerMenu();


        switch (opcion) {
            case "1":{// programa 1 
                JOptionPane.showMessageDialog(null,calcularResusltados());
                break;
            }
            case "2":{
                break;
            }
            
            case "4":{
                JOptionPane.showMessageDialog(null,"I WILL BE BACK ");
                sentinel = false ;
                break;
            }
            default:
                JOptionPane.showMessageDialog(null,"opcion no valida");
            }

        }while (sentinel);   
        
    }
    public static String obtenerMenu(){
        String menu = "=========== MENU ==========\n" +
            "1)Bolitas de descuento \n" +
            "2)OPCCION 2\n" +
            "3)OPCCION 3\n" +
            "4)SALIR" + 
            " \nELEGIR OPCCION:";
         
        String opcion= JOptionPane.showInputDialog(menu);    
        return opcion;
        /*or 
        String saludo = "hola soy tu primer metodo";
        return saludo ; */
    }
    public static String elegirBolota (){
        String menu= "=== Bolita elejida ==" +
                     "\n1) Roja" +
                     "\n2) Amarilla" +
                     "\n3) Blanca" +
                     "\n) Elejir la bolita" ;

        String opcion=JOptionPane.showInputDialog(menu);

         switch (opcion) {
            case "1":{
                opcion="1";
                break;
            }
            case "2":{
                opcion="2";
                break;

            }
             case "3":{
                opcion="3";
                break;

            }
            default:
            opcion="-1";



    }
    return opcion;
    
}
public static String calcularResusltados(){

    double descuento=0.0, importe=0.0;
    double total=0.0;
    String salida ="", bolita ="";
    boolean sentinel = true;
    int i=1;
    do {
        do{
        importe = Double.parseDouble(JOptionPane.showInputDialog
        ("introduce el importe o -1 para salir "));

    }while (importe <=0 && importe !=-1);

    if (importe ==-1){
        JOptionPane.showMessageDialog(null, "has terminadado");
    sentinel =false ;
}else{
    bolita=elegirBolota();
        if (bolita.equals("1")){
        descuento =importe *0.40;
        total=importe -descuento;
        }else if (bolita.equals("2")){
        descuento =importe *0.25;
        total=importe -descuento;
        }else{
        descuento=0.0;
        total=importe;
}
salida += " Cliente"+i +
         "\nimporte:& "+ importe +
         "\ndescuent0:&"+ descuento +
         "\ntotal:&"+ total + "\n\n";

         i++;

}

}while(sentinel);

         return salida ;


    }
}


