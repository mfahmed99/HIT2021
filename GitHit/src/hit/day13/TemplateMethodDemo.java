package hit.day13;

public class TemplateMethodDemo {

}

abstract class Sangeetha {
	public final void uniform() {
		System.out.println("Uniform defined by Sangeetha...");
	}
	public final void serve() {
		System.out.println("Sangeetha defined how to serve...");
	}
	public abstract void makeIdli();
	public final void createIdliPlate() {
		System.out.println("Sangeetha defined how to define idli plate");
	}
	public final void charge() {
		System.out.println("Sangeetha defines how much to charge...");
	}
	public final void process() {// TEmplate method
		uniform();
		makeIdli();
		createIdliPlate();
		serve();
		charge();
		}
}

class FurqanSangeethaRestro extends Sangeetha {
	@Override
	public void makeIdli() {
		System.out.println("My grandma makes idli at hotel...");
	}
}
