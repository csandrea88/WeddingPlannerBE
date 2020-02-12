//package com.weddingplanningbe.Controllers;
//
//import com.weddingplanningbe.DAO.RentalDAO;
//import com.weddingplanningbe.Manager.RentalManagerTest;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class rentalControllerIntTest {

//    public static final String Base_URI = "/api/v1/wedding-planning-rentals";
//
//
//    @Autowired
//    MockMvc mockMvc;
//
//    @Autowired
//    RentalManagerTest rentalManager;
//
//    @Autowired
//    RentalDAO rentalDAO;
//
//
//    @Test
//    @Transactional
//    @Rollback
//    public void getAllRentals() throws Exception {

//        WPRental rental =  WPRental.builder()
//                .rentalName("WhiteClassicChair")
//                .rentaldescription("vintage creme")
//                .build();
//        rentalDAO.save(rental);
//
//        WPRental rental1 = WPRental.builder()
//                .rentalName("YellowChair")
//                .rentaldescription("vintage yellow")
//                .build();
//        rentalDAO.save(rental1);
//
//        WPRental rental2 = WPRental.builder()
//                .rentalName("Big Easel1")
//                .rentaldescription("silver")
//                .build();
//        rentalDAO.save(rental2);
//
//        WPRental rental3 = WPRental.builder()
//                .rentalName("Medium Easel1")
//                .rentaldescription("silver")
//                .build();
//        rentalDAO.save(rental3);

//        MockHttpServletRequestBuilder request = get("/api/v1/wedding-planning-rentals/getAllRentals");
//
//        this.mockMvc.perform(request)
//                .andExpect(status().isOk());
//    }
//
//}
