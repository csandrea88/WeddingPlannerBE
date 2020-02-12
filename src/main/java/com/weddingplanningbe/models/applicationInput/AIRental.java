package com.weddingplanningbe.models.applicationInput;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Entity (name = "wp_rentals")
public class AIRental {

    @NotBlank(message = "Name field is required")
    String rentalName;
    String rentalDescription;

}
