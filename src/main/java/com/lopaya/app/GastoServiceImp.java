package com.lopaya.app;

import com.lopaya.domain.Gasto;
import com.lopaya.domain.service.GastoService;

import java.util.List;

public class GastoServiceImp implements GastoService {

    @Override
    public List<Gasto> listarTodos() {
        return List.of();
    }

    @Override
    public List<Gasto> listarGastosPorCategoria(Integer categoriaId) {
        return List.of();
    }

    @Override
    public Gasto buscarPorId(Integer id) {
        return null;
    }

    @Override
    public Gasto guardar(Gasto gasto) {
        return null;
    }
}
