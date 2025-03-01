package com.compuglobalhipermeganet.user_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compuglobalhipermeganet.user_service.models.Perfil;

import java.util.List;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
    List<Perfil> findByEdadGreaterThanEqual(int edad);
}