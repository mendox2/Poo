package Productos;

import Usuarios.Cliente;

import java.util.LinkedHashSet;
import java.util.Scanner;

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

    public void registroCompra(){
        System.out.println("Ingresar codigo de compra: ");
        idComra = sc.nextInt();
        compra.add(idComra);
        sc.nextLine();
        System.out.println("Ingresar id cliente: ");
        int idCliente = cliente.getCodcliente();
        compra.add(idCliente);
        sc.nextLine();
        System.out.println("Ingrese nombre del cliente: ");
        String nomcliente = cliente.getNombre();
        compra.add(nomcliente);
        System.out.println("Id producto: ");
        int idProd = producto.getIdProd();
        compra.add(idProd);
        sc.nextLine();
        System.out.println("Nombre producto: ");
        String nombreProducto = getProducto().getNombreprod();
        compra.add(nombreProducto);
        System.out.println("Precio producto: ");
        double precio = producto.getPrecio();
        compra.add(precio);
        System.out.println("Cantidad: ");
        cantidad = sc.nextInt();
        compra.add(cantidad);
        sc.nextLine();
        System.out.println("Total: ");
        double totalCompra = precio * cantidad;
        compra.add(totalCompra);
    }

    public void imprimirCompra(){
        for(Object item: compra){
            System.out.println(item);
        }
    }
}
