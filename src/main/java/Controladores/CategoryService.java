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

    public void selectCategory(){

        CategoryDAO.selectCategoryDAO();

    }

    public void deleteCategory(){

        System.out.println("Indique el ud de la categoria a Eliminar");
        int id = sc.nextInt();
        CategoryDAO.deleteCategoryDAO(id);

    }

    public void updateCategory(Categoria category){

        System.out.println("Seleccione el campo a eliminar\n" +
                "1. Actualizar ");

        int opc = sc.nextInt();
        sc.nextLine();
        category.setOpc(opc);

        switch(opc){
            case 1:
                System.out.println("Ingrese el id de la categoria a actualizar");
                int id = sc.nextInt();
                sc.nextLine();
                category.setIdCat(id);
                System.out.println("Ingrese el nuevo nombre de la categoria");
                String nombreNuevoCategoria = sc.nextLine();
                category.setNomCat(nombreNuevoCategoria);

                CategoryDAO.updateCategoryDAO(category);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }

    }

}
