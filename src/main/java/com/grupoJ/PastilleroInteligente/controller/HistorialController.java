
package com.grupoJ.PastilleroInteligente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistorialController {

    @GetMapping("/historial")
    public String consultarHistorial() {
        return "Historial del Pastillero Inteligente "
             + "(DATOS DE DEMOSTRACION): "
             + "Toma 1 - Realizada a tiempo. "
             + "Toma 2 - Realizada con retraso. "
             + "Toma 3 - Olvidada.";
    }
}

