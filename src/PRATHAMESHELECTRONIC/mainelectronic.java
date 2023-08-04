package PRATHAMESHELECTRONIC;

import java.util.*;

public class mainelectronic 
{
private static final String String = null;
public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("<==>==<==>==<==>==<==>==<==>==<==>==<==>");
	System.out.println("WELCOME TO THE PRATHAMESH ELECTRONICS");
	System.out.println("=<>=<>=<>=<>=<>=<>=<>=<>=<>=<.=<>=<>=<>=");
	System.out.println("WE HAVE MOBILES AND LAPTOPS FOR SELL");
	System.out.println("===============================");
	System.out.println("Enter mobile or laptop");
	System.out.println("===============================");
	String ele=sc.next();
	
	switch(ele)
		{
		case "mobile":
			System.out.println("Enter The Brand name in mobile");
			System.out.println("                            ");
			System.out.println("............................");
			System.out.println("Select from "
					                          + "apple,"
					                          + "samsung,"
					                          + "redmi");
			String mobile=sc.next();
			switch(mobile)
				{
				case"apple":
					System.out.println("Select mobile model in Apple");
					System.out.println("----------------------------------------");
					electronic apple=new electronic();
					apple.apple();
					
				break;
				case"samsung":
					System.out.println("Select mobile model in Samsung");
					System.out.println("----------------------------------------");
					electronic sam=new electronic();
					sam.samsung();
					
					break;
				case"redmi":
					System.out.println("Select mobile model in Redmi");
					System.out.println("----------------------------------------");
					electronic redm=new electronic();
					redm.redmi();
					
					break; 
					default:
						System.out.println("invalid choice of mobile Model");
				}
			break;
		case "laptop":
			System.out.println("Enter The Brand in laptop");
			System.out.println("Select from hp,"
							   			 + "asus,"
							   			 + "applemacbook");
			String laptop=sc.next();
			switch(laptop)
			{
			case"hp":
				System.out.println("Select laptop in hp");
				System.out.println("----------------------------------------");
				electronic hop=new electronic();
				hop.hp();
			
				
			break;
			case"asus":
				System.out.println("Select laptop in asus");
				System.out.println("----------------------------------------");
				electronic asu=new electronic();
				asu.asus();
				
				break;
			case"applemacbook":
				System.out.println("Select laptop in apple MacBook");
				System.out.println("----------------------------------------");
				electronic mac=new electronic();
				mac.macbook();
				break;
				default:
					System.out.println("invalid choice of laptop brand");
			}
			break;
		default:
			System.out.println("Invalid input");
		}
	
		System.out.println("=================================================");
		System.out.println("Please select your Payment Method");
		System.out.println("-------------------------------------------------");
		System.out.println("Select 1 for One Time Payment");
		System.out.println("Select 2 for EMI Payment");
		System.out.println("=================================================");
		
		int m=sc.nextInt();
		switch(m)
		{
		case 1:
			System.out.println("You have selected for One Time Payment");
			electronic one=new electronic();
			one.onetimepayment();
		break;
		
		case 2:
			System.out.println("=============================================");
			System.out.println("You have selected for EMI Payment");
			System.out.println("---------------------------------------------");
			electronic two=new electronic();
			two.emi();
			
		break;
		default :
			System.out.println("Please select valid input");
		}
		
	}
}

