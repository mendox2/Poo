package Usuarios;

import java.util.Scanner;

public class Usuario {

    Scanner sc = new Scanner(System.in);

    //Atributos
    protected int id;
    private String nombre;
    private String apellido;
    private String phone;
    private String mail;

    //Constructores
    public Usuario(){}
    //alt+ins para crear un constructor automaticamente


    public Usuario(int id, String nombre, String apellido, String phone, String mail) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.phone = phone;
        this.mail = mail;
    }
    //encapsulamiento Getters and Setters

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getMail(){
        return this.mail;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Metodos o comportamientos

    public void crearUsuario(){
        System.out.println("Id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Apellidio: ");
        apellido = sc.nextLine();
        System.out.println("Telefono: ");
        phone = sc.nextLine();
        System.out.println("Correo: ");
        mail = sc.nextLine();
    }

    public void actualizarUsuario(){}

    public void seleccionarUsuario(){
        System.out.println("Id: "+ id);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellidio: "+ apellido);
        System.out.println("Telefono: "+ phone);
        System.out.println("Correo: "+ mail);
    }

    public void seleccionarUsuario(String nit, String rut){
        System.out.println("Id: "+ id);
        System.out.println("Nit: "+ nit);
        System.out.println("Rut: "+rut);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellidio: "+ apellido);
        System.out.println("Telefono: "+ phone);
        System.out.println("Correo: "+ mail);
    }

    public void eliminarUsuario(){}
}
