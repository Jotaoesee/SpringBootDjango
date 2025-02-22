package com.tuempresa.service;

import com.tuempresa.model.Perfil;
import com.tuempresa.repository.PerfilRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PerfilService {

    private final PerfilRepository perfilRepository;

    public PerfilService(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    public List<Perfil> obtenerTodosLosPerfiles() {
        return perfilRepository.findAll();
    }

    public Optional<Perfil> obtenerPerfilPorId(UUID id) {
        return perfilRepository.findById(id);
    }

    public List<Perfil> obtenerPerfilesPorEdadMinima(int edad) {
        return perfilRepository.findByEdadGreaterThanEqual(edad);
    }

    public Perfil crearPerfil(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    public Perfil actualizarPerfil(UUID id, Perfil perfilActualizado) {
        return perfilRepository.findById(id).map(perfil -> {
            perfil.setNombre(perfilActualizado.getNombre());
            perfil.setEdad(perfilActualizado.getEdad());
            perfil.setTarjetaCredito(perfilActualizado.getTarjetaCredito());
            perfil.setCaducidad(perfilActualizado.getCaducidad());
            perfil.setCvv(perfilActualizado.getCvv());
            return perfilRepository.save(perfil);
        }).orElseThrow(() -> new RuntimeException("Perfil no encontrado"));
    }

    public void eliminarPerfil(UUID id) {
        perfilRepository.deleteById(id);
    }
}
