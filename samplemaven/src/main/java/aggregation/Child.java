package aggregation;

public class Child {
String City;
String State;
Parent ref;
public Child(String City, String State,Parent ref)
{
	this.City=City;
	this.State=State;
	this.ref=ref;
	
}
public void display()
{
System.out.println("Name :"+ref.Name);
System.out.println("Roll no :"+ref.RollNo);
System.out.println("Address :"+ref.Address);
System.out.println("City :"+City);
System.out.println("State :"+State);

}
public static void main(String[] args) {
	Parent obj=new Parent("Akshay",27,"Heavens");
	Child obj2=new Child("Kollam","Kerala",obj);
	obj2.display();
}

}
