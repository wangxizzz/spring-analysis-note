package factory;

import bean.Car;
import org.springframework.beans.factory.FactoryBean;

/**
 * 自定义工厂Bean
 */
public class CarFactoryBean implements FactoryBean<Car> {
	private String carInfo;
	@Override
	public Car getObject() throws Exception {
		String[] parts = carInfo.split(",");
		Car car = new Car();
		car.setBrand(parts[0].trim());
		car.setMaxSpeed(Integer.parseInt(parts[1]));
		car.setPrice(Double.parseDouble(parts[2]));
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
}
