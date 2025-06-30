package com.java.guilherme.Cadastro_Usuario.infraestrutura.entites;

import jakarta.persistence.*;
import lombok.*;

//Anotações
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
@Entity

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "name")
    private String name;

}
