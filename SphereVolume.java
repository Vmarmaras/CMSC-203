
import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class SphereVolume 
{ 
	public static void main(String[] args) 
	{ 
		DecimalFormat df = new DecimalFormat(".000");
		Scanner s = new Scanner(System.in);
		double diam = 0;
		
		System.out.println("The purpose of this is to calculate the volume of a sphere with values that you provide!");
		
		System.out.println("Enter the Diameter of your Sphere: ");
		diam = s.nextDouble();
		
		while(diam < 0 )
		{
			System.out.println("Diameter must be over zero.\nEnter Diameter once more: ");
			diam = s.nextDouble();
		}
		
		double radius = diam / 2;
		
		double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow(radius, 3 );
		
		System.out.println("The Volume of your Sphere is: " + volume);
		
	} 
} 
