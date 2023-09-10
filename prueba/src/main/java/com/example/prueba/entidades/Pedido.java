package com.example.prueba.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido extends BaseEntidad{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private boolean estado;
    private Date fecha;
    private boolean tipoEnvio;
    private double total;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private Factura factura;


}
