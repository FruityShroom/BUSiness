package controller;

import java.util.Vector;
import model.Rota;
import repository.RotaRepository;

public class RotaController 
{
    private RotaRepository repository;
    
    public RotaController()
    {
        this.repository = new RotaRepository();
    }
    
    public Vector<Rota> retornaTodasRotas()
    {
        return this.repository.selectAllRotas();
    }
    
    public Vector<Rota> retornaRotaDestino(String destino)
    {
        return this.repository.selectRotasDestinos(destino);
    }
    
    public void insereRota(Rota novaRota)
    {
        this.repository.insereNovaRota(novaRota);
    }
    
    public void modRota(Rota rota)
    {
        if(rota != null && rota.getNumero()!= 0)
        {
            repository.updateRota(rota);
        }
    }
}
