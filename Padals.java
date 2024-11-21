import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Padals extends Rectangle {

  int id;
  int yVelocity;
  int speed = 10;
  
  //The constructor of the class paddle takes in the values for the dimensions of the paddle that will be the compoment that the player is controlling.

  Padals(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
    super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
    this.id = id;

  }
  
  // The paddle class will use a keybinder to provide functionalty and control to the player. A case is preferred as it makes the code easy to understand and implement.

  public void keyPressed(KeyEvent e) {
	  //What happens when the player presses the control keys

    switch (id) {
    case 1:
      if (e.getKeyCode() == KeyEvent.VK_W) {
        setYDirection(-speed);
        move();
      }
      if (e.getKeyCode() == KeyEvent.VK_S) {
        setYDirection(speed);
        move();
      }
      break;

    case 2:
      if (e.getKeyCode() == KeyEvent.VK_UP) {
        setYDirection(-speed);
        move();
      }
      if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        setYDirection(speed);
        move();
      }
      break;

    }

  }

  public void keyReleased(KeyEvent e) {
	  //What happens when the player releases the key

    switch (id) {
    case 1:
      if (e.getKeyCode() == KeyEvent.VK_W) {
        setYDirection(0);
        move();
      }
      if (e.getKeyCode() == KeyEvent.VK_S) {
        setYDirection(0);
        move();
      }
      break;

    case 2:
      if (e.getKeyCode() == KeyEvent.VK_UP) {
        setYDirection(0);
        move();
      }
      if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        setYDirection(0);
        move();
      }
      break;

    }

  }

  public void setYDirection(int yDirection) {
    yVelocity = yDirection;

  }

  public void move() {
    y = y + yVelocity;

  }

  public void draw(Graphics g) {

    if (id == 1) {
      g.setColor(Color.blue);
    } else {
      g.setColor(Color.red);

    }

    g.fillRect(x, y, width, height);
  }

}