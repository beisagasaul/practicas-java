import java.lang.classfile.constantpool.DoubleEntry;

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

    //AGREGAR PRODUCTO->Agrega producto al carrito verificando que lo que ya selecciona mas el nuevamente selecciono
    //no se mayor a la disponibilidad que hay
    public void agregarProducto(int cantidad){
        int cantidadTotal=this._cantidadCarrito+cantidad;
        if(_producto.estaDisponible(cantidadTotal)  && cantidad>0){
            this._cantidadCarrito+=cantidad;
        }else{System.out.println("NO hay suficiente stock");}
    }
    //QUITAR PRODUCTO->reduce verificando que la cantidad sea mauyor a 0 y
    //cantidad sea menor o igual al que ya selecciono en carrito
    public void quitarProducto(int cantidad){
        if(cantidad>0 && cantidad<=this._cantidadCarrito){
            this._cantidadCarrito-=cantidad;
        }
        else{
            System.out.println("La cantidad que desea retirar no se puede retirar ");
        }
    }

    //CALCULAR EL TOTAL -> Calcula el total la cantidad que hay en el carrito
    public double calcularTotal(){
        return _producto.calcularSubtotal(this._cantidadCarrito);
    }

    //SI no hay productos-> me muestra que esta vacio si no hay nada
    public boolean estaVacio(){
        return  this._cantidadCarrito==0;
    }


    // Reducir el stock según la cantidad del carrito->reduce el Stock  verificando si esta disponible
    // y reduce la cantidad que hay en el carrito y solo devuelve TRUE
    public boolean reducirStock() {
        if (_producto.estaDisponible(_cantidadCarrito)) {
            _producto.reducirStock(_cantidadCarrito);
            return true;
        }
        return false;


    }


}