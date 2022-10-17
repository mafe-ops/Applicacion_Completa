package com.ciclo.reto.repository;

import com.ciclo.reto.Interface.ReservationInterface;
import com.ciclo.reto.modelo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationInterface extencionesCrud;

    public List<Reservation> getAll(){
        return (List<Reservation>) extencionesCrud.findAll();
    }

    public Optional<Reservation> getReservation(int id){
        return extencionesCrud.findById(id);
    }

    public Reservation save(Reservation reservation){
        return extencionesCrud.save(reservation);
    }

    public void delete (Reservation reservation) {extencionesCrud.delete(reservation);}

    public List<Reservation> ReservacionStatus(String status){
        return extencionesCrud.findAllByStatus(status);
    }

    public List<Reservation> ReservacionTiempo(Date fechaInicial, Date fechaFinal){
        return extencionesCrud.findAllByStartDateAfterAndStartDateBefore(fechaInicial, fechaFinal);
    }


    public   List<Object[]> reporteClientes() {
        return extencionesCrud.reporteClientes();

    }
}
