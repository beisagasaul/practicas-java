public class Usuario {
    private  final int id;
    private final String nombre;
    private final  String correo;
    private final String password;

    public Usuario(int id,String nombre,String correo,String password){
        this.id=id;
        this.nombre=nombre;
        this.correo=correo;
        this.password=password;

    }
    public int getId(){ return this.id;}
    public String getNombre(){ return this.nombre;}
    public String getCorreo(){ return this.correo;}
    public String getPassword(){ return this.password;}


    public void mostrarPerfil(){
        System.out.println("ID : "+this.id);
        System.out.println("NOMBRE : "+this.nombre);
        System.out.println("CORREO: "+this.correo);
        System.out.println("PASSWORD : ***************");


    }


}
