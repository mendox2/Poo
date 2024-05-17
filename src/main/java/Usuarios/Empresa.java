package Usuarios;

import java.util.Scanner;

public class Empresa extends Usuario{
    Scanner sc = new Scanner(System.in);

    private int id;
    private String nit;
    private String rut;
    private String nombre;
    private String type;
    private String num;
    private String mail;

    public Empresa(){super();}

    public Empresa(int id, String nombre, String apellido, String phone, String mail, Scanner sc, int id1, String nit, String rut, String nombre1, String type, String num, String mail1) {
        super(id, nombre, apellido, phone, mail);
        this.sc = sc;
        this.id = id1;
        this.nit = nit;
        this.rut = rut;
        this.nombre = nombre1;
        this.type = type;
        this.num = num;
        this.mail = mail1;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String getMail() {
        return mail;
    }

    @Override
    public void setMail(String mail) {
        this.mail = mail;
    }

    public void crearEmpresa(){
        System.out.println("---------------------------ID---------------------------");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------------NIT--------------------------");
        nit = sc.nextLine();
        System.out.println("---------------------------RUT--------------------------");
        rut = sc.nextLine();
        System.out.println("---------------------------NOMBRE-----------------------");
        nombre = sc.nextLine();
        System.out.println("---------------------------TIPO EMPRESA-----------------");
        type = sc.nextLine();
        System.out.println("---------------------------TELEFONO---------------------");
        num = sc.nextLine();
        System.out.println("---------------------------CORREO-----------------------");
        mail = sc.nextLine();
    }


    public void seleccionarEmpresa(){
        System.out.println("Id: "+ id);
        System.out.println("Nit: "+ nit);
        System.out.println("Rut: "+rut);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Tipo de empresa: "+ type);
        System.out.println("Telefono: "+ num);
        System.out.println("Correo: "+ mail);
    }
}
