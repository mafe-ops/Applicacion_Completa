package com.ciclo.reto.Interface;

import com.ciclo.reto.modelo.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientInterface extends CrudRepository<Client, Integer> {
}
