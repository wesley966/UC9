/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;
   import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author WESLLEIOLIVEIRADAROS
 */
public class Conexao {

    private static final String URL =
            "jdbc:postgresql://localhost/FerragemGK";

    private static final String USUARIO = "postgres";

    private static final String SENHA = "root";

    public static Connection conectar() throws SQLException {

        return DriverManager.getConnection(
                URL,
                USUARIO,
                SENHA
        );
    }
}

