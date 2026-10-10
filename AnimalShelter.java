//encapsulation - prevent unauthorized data access

public class AnimalShelter {
	
	public static void main(String[] args)
	{
		Animal anim = new Animal("Marlo",9);
		anim.setAge(-2);
		anim.setName("98");
		System.out.println(anim.getName("secret"));
		System.out.println(anim.getAge("secret"));
	
	}
}
