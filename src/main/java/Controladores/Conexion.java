package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConnect(){

        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda_cesde","root", "");
            if(connection != null){
                System.out.println("Conexion exitosa");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return connection;
    }

}
