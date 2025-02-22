package com.tuempresa.repository;

import com.tuempresa.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, UUID> {

    // Método para encontrar perfiles mayores de una edad específica
    List<Perfil> findByEdadGreaterThanEqual(int edad);
}
