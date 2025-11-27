package SuperKeyword;

public class SuperConstructorChild extends SuperConstructorParent{
	
	public SuperConstructorChild()
	{
		super();
		System.out.println("Super Constructor Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj= new SuperConstructorChild();

	}

}
