package Usuarios;

import java.util.Scanner;

public class Cliente extends Usuario{

    Scanner sc = new Scanner(System.in);

    private String tipoCliente;
    private int codcliente;

    //Constructor
    public Cliente(){
        super();//para pasar las cosas de clase padre
    }

    public Cliente(int id, String nombre, String apellido, String phone, String mail, String tipoCliente, int codcliente) {
        super(id, nombre, apellido, phone, mail);
        this.tipoCliente = tipoCliente;
        this.codcliente = codcliente;
    }

    //getters and setters


    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    //Metodos propios
    @Override
    public void crearUsuario() {
        super.crearUsuario();
        System.out.println("Tipo cliente: ");
        tipoCliente = sc.nextLine();
        System.out.println("Codigo cliente: ");
        codcliente = sc.nextInt();
    }

    @Override
    public void actualizarUsuario() {
        super.actualizarUsuario();
    }

    @Override
    public void seleccionarUsuario() {
        super.seleccionarUsuario();
        System.out.println("Tipo cliente: "+ tipoCliente);
        System.out.println("Codigo cliente: "+ codcliente);
    }

    @Override
    public void seleccionarUsuario(String nit, String rut) {
        super.seleccionarUsuario(nit, rut);
        System.out.println("Tipo cliente: "+ tipoCliente);
        System.out.println("Codigo cliente: "+ codcliente);
    }

    @Override
    public void eliminarUsuario() {
        super.eliminarUsuario();
    }
}
