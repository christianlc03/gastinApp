package com.lopaya.domain.repository;

import com.lopaya.domain.Gasto;
import com.lopaya.jpa.entity.CategoriaEntity;
import com.lopaya.jpa.entity.GastoEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface GastoRepository extends Repository<GastoEntity, Integer> {

    List<Gasto> all();
    
    List<Gasto> findByCategoriaEntity(CategoriaEntity categoriaEntity);

    Gasto findById(Integer gastoId);

    Gasto save(GastoEntity gastoEntity);

    Gasto deleteById(GastoEntity gastoEntity);
}
