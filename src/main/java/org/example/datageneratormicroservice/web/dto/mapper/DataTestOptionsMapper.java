package org.example.datageneratormicroservice.web.dto.mapper;

import org.example.datageneratormicroservice.model.test.DataTestOptions;
import org.example.datageneratormicroservice.web.dto.DataTestOptionsDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper
        extends Mappable<DataTestOptions, DataTestOptionsDTO> {
}
