import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Ball extends Rectangle {
// During the game the direction of the ball is going to be uncertain so we need to generate random values for the x and y values of its direction. We will also set the inital speed of 2 and will increase as the game progresses.
  Random random;
  int xVelocity;
  int yVelocity;
  int initalSpeed = 2;
  
  //The class of the ball will have the setters and getters for the x and y direction which will be manipulated by the application for the running of the game, which the random numbers will be used.

  Ball(int x, int y, int width, int height) {
    super(x, y, width, height);
    random = new Random();
    int randomXDirection = random.nextInt(2);
    //We want the ball to be moving, so if the direction is 0, the program will deduct 1 from it.
    if (randomXDirection == 0) {
      randomXDirection--;
    }
    setXDirection(randomXDirection * initalSpeed);

    int randomYDirection = random.nextInt(2);
    //We want the ball to be moving, so if the application finds that the random direction is 0, it will deduct 1 from it.
    if (randomYDirection == 0) {
      randomYDirection--;
    }

    setYDirection(randomYDirection * initalSpeed);

  }

  public void setXDirection(int randomxDirection) {
    xVelocity = randomxDirection;

  }

  public void setYDirection(int randomYDirection) {
    yVelocity = randomYDirection;

  }

  public void move() {
    x += xVelocity;
    y += yVelocity;

  }

  public void draw(Graphics g) {
	  //This part of the code generates the ball visualy, I have chosen the ball to be black. 
    g.setColor(Color.black);
    g.fillOval(x, y, height, width);

  }

}
