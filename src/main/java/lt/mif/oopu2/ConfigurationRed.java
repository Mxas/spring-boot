package lt.mif.oopu2;

import lt.mif.oopu2.repository.CarRepository;
import lt.mif.oopu2.repository.impl.CarRepositoryInMemory;
import lt.mif.oopu2.service.CarService;
import lt.mif.oopu2.service.impl.CarServiceRedImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationRed {

    @Bean
    public CarService carService() {
        return new CarServiceRedImpl();
    }

    @Bean
    public CarRepository carRepository() {
        return new CarRepositoryInMemory();
    }
}
