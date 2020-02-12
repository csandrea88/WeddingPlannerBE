package com.weddingplanningbe.Managers;

import com.weddingplanningbe.DAO.RentalDAO;
import com.weddingplanningbe.Manager.RentalManager;
import com.weddingplanningbe.models.ApplicationResponse.rental.ARODisplayRental;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import java.util.List;

import static junit.framework.TestCase.assertNull;
import static org.mockito.Mockito.when;


public class RentalManagerTest {
    @InjectMocks @Spy RentalManager rentalManager;
    @Mock RentalDAO rentalDAO;

//    @Before
//    public void bindMockServer() {
//        MockitoAnnotations.initMocks(this);}

     @Test
     public void handleGetAllRentals_noRentalsExist() {

         when(rentalDAO.getAllRentals()).thenReturn(null);

         List<ARODisplayRental> results = rentalManager.handleGetAllRentals();

         assertNull(results);

     }

}
