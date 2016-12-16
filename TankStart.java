import java.util.Scanner;

public class TankStart {

	public static void main(String[] args)
	{
		TankClass tankie = new TankClass("tankie", 10, 40);
		TankClass tanko = new TankClass();
		
		boolean AliveBoth = true;
		
		while (AliveBoth)
		{
			System.out.println("Alive:" + tankie.getName());
			System.out.println("Alive:" + tanko.getName());
			System.out.println("Who attacks?:");
			System.out.println("===========");
			Scanner question = new Scanner(System.in);
			String answer = question.nextLine();
		
			if (answer.toLowerCase() == "tanko")
			{
				tankie.damageHealth(tanko.Damage);
			}
			else
			{
				tanko.damageHealth(tankie.Damage);
			}
			tankie.checkifDead();
			tanko.checkifDead();
			
			if ((tanko.TankHealth == 0) || (tankie.TankHealth == 0))
				break;
		}
		
		
		
			
		}
}
	
	
	
