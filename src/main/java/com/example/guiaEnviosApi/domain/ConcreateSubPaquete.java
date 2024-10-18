package com.example.guiaEnviosApi.domain;

public class ConcreateSubPaquete extends PaqueteFactory {
    public ConcreateSubPaquete() {
        super();
    }

    @Override
    public Paquete createPaquete() {
        return new SubPaquete();
    }
}
