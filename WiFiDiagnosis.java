import java.util.*;

public class WiFiDiagnosis {
		public void diagnose()
		{
			boolean isFixed = false;
			String input;
			Scanner sc = new Scanner(System.in);
			System.out.println("This tool should be able to help if you are struggling to maintain a WiFi connection.");
			System.out.println("For all questions please reply yes/no\n");
			
			while(isFixed == false)
			{
				System.out.println("\nStep one: Reboot your computer. \nDid that fix the problem?");
				input = sc.nextLine();
				
				if(input.equals("yes"))
				{
					isFixed = true;
					System.out.println("Reboting your device seemed to work.\n");
					break;
					
				}
				
				System.out.println("\nStep Two: Reboot your router. \nDid that fix the problem?");
				input = sc.nextLine();
				
				if(input.equals("yes"))
				{
					isFixed = true;
					System.out.println("Rebooting your router seemed to work.\n");
					break;
					
				}
				
				System.out.println("\nStep Three: Make sure all wires are securely connected to your router. \nDid that fix the problem?");
				input = sc.nextLine();
				
				if(input.equals("yes"))
				{
					isFixed = true;
					System.out.println("Making sure connections were properly secured seemed to work.\n");
					break;
					
				}
				
				System.out.println("\nStep Four: Move the device closer to the router. \nDid that fix the problem?");
				input = sc.nextLine();
				
				if(input.equals("yes"))
				{
					isFixed = true;
					System.out.println("Moving closer seemed to work.\n");
					break;
					
				}
				
				System.out.println("\nContact your ISP\n");
				break;
			}
			sc.close();
		}
}
