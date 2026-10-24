

void main() {
    System.out.println("----------PRUEBA 1----------");
    Producto producto = new Producto("Mouse Gamer", 150.0, 10);
    Carrito carrito = new Carrito(producto);
    Cliente cliente = new Cliente("Saul", 500.0, carrito);
    carrito.agregarProducto(2);
    Pedido pedido = new Pedido(cliente);
    boolean confirmado = pedido.confirmarPedido();
    pedido.mostrarResumen();
    System.out.println("Saldo restante: " +cliente.getSaldo());
    System.out.println("Stock restante: " +producto.getStock());
    System.out.println("¿Se confirmó?: " +confirmado);


    System.out.println("----------PRUEBA 2----------");


    Producto teclado = new Producto("Teclado Mecanico", 250.0, 5);
    Carrito carritoTeclado = new Carrito(teclado);
    Cliente cliente2 = new Cliente("Saul", 100.0, carritoTeclado);

    carritoTeclado.agregarProducto(2);

    Pedido pedido2 = new Pedido(cliente2);
    boolean confirmado2 = pedido2.confirmarPedido();

    pedido2.mostrarResumen();
    System.out.println("Saldo restante: " +cliente2.getSaldo());
    System.out.println("Stock restante: " +teclado.getStock());
    System.out.println("¿Se confirmó?: " +confirmado2);

    System.out.println("----------PRUEBA 2----------");
    Producto monitor = new Producto("Monitor", 800.0, 1);
    Carrito carritoMonitor = new Carrito(monitor);
    Cliente cliente3 = new Cliente("Saul", 2000.0, carritoMonitor);

    carritoMonitor.agregarProducto(2);

    Pedido pedido3 = new Pedido(cliente3);
    boolean confirmado3 = pedido3.confirmarPedido();

    pedido3.mostrarResumen();
    System.out.println("Saldo restante: " +cliente3.getSaldo());
    System.out.println("Stock restante: " +monitor.getStock());
    System.out.println("¿Se confirmó?: " +confirmado3);
}
