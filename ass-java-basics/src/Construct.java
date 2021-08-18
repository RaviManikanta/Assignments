 
public class Construct {

	static String city ="INDORE";
	int bugdet;
	double Size_of_Plot;
	String constructor_CompanyName;
	String materialName;
	public Construct(int bugdet, double size_of_Plot, String constructor_CompanyName, String materialName)
	{
		this.bugdet = bugdet;
		this.Size_of_Plot = size_of_Plot;
		this.constructor_CompanyName = constructor_CompanyName;
		this.materialName = materialName;
	}
	
	public void getDetails()
	{
	System.out.println("bugdet is => "+ bugdet+"lack");
	System.out.println("size of the plot => "+ Size_of_Plot+"SqFit");
	System.out.println("Constructor company name => "+  constructor_CompanyName);
	System.out.println("Material names => "+ materialName);
	
	}
	public static void main(String[] args)
	{
		Construct c1 = new Construct(50000,480000,"Rane_Constructors","Cement,Sand,Blocks,Windows,Color ");
		System.out.println("City name => "+city);
		c1.getDetails();
	}
	
}
