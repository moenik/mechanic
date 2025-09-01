package mechanic;

import java.awt.AWTException;

import mechanic.actions.TypeAction;
import mechanic.actions.interfaces.IAction;

public class Mechanic {
	public static void main(String[] args) throws AWTException, InterruptedException {
		IAction a = new TypeAction("typooo..",	"The irish\n");
		IAction b = new TypeAction("typooo2..",	"The polish\n");
		IAction c = new TypeAction("typooo2..",	"The british\n");
		
		
		a.addNextActions(b);
		b.addNextActions(c);
		c.addNextActions(a);
		Thread.sleep(3001);
		a.startAction();
	}
}

