package program;
import actions.CarAction;
import models.Car;

public class Main {

	public static void main(String[] args) {
		CarAction actions = new CarAction();
		Car car1 = new Car("Peugeot", "206", "", 200000, 4);
		Car car2 = new Car("Honda", "Titan", "125cc", 60000, 4);
		Car car3 = new Car("Peugeot", "208", "", 250000, 5);
		Car car4 = new Car("Yamaha", "YBR", "160cc", 80500.50, 4);
		
		actions.DrawContent(car1, car2, car3, car4);
		System.out.println("=============================");
		actions.HighLowContains(car1, car2, car3, car4);
		System.out.println("=============================");
		actions.HigherToLower(car1, car2, car3, car4);
		
	}

}
