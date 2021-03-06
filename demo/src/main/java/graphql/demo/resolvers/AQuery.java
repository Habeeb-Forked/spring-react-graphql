package graphql.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.demo.model.Test;
import graphql.demo.model.Vehicle;
import graphql.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AQuery implements GraphQLQueryResolver {

    @Autowired
    private VehicleService vehicleService;

    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }

    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }

    public Test test(int id) {
        Test test = new Test();
        test.setId(id);
        return test;
    }

    public Test fetchTest(Integer count) {
        return new Test();
    }

}