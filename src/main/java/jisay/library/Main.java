package jisay.library;


import jisay.library.model.Func;
import jisay.library.module.CrudAuto;

public class Main {
    public static void main(String[] args) {

        CrudAuto ca = new CrudAuto(new Func() {
        });

        System.out.println("hello world");
    }

}