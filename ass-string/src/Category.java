public class Category
{
	private String id;
	private String name;
	private String createdDate;
	 

	public void setId(String id) 
	{
    		this.id=id;
	}

	public String getId()
	{
		return this.id;
	}


	public void setName(String name) 
	{
    		this.name=name;
	}

	public String getName()
	{
		return this.name;
	}
	

	public void setCreatedDate(String createdDate) 
	{
    		this.createdDate=createdDate;
	}

	public String getCreatedDate()
	{
		return this.createdDate;
	}


	public String showCategoryDetail() 
	{
        return "Id: "+getId()+"\nName: "+getName()+"\nCreatedDate: "+getCreatedDate();
    	}

	public static void main(String args[])
	{
		Category obj = new Category();
		obj.setId("101");
		obj.setName("javabasics");
		obj.setCreatedDate("31-01-2017");
		
		System.out.println(obj.showCategoryDetail());
	}
}