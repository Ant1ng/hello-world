package Ants;

import java.util.Scanner;
import javax.swing.JOptionPane;
import kareltherobot.Directions;
import kareltherobot.Robot;
import kareltherobot.World;

public class FirstProjectInitials implements Directions {

	private static void turnRight(Robot aRobot) 
	{
		aRobot.turnLeft();
		aRobot.turnLeft();
		aRobot.turnLeft();
	}	
		public static void main(String[] args) 
		{
			String answers = JOptionPane.showInputDialog(null, "What is the length of the diamond side?");
			int answer = Integer.parseInt(answers);
//			System.out.println("What is the length of the diamond side?");
//			@SuppressWarnings("resource")
//			Scanner keyboard = new Scanner(System.in);
//			int answer = keyboard.nextInt();
			World.setVisible(true);
			World.setDelay(-20);
			World.setSize(2*answer, 2*answer);
	
			CoolBot robbie = new CoolBot(1, answer, North, (answer-1)*4);
			robbie.putBeeper();
			for(int i = 0; i<4; i++)
			{
				for(int j = 1; j<answer; j++)
				{
					robbie.move();
					robbie.turnLeft();
					robbie.move();
					robbie.putBeeper();
					robbie.turnRight();
				}
					robbie.turnRight();
			}}}
		
/*		public static void run2(String[] args) 
		{
			System.out.println("What is the length of the diamond side?");
			@SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);
			int answer = keyboard.nextInt();
			World.setVisible(true);
			World.setDelay(-200);
			World.setSize(2*answer, 2*answer);
	
			Robot robbie = new Robot(1, answer, North, (answer-1)*4);
			robbie.putBeeper();
			
			for (int i=0; i < 4; i++) {
				for (int j = 0; j < answer - 1; j++) {
					robbie.move();
					robbie.turnLeft();
					robbie.move();
					robbie.putBeeper();
					robbie.turnRight();
				}
				robbie.turnRight();
			}
		}
	}
	
	class Circle {	
		public void main(String args[]){

			World.setVisible(true);
			Scanner keyboard = new Scanner(System.in);
			int radius = keyboard.nextInt();
			Robot Newbie = new Robot (1, radius+1, North, 1000);
			
			for(int i = 0; i<1000; i++)
			{
				double d = i*(6.28/1000);
				if((Math.cos(d)*radius)/radius>1)
				{
					 
					
				}
			
			}
		}
	}

	public static void main(String[] args) {
		Diamond.run2(args);
	}
}
		*/