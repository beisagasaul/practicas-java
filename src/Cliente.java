public class Cliente {
    private final String _nombre;
    private double _saldo;
    private Carrito _carrito;

    public Cliente(String nombre,double saldo,Carrito carrito){
        this._nombre=nombre;
        if(saldo<0) {
            throw  new IllegalArgumentException("el saldo no debe ser negativo");
        }
        this._saldo = saldo;
        this._carrito=carrito;
    }

    public String getNombre(){
        return this._nombre;
    }
    public double getSaldo(){return this._saldo;}

    //AGRTEGAR SALDO
    public void agregarSaldo(double cantidad){
        if(cantidad>0){
            this._saldo+=cantidad;
        }
    }

    //PUEDE PAGAR
    public boolean puedePagar(){
        return this._saldo >= _carrito.calcularTotal() && !_carrito.estaVacio();
    }

    //PAGAR
    public void pagar(){
        if(puedePagar()){
            this._saldo-= _carrito.calcularTotal();
        }
    }
}