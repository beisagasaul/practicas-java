//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Tienda tienda=new Tienda("Online");
    Producto p1 = new Producto(1, "Mouse", 80, 10, "Tecnología");
    Producto p2 = new Producto(2, "Teclado", 150, 5, "Tecnología");
    tienda.agregarP(p1);
    tienda.agregarP(p2);
    Scanner sc=new Scanner(System.in);

    int op=0;
    while(op!=7){
        System.out.println("===== TIENDA ONLINE =====");
        System.out.println("1. Mostrar productos");
        System.out.println("2. Buscar producto");
        System.out.println("3. Agregar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Actualizar precio");
        System.out.println("6. Salir");

        System.out.println("SELECCIONE UNA OPCION");
        op= sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Lista de Productos");
                tienda.listarP();
                break;
            case 2:
                System.out.print("BUSCAR por ID : ");
                int buscar = sc.nextInt();
                tienda.buscarP(buscar);
                break;

            case 3:
                System.out.print("Ingrese ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese precio: ");
                double precio = sc.nextDouble();
                System.out.print("Ingrese stock: ");
                int stock = sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese categoria: ");
                String categoria = sc.nextLine();
                Producto nuevo = new Producto(id, nombre, precio, stock, categoria);
                tienda.agregarP(nuevo);
                System.out.println("Producto agregado correctamente");
                break;
            case 4:
                System.out.print("ELIMINAR POR ID: ");
                int idEliminar = sc.nextInt();
                tienda.eliminarP(idEliminar);
                break;
            case 5:
                System.out.print("INGRESE EL ID QUE DESEA MODIFICAR :");
                int idA=sc.nextInt();
                System.out.print("Ingrese el nuevo precio: ");
                double precioNuevo=sc.nextDouble();
                tienda.actualizarPrecio(idA,precioNuevo);
                break;
            case 6:
                System.out.print("INGRESE EL ID QUE DESEA MODIFICAR :");
                int idS=sc.nextInt();
                System.out.print("Ingrese el nuevo precio: ");
                int stockNuevo=sc.nextInt();
                tienda.actualizarStock(idS,stockNuevo);
                break;


            case 7:
                System.out.println("Vuelva pronto");break;

            default: System.out.println("EL numero debe ser entre 1-7");





        }










                //BUSCAR




        }

    }



