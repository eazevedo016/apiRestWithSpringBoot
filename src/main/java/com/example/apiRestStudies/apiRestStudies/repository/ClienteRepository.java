package com.example.apiRestStudies.apiRestStudies.repository;

import com.example.apiRestStudies.apiRestStudies.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> { // <Tipo da Entidade, tipo do id Cliente>
    
} 
