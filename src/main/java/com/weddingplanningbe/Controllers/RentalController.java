package com.weddingplanningbe.Controllers;

import com.weddingplanningbe.Manager.RentalManager;
import com.weddingplanningbe.models.ApplicationResponse.rental.ARODisplayRental;
import com.weddingplanningbe.models.applicationInput.AIRental;
import com.weddingplanningbe.models.database.WPRental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static java.util.Objects.isNull;

@RestController
@CrossOrigin
@Service
@RequestMapping({RentalController.Base_URI, "/api/v1/wedding-planning-rentals" })
public class RentalController {

    public static final String Base_URI = "/api/v1/wedding-planning-rentals";

    @Autowired
    RentalManager rentalManager;

    @GetMapping("/getAllRentals")
    public ResponseEntity<List<ARODisplayRental>> getAllRentals() {
        List<ARODisplayRental> response = rentalManager.handleGetAllRentals();

        if(isNull(response)) return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/addARental")
    public ResponseEntity getReturnObj(@Valid @RequestBody AIRental rentalInput) {
        rentalManager.handleAddARental(rentalInput);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/updateARental")
    public  ResponseEntity updateARental (@RequestParam Integer rentalId, @RequestBody AIRental rentalInput) {
        WPRental response = rentalManager.handleUpdateRental(rentalId, rentalInput);

        if (isNull(response)) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}