
package vehiculo;


/**
 * Clase enfocada a todas las operaciones posibles que se han determinado para
 * la interacción con los coches. Venta, Compra y Control de Stock
 *
 * @author IES Aguadulce
 */
public class VehículoFranciscoJesusDiazMartinez2223 {

    private String nombre; //Nombre del vehículo
    private double precio; //Precio del vehículo
    private double precioIVA;  //Importe proporcional del precio por el IVA del vehículo
    private int stock; //Disponibilidad en existencias del vehículo

    /* Constructor sin argumentos */
    public VehículoFranciscoJesusDiazMartinez2223 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    
    
    public VehículoFranciscoJesusDiazMartinez2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
  /** Método para asignar el nombre del vehiculo
   * 
   * @param nom 
   */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
     /**  Método que me devuelve el nombre del vehiculo
      * 
      * @return  obtiene el nombre del vehículo
      */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /** Método que me devuelve el stock de vehiculos disponible en cada momento
     * 
     * @return obtiene el stock de vehículkos
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /**   Método para comprar vehiculos.Modifica el stock.Este método va a ser probado con Junit
     * @param cantidad
     * @throws java.lang.Exception
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }

     /**   Método para vender vehiculos.Modifica el stock.Este método va a ser probado con Junit
     * @param cantidad
     * @throws java.lang.Exception
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * Devuelve el nombre del producto
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nuevo nombre asignado al producto
     * @param nombre "nuevo nombre de producto"
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el precio del producto
     * @return el precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el nuevo precio del producto
     * @param precio "nuevo precio del producto"
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el precio+IVA del producto
     * @return el precioIVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Establece el nuevo precio+IVA del producto
     * @param precioIVA "nuevo precio+IVA del coche"
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Devuelve el stock actual de coches
     * @return "el stock de vehículos"
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el nuevo valor del stock de coches
     * @param stock "el nuevo stock de vehículos"
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}  
   
    

