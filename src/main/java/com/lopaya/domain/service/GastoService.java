package com.lopaya.domain.service;

import com.lopaya.domain.Gasto;

import java.util.List;

public interface GastoService {
    Gasto cargarGasto(Integer gastoId);

    List<Gasto> cargarGastos();




}
