public class Main
{
    int i = 50;
	  public static void main(String[] args) {
		Main obj1 = new Main();
		obj1.i = 60;
		System.out.println("i = "+obj1.i);
		Main obj2 = new Main();
		obj2.i = 80;
		System.out.println("i = "+obj2.i);
		Main obj3 = new Main();
		System.out.println("i = "+obj3.i);
	}
}



