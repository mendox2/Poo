package Controladores;

import Productos.Categoria;

import java.util.Scanner;

public class CategoryService {

    Scanner sc = new Scanner(System.in);

    public void crearCategoria(Categoria categoria){
        System.out.println("---------------------------ID CATEGORIA---------------------------");
        int idCat = sc.nextInt();
        sc.nextLine(); //Siempre que se haga un nextInt(); hacer abajo un nextLine();
        categoria.setIdCat(idCat);
        System.out.println("---------------------------NOMBRE CATEGORIA-----------------------");
        String nomCat = sc.nextLine();
        categoria.setNomCat(nomCat);

        CategoryDAO.createCategoryDAO(categoria);
    }

}
