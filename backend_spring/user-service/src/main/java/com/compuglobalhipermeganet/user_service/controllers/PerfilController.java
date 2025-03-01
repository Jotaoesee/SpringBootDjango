package com.compuglobalhipermeganet.user_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.compuglobalhipermeganet.user_service.models.Perfil;
import com.compuglobalhipermeganet.user_service.services.PerfilService;

import java.util.List;

@RestController
@RequestMapping("/perfiles")
public class PerfilController {
    
    @Autowired
    private PerfilService perfilService;

    @PostMapping("/crear")
    public ResponseEntity<Perfil> crearPerfil(@RequestBody Perfil perfil) {
        return ResponseEntity.ok(perfilService.crearPerfil(perfil));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Perfil> obtenerPerfil(@PathVariable Long id) {
        return ResponseEntity.ok(perfilService.obtenerPerfil(id));
    }

    @GetMapping
    public ResponseEntity<List<Perfil>> listarPerfiles(@RequestParam(required = false) Integer edadMin) {
        return ResponseEntity.ok(perfilService.listarPerfiles(edadMin));
    }
}