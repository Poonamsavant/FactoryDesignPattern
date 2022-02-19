package Factory;

/*import Factory.Cake;
import Factory.Pizza;
import Factory.Food;
import Factory.Drink;*/

public class FoodFactorySystem 
{
	public Food getFood(String order)
	{	
		//if(order == Null)
			//return Null;
		 if(order.equals("Cake"))
			return new Cake();
		else if(order.equals("Pizza"))
			return new Pizza();
		else 
			return new Drink();
		//	return Null;
			
	}
}
