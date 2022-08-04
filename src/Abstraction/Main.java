package Abstraction;

public class Main 
{
	public static void main(String[] args)
	{
        School s;
        s = new College ();
        System.out.println("Total Strength is: "+s.getstrength()+"%");
        s= new Office();
        System.out.println("Total Strength is : "+s.getstrength()+"%");
    }

}
