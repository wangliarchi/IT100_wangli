import stanford.karel.*;
public class doubleBeeper extends SuperKarel{
	public void run(){
		move();
		doublingBeepers();
	    moveBackward();
	}

	/*pre:standing with five beepers, facing east.
	 *post:standing with the doubled beepers,facing east.
	 */
private void doublingBeepers(){
	while(beepersPresent()){
	moveBeeperToNextDoor();
	moveBackBeepers();
	
	}
}

/*pre:karel standing at the same corner with the five beepers
 * facing east.
 * post:karel standing at the next door with the doubled beepers,
 * facing east.
 * 
 */
private void moveBeeperToNextDoor(){
	
	pickBeeper();
	turnLeft();
	move();
	putBeeper();
	turnRight();
	
}
/*pre:standing with the doubled beepers at the next door,
 * post: move back the doubled beepers ,facing east.
 * 
 */
private void moveBackBeepers(){
	while(beepersPresent()){
		pickBeeper();
		turnRight();
		move();
		putBeeper();
		turnLeft();
	}
	
}
/*pre:facing east,standing at the corner where five beepers stand.
 * post:facing east, at the original place. 
 */
private void moveBackward(){
	turnAround();
	move();
	turnAround();
	
	
	
}
 
}