package com.weddingplanningbe.Manager;

import com.weddingplanningbe.DAO.RentalDAO;
import com.weddingplanningbe.models.ApplicationResponse.rental.ARODisplayRental;
import com.weddingplanningbe.models.applicationInput.AIRental;
import com.weddingplanningbe.models.database.WPRental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.Objects.isNull;

@Service
public class RentalManager {

    @Autowired
    RentalDAO rentalDAO;

    public List<ARODisplayRental> handleGetAllRentals() {

      List<WPRental> rentals = rentalDAO.getAllRentals();

      if(isNull(rentals)) return null;

      List<ARODisplayRental> rentalsToDisplay = rentals.stream().map(ARODisplayRental::from).collect(Collectors.toList());

      return rentalsToDisplay;

    }

    public void handleAddARental(AIRental rentalInput) {
        WPRental rental = WPRental.from(rentalInput);
        rentalDAO.save(rental);

    }

    public WPRental handleUpdateRental(Integer rentalId, AIRental rentalChanges) {
        WPRental wpRental = rentalDAO.findRentalById(rentalId);

        if (isNull(wpRental)) return null;

        wpRental.setRentalName(rentalChanges.getRentalName());
        wpRental.setRentaldescription(rentalChanges.getRentalDescription());

        rentalDAO.save(wpRental);
        return wpRental;
    }
}
