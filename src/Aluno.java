
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Aluno {

    private int ID;
    private String Nome;
    private String Turma;
    private String Email;

    // Construtor vazio (necessário para criar objetos sem parâmetros)
    public Aluno() {
    }

    // Construtor com parâmetros
    public Aluno(int id, String nome, String turma, String email) {
        this.ID = id;
        this.Nome = nome;
        this.Turma = turma;
        this.Email = email;
    }

    // Getters
    public int getID() {
        return ID;
    }

    public String getNome() {
        return Nome;
    }

    public String getTurma() {
        return Turma;
    }

    public String getEmail() {
        return Email;
    }

    // Setters
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    // Método para cadastrar um aluno
    public boolean cadastrar(String nome, String turma, String email) {

        String sql = "INSERT INTO aluno (nome, turma, email) VALUES (?, ?, ?)";

        try {
            Connection conexao = Conexao.conectar();

            if (conexao == null) {
                System.out.println("Não foi possível estabelecer conexão com o banco.");
                return false;
            }

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, nome);
            stmt.setString(2, turma);
            stmt.setString(3, email);

            int linhas = stmt.executeUpdate();

            stmt.close();
            conexao.close();

            return linhas > 0;

        } catch (SQLException erro) {
            System.out.println("Erro ao cadastrar aluno.");
            System.out.println(erro.getMessage());
            return false;
        }
    }

    // Método para listar todos os alunos
    public static ArrayList<Aluno> listar() {

        ArrayList<Aluno> lista = new ArrayList<>();

        String sql = "SELECT * FROM aluno ORDER BY id";

        try {
            Connection conexao = Conexao.conectar();

            if (conexao == null) {
                return lista;
            }

            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {

                Aluno aluno = new Aluno();

                aluno.setID(resultado.getInt("id"));
                aluno.setNome(resultado.getString("nome"));
                aluno.setTurma(resultado.getString("turma"));
                aluno.setEmail(resultado.getString("email"));

                lista.add(aluno);
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

    // Método para atualizar um aluno
    public boolean atualizar(int id, String nome, String turma, String email) {

        String sql = "UPDATE aluno SET nome = ?, turma = ?, email = ? WHERE id = ?";

        try {
            Connection conexao = Conexao.conectar();

            if (conexao == null) {
                return false;
            }

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, nome);
            stmt.setString(2, turma);
            stmt.setString(3, email);
            stmt.setInt(4, id);

            int linhas = stmt.executeUpdate();

            stmt.close();
            conexao.close();

            return linhas > 0;

        } catch (SQLException erro) {
            System.out.println("Erro ao atualizar aluno.");
            System.out.println(erro.getMessage());
            return false;
        }
    }

    // Método para excluir um aluno
    public boolean excluir(int id) {

        String sql = "DELETE FROM aluno WHERE id = ?";

        try {
            Connection conexao = Conexao.conectar();

            if (conexao == null) {
                return false;
            }

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, id);

            int linhas = stmt.executeUpdate();

            stmt.close();
            conexao.close();

            return linhas > 0;

        } catch (SQLException erro) {
            System.out.println("Erro ao excluir aluno💀.");
            System.out.println(erro.getMessage());
            return false;
        }
    }

}




