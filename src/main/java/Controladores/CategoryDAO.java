package Controladores;

import Productos.Categoria;

import java.sql.*;

import Productos.Categoria;

public class CategoryDAO {

    public static void createCategoryDAO(Categoria category){

        Conexion conexion = new Conexion();

        try(Connection connection = conexion.getConnect()){

            PreparedStatement ps = null;

            try{

                String query = "INSERT INTO category(category_name)VALUES(?)";

                ps = connection.prepareStatement(query);
                ps.setString(1, category.getNomCat());

                ps.executeUpdate();

                System.out.println("Registro de categoria exitoso");

            }catch(SQLException e){
                System.out.println(e);
            }

        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public static void selectCategoryDAO(){
        Conexion conexion = new Conexion();

        try(Connection connection = conexion.getConnect()){

            PreparedStatement ps = null;
            ResultSet rs = null;

            try{
                String query = "SELECT * FROM category";
                ps = connection.prepareStatement(query);
                rs = ps.executeQuery();

                while(rs.next()){
                    System.out.println("Id: " + rs.getInt("id_category"));
                    System.out.println("Categoria : " + rs.getString("category_name"));
                }
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("No se pudo recuperar la informacion");

            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void deleteCategoryDAO(int idCategory) {

        Conexion conexion = new Conexion();

        try (Connection connection = conexion.getConnect()) {

            PreparedStatement ps = null;

            try {

                String query = "DELETE FROM category WHERE category.id_category = ?";

                ps = connection.prepareStatement(query);
                ps.setInt(1, idCategory);
                ps.executeUpdate();

                System.out.println("Se he eliminado correctamente");

            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateCategoryDAO(Categoria categoria){

        Conexion conexion = new Conexion();

        try(Connection connection = conexion.getConnect()){

            PreparedStatement ps = null;

            try{

                int opc = categoria.getOpc();

                if(opc == 1){
                    String query = "UPDATE category SET category_name WHERE id_category = ?";

                    ps = connection.prepareStatement(query);
                    ps.setString(1, categoria.getNomCat());
                    ps.setInt(2, categoria.getIdCat());
                    ps.executeUpdate();

                    System.out.println("Registro actualizado correctamente");
                }

            }catch(SQLException e){
                System.out.println(e);
            }

        }catch(SQLException e){
            System.out.println(e);
        }

    }

}
