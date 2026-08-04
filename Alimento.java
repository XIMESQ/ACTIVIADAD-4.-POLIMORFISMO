// Subclase que representra productos perecederos 
public class Alimento extends Producto {
    private int diasParaVencer;

    public Alimento(String id, String nombre, double precioBase, int, diasParaVencer) {
        super(id, nombre, precioBase);
        this.diasParaVencer = diasParaVencer;
    }

    public double calcularPrecioFinal() {
        // Si el alimento vence en 3 dias o menos, se aplica un 20% de descuento automatico
        if (diasParaVencer <= 3) {
            return getPrecioBase() * 0.80;
        }
        return getPrecioBase();
    }
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Categoria: Alimento | Dias para vencer: " + diasParaVencer + " | Precio Final: $" + calcularPrecioFinal());
    }
}