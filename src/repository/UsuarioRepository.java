package repository;

import java.sql.Connection;
import tool.FabricaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Usuario;

public class UsuarioRepository 
{
    public void insereNovoUsuario(Usuario novoUsuario) 
    {
        String sql = "INSERT INTO bus_iness.usuario(nome, email, senha) VALUES(?,?,?)";
        
        Connection conecBD = FabricaBanco.getConexaoPostgres();
        
        try {
            
            PreparedStatement transacao = conecBD.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            transacao.setString(1, novoUsuario.getNome());
            transacao.setString(2, novoUsuario.getEmail());
            transacao.setString(3, novoUsuario.getSenha());
            
            transacao.execute();
            
            
        } catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
    }
    
    public void updateUsuario(Usuario usuario)
    {
        
        String sql = "UPDATE bus_iness.usuario SET nome=?, email=?, senha=? WHERE id=?";
        
        Connection conecBD = FabricaBanco.getConexaoPostgres();
        
        try {
            
            PreparedStatement transacao = conecBD.prepareStatement(sql);
            
            transacao.setString(1, usuario.getNome());
            transacao.setString(2, usuario.getEmail());
            transacao.setString(3, usuario.getSenha());
            transacao.setInt(4, usuario.getId());
            
            int tuplasMod = transacao.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Usuario proucuraUsuarioSenha(String email, String senha)
    {
        String sql = "SELECT * FROM bus_iness.usuario WHERE email='"+email+"' AND senha='"+senha+"'";
        
        Connection conecBD = FabricaBanco.getConexaoPostgres();
        
        Usuario usuario;
        try {
            
            PreparedStatement transacao = conecBD.prepareStatement(sql);
            
            ResultSet tuplas = transacao.executeQuery();
            
            if(tuplas.next())
            {
                usuario = new Usuario(tuplas.getInt("id"), tuplas.getString("nome"), tuplas.getString("senha"), 
                        tuplas.getString("email"));
                return usuario;
            }
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public Usuario proucuraUsuarioEmail(String email)
    {
        String sql = "SELECT * FROM bus_iness.usuario WHERE email='"+email+"'";
        
        Connection conecBD = FabricaBanco.getConexaoPostgres();
        
        Usuario usuario;
        try {
            
            PreparedStatement transacao = conecBD.prepareStatement(sql);
            
            ResultSet tuplas = transacao.executeQuery();
            
            if(tuplas.next())
            {
                usuario = new Usuario(tuplas.getInt("id"), tuplas.getString("nome"), tuplas.getString("senha"), 
                        tuplas.getString("email"));
                return usuario;
            }
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public int proucuraVerifcAdministrador(Usuario usuario)
    {
        String sql = "SELECT verificador FROM bus_iness.usuario U JOIN bus_iness.administrador A "
                + "ON U.id = "+usuario.getId()+" AND A.id_usuario = "+usuario.getId();
        
        Connection conecBD = FabricaBanco.getConexaoPostgres();
        
        try {
            
            PreparedStatement transacao = conecBD.prepareStatement(sql);
            
            ResultSet tuplas = transacao.executeQuery();
            
            if(tuplas.next())
            {
                return tuplas.getInt("verificador");
            }
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return 0;
    }
}
