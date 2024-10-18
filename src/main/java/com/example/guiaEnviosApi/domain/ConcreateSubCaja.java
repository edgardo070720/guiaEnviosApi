package com.example.guiaEnviosApi.domain;

public class ConcreateSubCaja extends PaqueteFactory{
    public ConcreateSubCaja() {
        super();
    }

    @Override
    public Paquete createPaquete() {
        return new SubCaja();
    }
}
