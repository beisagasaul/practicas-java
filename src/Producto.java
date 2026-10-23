public class Producto {
    private final String _nombre;
    private  double _precio;
    private int _stock;

    public Producto(String nombre,double precio,int stock){
        this._nombre =nombre;
        if(precio>0){
            this._precio =precio;
        }else{
            throw  new IllegalArgumentException("EL precio debe ser mayor a cero");
        }
        if(stock<0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");

        }
        this._stock = stock;
    }
    public String getNombre(){return this._nombre;}
    public double getPrecio(){return this._precio;}
    public int getStock(){return this._stock;}

    public void setPrecio(double nuevo){
        if(nuevo>0){
            this._precio=nuevo;
        }else {
            throw  new IllegalArgumentException("EL precio debe ser mayor a cero");
        }
    }
    public void setStock(int nuevo){
        if(nuevo<0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");

        }
        this._stock = nuevo;
    }

    //DISPONIBILIDAD
    public boolean  estaDisponible(int cantidad){
        return cantidad <= this._stock && cantidad>0;
    }

    //REDUCIR STOCK
    public void reducirStock(int cantidad){
        if(estaDisponible(cantidad)){
            this._stock-=cantidad;
        }
    }
    //REPONER STOCK
    public void reponerStock(int cantidad){
        if(cantidad>0){
            this._stock+=cantidad;
        }
    }
    //Calcular Subtotal
    public double calcularSubtotal(int cantidad){
        if(cantidad>0) {
            return this._precio * cantidad;
        }else{
            return 0;
        }
    }

}