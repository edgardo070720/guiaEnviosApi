package com.example.guiaEnviosApi.domain;

public class SubPaquete extends Paquete {
    public SubPaquete() {
        super();
    }



    @Override
    public Double calcularValor() {
        if (super.getDhl()) {
        return 5000.0*getPeso()*0.25*getCantidad();
        }
        return 5000.0*getPeso()*getCantidad();
    }
}
