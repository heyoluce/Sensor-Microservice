package org.example.datageneratormicroservice.web.dto.mapper;

import org.example.datageneratormicroservice.model.Data;
import org.example.datageneratormicroservice.web.dto.DataDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDTO> {
}
