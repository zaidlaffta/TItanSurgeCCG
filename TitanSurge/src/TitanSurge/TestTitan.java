package TitanSurge;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTitan {

	
	//@Test
	public void testCardMovement(){
		
		//WHILE THE SHUFFLE METHOD WAS TURNED OFF
		//NOTE: This was developed when Spider's poisen 
		//ability wasn't developed so running it now will cause failures
		Player one = new Player();
		
		assertEquals(one.getDeck(0).getName(), "Lion" );
		
		assertEquals(one.getHandcard(0).getName(), "No card"); 
		one.drawTohand(one.drawTopdeck());
		assertEquals(one.getHandcard(0).getName(), "Lion");
		one.placeCard(one.getHandcard(0));
		assertEquals(one.getFieldcard(0).getName(), "Lion");
		one.getFieldcard(0).damaged(180); 
		one.deadCard(one.getFieldcard(0));
		assertNotEquals(one.getCementaryCard(0).getName(), "No card");
		assertEquals(one.getFieldcard(0).getName(),"No card");
		
		one.drawTohand(one.drawTopdeck());
		one.drawTohand(one.drawTopdeck());
		one.drawTohand(one.drawTopdeck());
		one.drawTohand(one.drawTopdeck());
		one.drawTohand(one.drawTopdeck());
		assertNotEquals(one.getHandcard(0).getName(), "No card");
		assertNotEquals(one.getHandcard(1).getName(), "No card");
		assertNotEquals(one.getHandcard(2).getName(), "No card");
		assertNotEquals(one.getHandcard(3).getName(), "No card");
		assertNotEquals(one.getHandcard(4).getName(), "No card");
		one.placeCard(one.getHandcard(0));
		one.placeCard(one.getHandcard(0));
		one.placeCard(one.getHandcard(0));
		one.placeCard(one.getHandcard(0));
		one.placeCard(one.getHandcard(0));
		assertEquals(one.getHandcard(0).getName(), "No card"); 
		assertEquals(one.getHandcard(1).getName(), "No card"); 
		assertEquals(one.getHandcard(2).getName(), "No card"); 
		assertEquals(one.getHandcard(3).getName(), "No card"); 
		assertEquals(one.getHandcard(4).getName(), "No card"); 
		
		assertNotEquals(one.getDeck(0).getName(), "No card");
		assertNotEquals(one.getDeck(1).getName(), "No card");
		assertNotEquals(one.getDeck(2).getName(), "No card");
		assertNotEquals(one.getDeck(3).getName(), "No card");
		assertEquals(one.getDeck(4).getName(), "No card"); 
		assertEquals(one.getDeck(5).getName(), "No card"); 
		assertEquals(one.getDeck(6).getName(), "No card"); 
		assertEquals(one.getDeck(7).getName(), "No card"); 
		assertEquals(one.getDeck(8).getName(), "No card"); 
		assertEquals(one.getDeck(9).getName(), "No card"); 
		
		assertNotEquals(one.getFieldcard(0).getName(), "No card");
		assertNotEquals(one.getFieldcard(1).getName(), "No card");
		assertNotEquals(one.getFieldcard(2).getName(), "No card");
		assertNotEquals(one.getFieldcard(3).getName(), "No card");
		assertNotEquals(one.getFieldcard(4).getName(), "No card");
		one.getFieldcard(0).damaged(150);
		one.getFieldcard(1).damaged(150);
		one.getFieldcard(2).damaged(150);
		one.getFieldcard(3).damaged(150);
		one.getFieldcard(4).damaged(150);
		
		
		
		one.deadCard(one.getFieldcard(0)); 
		one.deadCard(one.getFieldcard(1)); 
		one.deadCard(one.getFieldcard(2)); 
		one.deadCard(one.getFieldcard(3)); 
		one.deadCard(one.getFieldcard(4)); 
		one.adjustField();

		one.getFieldcard(0).damaged(180);
		one.getFieldcard(1).damaged(180);
		one.getFieldcard(2).damaged(180);
		one.getFieldcard(3).damaged(180);
		one.getFieldcard(4).damaged(180);  
		one.deadCard(one.getFieldcard(0)); 
		one.deadCard(one.getFieldcard(1)); 
		one.deadCard(one.getFieldcard(2)); 
		one.deadCard(one.getFieldcard(3)); 
		one.adjustField();
		
		assertEquals(one.getFieldcard(0).getName(), "No card");
		assertEquals(one.getFieldcard(1).getName(), "No card");
		assertEquals(one.getFieldcard(2).getName(), "No card");
		assertEquals(one.getFieldcard(3).getName(), "No card");
		assertEquals(one.getFieldcard(4).getName(), "No card");
		
		assertNotEquals(one.getCementaryCard(0).getName(), "No card");
		assertNotEquals(one.getCementaryCard(1).getName(), "No card");
		assertNotEquals(one.getCementaryCard(2).getName(), "No card");
		assertNotEquals(one.getCementaryCard(3).getName(), "No card");
		assertNotEquals(one.getCementaryCard(4).getName(), "No card");
		assertNotEquals(one.getCementaryCard(5).getName(), "No card");
		assertEquals(one.getCementaryCard(6).getName(), "No card");
		
		one.drawTohand(one.drawTopdeck());
		one.drawTohand(one.drawTopdeck());
		one.drawTohand(one.drawTopdeck());
		one.drawTohand(one.drawTopdeck());
		assertEquals("No card", one.getDeck(0).getName());
		
		assertNotEquals(one.getHandcard(0).getName(), "No card");
		assertNotEquals(one.getHandcard(1).getName(), "No card");
		assertNotEquals(one.getHandcard(2).getName(), "No card");
		assertNotEquals(one.getHandcard(3).getName(), "No card");
		one.placeCard(one.getHandcard(0));
		one.placeCard(one.getHandcard(0));
		one.placeCard(one.getHandcard(0));
		one.placeCard(one.getHandcard(0));
		
		one.getFieldcard(0).damaged(250);
		one.getFieldcard(1).damaged(250);
		one.getFieldcard(2).damaged(250);
		one.getFieldcard(3).damaged(250);
		one.deadCard(one.getFieldcard(0)); 
		one.deadCard(one.getFieldcard(1)); 
		one.deadCard(one.getFieldcard(2)); 
		one.deadCard(one.getFieldcard(3)); 
		one.adjustField();
		
		assertEquals(one.getFieldcard(0).getName(), "No card");
		assertEquals(one.getFieldcard(1).getName(), "No card");
		assertEquals(one.getFieldcard(2).getName(), "No card");
		assertEquals(one.getFieldcard(3).getName(), "No card");
		assertEquals(one.getFieldcard(4).getName(), "No card");
		assertEquals(one.getHandcard(0).getName(),"No card");
		assertEquals(one.getHandcard(1).getName(),"No card");
		assertEquals(one.getHandcard(2).getName(),"No card");
		assertEquals(one.getHandcard(3).getName(),"No card");
		assertEquals(one.getHandcard(4).getName(),"No card");
		assertNotEquals(one.getCementaryCard(0).getName(), "No card");
		assertNotEquals(one.getCementaryCard(1).getName(), "No card");
		assertNotEquals(one.getCementaryCard(2).getName(), "No card");
		assertNotEquals(one.getCementaryCard(3).getName(), "No card");
		assertNotEquals(one.getCementaryCard(4).getName(), "No card");
		assertNotEquals(one.getCementaryCard(5).getName(), "No card");
		assertNotEquals(one.getCementaryCard(6).getName(), "No card");
		assertNotEquals(one.getCementaryCard(7).getName(), "No card");
		assertNotEquals(one.getCementaryCard(8).getName(), "No card");
		assertNotEquals(one.getCementaryCard(9).getName(), "No card");
		
		
		}
	
	//@Test
	public void testDriver(){
		Player one = new Player();
		Player two = new Player();
		one.setEnemy(two); two.setEnemy(one); 
		one.setName("Player one"); two.setName("Player Two");
		
		one.rotation();
		assertEquals("Lion", one.getHandcard(0).getName());
		two.rotation();
		assertEquals("Lion", two.getHandcard(0).getName());
		
		one.rotation();
		assertEquals("Lion", one.getFieldcard(0).getName());
		assertEquals(1, one.getFieldlength());
		assertEquals("Spider", one.getHandcard(0).getName());
		
		two.rotation();
		assertEquals("Lion", two.getFieldcard(0).getName());
		assertEquals("Spider", two.getHandcard(0).getName());
		assertEquals(20, one.getFieldcard(0).getHealth());
		assertEquals(1, two.enemy.getHandcard(0).getTimer());
		assertEquals("Spider", one.getHandcard(0).getName());
		
		one.rotation();
		assertEquals(2, one.getFieldlength());
		assertEquals("Spider", one.getFieldcard(1).getName());
		assertEquals("Swamp Wolf", one.getHandcard(0).getName());
		assertEquals(20, two.getFieldcard(0).getHealth());
	}
	
	//was used to test the BattleWatcher class for the Dripfairy's
	//heal ability
	@Test
	public void testObserver(){
		Player one = new Player();
		Player two = new Player();
		one.setName("player one"); two.setName("player two");
		one.setEnemy(two); two.setEnemy(one); 
		
		one.addFieldcard(one.cardlib.lion());
		one.addFieldcard(one.cardlib.vampirebat());
		one.addFieldcard(one.cardlib.flamewyvern());
		one.addFieldcard(one.cardlib.dripfairy());
		
		one.watcher.recordConditions();
		
		one.getFieldcard(0).damaged(180);
		one.getFieldcard(1).damaged(180);
		one.getFieldcard(2).damaged(180);
		one.deadCard(one.getFieldcard(0));
		one.deadCard(one.getFieldcard(1));
		one.deadCard(one.getFieldcard(2));
		one.adjustField();
		assertEquals("Lion", one.getFieldcard(0).getName());
		assertEquals("Flame Wyvern", one.getFieldcard(1).getName());
	
		one.watcher.hasChanged();
		one.getFieldcard(2).ability();
		assertEquals(120, one.getFieldcard(1).getHealth());
		
		one.addFieldcard(one.cardlib.swampwolf());
		one.addFieldcard(one.cardlib.snowoakfairy());
		one.watcher.recordConditions();
		
		one.getFieldcard(0).damaged(10);
		one.getFieldcard(1).damaged(20);
		one.getFieldcard(2).damaged(30);
		one.getFieldcard(3).damaged(40);
		one.getFieldcard(4).damaged(50);
		one.watcher.hasChanged();
		one.getFieldcard(2).ability();
		
		assertEquals(180, one.getFieldcard(4).getHealth());
	}
	
	//@Test
	//Used to test spiders poisen ability
	//It's a little fishy in either it passes or fails
	//couldn't find the reason behind that
	public void testSpider(){
		Player one = new Player();
		Player two = new Player();
		one.setEnemy(two); two.setEnemy(one); 
		
		one.addFieldcard(one.cardlib.lion());
		one.addFieldcard(one.cardlib.spider());
		two.addFieldcard(two.cardlib.lion());
		two.addFieldcard(two.cardlib.dripfairy());
		
		one.attack();
		assertEquals(60, two.getFieldcard(1).getHealth());
		one.endTurn();
		assertEquals(two.getFieldcard(1).getHealth(), 30);
		
		
	}

}
