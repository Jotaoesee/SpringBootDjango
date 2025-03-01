package com.compuglobalhipermeganet.user_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compuglobalhipermeganet.user_service.models.Perfil;
import com.compuglobalhipermeganet.user_service.repositories.PerfilRepository;

import java.util.List;

@Service
public class PerfilService {
    @Autowired
    private PerfilRepository perfilRepository;

    public Perfil crearPerfil(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    public Perfil obtenerPerfil(Long id) {
        return perfilRepository.findById(id).orElse(null);
    }

    public List<Perfil> listarPerfiles(int edadMin) {
        return perfilRepository.findByEdadGreaterThanEqual(edadMin);
    }
}