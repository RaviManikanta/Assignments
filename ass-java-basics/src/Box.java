
public class Box {
    int length ;
    int breadth;
    int height;
    String material;
    String design;
    public void setData(int length , int breadth,int height,String material, String design)
    {
    	this.length =length;
    	this.breadth =breadth;
    	this.height =height;
    	this.material =material;
    	this.design = design;
    }
    public void getData()
    {
    	System.out.println("Length = "+length+"cm");
    	System.out.println("Breadth = "+breadth+"cm");
    	System.out.println("Height = "+height+"cm");
    	System.out.println("Material = "+material+" mixed_with_steel_cotting");
    	System.out.println("Design = "+design+" 3d_Mensuration");
    }
    public static void main(String[] args)
    {
    	Box b1 = new Box();
    	b1.setData(12, 8, 5,"Iron","Cuboid_shape");
    	b1.getData();
    }
}
