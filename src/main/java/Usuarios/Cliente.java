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
        System.out.println("Seleccione 1 para persona natural o 2 para persona juridica: ");
        int opc = sc.nextInt();
        sc.nextLine();
        tipoCliente = seleccionarTipoCliente(opc);
        System.out.println("---------------------------CODIGO CLIENTE-------------------------");
        codcliente = sc.nextInt();
    }

    public String seleccionarTipoCliente(int opc){
        if (opc == 1) {
            String personaNatural = String.valueOf(TipoCliente.PERSONA_NATURAL);
            return personaNatural;
        } else if (opc == 2) {
            String personaJuridica = String.valueOf(TipoCliente.PERSONA_JURIDICA);
            return personaJuridica;
        }else{
            String mensaje = "Selecciona una opcion valida";
            return mensaje;
        }
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
