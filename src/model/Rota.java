package model;

public class Rota 
{
    
    //Atributos
    private String nome;
    private String destinos;
    private String horarios;
    private int quantOnibus;
    
    
    //Constructor
    public Rota(String nome, String destinos, String horarios, int quantOnibus) 
    {
        this.nome = nome;
        this.destinos = destinos;
        this.horarios = horarios;
        this.quantOnibus = quantOnibus;
    }
    
    
    //Getters
    public String getNome() 
    {
        return nome;
    }

    public String getDestinos() 
    {
        return destinos;
    }

    public String getHorarios() 
    {
        return horarios;
    }

    public int getQuantOnibus()
    {
        return quantOnibus;
    }
    
    
    //Metodos
    public String toText()
    {
        String[] destinosSplit = this.destinos.split(",");
        String text = this.nome.toUpperCase()+"\n";
        for(int i = 0; i < destinosSplit.length; i++)
        {
            text += " -> "+destinosSplit[i];
        }
        
        text += "\n"+this.horarios+"\n Quantidade de onibus operando: "+this.quantOnibus+"\n \n";
        
        return text;
    }
}
