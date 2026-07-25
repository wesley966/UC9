
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    private static final String url = "jdbc:postgresql://localhost/EscolaGrafica";
    private static final String usuario = "postgres";
    private static final String senha = "root";
    
    public static Connection conectar() {
    try{
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        System.out.println("Conexão realizada com sucesso!");
        return conexao;
    }
    catch(SQLException erro){
        System.out.println("Erro ao conectar com o banco!");
        System.out.println(erro.getMessage());
        return null;
    }
}
}
