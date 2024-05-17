package Productos;

import Usuarios.Cliente;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Compra {

    Scanner sc = new Scanner(System.in);
    private int idComra;
    Cliente cliente;
    Producto producto;
    private int cantidad;
    private double total;
    public Compra(){

    }
    public Compra(int idComra, Cliente cliente, Producto producto, int cantidad, double total) {
        this.idComra = idComra;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public int getIdComra() {
        return idComra;
    }

    public void setIdComra(int idComra) {
        this.idComra = idComra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    LinkedHashSet<Object> compra = new LinkedHashSet<>();
    TreeMap <String , Compra> treeCompras = new TreeMap<String, Compra>(); //No lo supe usar :/

    public void registroCompra(){
        System.out.println("---------------------------INGRESAR CODIGO DE LA COMPRA ---------------------------");
        idComra = sc.nextInt();
        compra.add(idComra);
        sc.nextLine();
        System.out.println("---------------------------INGRESAR ID DEL CLIENTE---------------------------------");
        int idCliente = cliente.getCodcliente();
        compra.add(idCliente);
        sc.nextLine();
        System.out.println("---------------------------NOMBRE DEL CLIENTE--------------------------------------");
        String nomcliente = cliente.getNombre();
        compra.add(nomcliente);
        System.out.println("---------------------------ID DEL PRODUCTO-----------------------------------------");
        int idProd = producto.getIdProd();
        compra.add(idProd);
        sc.nextLine();
        System.out.println("---------------------------NOMBRE DEL PRODUCTO-------------------------------------");
        String nombreProducto = getProducto().getNombreprod();
        compra.add(nombreProducto);
        System.out.println("---------------------------PRECIO DEL PRODUCTO-------------------------------------");
        double precio = producto.getPrecio();
        compra.add(precio);
        System.out.println("---------------------------CANTIDAD------------------------------------------------");
        cantidad = sc.nextInt();
        compra.add(cantidad);
        sc.nextLine();
        System.out.println("---------------------------TOTAL---------------------------------------------------");
        double totalCompra = precio * cantidad;
        compra.add(totalCompra);
    }

    public void imprimirCompra(){
        for(Object item: compra){
            System.out.println(item);
        }
    }
}
