package com.enuelll1.my_fist_spring_app.controller;

import com.enuelll1.my_fist_spring_app.model.Modelo;
import com.enuelll1.my_fist_spring_app.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*") // Permite requisições do frontend
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    // POST - Criar usuário
    @PostMapping
    public ResponseEntity<Modelo> criar(@Valid @RequestBody Modelo usuario) {
        Modelo novoUsuario = service.criar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
    }

    // GET - Listar todos
    @GetMapping
    public ResponseEntity<List<Modelo>> listarTodos() {
        List<Modelo> usuarios = service.listarTodos();
        return ResponseEntity.ok(usuarios);
    }

    // GET - Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Modelo> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // PUT - Atualizar
    @PutMapping("/{id}")
    public ResponseEntity<Modelo> atualizar(
            @PathVariable Long id,
            @Valid @RequestBody Modelo usuario) {
        Modelo atualizado = service.atualizar(id, usuario);
        return ResponseEntity.ok(atualizado);
    }

    // DELETE - Deletar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
