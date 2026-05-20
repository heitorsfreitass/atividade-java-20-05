package com.demo.dig.controllers;

import com.demo.dig.models.ClienteModel;
import com.demo.dig.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteModel> findAll(){
        return clienteService.findAll();
    }

    @PostMapping
    public ClienteModel addCliente(@RequestBody ClienteModel clienteModel) {
        return clienteService.addCliente(clienteModel);
    }
}
