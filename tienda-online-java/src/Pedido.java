public class Pedido {
    private  Cliente _cliente;
    private double _total;
    private  boolean _confirmado;

    public Pedido(Cliente cliente ){
        this._cliente=cliente;
        this._total=0;
        this._confirmado=false;
    }
    public double getTotal(){return this._total;}
    public boolean isConfirmado(){return this._confirmado;}

    // Confirma el pedido verificando que el cliente pueda pagar y que se pueda reducir el stock.
    public boolean confirmarPedido() {
        // Verfica si el cliente tiene dinero suficiente y el carrito no está vacío.
        if (_cliente.puedePagar()) {
            if (!_cliente.reduciStock()) {
                return false;
            }

            // Guarda el importe total del carrito en el pedido.
            this._total = _cliente.total();

            // Descuenta el importe total del saldo del cliente.
            _cliente.pagar();

            // Marca el pedido como confirmado.
            this._confirmado = true;

            // Indica que el pedido se confirmó correctamente.
            return true;
        }

        // Si el cliente no puede pagar, el pedido no se confirma.
        return false;
    }

    public  void  mostrarResumen(){
        System.out.println("Cliente :"+this._cliente.getNombre());
        System.out.println("Total:"+this._total);
        System.out.println("Estado: "+this._confirmado);
    }

}
