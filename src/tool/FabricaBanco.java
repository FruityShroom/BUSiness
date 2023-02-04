package tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaBanco 
{
    private static Connection con;
    
    public static Connection getConexaoPostgres()
    {
        
        if(con == null)
        {
            try {
            con = DriverManager.getConnection("jdbc:postgresql://200.18.128.54:5432/aula", "aula", "aula");
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println("Erro no momento da conexao");
            }
        }
        
        return con;
    }
}
