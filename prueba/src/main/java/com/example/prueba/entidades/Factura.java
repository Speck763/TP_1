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
public class Factura extends BaseEntidad{

    private int numero;
    private Date fecha;
    private double descuento;
    private boolean formaPago = true;
    private int total;
    private String pago;

    @OneToOne()
    @Builder.Default
    Pedido pedido;


    public void retiro(boolean FormaPago) {
        if (FormaPago == formaPago) {
            pago = "Efectivo";
        } else {
            pago = "Otros medios de pago";
        }
    }
}
