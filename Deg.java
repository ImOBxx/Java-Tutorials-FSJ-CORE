
class Degree
{
	void getDegree()
	{
		System.out.println("I Got A Degree");
	}
}

class UG extends Degree
{
	@Override
	void getDegree()
	{
		System.out.println("I am a UnderGraduate");
	}
}

class PG extends Degree
{
	@Override
	void getDegree()
	{
		System.out.println("I am a Post-Graduate");
	}
}

public class Deg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Degree a = new Degree();
		UG b = new UG();
		PG c = new PG();
		
		a.getDegree();
		b.getDegree();
		c.getDegree();

	}

}
