interface Operation {
	final float pi = 3.142f;
	
	float area();
	float volume();
}

class Cylinder implements Operation {
	float r, h;
	
	Cylinder(float r, float h) {
		this.r = r;
		this.h = h;
	}
	
	public float area() {
		return 2 * pi * r * (r + h);
	}
	
	public float volume() {
		return pi * r * r * h;
	}
	
	public static void main(String[] args) {
		Cylinder obj =  new Cylinder(3, 5.2f);
		
		System.out.println("Area : " + obj.area() + "\nVolume : " + obj.volume());
	}
}
