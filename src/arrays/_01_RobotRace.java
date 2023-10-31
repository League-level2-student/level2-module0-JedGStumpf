package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		int robX = 25;
		int robY = 500;
		int location = 0;
		for (Robot rob : robots) {
			rob = new Robot();
			robots[location] = rob;
			rob.setX(robX);
			rob.setY(robY);
			rob.miniaturize();
			
			robX += 50;
			rob.setSpeed(25);
			rob.show();
			location++;
			
		}
		

		
		boolean keepMoving = true;
		while (keepMoving){
			int robotsMoved = 0;
			Random rand = new Random();
			for (int i = 0; i < robots.length; i++) {
				
				int moveDist = rand.nextInt(50);
				robots[i].move(moveDist);
				if (robots[i].getY() <= 0) {
					robotsMoved++;
					System.out.println("Robot in pos: " + i + " Wins");
					break;
				}
			}
			if (robotsMoved >= 1){
				keepMoving = false;
			}
			
		}
		

	}


	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
