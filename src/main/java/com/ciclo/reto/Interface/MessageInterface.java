package com.ciclo.reto.Interface;

import com.ciclo.reto.modelo.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageInterface extends CrudRepository<Message, Integer> {
}
