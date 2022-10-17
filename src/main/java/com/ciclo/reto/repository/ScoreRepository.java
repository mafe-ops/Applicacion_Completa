package com.ciclo.reto.repository;


import com.ciclo.reto.Interface.ScoreInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class ScoreRepository {

    @Autowired
    private ScoreInterface extencionesCrud;


}
