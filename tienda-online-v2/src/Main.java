//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Tienda tienda = new Tienda("Mi Tienda Online");
    // Crear productos
    Producto p1 = new Producto(1, "Mouse", 80, 10, "Tecnología");
    Producto p2 = new Producto(2, "Teclado", 150, 5, "Tecnología");

    tienda.agregarP(p1);
    tienda.agregarP(p2);
    tienda.listarP();

    tienda.buscarP(12);
    tienda.eliminarP(1);
    tienda.listarP();
    tienda.actualizarPrecio(2,566666.0);
    tienda.listarP();
    tienda.actualizarStock(2,1);
    tienda.listarP();
}
