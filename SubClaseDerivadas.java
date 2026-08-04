// Subclase que hereda de un Producto e implementa la interfaz Descontable 
public class Electronico extends Producto implements Descontable {
    private int garantiaMeses;

    public Electronico(String id, String nombre, double precioBase, int garantiaMeses) {
        super(id, nombre, precioBase); // Llamada al constructor de la clase padre
        this.garantiaMeses = garantiaMeses;
    }

    public double calcularPrecioFinal() {
        // Los electronicos tienen un recargo por garantia extendida si supera los 12 meses
        return (garantiaMeses > 12) ? getPrecioBase() * 1.10 : getPrecioBase();
    }

    public void aplicarDescuento(double porcentaje) {
        double nuevoPrecio = getPrecioBase() - (getPrecioBase() * (porcentaje / 100));
        setPrecioBase(nuevoPrecio);
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Categoria: Electronico | Garantia: " +garantiaMeses + " meses | Precio Final: $" + calcularPrecioFinal());
    }
} 