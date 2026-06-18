package exercise11.dependencyinjection;

public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void getCustomer(int id) {

        String customerName =
                customerRepository.findCustomerById(id);

        System.out.println("Customer ID : " + id);
        System.out.println("Customer Name : " + customerName);
    }
}