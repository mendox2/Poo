package Productos;

import Usuarios.Cliente;
import Usuarios.Empleado;
import Usuarios.Empresa;
import Usuarios.Usuario;

import java.util.Scanner;

public class TestProductos {
    public static void main(String[] args) {
/*        Usuario usuario3 = new Usuario(); no se puede implementar usuario por
 ser abstracta*/
        boolean conf;
        boolean cont;
        int categoriaa;

        Scanner sc = new Scanner(System.in);
        Categoria categoria = new Categoria();
        Producto producto = new Producto();
        Compra compraProductos = new Compra();
        Cliente cliente = new Cliente();
        Empleado empleado = new Empleado();
        Empresa empresa = new Empresa();

        //vamos a crear la agregacion (o composición) igualando los objetos

        producto.cat = categoria;
        compraProductos.producto = producto;
        compraProductos.cliente = cliente;

        System.out.println("Escriba 'true' para comenzar o false para retirarse");
        conf = sc.nextBoolean();
        if (conf == true) {
            do {
                System.out.println("Que quieres hacer?" +
                        "\n 1 para registrar cliente: " +
                        "\n 2 para registrar empleado: " +
                        "\n 3 para registrar empresa: "+
                        "\n 4 para registrar la categoria: "+
                        "\n 5 para registrar producto: "+
                        "\n 6 para comprar: "+
                        "\n 7 para salir: ");
                categoriaa = sc.nextInt();
                switch (categoriaa) {
                    case 1:
                        cliente.crearUsuario();
                        cliente.seleccionarUsuario();
                        break;
                    case 2:
                        empleado.crearUsuario();
                        empleado.seleccionarUsuario();
                        break;
                    case 3:
                        empresa.crearEmpresa();
                        empresa.seleccionarEmpresa();
                        break;
                    case 4:
                        categoria.crearCategoria();
                        categoria.seleccionarCategoria();
                        break;
                    case 5:
                        producto.crearProducto();
                        producto.seleccionarProducto();
                        break;
                    case 6:
                        compraProductos.registroCompra();
                        compraProductos.imprimirCompra();
                        break;
                    case 7:
                        System.out.println("Saliendo del menú, vuelva pronto");
                        break;
                    default:
                        System.out.println("Lo lamento el numero no fue identificado," +
                                "intentalo luego");
                }
                System.out.println("--------------------DESEA CONTINUAR?------------------------------");
                System.out.println("(Escriba true o false)");
                cont = sc.nextBoolean();
            } while (cont == true);
            System.out.println("---------------------------HASTA LUEGO---------------------------");
        }
    }
}
