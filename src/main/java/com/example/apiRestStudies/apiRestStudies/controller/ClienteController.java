package com.example.apiRestStudies.apiRestStudies.controller;

import com.example.apiRestStudies.apiRestStudies.model.Cliente;
import com.example.apiRestStudies.apiRestStudies.repository.ClienteRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;


    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();    
    }

    
}
