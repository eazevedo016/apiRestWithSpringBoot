package com.example.apiRestStudies.apiRestStudies.controller;


import com.example.apiRestStudies.apiRestStudies.model.Cliente;
import com.example.apiRestStudies.apiRestStudies.repository.ClienteRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;



@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;


    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();    
    }

    @PostMapping
    @ResponseStatus (HttpStatus.CREATED)
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    
}
