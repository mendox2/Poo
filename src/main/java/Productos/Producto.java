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
    private double costo;
    private double margenGanancia;

    //Constructores


    public Producto(Scanner sc, int idProd, String nombreprod, double precio, int cantidad, Categoria cat, double costo, double margenGanancia) {
        this.sc = sc;
        this.idProd = idProd;
        this.nombreprod = nombreprod;
        this.precio = precio;
        this.cantidad = cantidad;
        this.cat = cat;
        this.costo = costo;
        this.margenGanancia = margenGanancia;
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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    public void crearProducto(){
        System.out.println("---------------------------ID PRODUCTO-----------------------------------");
        idProd = sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------------NOMBRE DEL PRODUCTO---------------------------");
        nombreprod = sc.nextLine();
        System.out.println("---------------------------Costo-----------------------------------------");
        double costo = sc.nextDouble();
        System.out.println("---------------------------Margen de ganancia----------------------------");
        double margenGanancia = sc.nextDouble();
        System.out.println("---------------------------PRECIO DEL PRODUCTO---------------------------");
        precio = calcularPrecio(costo, margenGanancia);
        sc.nextLine();//Siempre que reciba datos numericos por scanner resetea con nextLine()
        System.out.println("---------------------------CANTIDAD DE PRODUCTOS-------------------------");
        sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------------CATEGORIA-------------------------------------");
        String nomCategoria = cat.getNomCat();
    }

    public void seleccionarProducto(){
        System.out.println("Id Producto: "+ idProd);
        System.out.println("Nombre del producto: "+ nombreprod);
        System.out.println("Precio del prodcuto: "+ precio);
        System.out.println("Cantidad de prodcutos: "+ cantidad);
        String nomCategoria = cat.getNomCat();
        System.out.println("Categoria: "+ nomCategoria);
    }

    public double calcularPrecio(double costoProducto, double margenGanacia){
        double precio = costoProducto/(1-margenGanacia);

        return precio;
    }
}
