package dal;
import java.sql.*;


public class ModuloConexao {
    //Método responsavel por estabelacer a conexão com o Banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        // A linha abaixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        
        // Armazenando informação referente ao BAnco
        String url = "jdbc:mysql://localhost:3307/sistema";
        
        String user = "root";
        String password = "";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }catch(Exception e){
            return null;
        }
    }
}
