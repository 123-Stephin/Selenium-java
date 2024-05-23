package Stephinpractice;

public class Basic4 {

	public static void main(String[] args) {
	
		Basic4 d = new Basic4();
		String name =d.getData();
		System.out.println(name);
		
		Basic5 b = new Basic5();
		b.showData();
		}

	public String getData()
	{
		System.out.println("hi all");
		return "no comments";
	}
}
