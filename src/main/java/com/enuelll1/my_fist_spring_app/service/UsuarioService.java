package com.enuelll1.my_fist_spring_app.service;

import com.enuelll1.my_fist_spring_app.model.Modelo;
import com.enuelll1.my_fist_spring_app.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository repository;
    
    // Criar usuário
    public Modelo criar(Modelo usuario) {
        // Validação: email já existe?
        if (repository.existsByEmail(usuario.getEmail())) {
            throw new RuntimeException("Email já cadastrado!");
        }
        return repository.save(usuario);
    }
    
    // Listar todos
    public List<Modelo> listarTodos() {
        return repository.findAll();
    }
    
    // Buscar por ID
    public Optional<Modelo> buscarPorId(Long id) {
        return repository.findById(id);
    }
    
    // Atualizar
    public Modelo atualizar(Long id, Modelo usuarioAtualizado) {
        Modelo usuario = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
        
        usuario.setNome(usuarioAtualizado.getNome());
        usuario.setEmail(usuarioAtualizado.getEmail());
        usuario.setTelefone(usuarioAtualizado.getTelefone());
        usuario.setIdade(usuarioAtualizado.getIdade());
        usuario.setDataNascimento(usuarioAtualizado.getDataNascimento());
        usuario.setGenero(usuarioAtualizado.getGenero());
        usuario.setCidade(usuarioAtualizado.getCidade());
        usuario.setEstado(usuarioAtualizado.getEstado());
        usuario.setMensagem(usuarioAtualizado.getMensagem());
        
        return repository.save(usuario);
    }
    
    // Deletar
    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado!");
        }
        repository.deleteById(id);
    }
}