package com.example.prueba;

import com.example.prueba.entidades.*;
import com.example.prueba.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.Date;

@SpringBootApplication
public class PruebaApplication {

	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	DomicilioRepository domicilioRepository;
	@Autowired
	PedidoRepository pedidoRepository;
	@Autowired
	DetallePedidoRepository detallePedidoRepository;
	@Autowired
	ProductoRepository productoRepository;
	@Autowired
	RubroRepository rubroRepository;

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ClienteRepository clienteRepo) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO---------");

			Cliente cliente = Cliente.builder()
					.nombre("Francisco")
					.apellido("Saavedra")
					.telefono("2611111111")
					.email("abc@gmail.com")
					.build();

			Domicilio domicilio1 = Domicilio.builder()
					.localidad("Guaymallen")
					.calle("Carril Godoy Cruz")
					.numero("800")
					.build();

			Domicilio domicilio2 = Domicilio.builder()
					.localidad("Ciudad")
					.calle("Av. San Martin")
					.numero("1500")
					.build();

			Pedido pedido1 = Pedido.builder()
					.estado(true)
					.fecha(new Date())
					.envio("delivery")
					.total(2500)
					.build();

			Pedido pedido2 = Pedido.builder()
					.estado(false)
					.fecha(new Date())
					.envio("delivery")
					.total(1500)
					.build();

			DetallePedido dp1 = DetallePedido.builder()
					.cantidad(1)
					.subtotal(2000)
					.build();

			DetallePedido dp2 = DetallePedido.builder()
					.cantidad(1)
					.subtotal(500)
					.build();

			Producto producto1 = Producto.builder()
					.tipo(true)
					.tiempoEstimadoCocina(30)
					.denominacion("Hamburguesa")
					.precioVenta(2000)
					.precioCompra(1000)
					.stockActual(150)
					.stockMinimo(50)
					.unidadMedida("gr")
					.receta("...")
					.build();

			Producto producto2 = Producto.builder()
					.tipo(false)
					.tiempoEstimadoCocina(0)
					.denominacion("Coca-cola")
					.precioVenta(500)
					.precioCompra(200)
					.stockActual(300)
					.stockMinimo(10)
					.unidadMedida("ml")
					.receta("...")
					.build();

			Rubro rubro1 = Rubro.builder()
					.denominacion("Alimentos procesados")
					.build();

			Rubro rubro2 = Rubro.builder()
					.denominacion("Bebidas")
					.build();

			clienteRepository.save(cliente);
//			domicilioRepository.save(domicilio1);
//			domicilioRepository.save(domicilio2);
//			pedidoRepository.save(pedido1);
//			pedidoRepository.save(pedido2);
//			detallePedidoRepository.save(dp1);
//			detallePedidoRepository.save(dp2);
//			productoRepository.save(producto1);
//			productoRepository.save(producto2);
			rubroRepository.save(rubro1);
			rubroRepository.save(rubro2);


		};
	}
}

