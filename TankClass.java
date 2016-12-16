public class TankClass {
		private String TankName;
		public double TankHealth;
		public double Damage;
		public boolean Alive;
		
		public TankClass(String name, double Damage, double health)
		{
			TankName = name;
			TankHealth = health;
			this.Damage = Damage;
			Alive = true;
		}
		
		public TankClass()
		{
			TankName = "tanko";
			TankHealth = 50;
			this.Damage = 30;
			Alive = true;
		}
		
		public String getName()
		{
			return TankName;
		}
		
		public void damageHealth(double damage)
		{
			this.TankHealth = TankHealth - damage;
		}
		
		public void checkifDead()
		{
			if (TankHealth == 0)
			{
				System.out.println(TankName + " is DEAD!");
			}
			else
			{
				System.out.println("===========");
				System.out.println("Name: " + TankName);
				System.out.println("Health now:" + TankHealth);
				System.out.println("Damage: " + Damage);
				System.out.println("===========");
			}
			
				
		}
		
}
		