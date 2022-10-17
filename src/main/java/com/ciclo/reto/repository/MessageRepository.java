package com.ciclo.reto.repository;

import com.ciclo.reto.Interface.MessageInterface;
import com.ciclo.reto.modelo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {

    @Autowired
    private MessageInterface extencionesCrud;

    public List<Message> getAll(){
        return (List<Message>) extencionesCrud.findAll();
    }

    public Optional<Message> getMessage(int id){
        return extencionesCrud.findById(id);
    }

    public Message save(Message message){
        return extencionesCrud.save(message);
    }

    public void delete (Message message) {extencionesCrud.delete(message);}
}
