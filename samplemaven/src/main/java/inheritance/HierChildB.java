package inheritance;

public class HierChildB extends HierParent {
	public void printB()
	{
		System.out.println("ChildB extends Parent");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierChildB obj= new HierChildB();
		obj.display();
		obj.printB();
		

	}

}
