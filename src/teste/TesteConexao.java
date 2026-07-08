
package teste;

import conexaoDAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {

   
    public static void main(String[] args) {
       Conexao.conectar();
    }
    
}
