package Ants;

import kareltherobot.Robot;
import kareltherobot.Directions;


public class CoolBot extends Robot {

	public CoolBot(int arg0, int arg1, Direction arg2, int arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}
	
public void turnRight()
{
	this.turnLeft();
	this.turnLeft();
	this.turnLeft();
}
public void turnAround()
{
	this.turnLeft();
	this.turnLeft();
}
public void turnLeftandMoveandturnRight()
{
	this.turnLeft();
	this.move();
	this.turnRight();
}
}