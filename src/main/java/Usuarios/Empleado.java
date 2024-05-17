package Usuarios;

import java.util.Scanner;

public class Empleado extends Usuario{

    Scanner sc = new Scanner(System.in);

    private int codEmp;
    private double salario;
    private String cargo;

    public Empleado(){
        super();
    }

    public Empleado(int id, String nombre, String apellido, String phone, String mail, int codEmp, double salario) {
        super(id, nombre, apellido, phone, mail);
        this.codEmp = codEmp;
        this.salario = salario;
    }

    public int getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(int codEmp) {
        this.codEmp = codEmp;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void crearUsuario() {
        super.crearUsuario();
        System.out.println("---------------------------CARGO---------------------------");
        cargo = sc.nextLine();
        System.out.println("---------------------------SALARIO-------------------------");
        salario = sc.nextDouble();
    }

    @Override
    public void actualizarUsuario() {
        super.actualizarUsuario();
    }

    @Override
    public void seleccionarUsuario() {
        super.seleccionarUsuario();
    }

    @Override
    public void eliminarUsuario() {
        super.eliminarUsuario();
    }
}
