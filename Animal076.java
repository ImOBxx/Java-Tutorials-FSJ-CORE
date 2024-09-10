
class Animal098
{
	void makesound()
	{
		System.out.println("The Animal Makes Sounds");
	}
}

class Dog3 extends Animal098
{
	@Override
	void makesound()
	{
		System.out.println("The Dog Barks");
	}
}

public class Animal076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal098 x = new Dog3();
		x.makesound();
		

	}

}
