package jisay.library.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.json.simple.parser.ParseException;
import org.modelmapper.ModelMapper;

public interface Func {

    default <DTO, ENTITY> DTO entityToDto(Class<DTO> dtoClass, ENTITY entity) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(entity, dtoClass);
    }

    default <ENTITY, DTO> ENTITY dtoToEntity(Class<ENTITY> entityClass, DTO dto) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(dto, entityClass);
    }


}
