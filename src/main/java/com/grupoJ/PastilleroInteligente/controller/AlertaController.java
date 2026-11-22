
package com.grupoJ.PastilleroInteligente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertaController {

    @GetMapping("/alertas")
    public String consultarAlertas() {
        return "INFORMACION DE DEMOSTRACION: el pastillero utiliza "
                + "una alerta verde a la hora de toma, roja tras "
                + "30 minutos sin realizar la toma y naranja por "
                + "bateria baja. Estos mensajes describen el "
                + "funcionamiento previsto y no son alertas reales activas.";
    }
}

