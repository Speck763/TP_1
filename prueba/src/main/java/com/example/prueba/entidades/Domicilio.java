package com.example.prueba.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Domicilio  extends BaseEntidad{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  private Long id;
    private String calle;
    private String numero;
    private String localidad;



}
