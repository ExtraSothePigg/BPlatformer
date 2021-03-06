import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;
@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	if(currentState == MENU_STATE){
		updateMenuState();
	}else if(currentState == GAME_STATE){
		updateGameState();
	}else if(currentState == END_STATE){
		updateEndState();
	}
}
void updateMenuState(){
	
}void updateGameState(){
	
}void updateEndState(){
	
}
void drawMenuState(Graphics g){
	g.setColor(Color.WHITE);
	g.fillRect(0, 0, 1600, 900);
}void drawGameState(Graphics g){
	g.setColor(Color.GRAY);
	g.fillRect(0, 0, 1600, 900);
}void drawEndState(Graphics g){
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, 1600, 900);
}
public GamePanel(){
	timer = new Timer(1000/60,this);
}
void startGame(){
	timer.start();
}
public void paintComponent(Graphics g){
	if(currentState == MENU_STATE){
		drawMenuState(g);
	}else if(currentState == GAME_STATE){
		drawGameState(g);
	}else if(currentState == END_STATE){
		drawEndState(g);
	}
}


@Override
public void keyTyped(KeyEvent e) {
	System.out.println("type");
}
@Override
public void keyPressed(KeyEvent e) {
	if(e.getKeyCode()==KeyEvent.VK_ENTER){
		currentState += 1;
	if(currentState > END_STATE){
		currentState = MENU_STATE;
	}
	}
	
}
@Override
public void keyReleased(KeyEvent e) {
	System.out.println("release");
	
}
}
