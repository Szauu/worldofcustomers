package com.worldofcustomers.beta.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;



@RestController
@RequestMapping("customers")
public class CustomerController {


    @GetMapping
    public List<Customer> getAllCustomers() {
        return Arrays.asList(
                new Customer(UUID.randomUUID(), "3Dream", "Poland", "Warsaw", "Lomiankowa", "12", "01-400", "20", "20", Customer.Owner.WOJTEK),
                new Customer(UUID.randomUUID(), "Maxillab", "Poland", "Wroclaw", "Wroclawska", "50", "03-400", "12", "51", Customer.Owner.PAWEL)
        );
    }


}
