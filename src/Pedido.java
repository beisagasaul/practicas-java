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

    public boolean confirmarPedido() {
        if (_cliente.puedePagar()) {
            if (!_cliente.reduciStock()) {
                return false;
            }
            this._total = _cliente.total();
            _cliente.pagar();
            this._confirmado = true;
            return true;
        }
        return false;
    }

    public  void  mostrarResumen(){
        System.out.println("Cliente :"+this._cliente.getNombre());
        System.out.println("Total:"+this._total);
        System.out.println("Estado: "+this._confirmado);
    }

}
