package p206;

class Circle {
	int r;
	public Circle(int r) {
		this.r = r;
	}
	public double getArea() {
		return 3.14 * r * r;
	}
}

public class CircleArray {

	public static void main(String[] args) {
		Circle[] c;
		c = new Circle[5];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = new Circle(i);
		}
		for(int i= 0; i<c.length; i++) {
			System.out.print((int)(c[i].getArea()) + " ");
		}

	}

}
