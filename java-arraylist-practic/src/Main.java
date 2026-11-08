import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.ArrayList;

void main() {
    ArrayList<Producto> productos = new ArrayList<>();
    Scanner sc=new Scanner(System.in);


     //INSERTAR
    Producto mouse = new Producto("Mouse Gamer", 150.0);
    Producto teclado = new Producto("Teclado", 250.0);
    Producto monitor = new Producto("Monitor", 800.0);
    Producto audifonos = new Producto("Audifonos", 120.0);
    Producto fruta = new Producto("zanahoria",1.50);
    Producto laptop= new Producto("laptop",4500.0);

    productos.add(mouse);
    productos.add(teclado);
    productos.add(monitor);
    productos.add(audifonos);
    productos.add(fruta);
    productos.add(1,laptop);



    int op=0;
    while (op!=6){
        System.out.println("===== TIENDA ONLINE =====");
        System.out.println("1. Mostrar productos");
        System.out.println("2. Buscar producto");
        System.out.println("3. Agregar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Actualizar precio");
        System.out.println("6. Salir");

        System.out.println("SELECCIONE UNA OPCION");
        op= sc.nextInt();
        sc.nextLine();
        int opl=-1;
        String buscar="";


        switch (op){
            case 1:
                //LISTA LOS PRODUCTOS


                while (opl!=0) {
                    System.out.println("\n===== LISTA DE PRODUCTOS =====");
                    for (Producto producto : productos) {
                        System.out.println(
                                producto.getNombre() + " - " +
                                        producto.getPrecio() + " Bs"
                        );
                    }

                    System.out.println("\n0. Regresar al menú principal");
                    System.out.print("Seleccione una opción: ");

                    opl = sc.nextInt();
                }
                break;
            case 2:
                //BUSCAR

                while (!buscar.equals("0")) {
                    System.out.print("\nBUSCAR PRODUCTO (0 para regresar ) : ");
                    buscar = sc.nextLine();

                    if(buscar.equals("0")){
                        System.out.println("Regresando..............");
                        break;
                    }

                    boolean encontrado = false;
                    int posicion = -1;
                    for (int i = 0; i < productos.size(); i++) {
                        if (productos.get(i).getNombre().equalsIgnoreCase(buscar)) {
                            encontrado = true;
                            posicion = i;
                            break;
                        }
                    }

                    if (encontrado) {
                        System.out.println("Índice: " + posicion);
                        System.out.println("Nombre: " + productos.get(posicion).getNombre());
                        System.out.println("Precio: " + productos.get(posicion).getPrecio() + " Bs");
                    } else {
                        System.out.println("No existe el producto: " + buscar + " que busca");
                    }

                }
                break;

            case 3:
                //AGREGAR PRODUCTO
                String nombreNUEVO="";
                while (!nombreNUEVO.equals("0")) {
                    System.out.print("\nAgregar  PRODUCTO (0 para regresar ) : ");
                    nombreNUEVO = sc.nextLine();

                    if(nombreNUEVO.equals("0")){
                        System.out.println("Regresando..............");
                        break;
                    }




                    //BUSCAR SU YA EXISTE EL PRODUCTO
                    boolean encontrado3 = false;

                    for (int i = 0; i < productos.size(); i++) {
                        if (productos.get(i).getNombre().equalsIgnoreCase(nombreNUEVO)) {
                            encontrado3 = true;
                            break;
                        }
                    }

                    if (encontrado3) {
                        System.out.println("El producto "+ nombreNUEVO+ " ya existe " );
                        continue;
                    }
                    //Solicitar precio
                    System.out.print("Ingresa el Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    //VALIDAR
                        if(precio<=0){
                            System.out.println("El precio debe ser mayor a 0");
                            continue;
                        }
                        //Contr y agregar producto

                            Producto ProductoNuevo = new Producto(nombreNUEVO, precio);
                            productos.add(ProductoNuevo);
                            System.out.println("Registro exitoso");
                        }
                break;

            case 4:
                // ELIMINAR PRODUCTO
                while (!buscar.equals("0")) {
                    System.out.print("\nBUSCAR PRODUCTO  PARA ELIMINAR (0 para regresar ) : ");
                    buscar = sc.nextLine();

                    if(buscar.equals("0")){
                        System.out.println("Regresando..............");
                        break;
                    }

                    boolean encontrado1 = false;
                    int posicion1 = -1;
                    for (int i = 0; i < productos.size(); i++) {
                        if (productos.get(i).getNombre().equalsIgnoreCase(buscar)) {
                            encontrado1 = true;
                            posicion1 = i;
                            break;
                        }
                    }

                    if (encontrado1) {
                        productos.remove(posicion1);
                        System.out.println("El producto es  " + buscar + " se elimino  correctamente  " );
                    } else {
                        System.out.println("No existe el producto que quiere eliminar");
                    };

                }
                break;

            case 5 :
                //ACTUALIZAR

                String nombreActualizar = "";

                while (!nombreActualizar.equals("0")) {

                    System.out.print("\nPRODUCTO A ACTUALIZAR (0 para regresar): ");
                    nombreActualizar = sc.nextLine();

                    if (nombreActualizar.equals("0")) {
                        System.out.println("Regresando al menú principal...");
                        break;
                    }

                    // BUSCAR PRODUCTO Y GUARDAR SU POSICIÓN
                    int posicion = -1;

                    for (int i = 0; i < productos.size(); i++) {

                        if (productos.get(i).getNombre().equalsIgnoreCase(nombreActualizar)) {
                            posicion = i;
                            break;
                        }
                    }

                    // COMPROBAR SI EXISTE
                    if (posicion != -1) {

                        double precioAnterior = productos.get(posicion).getPrecio();

                        System.out.println("\nProducto encontrado: " +
                                productos.get(posicion).getNombre());

                        System.out.println("Precio anterior: " + precioAnterior + " Bs");

                        // SOLICITAR NUEVO PRECIO
                        System.out.print("Ingresa el nuevo precio: ");
                        double nuevoPrecio = sc.nextDouble();
                        sc.nextLine();

                        // VALIDAR PRECIO
                        if (nuevoPrecio <= 0) {
                            System.out.println("El precio debe ser mayor a 0");
                        } else {
                            // ACTUALIZAR PRECIO
                            productos.get(posicion).setNuevoPrecio(nuevoPrecio);

                            System.out.println("\nPrecio actualizado correctamente!");
                            System.out.println("Precio anterior: " + precioAnterior + " Bs");
                            System.out.println("Nuevo precio: " +productos.get(posicion).getPrecio() + " Bs");
                        }
                    } else {
                        System.out.println("No existe el producto: " + nombreActualizar);
                    }
                }
                break;

            case 6:
                System.out.println("VUELVA PRONTO  :)");break;
            default: System.out.println("La opcion debe ser entre 1-6");break;

        }

    }




}