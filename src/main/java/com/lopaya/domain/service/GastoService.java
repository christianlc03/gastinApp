package com.lopaya.domain.service;

import com.lopaya.domain.Gasto;

import java.util.List;

public interface GastoService {
    List<Gasto> listarTodos();
    List<Gasto> listarGastosPorCategoria(Integer categoriaId);
    Gasto buscarPorId(Integer id);
    Gasto guardar(Gasto gasto);


}
