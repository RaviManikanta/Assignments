public class Document {

	private String title;
	private String filepath;

	public void setTitle(String title) 
	{
    		this.title = title;;
	}

	public String getTitle()
	{
		return this.title;
	}

	public void setFilepath(String filepath) 
	{
    		this.filepath = filepath;;
	}

	public String getFilepath()
	{
		return this.filepath;
	}

	public String showDocumentInformation() 
	{
        return "Title: "+getTitle()+"\nFilepath: "+getFilepath();
    	}
	public static void main(String[] args) {
		
		Document obj = new Document();
		obj.setTitle("java basics");
		obj.setFilepath("c:/document/corejava/basics/introduction.pdf");
		System.out.println(obj.showDocumentInformation());

	}

}
