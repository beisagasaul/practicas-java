public class Carrito {
    private Producto _producto;
    private int _cantidadCarrito;

    public Carrito(Producto producto){
        this._producto=producto;
        this._cantidadCarrito=0;

    }

    public int getCantidad(){
        return this._cantidadCarrito;
    }

    //AGREGAR PRODUCTO
    public void agregarProducto(int cantidad){
        int cantidadTotal=this._cantidadCarrito+cantidad;
        if(_producto.estaDisponible(cantidadTotal)  && cantidad>0){
            this._cantidadCarrito+=cantidad;
        }else{System.out.println("NO hay suficiente stock");}
    }
    //QUITAR PRODUCTO
    public void quitarProducto(int cantidad){
        if(cantidad>0 && cantidad<=this._cantidadCarrito){
            this._cantidadCarrito-=cantidad;
        }
        else{
            System.out.println("La cantidad que desea retirar no se puede retirar ");
        }
    }

    //Calcular total
    public double calcularTotal(){
        return _producto.calcularSubtotal(this._cantidadCarrito);
    }

    //SI no hay productos
    public boolean estaVacio(){
        return  this._cantidadCarrito==0;
    }


}