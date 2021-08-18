
public class Member {
 
	String name ;
	String email;
	int password;
	String roll;

 public void SetData(String name , String email , int password ,String roll)
 {
	 this .name = name;
	 this .email = email;
	 this.password = password;
	 this.roll =roll;
 }
 public void GetData()
 {
	System.out.println(name);
	System.out.println(email);
	System.out.println(password);
	System.out.println(roll);
 }
 public static void main(String[] arg)
 {
	Member m1 = new Member();
	m1.SetData("pankaj","pankaj@yash.com", 1234, "traniee");
	m1.GetData();
 }
 
}
