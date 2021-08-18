
public class Document {
	 String title;
     String filepath;
	public void getter()
	{
		System.out.println(title);
		System.out.println(filepath);
	}
	public void setter(String title , String filepath)
	{
		this.title = title;
		this.filepath = filepath;
	}
	
	public static void main(String[] args) {
	
      Document d1 = new Document();
       d1.setter("javaBasic","c/java/jdk/bin");
       d1.getter();
       
	}

}
