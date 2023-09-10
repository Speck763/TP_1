package com.example.prueba.repositorios;

import com.example.prueba.entidades.Domicilio;
import com.example.prueba.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Domicilio, Long> {
}
