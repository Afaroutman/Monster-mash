package Monster.view;

import javax.swing.JOptionPane;

import Monster.controller.MonsterAppController;

public class MonsterView 
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null,"I made a monster");
		JOptionPane.showMessageDialog(null,"It's name is" + baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null, "It has " + baseController.getMyMonster().getNumberOfLegs() + " legs");
		JOptionPane.showMessageDialog(null, "It has " + baseController.getMyMonster().gethairCount() + " pieces of hair");
		JOptionPane.showMessageDialog(null, "It has " + baseController.getMyMonster().geteyeCount() + " eyes");
		JOptionPane.showMessageDialog(null, "It has " + baseController.getMyMonster().getnoseCount() + " nose");
		JOptionPane.showMessageDialog(null, "It has " + baseController.getMyMonster().getarmCount() + " arms");
	
	
	
	
	}
	

	
}
