package Example1;

public class SampleBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer("hello");
		System.out.println(sb);
		StringBuilder sbs=new StringBuilder("Hiiii");
		System.out.println(sbs);
		//INSERT METHOD: To insert a anything based on index
		sb.insert(5, " Akshay");
		System.out.println(sb);
		//APPEND METHOD: To add a new string at end
		sb.append(" How are you");
		System.out.println(sb);
		//REPLACE: To change any characters:giv strt and end index
		sbs.replace(2, 5, " Akshay");
		System.out.println(sbs);
		//REVERSE: To reverse a string
		sbs.reverse();
		System.out.println(sbs);
		//DELETE: To delete based on index
		sbs.delete(8, 9);
		System.out.println(sbs);

	}

}
