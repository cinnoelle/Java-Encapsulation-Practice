
public class Animal {
	private String name;	//use private to prevent direct access
	private int age;
	

	public String getName(String pass) {
		if (pass.equals("secret"))
		{
			return name;
		}
		else
		{
			System.err.println("Unauthorized Access! Wrong Password!");
			return null;
		}
	}

	protected void setName(String name) {	//protected is only ppl w authentication can set name/age
		if (!name.isEmpty() && name.length()>2)
		{
			this.name = name;
		}
		else
		{
			System.err.println("Invalid name value! Change not permitted!");
		}
	}

	public int getAge(String pass) {
		if (pass.equals("secret"))
		{
			return age;
		}
		else
		{
			System.err.println("Unauthorized Access! Wrong Password!");
			return -1;
		}
	}

	protected void setAge(int age) {
		if (age>0)
		{
			this.age = age;
		}
		else
		{
			System.err.println("Invalid age value! Change not permitted!");
		}
	}
		
	public Animal(String _name, int _age)
	{
		setName(_name);
		setAge(_age);
	}
}
