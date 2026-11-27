package com.example.demo.service;

import com.example.demo.model.Toma;
import com.example.demo.model.TomaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TomaService {

    private final TomaRepository tomaRepository;

    public TomaService(TomaRepository tomaRepository) {
        this.tomaRepository = tomaRepository;
    }

    // READ: todas las tomas
    public List<Toma> obtenerTodas() {
        return tomaRepository.findAll();
    }

    // READ: una toma por id
    public Optional<Toma> obtenerPorId(Long id) {
        return tomaRepository.findById(id);
    }

    // CREATE
    public Toma crear(Toma toma) {
        toma.setId(null);   // fuerza que sea una toma nueva
        return tomaRepository.save(toma);
    }

    // UPDATE: devuelve vacío si el id no existe
    public Optional<Toma> actualizar(Long id, Toma datos) {
        return tomaRepository.findById(id).map(existente -> {
            existente.setMedicamento(datos.getMedicamento());
            existente.setHoraProgramada(datos.getHoraProgramada());
            existente.setEstado(datos.getEstado());
            return tomaRepository.save(existente);
        });
    }

    // DELETE: devuelve true si existía y se borró
    public boolean borrar(Long id) {
        if (tomaRepository.existsById(id)) {
            tomaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}