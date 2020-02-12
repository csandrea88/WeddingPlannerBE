package com.weddingplanningbe.repositories;


import com.weddingplanningbe.models.database.WPRental;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RentalRepository extends CrudRepository<WPRental, Integer>  {

    List<WPRental> findAll();

    WPRental findByrentalId(Integer rentalId);

}
