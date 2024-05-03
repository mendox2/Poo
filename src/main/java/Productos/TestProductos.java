package Productos;

import Usuarios.Usuario;

public class TestProductos {
    public static void main(String[] args) {
        Usuario usuario3 = new Usuario();

        Categoria categoria = new Categoria();
        Producto producto = new Producto();
        //vamos a crear la agregacion (o ocmposición) igualando los objetos
        producto.cat = categoria;

        categoria.crearCategoria();
        categoria.seleccionarCategoria();
        producto.crearProducto();
        producto.seleccionarProducto();

    }
}
