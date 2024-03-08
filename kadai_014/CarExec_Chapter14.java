package kadai_014;

public class CarExec_Chapter14 {

	public static void main(String[] args) {

		Car_Chapter14 gear = new Car_Chapter14(1, 10);
		Car_Chapter14 speed = new Car_Chapter14(3, 30);

		gear.gearChange(3);
		speed.run();
	}

}
