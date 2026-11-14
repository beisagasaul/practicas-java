public class Administrador  extends     Usuario{
    private String nivelAcceso;
    public Administrador(int id,String nombre,String correo,String password,String nivelAcceso){
        super(id,nombre,correo,password);
        this.nivelAcceso=nivelAcceso;
    }

    public void mostrarPermisos(){
        System.out.println("El administrador "+ this.getNombre()+" tiene acceso total al sistema.");
    }
    public void mostrarNivelAcceso() {
        System.out.println("Nivel de acceso: " + this.nivelAcceso);
    }

}
