// Subclase que representa prendas de vestir e implementa Descontable
public class Ropa extends Producto implements Descontable {
    private String talla;

    public Ropa(String id, String nombre, double precioBase, String talla) {
        this.talla = talla;
    }

public double calcularPrecioFinal() {
    return getPrecioBase();
    }

public void aplicarDescuento(double porcentaje){
    double nuevoPrecio = getPrecioBase() - (getPrecioBase() * (porcentaje / 100));
    setPrecioBase(nuevoPrecio);
    }

public void mostrarDetalles(){
    super.mostrarDetalles();
    System.out.println("Categoria: Ropa | Talla: " + talla +" | Precio Final: $" + calcularPrecioFinal())
    }
}
