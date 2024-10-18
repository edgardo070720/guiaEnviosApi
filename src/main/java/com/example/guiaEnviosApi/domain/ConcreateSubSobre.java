package com.example.guiaEnviosApi.domain;

public class ConcreateSubSobre extends PaqueteFactory{
    public ConcreateSubSobre() {
        super();
    }

    @Override
    public Paquete createPaquete() {
        return new SubSobre();
    }
}
