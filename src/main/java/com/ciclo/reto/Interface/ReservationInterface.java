package com.ciclo.reto.Interface;

import com.ciclo.reto.modelo.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ReservationInterface extends CrudRepository<Reservation, Integer> {

    List<Reservation> findAllByStatus(String status);

    List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date fechaInicio, Date fechaFin);

    @Query("SELECT c.client, COUNT(c.client) from Reservation  AS c  group by c.client order by COUNT(c.client)DESC ")
    List<Object[]> reporteClientes();
}
