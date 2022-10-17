package com.ciclo.reto.repository;

import com.ciclo.reto.Interface.AdminInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepository {

    @Autowired
    private AdminInterface extencionesCrud;
}
