package com.grupoJ.PastilleroInteligente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PastilleroController {

	@GetMapping("/pastillero")
	public String consultarEstado() {
	    return "Pastillero inteligente: encendido, Wi-Fi conectado (datos de demostracion)";
	}
}