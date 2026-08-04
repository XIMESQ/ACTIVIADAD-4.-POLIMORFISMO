public class Main {
    public static void main(String[] args) {
        // Creación de una lista genérica de objetos de tipo Producto (Demostración de Polimorfismo)
        List<Producto> inventario = new ArrayList<>();

        // Instanciación de objetos de las subclases
        inventario.add(new Electronico("E01", "Laptop Gamer", 15000.0, 24));
        inventario.add(new Alimento("A01", "Leche Entera", 25.0, 2)); // Vence en 2 días
        inventario.add(new Ropa("R01", "Chamarra de Mezclilla", 800.0, "M"));

        System.out.println("=== SISTEMA DE GESTIÓN DE INVENTARIOS ===");
        System.out.println("--- Lista de Productos en Inventario ---");

        // POLIMORFISMO EN ACCIÓN:
        // Se recorre la lista llamando a 'mostrarDetalles()' y 'calcularPrecioFinal()'.
        // Cada objeto ejecuta la versión de estos métodos correspondiente a su clase.
        for (Producto p : inventario) {
            p.mostrarDetalles();
            System.out.println("----------------------------------------");
        }

        // Aplicación de descuento a productos que implementan la interfaz Descontable
        System.out.println("\n--- Aplicando Descuento de Promoción (15%) a Productos Seleccionados ---");
        for (Producto p : inventario) {
            if (p instanceof Descontable) {
                ((Descontable) p).aplicarDescuento(15);
                System.out.println("Descuento aplicado a: " + p.getNombre());
                p.mostrarDetalles();
                System.out.println("----------------------------------------");
            }
        }
    }
}