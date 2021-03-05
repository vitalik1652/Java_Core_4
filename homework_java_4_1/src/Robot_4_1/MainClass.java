package Robot_4_1;

public class MainClass {
	public static void main(String[] args) {

		DefaultRobot DefaultRobot = new DefaultRobot();
		CoffeRobot CoffeRobot = new CoffeRobot();
		RobotDancer RobotDancer = new RobotDancer();
		RobotCoocker RobotCoocker = new RobotCoocker();

		DefaultRobot.work();
		CoffeRobot.work();
		RobotDancer.work();
		RobotCoocker.work();

		System.out.println("-------------------------------");

		Robot[] arrayRobot = { DefaultRobot, CoffeRobot, RobotDancer, RobotCoocker };
		for (int i = 0; i < arrayRobot.length; i++) {
			DefaultRobot.work();
			CoffeRobot.work();
			RobotDancer.work();
			RobotCoocker.work();
		}
	}
}
