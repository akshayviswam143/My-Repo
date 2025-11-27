package AccessSpecifier;

public class Access1 {
	public void display1()
	{
		System.out.println("Access Specifier 1:PUBLIC");
	}
	private void display2()
	{
		System.out.println("Access Specifier 2:PRIVATE");
	}
	protected void display3()
	{
		System.out.println("Access Specifier 3:PROTECTED");
	}
	void display4()
	{
		System.out.println("Access Specifier 4: DEFAULT");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 obj = new Access1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
		

	}

}
