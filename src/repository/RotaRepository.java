package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import model.Rota;
import tool.FabricaBanco;

public class RotaRepository 
{
    public Vector<Rota> selectAllRotas()
    {
        
        Vector<Rota> rotas = new Vector<>();
        
        String sql = "SELECT nome, destinos, horarios, quant_onibus, numero FROM bus_iness.rota ORDER BY nome";
        
        Connection conecBD = FabricaBanco.getConexaoPostgres();
    
    
        try {
            
            PreparedStatement transacao = conecBD.prepareStatement(sql);
            
            ResultSet tuplas = transacao.executeQuery();
            
            while (tuplas.next())
            {
                Rota rota = new Rota(tuplas.getString("nome"), tuplas.getString("destinos"), 
                        tuplas.getString("horarios"), tuplas.getInt("quant_onibus"), tuplas.getInt("numero"));
                rotas.add(rota);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rotas;
    }
    
    public Vector<Rota> selectRotasDestinos(String destino)
    {
        
        Vector<Rota> rotas = new Vector<>();
        
        String sql = "SELECT nome, destinos, horarios, quant_onibus FROM bus_iness.rota WHERE destinos "
                + "LIKE '%"+destino.toLowerCase()+"%' ORDER BY nome";
        
        Connection conecBD = FabricaBanco.getConexaoPostgres();
    
    
        try {
            
            PreparedStatement transacao = conecBD.prepareStatement(sql);
            
            ResultSet tuplas = transacao.executeQuery();
            
            while (tuplas.next())
            {
                Rota rota = new Rota(tuplas.getString("nome"), tuplas.getString("destinos"), 
                        tuplas.getString("horarios"), tuplas.getInt("quant_onibus"));
                rotas.add(rota);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rotas;
    }
    
    public void insereNovaRota(Rota novaRota) 
    {
        String sql = "INSERT INTO bus_iness.rota(destinos, horarios, quant_onibus, nome) VALUES(?,?,?,?)";
        
        Connection conecBD = FabricaBanco.getConexaoPostgres();
        
        try {
            
            PreparedStatement transacao = conecBD.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            transacao.setString(1, novaRota.getDestinos());
            transacao.setString(2, novaRota.getHorarios());
            transacao.setInt(3, novaRota.getQuantOnibus());
            transacao.setString(4, novaRota.getNome());
            
            transacao.execute();
            
            
        } catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
    }
    
    public void updateRota(Rota rota)
    {
        
        String sql = "UPDATE bus_iness.rota SET destinos=?, horarios=?, "
                + "quant_onibus =?, nome =? WHERE numero=?";
        
        Connection conecBD = FabricaBanco.getConexaoPostgres();
        
        try {
            
            PreparedStatement transacao = conecBD.prepareStatement(sql);
            
            transacao.setString(1, rota.getDestinos());
            transacao.setString(2, rota.getHorarios());
            transacao.setInt(3, rota.getQuantOnibus());
            transacao.setString(4, rota.getNome());
            transacao.setInt(5, rota.getNumero());
            
            int tuplasMod = transacao.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
