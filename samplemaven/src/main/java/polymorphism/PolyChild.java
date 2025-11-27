package polymorphism;

public class PolyChild extends Polyparent{
	public void display(int a, int b)
	{
		super.display(12, 10);
		int c=a-b;
		System.out.println("Difference of numbers is "+ c);
		
	}
	public static void main(String[] args) {
		PolyChild poly =new PolyChild();
		poly.display(100, 50);
		
	}

}
