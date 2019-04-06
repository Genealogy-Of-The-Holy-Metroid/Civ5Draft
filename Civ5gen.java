import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Civ5gen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("America");
		al.add("Arabia");
		al.add("Assyria");
		al.add("Austria");
		al.add("Aztec");
		al.add("Babylon");
		al.add("Brazil");
		al.add("Byzantium");
		al.add("Carthage");
		al.add("Celts");
		al.add("China");
		al.add("Denmark");
		al.add("Egypt");
		al.add("England");
		al.add("Ethiopia");
		al.add("France");
		al.add("Germany");
		al.add("Greece");
		al.add("Huns");
		al.add("Inca");
		al.add("India");
		al.add("Indonesia");
		al.add("Iroquois");
		al.add("Japan");
		al.add("Korea");
		al.add("Maya");
		al.add("Mongolia");
		al.add("Morocco");
		al.add("Netherlands");
		al.add("Ottoman");
		al.add("Persia");
		al.add("Poland");
		al.add("Polynesia");
		al.add("Portugal");
		al.add("Rome");
		al.add("Russia");
		al.add("Shoshone");
		al.add("Siam");
		al.add("Songhai");
		al.add("Spain");
		al.add("Sweden");
		al.add("Venice");
		al.add("Zulu");
		
		
		
		Scanner reader = new Scanner(System.in); 
		System.out.println("How many players?");
		int amount = reader.nextInt();
		System.out.println("Do you want to ban civ? 1 - yes, 2 - no.");
		int ban = -1;
		String doYouWantToBanCivs = "" + reader.next();
		try
		{
		ban = Integer.parseInt(doYouWantToBanCivs);
		}catch(InputMismatchException e)
			{
				if(doYouWantToBanCivs.toLowerCase().equals("yes"))
					ban = 1;
			}
		 catch(NumberFormatException e)
			{
			 	if(doYouWantToBanCivs.toLowerCase().equals("yes"))
					ban = 1;
			}
		if(ban == 1)
			{
			while(true)
				if(true)
					{
						int at = 0;
						for(String s : al)
							{
								System.out.println("" + at + " " +s);
								at++;
							}
						System.out.println("Who do you want to ban? \n(You can type out the name or just say the number right next to them.)\n(Type “exit” to exit loop.)");
						String civ = reader.next();
						try
						{
							int intBan = Integer.parseInt(civ);
							al.remove(intBan);
						}catch(Exception e) {al.remove(civ);}
						
						if(civ.equals("exit"))
						{
							break;
						}
					}
			}
		
		
		ban = -1;
		System.out.println("Do you want to add civs modded civs to the game? \n(or you can use this to readd civs that you accidently banned.) \n1 - yes, 2 - no.");
		doYouWantToBanCivs = "" + reader.next();
		try
		{
		ban = Integer.parseInt(doYouWantToBanCivs);
		}catch(InputMismatchException e)
			{
				if(doYouWantToBanCivs.toLowerCase().equals("yes"))
					ban = 1;
			}
		 catch(NumberFormatException e)
			{
			 	if(doYouWantToBanCivs.toLowerCase().equals("yes"))
					ban = 1;
			}
		if(ban == 1)
			{
			System.out.println("Type \"exit\" when you're done.\nType \"undo\" to get rid of the last civ you added.");
			while(true)
				{
				String civ = reader.next();
				if(civ.toLowerCase().equals("exit"))
					break;
				else if(civ.toLowerCase().equals("undo"))
				{
					System.out.println(al.get(al.size()-1) + " has been successfully removed.");
					al.remove((al.size()-1));
				}
				else
					{
					al.add(civ);
					System.out.println(civ + " has been successfully added...\nAnyone else?");
					}
				}
			}
		
		System.out.println("1 - Randomly choose one unique civ, \n2 - Randomly choose one non-unique civ, \n3 - Randomly choose three unique civ, \n4 - Randomly choose three non-unique civ.");
		int random = reader.nextInt();
		if(random == 1 || random == 2 || random == 3 || random == 4)
		{
			int loop = 1;
			if(random == 3 || random == 4)
				loop = 3;
			while(amount > 0)
			{
				for(int xx = 0; xx < loop; xx++)
				{
					String theCivYouShallPlay = al.get((int) (Math.random() * (al.size()-1)));
					System.out.println(theCivYouShallPlay);
					if(random != 2 || random != 4)
					{
						al.remove(theCivYouShallPlay);
					}
				}
			System.out.println("---");
			amount--;
			}
		}

	}

}
