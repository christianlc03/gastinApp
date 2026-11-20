package com.lopaya.gastos;

import com.lopaya.domain.Gasto;
import com.lopaya.domain.repository.GastoRepository;
import com.lopaya.jpa.entity.CategoriaEntity;
import com.lopaya.jpa.entity.GastoEntity;
import com.lopaya.jpa.repository.GastoRepositoryImp;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class GastosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GastosApplication.class, args);
//		ApplicationContext ctx = SpringApplication.run(GastosApplication.class, args);
//		GastoRepository gastoRepository = ctx.getBean(GastoRepository.class);
//
//
//		//CREO EL GASTO CON LO MINIMO
//		Gasto gasto = new Gasto();
//		gasto.setTitulo("Compra en el mercadona");
//		gasto.setCategoriaId(1);
//		gasto.setCantidadImporte(90.12);
//		gasto.setFecha(LocalDate.now());
//		//CREO LA CATEGORIA ENTIDAD
//		CategoriaEntity categoriaEntity = new CategoriaEntity();
//		categoriaEntity.setId(1);
//		categoriaEntity.setNombre("Mercadona");
//		categoriaEntity.setColor("#888888");
//		//LO PASO A GASTO ENTIDAD
//		GastoEntity gastoEntity = new GastoEntity();
//		gastoEntity.setTitulo(gasto.getTitulo());
//		gastoEntity.setCategoriaEntity(categoriaEntity);
//		gastoEntity.setCantidadImporte(BigDecimal.valueOf(gasto.getCantidadImporte()));
//		gastoEntity.setFecha(gasto.getFecha());
//		//LA GUARDO
//		System.out.println(gastoEntity.toString());
//		GastoEntity objetoGuardado = gastoRepository.save(gastoEntity);
//		System.out.println(gastoEntity.toString());
//		System.out.println(objetoGuardado.toString());

	}

}
