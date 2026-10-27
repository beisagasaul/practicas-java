import java.util.ArrayList;

void main() {
    ArrayList<Producto> productos = new ArrayList<>();


    Producto mouse = new Producto("Mouse Gamer", 150.0);
    Producto teclado = new Producto("Teclado", 250.0);
    Producto monitor = new Producto("Monitor", 800.0);

    productos.add(mouse);
    productos.add(teclado);
    productos.add(monitor);

    for (Producto producto : productos) {
        System.out.println(
                producto.getNombre() + " - " +
                        producto.getPrecio() + " Bs"
        );
    }
}