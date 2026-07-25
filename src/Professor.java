
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Professor {
      
    private int ID;
    private String Nome;
    private String Disciplina;
    private String Email;
    private String Telefone;
    
    
    public Professor(int id,String nome,String disciplina,String email,String telefone){
        this.ID = id;
        this.Nome = nome;
        this.Disciplina = disciplina;
        this.Email = email;
        this.Telefone = telefone;
    }

    private Professor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return Nome;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public String getEmail() {
        return Email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setDisciplina(String Disciplina) {
        this.Disciplina = Disciplina;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
       public static void main(String args[]) {
   
        Professor.cadastrar();
    }
    
    public boolean cadastrar(int id, String nome,String disciplina,String email,String telefone){
        
        String sql = "insert into professor"
                    +"(nome,disciplina,email,telefone)"
                    +"values (?,?,?,?)";
      try{
          Connection conexao = Conexao.conectar();
          if(conexao == null){
              System.out.println("Não foi posssível estabelecer uma conexão!");
              return false;
          }
          PreparedStatement stmt = conexao.prepareStatement(sql);
          stmt.setString(1,nome);
          stmt.setString(2,disciplina);
          stmt.setString(3,email);
          stmt.setString(4,telefone);
         
          
          
         int linhas = stmt.executeUpdate();
         stmt.close();
         conexao.close();
         return linhas > 0;
      }
      catch(SQLException erro){
             System.out.println("Erro ao cadastrar.");
            System.out.println(erro.getMessage());
            return false;
      }
    
}
     public static void buscarProf(int id){
        
        String sql = "SELECT * FROM aluno WHERE id = ?";
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1,id);
            
            ResultSet resultado = stmt.executeQuery();
            
            
                resultado.close();
                stmt.close();
                conexao.close();
        } catch (SQLException erro){
            System.out.println("Erro ao Buscar professor");
            System.out.println(erro.getMessage());
        }
     }
     public static ArrayList<Professor> listar() {

        ArrayList<Professor> lista = new ArrayList<>();

        String sql = "SELECT * FROM aluno ORDER BY id";

        try {
            Connection conexao = Conexao.conectar();

            if (conexao == null) {
                return lista;
            }

            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {

                Professor professor = new Professor();

                professor.setID(resultado.getInt("id"));
                professor.setNome(resultado.getString("nome"));
                professor.setDisciplina(resultado.getString("disciplina"));
                professor.setEmail(resultado.getString("email"));
                professor.setTelefone(resultado.getString("telefone"));
                

                lista.add(professor);
            }

            resultado.close();
            stmt.close();
            conexao.close();

        } catch (SQLException erro) {
            System.out.println("Erro ao listar alunos.");
            System.out.println(erro.getMessage());
        }

        return lista;
    }

}
