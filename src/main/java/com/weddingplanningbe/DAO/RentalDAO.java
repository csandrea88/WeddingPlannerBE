package com.weddingplanningbe.DAO;

import com.weddingplanningbe.models.database.WPRental;
import com.weddingplanningbe.repositories.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalDAO {

    @Autowired
    RentalRepository rentalRepository;

    public List<WPRental> getAllRentals() {
        return rentalRepository.findAll();
    }

    public WPRental findRentalById(Integer rentalId) {
        return rentalRepository.findByrentalId(rentalId);
    }

    public void save(WPRental rental) {
        this.rentalRepository.save(rental);



    }
}