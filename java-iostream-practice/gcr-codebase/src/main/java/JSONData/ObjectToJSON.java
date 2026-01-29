package JSONData;
public class ObjectToJSON {
	 static class Car {
		String make;
		String model;
		int year;

		Car(String make, String model, int year) {
			this.make = make;
			this.model = model;
			this.year = year;
		}

		String toJSON() {
			return String.format("{\"make\":\"%s\", \"model\":\"%s\", \"year\":%d}", make, model, year);
		}
	}

	public static void main(String[] args) {
		Car car = new Car("Toyota", "Camry", 2020);
		String json = car.toJSON();
		System.out.println(json);

	}

}
