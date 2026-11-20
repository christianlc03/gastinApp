package com.lopaya.jpa.repository;

import com.lopaya.domain.repository.GastoRepository;
import com.lopaya.jpa.entity.CategoriaEntity;
import com.lopaya.jpa.entity.GastoEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GastoRepositoryImp implements GastoRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<GastoEntity> all() {
        List<GastoEntity> listaGastos = em.createQuery("SELECT e FROM GastoEntity", GastoEntity.class)
            .getResultList();

        if(listaGastos.isEmpty()){
            return null;
        }

        return listaGastos;
    }

    @Override
    public List<GastoEntity> findByCategoriaEntity(CategoriaEntity categoriaEntity) {
        List<GastoEntity> listaGastos = em.createQuery("SELECT e FROM GastoEntity e WHERE e.categoriaEntity = : categoriaEntity", GastoEntity.class)
                .setParameter("categoriaEntity", categoriaEntity)
                .getResultList();

        if(listaGastos.isEmpty()){
            return null;
        }

        return listaGastos;
    }

    @Override
    public GastoEntity findById(Integer gastoId) {
        GastoEntity gasto = em.createQuery("SELECT e FROM GastoEntity e WHERE e.id = :gastoId", GastoEntity.class)
                .setParameter("gastoId", gastoId)
                .getSingleResult();

        return gasto;
    }

    @Override
    public GastoEntity save(GastoEntity gastoEntity) {
        if(gastoEntity.getId() == null){
            em.persist(gastoEntity);
            return gastoEntity;
        }else{
            return em.merge(gastoEntity);
        }
    }

    @Override
    public GastoEntity deleteById(GastoEntity gastoEntity) {
//        GastoEntity gastoDeleted = gastoEntity;
        em.remove(gastoEntity);
        return gastoEntity;
    }
}
