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

    //AGRTEGAR SALDO -> Agrega saldo a la cuenta del cliente
    public void agregarSaldo(double cantidad){
        if(cantidad>0){
            this._saldo+=cantidad;
        }
    }

    //PUEDE PAGAR -> ve si puede pagar verificando que su dinero sea igual o mayor a total de productos que hay en el carrito
    public boolean puedePagar(){
        return this._saldo >= _carrito.calcularTotal() && !_carrito.estaVacio();
    }

    //PAGAR ->verifica si puede pagar y si es asi paga resta el dienro
    public void pagar(){
        if(puedePagar()){
            this._saldo-= _carrito.calcularTotal();
        }
    }

    //Calcular el total -> calcula el totla traido de carrito
    public double total(){
     return   _carrito.calcularTotal();
    }
    //LLamar a reducirStock del producto del carrito si puede pagar
    public boolean reduciStock(){
        if(puedePagar()){
            return _carrito.reducirStock();

        }
        return false;
    }
}