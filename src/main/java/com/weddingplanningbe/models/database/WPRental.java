package com.weddingplanningbe.models.database;

import com.weddingplanningbe.models.applicationInput.AIRental;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity (name = "wp_rentals")
public class WPRental {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rental_id")
    Integer rentalId;

    @Column(name = "name")
    String rentalName;

    @Column(name = "description")
    String  rentaldescription;

    public static WPRental from(AIRental rental) {
        return WPRental.builder()
                .rentalName(rental.getRentalName())
                .rentaldescription(rental.getRentalDescription())
                .build();
    }


}
