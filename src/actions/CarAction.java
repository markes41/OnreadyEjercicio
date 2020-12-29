package actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import models.Car;

public class CarAction {
	
	public void DrawContent(Car car1, Car car2, Car car3, Car car4) {
		Car[] cars = new Car[] {car1, car2, car3, car4};
		
		for(int i = 0; i < 4; i++) {
			if(cars[i].getCilindrada().equals("")) 
				System.out.println("Marca: "+cars[i].getMarca()+" // Modelo: "+cars[i].getModelo()+
						" // Puertas: "+cars[i].getPuertas()+" // Precio: $"+cars[i].getPrecio());
			else
				System.out.println("Marca: "+cars[i].getMarca()+" // Modelo: "+cars[i].getModelo()+
						" // Cilindrada: "+cars[i].getCilindrada()+" // Precio: $"+cars[i].getPrecio());
		}
		
	}
	
	public void HighLowContains(Car car1, Car car2, Car car3, Car car4) {
		double max = 0, min = 200000;
		String maxName = null, minName = null, containsName = null;
		
		Car[] carArray = new Car[] {car1, car2, car3, car4};
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i].getPrecio() > max) {
				max = carArray[i].getPrecio();
				maxName = carArray[i].getMarca() +" "+ carArray[i].getModelo();
			}else if(carArray[i].getPrecio() < min){
				min = carArray[i].getPrecio();
				minName = carArray[i].getMarca() +" "+ carArray[i].getModelo();
			}
		}
		
		for(int j = 0; j < carArray.length; j++) {
			if(carArray[j].getModelo().contains("Y")) {
				containsName = carArray[j].getMarca() +" "+ carArray[j].getModelo() + " $" + 
						String.valueOf(carArray[j].getPrecio());
			}
		}
		
		System.out.println("Vehículo más caro: "+maxName+"\nVehículo más barato: "+minName+"\n"
				+ "Vehículo que contiene en el modelo la letra ‘Y’: "+containsName);
	}
	
	public void HigherToLower(Car car1, Car car2, Car car3, Car car4) {
		double[] carPrices = new double[] {car1.getPrecio(), car2.getPrecio(), car3.getPrecio(), car4.getPrecio()};
		Car[] carsToCompare = new Car[] {car1, car2, car3, car4};
		Arrays.sort(carPrices);
		ArrayList<Car> cars = new ArrayList<Car>();

		
		for(int i = 0; i < carsToCompare.length; i++) {
			for(int j = 0; j < carsToCompare.length; j++) {
				if(carPrices[i] == carsToCompare[j].getPrecio()) {
					cars.add(carsToCompare[j]);
				}
			}
		}
		
		Collections.reverse(cars);
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		
		for(int i = 0; i < 4; i++) {
			System.out.println(cars.get(i).getMarca()+ " "+cars.get(i).getModelo());
		}
	}
}
