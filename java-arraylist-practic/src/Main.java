import java.util.ArrayList;

void main() {
    ArrayList<Producto> productos = new ArrayList<>();



     //INSERTAR
    Producto mouse = new Producto("Mouse Gamer", 150.0);
    Producto teclado = new Producto("Teclado", 250.0);
    Producto monitor = new Producto("Monitor", 800.0);
    Producto audifonos = new Producto("Audifonos", 120.0);
    Producto fruta = new Producto("zanahoria",1.50);

    productos.add(mouse);
    productos.add(teclado);
    productos.add(monitor);
    productos.add(audifonos);
    productos.add(fruta);


    //LISTA LOS PRODUCTOS
    for (Producto producto : productos) {
        System.out.println(
                producto.getNombre() + " - " +
                        producto.getPrecio() + " Bs"
        );
    }



//BUSCAR

    String buscar = "monitor";
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
    System.out.println("No existe el producto que busca");
    };

    //ELIMINAR
    String buscar1 = "zanahoria";
    boolean encontrado1 = false;
    int posicion1 = -1;
    for (int i = 0; i < productos.size(); i++) {
        if (productos.get(i).getNombre().equalsIgnoreCase(buscar1)) {
            encontrado1 = true;
            posicion1 = i;
            break;
        }
    }

    if (encontrado1) {
        productos.remove(posicion1);
        System.out.println("El producto es  " + buscar1 + " se elimino  correctamente  " );
    } else {
        System.out.println("No existe el producto que quiere eliminar");
    };


    //ACTUALIZAR
    String buscar2 = "monitor";
    double nuevoPrecio=120.70;
    boolean encontrado2 = false;

    for (int i = 0; i < productos.size(); i++) {
        if (productos.get(i).getNombre().equalsIgnoreCase(buscar2)) {
            double precioAnterior=productos.get(i).getPrecio();
            productos.get(i).setNuevoPrecio(nuevoPrecio);
            encontrado2 = true;

            System.out.println("Producto actualizado correctamente");
            System.out.println("Precio anterior: " + precioAnterior);
            System.out.println("Nuevo precio: " + productos.get(i).getPrecio());

            break;
        }
    }

    if (!encontrado2) {
        System.out.println("No exuiste el producto es  "  );
    }

    for (Producto producto : productos) {
        System.out.println(
                producto.getNombre() + " - " +
                        producto.getPrecio() + " Bs"
        );
    }

 
}