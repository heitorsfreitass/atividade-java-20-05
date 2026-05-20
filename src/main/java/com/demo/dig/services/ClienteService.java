package com.demo.dig.services;

import com.demo.dig.models.ClienteModel;
import com.demo.dig.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> findAll(){
        return clienteRepository.findAll();
    }

    public ClienteModel addCliente(ClienteModel clienteModel) {
        return clienteRepository.save(clienteModel);
    }
}
