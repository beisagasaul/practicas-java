import java.util.ArrayList;

void main() {
    ArrayList<Producto> productos = new ArrayList<>();


    Producto mouse = new Producto("Mouse Gamer", 150.0);
    Producto teclado = new Producto("Teclado", 250.0);
    Producto monitor = new Producto("Monitor", 800.0);
    Producto audifonos = new Producto("Audifonos", 120.0);

    productos.add(mouse);
    productos.add(teclado);
    productos.add(monitor);
    productos.add(audifonos);

    for (Producto producto : productos) {
        System.out.println(
                producto.getNombre() + " - " +
                        producto.getPrecio() + " Bs"
        );
    }



//Buscador de productos

    String buscar = "monitorrr";
    boolean encontrado = false;
    int posicion = -1;
    for (int i = 0; i < productos.size(); i++) {
        if (productos.get(i).getNombre().equalsIgnoreCase(buscar)) {
            encontrado = true;
            posicion = i;
            break; // Termina el bucle al encontrar el primer resultado
        }
    }

    if (encontrado) {
        System.out.println("El producto es  " + buscar + " se encuentra en el índice " + posicion);
    } else {
    System.out.println("No existe el producto");
    };



    }