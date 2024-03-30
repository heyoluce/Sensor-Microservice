package org.example.datageneratormicroservice.web.dto.mapper;

public interface Mappable<E, D> {
    E toEntity(D dto);

    D toDTO(E entity);
}
