package model;

public class Usuario 
{
    
    //Atributos
    private int id;
    private String nome;
    private String email;
    private String senha;
    private boolean verificado;
    private int verificador;
    
    
    //Constructors
    public Usuario(){}
    
    public Usuario(String nome, String senha, String email) 
    {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    
    public Usuario(int id, String nome, String senha, String email) 
    {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    
    
    //Getters
    public int getId() 
    {
        return id;
    }

    public String getNome() 
    {
        return nome;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getSenha() 
    {
        return senha;
    }

    public boolean isVerificado() 
    {
        return verificado;
    }

    public int getVerificador() 
    {
        return verificador;
    }
    
    
    
    //Setters
    public void setId(int id) 
    {
        this.id = id;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }

    public void setVerificado(boolean verificado)
    {
        this.verificado = verificado;
    }

    public void setVerificador(int verificador) 
    {
        this.verificador = verificador;
    }
    
    
    
    
    //Metodos
    public boolean logar(String senha)
    {
        return this.senha.equals(senha);
    }
}
