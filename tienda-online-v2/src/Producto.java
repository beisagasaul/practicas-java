public class Producto {
    private final int _id;
    private final String _nombre;
    private double _precio;
    private int _stock;
    private final String _categoria;


    public  Producto(int id, String nombre,double precio,int stock,String categoria){
        this._id=id;
        this._nombre=nombre;
        this._precio=precio;
        this._stock=stock;
        this._categoria=categoria;

    }
    public int getId(){return this._id;}
    public String getNombre(){return this._nombre;}
    public double getPrecio(){return this._precio;}
    public int getStock(){return this._stock;}
    public String getCategoria(){return this._categoria;}
    public void setPrecio(double nuevoP){
        if(nuevoP>0){
            this._precio=nuevoP;
        }
    }
    public  void setStock(int nuevoS){
        if(nuevoS>=0){
            this._stock=nuevoS;
        }
    }

    public void mostrarInfo(){
        System.out.println("=======PRODUCTOS=========");
        System.out.println("Id : "+this._id);
        System.out.println("Nombre : "+this._nombre);
        System.out.println("Precio Bs. : "+ this._precio);
        System.out.println("Stock : "+this._stock);
        System.out.println("Categoria : "+this._categoria);
    }

}
