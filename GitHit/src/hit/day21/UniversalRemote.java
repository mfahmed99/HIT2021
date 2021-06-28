package hit.day21;

public class UniversalRemote {
	public static void main(String[] args) {
		System.out.println("Demonstration of Remote...");
		Tv tv=new Tv();
		SetTopBox setTopBox = new SetTopBox();
		Netflix netflix=new Netflix();
		SoundSystem soundSystem=new SoundSystem();
		
		FatherNewsChannelCommand fncc= new FatherNewsChannelCommand(tv, setTopBox,soundSystem,netflix);
		MotherOldMovieCommand momc= new MotherOldMovieCommand(tv, setTopBox, soundSystem, netflix);
		MotherSerialCommand msc=new MotherSerialCommand(tv, setTopBox, soundSystem, netflix);
		
		Remote universalRemote= new Remote();
		universalRemote.setCommand(fncc, 0);
		universalRemote.setCommand(momc, 1);
		universalRemote.setCommand(msc, 2);
		
		System.out.println("Father wants news...");
		universalRemote.executeCommand(0);
		
	}
	
}


class Tv {
	public void av1() {
		System.out.println("Switch on AV1 mode...");
	}
	public void switchOn() {
		System.out.println("TV switched ON...");
	}
}

class SetTopBox {
	public void newsChannel() {
		System.out.println("News channel starting...");
	}
	public void serialChannel() {
		System.out.println("Serial channel started");
	}
}

class Netflix{
	public void movieOld() {
		System.out.println("Old movie playing...");
		
	}
}

class SoundSystem {
	public void lowVol() {
		System.out.println("Volume decreased...");
	}
	public void highVol() {
		System.out.println("VOlume increased...");
		
	}
}

interface Command {
	public void execute();
}

class FatherNewsChannelCommand implements Command {
	Tv tv; SetTopBox setTopBox; SoundSystem soundSystem; Netflix netflix;
	public FatherNewsChannelCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, Netflix netflix ) {
		this.tv=tv;
		this.setTopBox=setTopBox;
		this.netflix=netflix;
		this.soundSystem=soundSystem;
	}
	
	public void execute() {
		System.out.println("Father TV command execution started...");
		tv.switchOn();
		tv.av1();
		setTopBox.newsChannel();
		soundSystem.lowVol();
		System.out.println("Enjoy your news channel Dad...");
	}
}


class MotherOldMovieCommand implements Command{
	Tv tv; SetTopBox setTopBox; SoundSystem soundSystem; Netflix netflix;
	public MotherOldMovieCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, Netflix netflix ) {
	this.tv=tv;
	this.setTopBox=setTopBox;
	this.netflix=netflix;
	this.soundSystem=soundSystem;
	
	}
	
	@Override
	public void execute() {
		System.out.println("Old movie command execution started...");
		tv.switchOn();
		netflix.movieOld();
		soundSystem.lowVol();
		System.out.println("Enjoy old movie...");
	}
}

class MotherSerialCommand implements Command{
	Tv tv; SetTopBox setTopBox; SoundSystem soundSystem; Netflix netflix;
	public MotherSerialCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, Netflix netflix ) {
	this.tv=tv;
	this.setTopBox=setTopBox;
	this.netflix=netflix;
	this.soundSystem=soundSystem;
	
	}
	
	@Override
	public void execute() {
		System.out.println("Mom serial command execution started...");
		tv.switchOn();
		tv.av1();
		setTopBox.serialChannel();
		soundSystem.lowVol();
		System.out.println("Enjoy favourite serial...");
	}
}

class DummyCommand implements Command {
	public void execute() {
		System.out.println("Dummy command executuion started...");
	}
}

class Remote {
	Command command[]=new Command[5];
	public Remote() {
		for(int i=0;i<5;i++){
			command[i]=new DummyCommand();
		}
	}
	
	public void setCommand(Command command, int slot) {
		this.command[slot]=command;
	}
	
	public void executeCommand(int slot) {
		command[slot].execute();
	}
}