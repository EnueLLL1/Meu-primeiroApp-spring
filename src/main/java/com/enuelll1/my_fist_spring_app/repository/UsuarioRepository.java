package com.enuelll1.my_fist_spring_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.enuelll1.my_fist_spring_app.model.Modelo;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Modelo, Long>{

    Optional<Modelo> findByEmail(String email);
    boolean existsByEmail(String email);
}
