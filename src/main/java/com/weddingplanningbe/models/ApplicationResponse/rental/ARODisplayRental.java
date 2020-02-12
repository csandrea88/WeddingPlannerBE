package com.weddingplanningbe.models.ApplicationResponse.rental;

import com.weddingplanningbe.models.database.WPRental;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "wp_rentals")
public class ARODisplayRental {

    Integer rentalId;
    String rentalName;
    String rentalDescription;


    public static ARODisplayRental from(WPRental rental) {
        return ARODisplayRental.builder()
                .rentalId(rental.getRentalId())
                .rentalName(rental.getRentalName())
                .rentalDescription(rental.getRentaldescription())
                .build();

    }

}
