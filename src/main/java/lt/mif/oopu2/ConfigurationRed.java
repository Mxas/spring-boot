package lt.mif.oopu2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lt.mif.oopu2.service.CarService;
import lt.mif.oopu2.service.impl.CarServiceRedImpl;

//@Configuration
public class ConfigurationRed {

	@Bean
	public CarService carService() {
		return new CarServiceRedImpl();
	}

}
