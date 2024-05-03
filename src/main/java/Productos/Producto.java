package Productos;

import java.util.Scanner;

public class Producto {

    Scanner sc = new Scanner(System.in);

    //Atributos

    private int idProd;
    private String nombreprod;
    private double precio;
    private int cantidad;
    Categoria cat;

    //Constructores

    public Producto(Scanner sc, int idProd, String nombreprod, double precio, int cantidad, Categoria cat) {
        this.sc = sc;
        this.idProd = idProd;
        this.nombreprod = nombreprod;
        this.precio = precio;
        this.cantidad = cantidad;
        this.cat = cat;
    }
    public Producto(){

    }
    //Getters y setters


    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNombreprod() {
        return nombreprod;
    }

    public void setNombreprod(String nombreprod) {
        this.nombreprod = nombreprod;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    public void crearProducto(){
        System.out.println("Id Producto: ");
        idProd = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre del producto: ");
        nombreprod = sc.nextLine();
        System.out.println("Precio del prodcuto: ");
        precio = sc.nextDouble();
        sc.nextLine();//Siempre que reciba datos numericos por scanner resetea con nextLine()
        System.out.println("Cantidad de prodcutos: ");
        sc.nextInt();
        sc.nextLine();
        System.out.println("Categoria: ");
        Categoria
    }

    public void seleccionarProducto(){}
}
