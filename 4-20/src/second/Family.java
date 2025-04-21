package second;

public class Family {

	public String doorPlate = "No.123";

	protected String getSecret() {
		
		return "保密";
	}

	private void getVehicle() {
		System.out.println("使用家庭的私人车辆");
	}

	public void demonstrateVehicleUsage() {
		getVehicle();
	}
}
