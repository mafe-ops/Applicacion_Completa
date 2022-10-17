package com.ciclo.reto.service;


import com.ciclo.reto.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;
}
