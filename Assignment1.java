import java.util.Scanner;
public class Assignment1 {

	public static void main (String[] args){
		Scanner Reader = new Scanner (System.in);
		String SecretPassword, Payment, StringAmount;
		double PasswordAttempts = 2, Customer = 0, Option = 0, CheckOut = 0, PinCost = 20, PinOrder = 0, PinCount = 0;
		double QuaffleCount = 145, QuaffleBoxCount = 0, QuaffleLeftOver = 0, QBoxCost = 638, QuaffleCost = 0, BSKits = 0, BSKitCost = 986;
		double DiscountedTotal = 0, Total = 0, FinalTotal = 0, StillOwe = 0, HavePaid = 0;
		double Bill = 0, IntAmount = 0, SickleToKnut = 0, GalleonToKnut = 0, Change2 = 0;
		double GriffindorPinCount = 0, SlytherinPinCount = 0, HufflepuffPinCount = 0, RavenclawPinCount = 0;
		
		System.out.println("Greetings! Welcome to the Quality Quidditch Supplies in Hogsmeade!\nIs There A Customer In Line? (0 = yes, 1 = no)");
		Customer = Integer.parseInt(Reader.nextLine());
		
		while (Customer == 0){
			
			while(PasswordAttempts > 0){
				System.out.println("Please Enter the Secret Password");
				SecretPassword = Reader.next();
				PasswordCheck(SecretPassword);
				if(PasswordCheck(SecretPassword) == true){
					QBoxCost = 580;
					BSKitCost = 899;
					System.out.println("Welcome special customer! Our discounted prices apply on:\n10 or more House Pins\nBoxes of Quaffles\nBromstick Service Kits\n");
				break;
				}
				else if(PasswordCheck(SecretPassword) == false){
					PasswordAttempts--;
					System.out.println("Invalid Password\n" + PasswordAttempts + " attempts out of 2 remaining\n");	
				}
			}//Password Loop
			Reader.nextLine();
			
			while(PasswordAttempts >= 0){
				
				while(CheckOut != 4){
					System.out.println("Here Is Our Price List: \n" +
										"House Pins (each)               20 Knuts\n" +
										"Available in Gryffindor, Slytherin, HufflePuff and Ravenclaw\n" +
										"[only 18 Knuts if you buy 10 or more]\n" +
										"Quaffles (each)                 145 Knuts\n" +
										"Quaffles (box of 5)             " + QBoxCost + " Knuts\n" +
										"Broomstick Service Kits (each)  " + BSKitCost + " Knuts\n" +
										" \n" +
										"Please choose an option:\n" +
										"1) Update House Pins Order\n" +
										"2) Update Quaffles Order\n" +
										"3) Update Broomstick Kits Order\n" +
										"4) Check Out\n");
					Option = Integer.parseInt(Reader.nextLine());
						
					if (Option == 1){// Pins
						while (PinOrder != 5){
						System.out.println("Here is your current order: \n" +
											PinCount + " Pins Ordered: \n" +
											GriffindorPinCount + " Griffindor Pins, " + SlytherinPinCount + " Slytherin Pins " + HufflepuffPinCount + " Hufflepuff Pins " + RavenclawPinCount + " Ravenclaw Pins \n" +
											"Which Pins Would You Like To Order?\n" +
											"1) Gryffindor\n" +
											"2) Slytherin\n" +
											"3) Hufflepuff\n" +
											"4) Ravenclaw\n" +
											"5) Finished with Pin order");
						PinOrder = Integer.parseInt(Reader.nextLine());
						if (PinOrder == 1){
							System.out.println("How Many Grffindor Pins Would You Like?");
							GriffindorPinCount = Integer.parseInt(Reader.nextLine());
							PinCount += GriffindorPinCount;
							System.out.println(GriffindorPinCount + " Griffindor Pins Added To Your Shopping Cart");
							if (PinCount >= 10)
								System.out.println("Purchase of 10 or more pins: 18 Knuts each \n");
							else if (PinCount < 10)
								System.out.println("Purchase of less than 10 pins: 20 Knuts each \n");
							}
						else if (PinOrder == 2){
							System.out.println("How Many Slytherin Pins Would You Like?");
							SlytherinPinCount = Integer.parseInt(Reader.nextLine());
							PinCount += SlytherinPinCount;
							System.out.println(SlytherinPinCount + " Slytherin Pins Added To Your Shopping Cart");
							if (PinCount >= 10)
								System.out.println("Purchase of 10 or more pins: 18 Knuts each \n");
							else if (PinCount < 10)
								System.out.println("Purchase of less than 10 pins: 20 Knuts each \n");
						}
						else if (PinOrder == 3){
							System.out.println("How Many Hufflepuff Pins Would You Like?");
							HufflepuffPinCount = Integer.parseInt(Reader.nextLine());
							PinCount += HufflepuffPinCount;
							System.out.println(HufflepuffPinCount + " Hufflepuff Pins Added To Your Shopping Cart");
							if (PinCount >= 10)
								System.out.println("Purchase of 10 or more pins: 18 Knuts each \n");
						else if (PinCount < 10)
							System.out.println("Purchase of less than 10 pins: 20 Knuts each \n");
							}
						else if (PinOrder == 4){
							System.out.println("How Many Ravenclaw Pins Would You Like?");
							RavenclawPinCount = Integer.parseInt(Reader.nextLine());
							PinCount += RavenclawPinCount;
							System.out.println(RavenclawPinCount + " Ravenclaw Pins Added To Your Shopping Cart");
							if (PinCount >= 10)
								System.out.println("Purchase of 10 or more pins: 18 Knuts each \n");
							else if (PinCount < 10)
								System.out.println("Purchase of less than 10 pins: 20 Knuts each \n");
							}
						}						
					}
					if (Option == 2){// Quaffles
						System.out.println("How many Quaffles would you like for: \n145 Knuts each \n638 Knuts per box of 5");
						QuaffleCount = Integer.parseInt(Reader.nextLine());
						QuaffleBoxCount = QuaffleCount/5;
						QuaffleLeftOver = QuaffleCount - (QuaffleBoxCount * 5);
						System.out.println(QuaffleBoxCount + " Quaffle Boxes for 580 Knuts each " + QuaffleLeftOver + " Individual Quaffles for 145 Knuts each \n");
					}
					else if (Option == 3){// Broomstick Kits
						System.out.println("How Many Broomstick Service Kits would you like for 899 Knuts each?");
						BSKits = Integer.parseInt(Reader.nextLine());
					}
					else if (Option == 4){ 
						break;
					}	
				}	
				//check out
				PinCost = PinCount * 18;
				QBoxCost = QuaffleBoxCount * 580;
				QuaffleCost = QuaffleLeftOver * 145;
				BSKitCost = BSKits * 899;
				Total = PinCost + QBoxCost + QuaffleCost + BSKitCost;
				DiscountedTotal = (Total * (10.0/100.0));
				FinalTotal = Total - DiscountedTotal;
				FinalTotal = (int)(FinalTotal);
					
					System.out.println("Subtotal: \n" + PinCount + " Pins at 18 Knuts Each: " + PinCost + " Knuts\n" + 
					GriffindorPinCount + " Griffindor Pins \n" + SlytherinPinCount + " Slytherin Pins \n" + HufflepuffPinCount + " Hufflepuff Pins \n" +
					RavenclawPinCount + " Ravenclaw Pins \n" + QuaffleBoxCount + " Boxes of Quaffles: " + QBoxCost + " Knuts\n" +
					QuaffleLeftOver + " Individual Quaffles: " + QuaffleCost + " Knuts\n" + BSKits + " Broomstick Service Kits: " + BSKitCost + " Knuts \n"
					+ " \n" + "Total: " + Total + " Knuts\n" + "10% Discount " + "-" + DiscountedTotal + " Knuts\n" + "Final Total: " + FinalTotal + " Knuts");
			
					System.out.println("\nPlease enter a payment amount in the following format:\n" +
								       "<amount><space><currency>\n" +
								       "Where <amount> = an integer\n" +
								       "Where <space> = a blank space\n" +
								       "Where <currency> = {Knuts, Sickles, Galleons}\n" +
								       "You may enter as many times as you like.  Each entry will be\n" +
								       "added to your total until sufficient funds have been obtained.\n" +
								       "Recall the currency exchange:\n" +
								       "29 Knuts = 1 Sickle\n" +
								       "493 Knuts = 17 Sickles = 1 Galleon");
					
						System.out.println("FinalTotal: " + FinalTotal);	
						
						Bill = (int)FinalTotal;
						Payment = Reader.nextLine();
						//System.out.println("DEBUG");
						while (Bill > 0){
							if(Payment.contains("Sickles")){
								IntAmount = Integer.parseInt(Payment.substring(0, Payment.indexOf(' ')));
								SickleToKnut = IntAmount * 29;
								HavePaid += SickleToKnut;
								StillOwe = FinalTotal - HavePaid;
								System.out.println("You have added " + SickleToKnut + " Knuts to you total");
								System.out.println("You have paid " + HavePaid + " Out of " + FinalTotal + " Knuts");
								
								if (StillOwe > 0)
								System.out.println("You still owe " + StillOwe + " Knuts");
								else
									StillOwe = StillOwe * -1;
								
									System.out.println("Thank You! \nYou Have overpaid by " + StillOwe + " Knuts\nHere is your change: \n" + Change(StillOwe) + "\nThank You for Shopping With Us! Have a Nice Day!");
								}
							if(Payment.contains("Galleons")){
								IntAmount = Integer.parseInt(Payment.substring(0, Payment.indexOf(' ')));
								GalleonToKnut = IntAmount * 493;
								HavePaid += GalleonToKnut;
								StillOwe = FinalTotal - HavePaid;
								System.out.println("You have added " + GalleonToKnut + " Knuts to you total");
								System.out.println("You have paid " + HavePaid + " Out of " + FinalTotal + " Knuts");
								if (StillOwe > 0)
								System.out.println("You still owe " + StillOwe + " Knuts");
								else
									StillOwe = StillOwe * -1;
									System.out.println("Thank You! \nYou Have overpaid by " + StillOwe + " Knuts\nHere is your change: \n" + Change(StillOwe) + "\nThank You for Shopping With Us! Have a Nice Day!");
								}
							if(Payment.contains("Knuts")){
								IntAmount = Integer.parseInt(Payment.substring(0, Payment.indexOf(' ')));
								HavePaid += IntAmount;
								StillOwe = FinalTotal - HavePaid;
								System.out.println("You have added " + IntAmount + " Knuts to you total");
								System.out.println("You have paid " + HavePaid + " Out of " + FinalTotal + " Knuts");
								if (StillOwe > 0)
								System.out.println("You still owe " + StillOwe + " Knuts");
								else
									StillOwe = StillOwe * -1;
									System.out.println("Thank You! \nYou Have overpaid by " + StillOwe + " Knuts\nHere is your change: \n" + Change(StillOwe) + "\nThank You for Shopping With Us! Have a Nice Day!");
								}
							Bill = (int)StillOwe;
							if (StillOwe > 0) Payment = Reader.nextLine();
						}//While Bill Exists Loop
				}//While Checkout
			}//While Customer 
		}//Main Method
	public static boolean PasswordCheck(String SecretPassword){
		if (SecretPassword.equalsIgnoreCase("Weasel"))
			return true;
		else
			return false;
	}//PasswordCheck Method
	public static String Change(double StillOwe){
		
		int GalleonChangeHolder = (int)StillOwe/493;
		double GalleonChange = GalleonChangeHolder * 493;
		double Change = StillOwe - GalleonChange; 
		int SicklesChangeHolder = (int)Change/29;
		double SicklesChange = SicklesChangeHolder * 29;
	
		double Change2 = Change - SicklesChange;
		String str = GalleonChangeHolder + " Galleons " + SicklesChangeHolder + " Sickles " + Change2 + " Knuts ";
		return str;//Knuts
	}
}//Class