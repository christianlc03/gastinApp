package com.lopaya.jpa.repository;

import com.lopaya.domain.Gasto;
import com.lopaya.domain.repository.GastoRepository;
import com.lopaya.jpa.entity.CategoriaEntity;
import com.lopaya.jpa.entity.GastoEntity;
import com.lopaya.jpa.mapper.GastoMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GastoRepositoryImp implements GastoRepository {

    @PersistenceContext
    private EntityManager em;

    private final GastoMapper gastoMapper;

    public GastoRepositoryImp(GastoMapper gastoMapper){
        this.gastoMapper = gastoMapper;
    }

    @Override
    public List<Gasto> all() {
        List<GastoEntity> listaGastosEntity = em.createQuery("SELECT e FROM GastoEntity e", GastoEntity.class)
            .getResultList();

        List<Gasto> listaGastos = listaGastosEntity.stream().map(gastoMapper::toDomain).toList();

        return listaGastos;
    }

    @Override
    public List<Gasto> findByCategoriaEntity(CategoriaEntity categoriaEntity) {
        List<GastoEntity> listaGastosEntity = em.createQuery("SELECT e FROM GastoEntity e WHERE e.categoriaEntity = : categoriaEntity", GastoEntity.class)
                .setParameter("categoriaEntity", categoriaEntity)
                .getResultList();

        List<Gasto> listaGastos = listaGastosEntity.stream().map(gastoMapper::toDomain).toList();

        return listaGastos;
    }

    @Override
    public Gasto findById(Integer gastoId) {
        //Para buscar por clave primario no hace falta crear la query,
        // JPA tiene em.find que devuelve el null si no existe.
        GastoEntity gastoEntity = em.find(GastoEntity.class, gastoId);

        Gasto gasto = gastoMapper.toDomain(gastoEntity);

        return gasto;
    }

    @Override
    public Gasto save(GastoEntity gastoEntity) {
        if(gastoEntity.getId() == null){
            em.persist(gastoEntity);
            return gastoMapper.toDomain(gastoEntity);
        }else{
            return gastoMapper.toDomain(em.merge(gastoEntity));
        }
    }

    @Override
    public Gasto deleteById(GastoEntity gastoEntity) {
//        GastoEntity gastoDeleted = gastoEntity;
        em.remove(gastoEntity);
        return gastoMapper.toDomain(gastoEntity);
    }
}
