package com.tuempresa.controller;

import com.tuempresa.model.Perfil;
import com.tuempresa.service.PerfilService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/perfiles")
public class PerfilController {

    private final PerfilService perfilService;

    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @GetMapping
    public List<Perfil> obtenerTodosLosPerfiles() {
        return perfilService.obtenerTodosLosPerfiles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Perfil> obtenerPerfilPorId(@PathVariable UUID id) {
        Optional<Perfil> perfil = perfilService.obtenerPerfilPorId(id);
        return perfil.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/mayores")
    public List<Perfil> obtenerPerfilesPorEdadMinima(@RequestParam int edad_min) {
        return perfilService.obtenerPerfilesPorEdadMinima(edad_min);
    }

    @PostMapping
    public Perfil crearPerfil(@RequestBody Perfil perfil) {
        return perfilService.crearPerfil(perfil);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Perfil> actualizarPerfil(@PathVariable UUID id, @RequestBody Perfil perfilActualizado) {
        try {
            Perfil perfil = perfilService.actualizarPerfil(id, perfilActualizado);
            return ResponseEntity.ok(perfil);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPerfil(@PathVariable UUID id) {
        perfilService.eliminarPerfil(id);
        return ResponseEntity.noContent().build();
    }
}
