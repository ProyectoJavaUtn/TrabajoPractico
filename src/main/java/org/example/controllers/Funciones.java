package org.example.controllers;

import org.example.models.Tecnico;
import org.example.models.TiempoResolucionPorTecnicoEstimado;
import org.example.repository.ClienteServicioRepository;
import org.example.repository.TecnicoRepository;
import org.example.repository.TiempoResolucionPorTecnicoEstimadoRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Funciones {
    ClienteServicioRepository clienteServicioRepository = new ClienteServicioRepository();
    TecnicoRepository tecnicoRepository = new TecnicoRepository();
    TiempoResolucionPorTecnicoEstimadoRepository tiempoResolucionRepository = new TiempoResolucionPorTecnicoEstimadoRepository();


    public Tecnico findTecnicoConMenorTiempoResolucion() {
        List<TiempoResolucionPorTecnicoEstimado> tiempos = tiempoResolucionRepository.findAll();

        // Encuentra el tiempo mínimo
        TiempoResolucionPorTecnicoEstimado tiempoMinimo = tiempos.stream()
                .min(Comparator.comparingInt(TiempoResolucionPorTecnicoEstimado::getHorasResolucion))
                .orElse(null);

        // Si se encontró el tiempo mínimo, busca al tecnico por id
        if (tiempoMinimo != null) {
            return tecnicoRepository.findOne(tiempoMinimo.getTecnico().getId());
        }

        return null; // O maneja el caso en el que no se encontró ningún tiempo mínimo
    }
}
