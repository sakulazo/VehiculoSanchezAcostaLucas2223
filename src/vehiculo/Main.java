
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoSanchezAcostaLucas2223 miVehiculoSanchezAcostaLucas2223;
        int stockActual;
        
        miVehiculoSanchezAcostaLucas2223 = new VehiculoSanchezAcostaLucas2223("Seat",18000,100);
        operativaVehiculosSanchezAcostaLucas2223(miVehiculoSanchezAcostaLucas2223, 50); 
        stockActual = miVehiculoSanchezAcostaLucas2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosSanchezAcostaLucas2223(VehiculoSanchezAcostaLucas2223 miVehiculoSanchezAcostaLucas2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoSanchezAcostaLucas2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoSanchezAcostaLucas2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
