interface Operation {
	final static float pi = 3.142f;

	double area();

	double volume();
}

class Cylinder implements Operation {
	double r, h;

	Cylinder(double r, double h) {
		this.r = r;
		this.h = h;
	}

	public double area() {
		return pi * 2 * r * (r + h);
	}

	public double volume() {
		return pi * r * r * h;
	}
}

public class Ac {
	public static void main(String[] args) {
		Operation o;
		o = new Cylinder(3, 5.2);
		System.out.println("Area of cylinder : " + o.area());
		System.out.println("Volume of cylinder : " + o.volume());
	}
}