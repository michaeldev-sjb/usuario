package com.michaeldeveveloper.usuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "endereco")
@Builder
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rua")
    private String rua;
    @Column(name = "numero")
    private Long numero;
    @Column(name = "complemento", length = 20)
    private String complemento;
    @Column(name = "cidade", length = 50)
    private String cidade;
    @Column(name = "estado", length = 2)
    private String estado;
    @Column(name = "cep", length = 9)
    private String cep;
    @Column(name = "usuario_id")
    private Long usuario_id;



}
