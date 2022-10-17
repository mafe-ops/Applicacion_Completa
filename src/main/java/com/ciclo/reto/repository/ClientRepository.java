package com.ciclo.reto.repository;

import com.ciclo.reto.Interface.ClientInterface;
import com.ciclo.reto.modelo.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {

    @Autowired
    private ClientInterface extencionesCrud;

    public List<Client> getAll(){
        return (List<Client>) extencionesCrud.findAll();
    }

    public Optional<Client> getClient(int id){
        return extencionesCrud.findById(id);
    }

    public Client save(Client client){
        return extencionesCrud.save(client);
    }

    public void delete (Client client) {extencionesCrud.delete(client);}
}
