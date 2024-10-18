package com.example.guiaEnviosApi.domain;

public class SubSobre extends Paquete {
    public SubSobre() {
        super();
    }



    @Override
    public Double calcularValor(){
        if(super.getDhl()){
            return 15000.0*0.25*getCantidad();
        }
        return 15000.0*getCantidad();
    }

}
