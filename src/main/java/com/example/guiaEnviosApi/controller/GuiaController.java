package com.example.guiaEnviosApi.controller;

import com.example.guiaEnviosApi.domain.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/api")
public class GuiaController {
    @GetMapping("/guia")
    public ResponseEntity<?> getGuia(){
        PaqueteFactory factory= new ConcreateSubPaquete();
        Paquete paquete= factory.createPaquete();
        paquete.setIdPaquete("1234");
        paquete.setTipoPaquete(TypePaquete.paquete);
        paquete.setCantidad(2);
        paquete.setPeso(2.45);
        paquete.setDhl(false);

        Remitente remitente= new Remitente();
        remitente.setId("2455678");
        remitente.setNombre("pepito perez");
        remitente.setDepartamento("ventas");
        remitente.setTelefono("3156468871");

        Destinatario destinatario= new Destinatario();
        destinatario.setId("13231");
        destinatario.setContacto("jairo");

        Guia  guia = new Guia();
        guia.setNumEnvio(15);
        guia.setFecha(LocalDateTime.now().toString());
        guia.setRemitente(remitente);
        guia.setDestinatario(destinatario);
        guia.setPaquete(paquete);
        guia.setValorEnvio(paquete.calcularValor());
        return ResponseEntity.ok(guia);
    }
}
