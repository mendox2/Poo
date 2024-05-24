package Productos;

import java.util.Scanner;

public class Categoria {

    Scanner sc = new Scanner(System.in);

    //1. Crear atributos.
    private int idCat;
    private String nomCat;

    //2. Crear el constructor.

    public Categoria(){

    }

    public Categoria(int idCat, String nomCat) {
        this.idCat = idCat;
        this.nomCat = nomCat;
    }

    //3. Crear getters y setters

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }
    //4. Crear metodos propios.

    public void crearCategoria(){
        System.out.println("---------------------------ID CATEGORIA---------------------------");
        idCat = sc.nextInt();
        sc.nextLine(); //Siempre que se haga un nextInt(); hacer abajo un nextLine();
        System.out.println("---------------------------NOMBRE CATEGORIA-----------------------");
        nomCat = sc.nextLine();
    }

    public void seleccionarCategoria(){
        System.out.println("Id categoria: "+ idCat);
        System.out.println("Nombre categoria: "+ nomCat);
    }
}
