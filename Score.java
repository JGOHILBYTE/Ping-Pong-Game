import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Score extends Rectangle {

	//This class works on the scoring system and how the score can be viewED.
  static int GAME_WIDTH;
  static int GAME_HEIGHT;
  int player1;
  int player2;
  
  //The score needs to be within the game's panel

  Score(int GAME_WIDTH, int GAME_HEIGHT) {
    Score.GAME_WIDTH = GAME_WIDTH;
    Score.GAME_HEIGHT = GAME_HEIGHT;

  }
  
  //As a player scores, the scores need to be updated, so the below codes works on updating the visualiation of the numbers on the screen.

  public void draw(Graphics g) {
    g.setColor(Color.red);
    g.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 60));

    g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);

    g.drawString(String.valueOf(player1 / 10) + String.valueOf(player1 % 10), (GAME_WIDTH / 2) - 85, 50);
    g.drawString(String.valueOf(player2 / 10) + String.valueOf(player2 % 10), (GAME_WIDTH / 2) + 20, 50);

  }

}