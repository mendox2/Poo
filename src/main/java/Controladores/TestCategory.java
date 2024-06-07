package Controladores;

import Productos.Categoria;

public class TestCategory {

    public static void main(String[] args) {

        CategoryService categoryService = new CategoryService();
        Categoria category = new Categoria();

        categoryService.crearCategoria(category);

    }

}
