package com.lopaya.domain.repository;

import com.lopaya.domain.Gasto;
import com.lopaya.jpa.entity.CategoriaEntity;
import com.lopaya.jpa.entity.GastoEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface GastoRepository extends Repository<GastoEntity, Integer> {

    List<GastoEntity> all();
    
    List<GastoEntity> findByCategoriaEntity(CategoriaEntity categoriaEntity);

    GastoRepository findById(Integer gastoId);

    GastoEntity save(GastoEntity gastoEntity);

    GastoEntity deleteById(Integer id);
}
