package com.enuelll1.my_fist_spring_app.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "usuario_db")
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "COLOCA UM NOME BAIANO")
    @Column(nullable = false, length = 100)
    private String nome;

    @Email(message = "EMAIL ERRADO BAIANO")
    @NotBlank(message = "É OBRIGATORIO O EMAIL BAIANO")
    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(length = 20)
    private String telefone;

    private Integer idade;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(length = 20)
    private String genero;

    @Column(length = 100)
    private String cidade;

    @Column(length = 2)
    private String estado;

    @Column(columnDefinition = "TEXT")
    private String mensagem;

    // TODO Construtor vazio (obrigatório para JPA)
    public Modelo() {}
}
