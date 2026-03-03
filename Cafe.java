class Cafe{
	
	public static void main(String[] cafe)
	{
	  //DataType refName = ref;
		String cafeName = "Cringe Cafe";
		//String teaNames[]={"Green Tea","Mint","Tulsi","Mango Green Tea","Lemon Ginger Mint","Organic"};
	
		/*String coffeNames[]={"Cold Coffee","Cold Coffe With Crush","Orio Shake","Kit Kat Shake"};
		String snacks[]={"Samosa","Plain Maggi","Cheese Maggi","Burger Plain","Sandwich","French Fries","Patato Roll"};
		System.out.println("The Cafe Name is" +cafeName);
		System.out.println("The menue here is");
		System.out.println("List of Tea Items are");
		System.out.println("\n");
		//System.out.println(teaNames[0]+"\n"+teaNames[1]+"\n"+teaNames[2]+"\n"+teaNames[3]+"\n"+teaNames[4]+"\n"+teaNames[5]);
		for(String teaname :teaNames){
			System.out.println(teaname);
		}
		System.out.println("\n");
		System.out.println("List of Coffee Items are");
		for(String coffeName:coffeNames){
			System.out.println(coffeName);
		}
		for(String snack:snacks){
			System.out.println(snack);
		}
		//System.out.println(coffeNames[0]+"\n"+coffeNames[1]+"\n"+coffeNames[2]+"\n"+coffeNames[3]);
		System.out.println("\n");
		System.out.println("List of Snaks Items are");
		//System.out.println(snacks[0]+"\n"+snacks[1]+"\n"+snacks[2]+"\n"+snacks[3]+"\n"+snacks[4]+"\n"+snacks[5]+"\n"+snacks[6]+"\n");*/
		
		String greenTea = "Green Tea";
		String mint="Mint";
		String tulsi="Tulsi";
		String mangoTea ="Mango Green Tea";
		String lemonTea ="Lemon Ginger Mint";
		String organic ="Organic";
		String teaNames[]={greenTea,mint,tulsi,mangoTea,lemonTea,organic};
		for(String teaname:teaNames){
			System.out.println(teaname);
		}
		
		String coldCoffee="Cold Coffee";
		String  cold="Cold Coffe With Crush";
		String orioShake ="Orio Shake";
		String kitkat = "Kit Kat Shake";
		String coffeNames[]={coldCoffee,cold,orioShake,kitkat};
		for(String coffeName:coffeNames){
			System.out.println(coffeName);
		}
		String Samosa = "Samosa";
		String PlainMaggi ="Plain Maggi";
		String BurgerPlain ="Burger Plain";
		String Sandwich ="Sandwich"; 
		String frenchFries ="French Fries";
		String patatoRoll ="Patato Roll";
		String snacks[]={Samosa,PlainMaggi,BurgerPlain,Sandwich,frenchFries,patatoRoll};
		for(String snack:snacks){
			System.out.println(snack);
		}
	}
}