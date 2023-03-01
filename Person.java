public class Person
{
	/* In this Person class there's a single variable 'name'. The variable 
	  can be accessed using a getter function 'getName()' and can be changed
	  using a setter function 'setName(String)'.*/
	 
	// Instead of making the variable 'name' public, we use a setter function.
	// It allows others to set the value of 'name' with certain restrictions.
	private String name;
/* Let's define our getter functions here */
	
	public String getName()
	{
		if (name.length() > 16)
			return "Name is too large!";
		else
			return name;
	}
/* Let's define out setter function here */

	public void setName(String name)
	{
		if (name != null && name.length() > 2)
			this.name = name;
	}
}
