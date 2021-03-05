package Robot_4_1;

abstract class Robot {
	abstract void work();
}

class DefaultRobot extends Robot {
	void work() {
		System.out.println("Я Robot - я просто працюю");
	}
}

class CoffeRobot extends Robot {
	void work() {
		System.out.println("Я CoffeRobot - я варю каву");
	}
}

class RobotDancer extends Robot {
	void work() {
		System.out.println("Я RobotDancer -я просто танцюю");
	}
}

class RobotCoocker extends Robot {
	void work() {
		System.out.println("Я RobotCoocker -я просто готую");
	}
}
