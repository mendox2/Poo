package Productos;

import Usuarios.Cliente;
import Usuarios.Usuario;

public class TestProductos {
    public static void main(String[] args) {
/*        Usuario usuario3 = new Usuario(); no se puede implementar usuario por
 ser abstracta*/

        Categoria categoria = new Categoria();
        Producto producto = new Producto();
        Compra compraProductos = new Compra();
        Cliente cliente = new Cliente();
        //vamos a crear la agregacion (o composición) igualando los objetos
        producto.cat = categoria;
        compraProductos.producto = producto;
        compraProductos.cliente = cliente;

        cliente.crearUsuario();
        cliente.seleccionarUsuario();
        categoria.crearCategoria();
        categoria.seleccionarCategoria();
        producto.crearProducto();
        producto.seleccionarProducto();
        compraProductos.registroCompra();
        compraProductos.imprimirCompra();
    }
}
