package jisay.library.module;

import jisay.library.model.To;

import javax.servlet.http.HttpSession;

public class CrudAuto {

    private To to;

    public CrudAuto(To to) {
        this.to = to;
    }
    public boolean checkLogin(HttpSession session, String session_key){

        return session.getAttribute(session_key) != null ? true : false;
    }

    public <ENTITY,DTO> ENTITY createUpdate(Class<ENTITY> entityClass,DTO dto){
        ENTITY entity = to.dtoToEntity(entityClass,dto);
        return entity;
    }

    public <DTO,ENTITY> DTO read(Class<DTO> dtoClass,ENTITY entity){
        DTO dto = to.entityToDto(dtoClass, entity);
        return dto;
    }

}
