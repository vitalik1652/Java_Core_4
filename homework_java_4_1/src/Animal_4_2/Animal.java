package Animal_4_2;

public class Animal {
	private String NameAnimal;
	private String SpeedAnimal;
	private String AgeAnimal;

	Animal(String NameAnimal, String SpeedAnimal, String AgeAnimal) {
		super();
		this.NameAnimal = NameAnimal;
		this.SpeedAnimal = SpeedAnimal;
		this.AgeAnimal = AgeAnimal;
	}

	public String getNameAnimal() {
		return this.NameAnimal;
	}

	public void setNameAnimal(String nameAnimal) {
		NameAnimal = nameAnimal;
	}

	public String getSpeedAnimal() {
		return this.SpeedAnimal;
	}

	public void setSpeedAnimal(String speedAnimal) {
		SpeedAnimal = speedAnimal;
	}

	public String getAgeAnimal() {
		return this.AgeAnimal;
	}

	public void setAgeAnimal(String ageAnimal) {
		AgeAnimal = ageAnimal;
	}

	@Override
	public String toString() {
		return "Назва тварини = " + NameAnimal + ", Швидкість тварини = " + SpeedAnimal + ", Вік тварини = "
				+ AgeAnimal ;
	}

}
