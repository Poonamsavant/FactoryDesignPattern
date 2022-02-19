package Factory;

import Factory.Food;
import Factory.FoodFactorySystem;

public class factorym
{
	public static void main(String[] args)
	{
		FoodFactorySystem fm = new FoodFactorySystem();
	Food obj = fm.getFood("Pizza");
		obj.spec();

	}


}
