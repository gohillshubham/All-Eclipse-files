class HondaBikes{
	void oldFeatures() {
		System.out.print("old Features");
	}
	void Balance() {
		System.out.println("Best Balanace in the models in market");
	}
	void Colours() {
		System.out.println("In four clours");
	}
	void Type() {
		System.out.println("Basic");
	}
	void priceRange() {
		System.out.println("1 to 2.5 lakh");
	}
}
class NewLaunch extends HondaBikes {
	void newFeatures() {
	System.out.print("\nnew Features - All the old features benefits");
	System.out.print("\n2 seater with extra space \nBetter milege \n260 speed range \nSportsBikes\n");
	}
	void speed() {
		System.out.println("increased 210 to 260");
	}
	void Type() {
		System.out.println("Sports");
	}
	void priceRange() {
		System.out.println("3 to 10 lakh");
	}
}
public class HondaNewLaunch {
	public static void main(String[] args) {
		NewLaunch nl = new NewLaunch();
		nl.oldFeatures();nl.newFeatures();nl.Balance(); nl.speed();nl.Colours();nl.Type();nl.priceRange();
		
	}

}
