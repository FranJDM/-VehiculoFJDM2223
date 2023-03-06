
package vehiculo;

/**
 * Clase main, donde se describen las interacciones de los atributos de la clase
 * "VehiculoDiazMartinezFranciscoJesus2223"
 *
 * @author IES Aguadulce
 */
public class Main {
   
    /**
 * Método main; principal para la ejecución del código
     * @param args
 */
    
      public static void main(String[] args) {
        VehículoFranciscoJesusDiazMartinez2223 miVehiculoDiazMartinezFranciscoJesus2223;
        int stockActual;
        
 /**
 *Introducimos el método que engloba las sentencias que operan con el objeto 
 * "miVehiculoDiazMartinezFranciscoJesus"
 *
 */
        operativaVehiculosDiazMartinezFranciscoJesus2223(50);
    }

    private static void operativaVehiculosDiazMartinezFranciscoJesus2223(int cantidad) {
        VehículoFranciscoJesusDiazMartinez2223 miVehiculoDiazMartinezFranciscoJesus2223;
        int stockActual;
        miVehiculoDiazMartinezFranciscoJesus2223 = new VehículoFranciscoJesusDiazMartinez2223("Seat",18000,100);
 /**
 *Se van a vender 20 vehículos por lo tanto, la ejecución debe ser correcta.
 * Ya que tenemos 100 unidades en stock
 */
        
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoDiazMartinezFranciscoJesus2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
 /**
 *Se van a intentar comprar 100 vehículos. No debería de haber problema
 * en el método comprar no se establece cantidad máxima, solo la restricción
 * para que no se compren cantidades iguales o menores que "0"
 * 
 * Además se modificará el recuento de stock actual
 */
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoDiazMartinezFranciscoJesus2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoDiazMartinezFranciscoJesus2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

}
    
