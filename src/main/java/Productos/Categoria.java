package Productos;

import java.util.Scanner;

public class Categoria {

    Scanner sc = new Scanner(System.in);

    //1. Crear atributos.
    private int idCat;
    private String nomCat;
    private int opc;

    //2. Crear el constructor.

    public Categoria(){

    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    public Categoria(int idCat, String nomCat, int opc) {
        this.idCat = idCat;
        this.nomCat = nomCat;
        this.opc = opc;
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

    public void seleccionarCategoria(){
        System.out.println("Id categoria: "+ idCat);
        System.out.println("Nombre categoria: "+ nomCat);
    }
}
