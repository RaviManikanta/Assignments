public class Member {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String role; 

	public void setFirstName(String firstName) 
	{
    		this.firstName=firstName;
	}

	public String getFirstName()
	{
		return this.firstName;
	}


	public void setLastName(String lastName) 
	{
    		this.lastName=lastName;
	}

	public String getLastName()
	{
		return this.lastName;
	}
	

	public void setEmail(String email) 
	{
    		this.email=email;
	}

	public String getEmail()
	{
		return this.email;
	}


	public void setPassword(String password) 
	{
    		this.password=password;
	}

	public String getPassword()
	{
		return this.password;
	}


	public void setRole(String role) 
	{
    		this.role=role;
	}

	public String getRole()
	{
		return this.role;
	}

	public String showMemberDetail() 
	{
        return "name: "+getFirstName()+" "+getLastName()+"\nEmail: "+getEmail()+"\nPassword: "+getPassword()+"\nRole: "+getRole();
    	}

	public static void main(String args[])
	{
		Member obj = new Member();
		obj.setFirstName("Pankaj");
		obj.setLastName("Sharma");
		obj.setEmail("sharma.pankaj@yash.com");
		obj.setPassword("12345");
		obj.setRole("Trainer");
		System.out.println(obj.showMemberDetail());
	}
}	
