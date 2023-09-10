package com.example.prueba.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name= "cliente")//es por si las tablas son diferentes en BD (Lo agrego, solo como ejemplo)

public class Cliente extends BaseEntidad{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

    private String nombre;
    private String apellido;

    private String telefono;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")

    //Colocar esta Anotacion sino me da error
    @Builder.Default


    private List<Domicilio> domicilios = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();
    public void agregarDomicilio(Domicilio dom){
        domicilios.add(dom);
    }

    public void mostrarDomicilio(){
        System.out.println("Domicilios de " + nombre + " " + apellido + ":");

        for (Domicilio domicilio : domicilios){
            System.out.println("Calle: " + domicilio.getCalle() + ", número: " + domicilio.getNumero());
        }
    }


}
