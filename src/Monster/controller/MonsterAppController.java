package Monster.controller;

import Monster.model.MarshmallowMonster;
import Monster.view.MonsterView;

public class MonsterAppController {
	
	 private MonsterView myAppView;
	 private MarshmallowMonster myMonster;
	 private MarshmallowMonster otherMonster;
	 
	 public MonsterAppController()
	 {
		 myAppView = new MonsterView(this);
		 myMonster = new MarshmallowMonster("Steve", 2.0, 3.0, 5, 1, 3, false);
		 otherMonster = new MarshmallowMonster("pineapple", 2.5, 4.0, 5, 4, 7, true );
		 
		 //create your monster here.
	 }
	 public MarshmallowMonster getMyMonster()
	 {
		 return myMonster;
	 }
	 public MarshmallowMonster getotherMonster()
	 {
		 return otherMonster;
	 }
	 
	public void start()
	{
		myAppView.displayInformation();
	}

}
