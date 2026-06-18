package exercise11.dependencyinjection;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if(id == 101) {
            return "John";
        }

        return "Customer Not Found";
    }
}