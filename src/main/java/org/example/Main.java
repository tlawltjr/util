package org.example;

import org.example.module.CrudAuto;
import org.example.sample.Dto;
import org.example.sample.Entity;

public class Main extends CrudAuto {

    public void aa(){
        Entity entity = Entity.builder()
                .name("js")
                .age(30)
                .build();

        Dto dto = super.entityToDto(Dto.class, entity);

        System.out.println(dto.toString());
    }
    public static void main(String[] args) {
//        AddCommas ac = new AddCommas();
//
//        System.out.println(ac.addComma(1000000000L));
    Main ma = new Main();

    ma.aa();


    }
}