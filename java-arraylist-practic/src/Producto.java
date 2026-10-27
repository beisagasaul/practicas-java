public class Producto {

    private String _nombre;
    private double _precio;

    public Producto(String nombre,double precio){
        this._nombre=nombre;
        this._precio=precio;
    }

    public String getNombre(){
        return this._nombre;
    }
    public double getPrecio(){
        return this._precio;
    }
}
