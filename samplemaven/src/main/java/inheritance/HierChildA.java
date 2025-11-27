package inheritance;

public class HierChildA extends HierParent{
	public void print()
	{
		System.out.println("ChildA extends Parent");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierChildA obj= new HierChildA();
		obj.display();
		obj.print();

	}

}
