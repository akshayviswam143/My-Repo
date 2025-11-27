package inheritance;

public class MultilevelChild extends MultilevelParent{
	public void displaychild()
	{
		System.out.println("Child extends parent");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChild obj= new MultilevelChild();
		obj.display();
		obj.displayParent();
		obj.displaychild();
		

	}

}
