import java.util.ArrayList;

//productos	La lista completa
//Producto	El tipo de objeto
//producto	Cada objeto de la lista

public class Tienda {

 private  final String _nombre;
 private  ArrayList<Producto> productos;

 public Tienda(String nombre){
     this._nombre=nombre;
     this.productos=new ArrayList<>();

 }

 //Agregar producto
    public void agregarP(Producto producto){

     productos.add(producto);
    }


    //Listar Productos
    public void listarP(){
     for(Producto producto:productos){
         producto.mostrarInfo();
     }
    }
    // Buscar
    public void buscarP(int id){
     boolean existe=false;
     int posicion=-1;
     for(int i =0;i<productos.size();i++){
         if(productos.get(i).getId()== id){
             existe=true;
             posicion=i;
             break;

         }
     }
     if(existe){
         productos.get(posicion).mostrarInfo();
     }
     else{
         System.out.println("NO existe");
     }
    }

    //Eliminar
    public void eliminarP(int id){
     boolean existe=false;
     int posicion=-1;

     for(int i =0; i<productos.size();i++){
         if(productos.get(i).getId()==id){
             existe=true;
             posicion=i;
             break;
         }
     }
     if(existe){
         productos.remove(posicion);
         System.out.println("Producto eliminado correctamente");
     }
     else{
         System.out.println("No existe el producto que desea eliminar");
     }

    }
    //Actualizar Precio
    public void actualizarPrecio(int id, double nuevoPrecio){
     boolean existe=false;
     int posicion=-1;
        for(int i =0; i<productos.size();i++){
            if(productos.get(i).getId()==id){
                existe=true;
                posicion=i;
                break;
            }
        }
        if(existe){
            productos.get(posicion).setPrecio(nuevoPrecio);
            System.out.println("Se actualiza correctamente");

        }else{
            System.out.println("NO existe el producto");
        }
        }

    //Actualizar Stock
    public void actualizarStock(int id, int nuevoStock){
        boolean existe=false;
        int posicion=-1;
        for(int i =0; i<productos.size();i++){
            if(productos.get(i).getId()==id){
                existe=true;
                posicion=i;
                break;
            }
        }
        if(existe){
            productos.get(posicion).setStock(nuevoStock);
            System.out.println("Se actualiza correctamente");

        }else{
            System.out.println("NO existe");
        }
    }


}



