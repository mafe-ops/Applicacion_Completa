package com.ciclo.reto.Controller;


import com.ciclo.reto.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
public class ScoreController {

    @Autowired
    private ScoreService scoreService;
}
