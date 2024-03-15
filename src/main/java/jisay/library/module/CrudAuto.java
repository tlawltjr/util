package jisay.library.module;

import jisay.library.model.Func;

import javax.servlet.http.HttpSession;

public class CrudAuto {

    private Func func;

    public CrudAuto(Func func) {
        this.func = func;
    }
    public boolean checkLogin(HttpSession session, String session_key){

        return session.getAttribute(session_key) != null ? true : false;
    }

    public <ENTITY,DTO> ENTITY createUpdate(Class<ENTITY> entityClass,DTO dto){
        ENTITY entity = func.dtoToEntity(entityClass,dto);
        return entity;
    }

    public <DTO,ENTITY> DTO read(Class<DTO> dtoClass,ENTITY entity){
        DTO dto = func.entityToDto(dtoClass, entity);
        return dto;
    }

}
