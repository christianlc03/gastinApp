package com.lopaya.jpa.mapper;

import com.lopaya.domain.Gasto;
import com.lopaya.jpa.entity.GastoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GastoMapper {

    @Mapping(source = "gastoEntity.id", target="gastoId")
    Gasto toDomain(GastoEntity gastoEntity);

    @Mapping(source = "gastoId", target = "gastoEntity.id")
    GastoEntity toEntity(Gasto gasto);

}
