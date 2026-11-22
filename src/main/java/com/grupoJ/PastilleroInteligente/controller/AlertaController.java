
package com.grupoJ.PastilleroInteligente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertaController {

    @GetMapping("/alertas")
    public String consultarAlertas() {

        return "Alertas del pastillero: verde a la hora de toma, "
                + "roja tras 30 min sin toma y naranja por bateria baja";
    }
}

