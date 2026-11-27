package com.example.demo.service;

import com.example.demo.model.Toma;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TomaServiceTest {

    @Autowired
    private TomaService tomaService;

    @Test
    void crearYObtenerPorId() {
        Toma toma = new Toma();
        toma.setMedicamento("Ibuprofeno 600mg");
        toma.setHoraProgramada("08:00");
        toma.setEstado("PENDIENTE");

        Toma guardada = tomaService.crear(toma);

        assertNotNull(guardada.getId());
        assertTrue(tomaService.obtenerPorId(guardada.getId()).isPresent());
    }

    @Test
    void borrarTomaExistente() {
        Toma toma = new Toma();
        toma.setMedicamento("Paracetamol 1g");
        toma.setHoraProgramada("14:00");
        toma.setEstado("PENDIENTE");

        Toma guardada = tomaService.crear(toma);

        assertTrue(tomaService.borrar(guardada.getId()));
        assertFalse(tomaService.obtenerPorId(guardada.getId()).isPresent());
    }

    @Test
    void borrarTomaInexistenteDevuelveFalse() {
        assertFalse(tomaService.borrar(99999L));
    }
}