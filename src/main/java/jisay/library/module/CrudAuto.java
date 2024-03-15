package jisay.library.module;

import org.modelmapper.ModelMapper;

public class CrudAuto {
    public <DTO, ENTITY> DTO entityToDto(Class<DTO> dtoClass, ENTITY entity) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(entity, dtoClass);
        //asd
    }

    public <ENTITY, DTO> ENTITY dtoToEntity(Class<ENTITY> entityClass, DTO dto) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(dto, entityClass);
    }


}