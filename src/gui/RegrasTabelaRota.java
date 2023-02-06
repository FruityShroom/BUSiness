package gui;

import controller.RotaController;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import model.Rota;

public class RegrasTabelaRota extends AbstractTableModel
{
    private Vector<Rota> rotas;
    private String columnName[] = {"Nome", "Destinos", "Horarios", "Quant. onibus"};
    private RotaController controllerRota;
    
    public RegrasTabelaRota() 
    {
        this.controllerRota = new RotaController();
        
        carregaRota();
    }

    private void carregaRota() 
    {
        this.rotas = this.controllerRota.retornaTodasRotas();
    }
    
    @Override
    public int getRowCount() 
    {
        return this.rotas.size();
    }

    @Override
    public int getColumnCount() 
    {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        Rota rota = this.rotas.get(rowIndex);
        
        return switch (columnIndex) 
        {
            case 0 -> rota.getNome();
            case 1 -> rota.getDestinos();
            case 2 -> rota.getHorarios();
            case 3 -> rota.getQuantOnibus();
                
            default -> null;
        };    
    }
    
    @Override
    public String getColumnName(int column) 
    {        
        return columnName[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) 
    {
        return true;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) 
    {
        Rota rota = this.rotas.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0 -> rota.setNome((String)aValue);
            case 1 -> rota.setDestinos((String)aValue);
            case 2 -> rota.setHorarios((String)aValue);
            case 3 -> rota.setQuantOnibus((int)aValue);
        }
        
        controllerRota.modRota(rota);
    }
 
    @Override
    public Class<?> getColumnClass(int column) 
    {
        return switch (column) 
        {
            case 3 -> Integer.class;
                
            default -> String.class;
        };
    }
}
