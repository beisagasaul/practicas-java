//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("====ADMIN====");
    Administrador admin = new Administrador(
            1,
            "Saul",
            "admin@gmail.com",
            "123456",
            "TOTAL"
    );


    admin.mostrarPermisos();
    admin.mostrarNivelAcceso();
    admin.mostrarPerfil();


System.out.println("===CLIENTE====");
    Cliente cliente = new Cliente(
            2,
            "Carlos",
            "carlos@gmail.com",
            "123456",
            "Av. América"
    );
cliente.mostrarDireccion();
cliente.realizaCompra();
cliente.mostrarPerfil();
}
