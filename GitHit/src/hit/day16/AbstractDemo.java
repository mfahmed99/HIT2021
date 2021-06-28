package hit.day16;
/*
 * What is the need for heirarchial classessification
 * 1. PArt whole heirarchy
 * 2. Composition - Mix and match
 * 3. Polymorphic query
 * 4. Object re-usability
 * 5. Removal of if-else-if
 * 6. Reusability of code
 * The above uses are the reasons we go for inheritance
 * 
 * All parent classes should be abstract
 * As we cannot create obj of parent class
 * So to ensure that aan obj is not created of parent class, we make them abstrat
 * 
 */

abstract class Item {// parent class abstract 
	abstract public int cost();
}

abstract class Cream extends Item {
	
}

abstract class Ingredients extends Item {
	
}

class Vanila extends Cream {//static binding - what cannot be changed at runtime
	Item item;
	@Override
	public int cost() {
		if (item==null) 
			return 10;
		else {
			return 10 + item.cost();
		}
	}
	public Vanila() {// ONly take Vanilla
		
	}
	public Vanila(Item item) {// Take vanila with something
		this.item=item;
	}
}

class ButterScotch extends Cream {
	Item item;
	public ButterScotch() {
		
	}
	public ButterScotch (Item item) {
		this.item=item;
	}
	@Override
	public int cost() {
		if (item==null) 
			return 15;
		else {
			return 15 + item.cost();
		}
	}
}
	
	
class Nuts extends Ingredients {
	
	Item item;
	public Nuts() {
		
	}
	public Nuts(Item item) {
		this.item=item;
	}
	@Override
	public int cost() {
		if (item==null) 
			return 5;
		else {
			return 5 + item.cost();
		}
	}
}


class DryFruit extends Ingredients{
	Item item;
	public DryFruit() {
		
	}
	public DryFruit (Item item) {
		this.item=item;
	}
	@Override
	public int cost() {
		if (item==null) 
			return 20;
		else {
			return 20 + item.cost();
		}
	}
}


public class AbstractDemo {
	public static void main(String[] args) {
		Item iceCream=new Vanila(new Nuts(new ButterScotch(new DryFruit(new Vanila()))));
		System.out.println("One Vanila cup+Nuts+ButterScotch scoop"+iceCream.cost());
	}
}
