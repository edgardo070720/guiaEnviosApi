package com.example.guiaEnviosApi.domain;

public class SubCaja extends Paquete{
    public SubCaja() {
        super();
    }

    @Override
    public Double calcularValor() {
        if (super.getDhl()){
            return ((5000.0*getPeso())+25000)*0.25*getCantidad();
        }
        return (5000.0*getPeso())+25000*getCantidad();
    }
}
