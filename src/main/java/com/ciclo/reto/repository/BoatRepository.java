package com.ciclo.reto.repository;

import com.ciclo.reto.Interface.BoatInterface;
import org.springframework.stereotype.Repository;
import com.ciclo.reto.modelo.Boat;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Repository
public class BoatRepository {

    @Autowired
    private BoatInterface extencionesCrud;

    public List<Boat> getAll() {return (List<Boat>) extencionesCrud.findAll();}

    public Optional<Boat> getBoat(int id){ return extencionesCrud.findById(id);}

    public Boat save(Boat boat) {return extencionesCrud.save(boat);}

    public void delete (Boat boat) {extencionesCrud.delete(boat);}
}
