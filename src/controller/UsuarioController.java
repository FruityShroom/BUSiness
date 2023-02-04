package controller;

import java.util.Vector;
import model.Usuario;
import repository.UsuarioRepository;

public class UsuarioController 
{
    private UsuarioRepository repository;
    
    public UsuarioController()
    {
        repository = new UsuarioRepository();
    }
    
    public Usuario proucuraUsuarioSenha(String email, String senha)
    {
        return repository.proucuraUsuarioSenha(email, senha);
    }
    
    public Usuario proucuraUsuarioEmail(String email)
    {
        return repository.proucuraUsuarioEmail(email);
    }
    
    public void cadastraUsuario(Usuario novoUsuario)
    {
        repository.insereNovoUsuario(novoUsuario);
        
    }
    
    public void modUsuario(Usuario usuario)
    {
        if(usuario != null && usuario.getId() != 0)
        {
            repository.updateUsuario(usuario);
        }
    }
    
    public int proucuraVerifcAdministrador(Usuario usuario)
    {
        return this.repository.proucuraVerifcAdministrador(usuario);
    }
}
