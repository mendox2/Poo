package Usuarios;

public class TestUsuario {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        usuario1.setNombre("maria");
        usuario1.setMail("maria@mail.com");
        System.out.println(usuario1.getNombre());
        System.out.println(usuario1.getMail());

    }
}
