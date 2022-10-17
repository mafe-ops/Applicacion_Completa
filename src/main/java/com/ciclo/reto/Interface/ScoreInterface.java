package com.ciclo.reto.Interface;

import com.ciclo.reto.modelo.Score;
import org.springframework.data.repository.CrudRepository;

public interface ScoreInterface extends CrudRepository<Score, Integer> {
}
