package SuperKeyword;

public class SuperVariableChild extends SuperVariableParent{
	
	String S="RED"; //Same variable in parent and child
	public void display()
	{
		
		System.out.println(S); 
		System.out.println(super.S); //Using super keyword: Variable from parent
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj = new SuperVariableChild();
		obj.display(); 

	}

}
