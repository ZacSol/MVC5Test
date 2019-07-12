package guru.springframework.springmvcrest.bootstrap;

import guru.springframework.springmvcrest.domain.Customer;
import guru.springframework.springmvcrest.repositories.CustomerRepository;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Data
@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception{

        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstName("Michale");
        c1.setLastName("Weston");
        c1.setCity("L.A.");
        c1.setPhone("555-555-1234");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Sam");
        c2.setLastName("Axe");
        c2.setCity("L.A.");
        c2.setPhone("555-555-4321");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Fiona");
        c3.setLastName("Glennann");
        c3.setCity("L.A.");
        c3.setPhone("555-555-1221");
        customerRepository.save(c3);

        System.out.println("Customers Saved: " + customerRepository.count());
    }

}
