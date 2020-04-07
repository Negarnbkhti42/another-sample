package tryingagain;

public class Vehicle {
	String type;
	String color;
	public Vehicle(String name) {
		System.out.println(name+" is using the Vehicle class now!");
	}
	String getColor() {
		return color;
	}
	void setColor(String x) {
		this.color=x;
	}

}
