/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	/* Precondition:Karel is standing at the northwest corner of the house, facing east.
	 * Postcondition:Karel is standing at the same place of his house, 
	 * but he had picked the newspaper outside his house and turned back.
	 */
	public void run(){
		
	moveToTheDoor();
	pickBeeper();
	moveBackToHouse();
		
	}
	
	private void moveToTheDoor(){
    /* Karel will take a few steps to reach the door*/
		
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
	}
	
	private void moveBackToHouse(){
	/* karel will come back to his original, 
	 * with the newspaper in his hand
	 */
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
		turnAround();
		
	}
	                               
}	                               
	     


public void run(){
	  moveInRow();
	  while(leftIsClear()){
		  repositionForRowToWest();
		  moveInRow();
		  if(rightIsClear()){
			  repositionForRowToEast();
		     moveInRow();
		  }
		  else{
			  turnAround();
		  }
	  }
	  
	  
}

private void moveInRow(){
	  
	  
	  
	  
	  
	  
}


private void moveInRow(){
	  
	  
	  
}


private void moveToKareLeftRow(){
	  turnLeft();
	  move();
	  turnLeft();
	  
	  
	  
	  
}
	                               
	                               
	                        
