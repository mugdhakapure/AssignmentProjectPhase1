//2. using private access specifiers
    class accessSpecifiers
    { 
    private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
    } 

    public class accessSpecifiers2
    {

	public static void main(String[] args)
	{
		//private
		System.out.println("Private Access Specifier");
		accessSpecifiers2  obj = new accessSpecifiers2(); 
        //trying to access private method of another class 
        //obj.display();

	}
}
