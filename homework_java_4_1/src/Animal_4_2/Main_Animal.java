package Animal_4_2;

public class Main_Animal {
	public static void main(String[] args) {

		Animal a = new Animal("Леопард", "20 км/год", "14 років");

		System.out.println(a);

		a.setNameAnimal("Бик");
		a.setSpeedAnimal("2 км/год");
		a.setAgeAnimal("14 років");

		System.out.println(a);

		
	}
}
