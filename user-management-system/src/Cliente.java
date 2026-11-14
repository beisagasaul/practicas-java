
public class Cliente extends Usuario {

    private final String direccion;

    public Cliente(int id, String nombre, String correo,
                   String password, String direccion) {

        super(id, nombre, correo, password);
        this.direccion = direccion;
    }
public  void mostrarDireccion(){
        System.out.println("DIRECCION :"+this.direccion);
}
public  void realizaCompra(){
        System.out.println("EL cliente usuario hizo una compra");
}
}

