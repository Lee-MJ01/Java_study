package p224;

class Sample {
	public int a;
	//private int b;
	int c;
	protected int d; 
		
}

class sub extends Sample{
	public void method() { 
		d= 10;
	}
}

public class AccessEx {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.a = 10;
		// s.b = 10;
		s.c = 10;
		
	}

}
