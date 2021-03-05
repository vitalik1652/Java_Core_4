package Robot_4_1;

abstract class Robot {
	abstract void work();
}

class DefaultRobot extends Robot {
	void work() {
		System.out.println("� Robot - � ������ ������");
	}
}

class CoffeRobot extends Robot {
	void work() {
		System.out.println("� CoffeRobot - � ���� ����");
	}
}

class RobotDancer extends Robot {
	void work() {
		System.out.println("� RobotDancer -� ������ ������");
	}
}

class RobotCoocker extends Robot {
	void work() {
		System.out.println("� RobotCoocker -� ������ �����");
	}
}
