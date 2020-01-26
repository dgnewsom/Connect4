package connect4;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

public class Connect4 extends Canvas implements MouseListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Ellipse2D.Double[][] circles;
	static int[][] spaces;
	static Shape board;
	static JFrame win;
	static Image arrowBlack; 
	static Color curColour;
	static int currentTurn = 0;
	static boolean gameOver = false;
	static Ellipse2D circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8, circle9, circle10, circle11, circle12;
	static double winCounter1X;
	static double winCounter1Y;
	static double winCounter2X;
	static double winCounter2Y;
	
	public Connect4()
	{
		enableEvents(java.awt.AWTEvent.KEY_EVENT_MASK);
		requestFocus();
		addMouseListener(this);
		importArrowImage();
		drawBoard();
		
	}
	public void update(Graphics g) {
		paint(g);
	}

	
	public void paint(Graphics g) {
	    
		curColour = getColour(currentTurn);
		
		Graphics2D g2 = (Graphics2D)g;
		
		//Set background colour
		g2.setBackground(Color.WHITE);
		
		//Draw board
		g2.setColor(Color.BLUE);
		g2.fill(board);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(6));
		g2.drawRect(10, 100, 1115, 750);
		
		//Draw top circles and arrows
		g2.setStroke(new BasicStroke(10));
		g2.drawOval((int) circle1.getX(), (int) circle1.getY(), (int) circle1.getWidth(), (int) circle1.getHeight());
		g2.drawOval((int) circle2.getX(), (int) circle2.getY(), (int) circle2.getWidth(), (int) circle2.getHeight());
		g2.drawOval((int) circle3.getX(), (int) circle3.getY(), (int) circle3.getWidth(), (int) circle3.getHeight());
		g2.drawOval((int) circle4.getX(), (int) circle4.getY(), (int) circle4.getWidth(), (int) circle4.getHeight());
		g2.drawOval((int) circle5.getX(), (int) circle5.getY(), (int) circle5.getWidth(), (int) circle5.getHeight());
		g2.drawOval((int) circle6.getX(), (int) circle6.getY(), (int) circle6.getWidth(), (int) circle6.getHeight());
		g2.drawOval((int) circle7.getX(), (int) circle7.getY(), (int) circle7.getWidth(), (int) circle7.getHeight());
		g2.drawOval((int) circle8.getX(), (int) circle8.getY(), (int) circle8.getWidth(), (int) circle8.getHeight());
		g2.drawOval((int) circle9.getX(), (int) circle9.getY(), (int) circle9.getWidth(), (int) circle9.getHeight());
		g2.drawOval((int) circle10.getX(), (int) circle10.getY(), (int) circle10.getWidth(), (int) circle10.getHeight());
		g2.drawOval((int) circle11.getX(), (int) circle11.getY(), (int) circle11.getWidth(), (int) circle11.getHeight());
		
		g2.setColor(curColour);
				
		g2.fill(circle1);
		g2.fill(circle2);
		g2.fill(circle3);
		g2.fill(circle4);
		g2.fill(circle5);
		g2.fill(circle6);
		g2.fill(circle7);
		g2.fill(circle8);
		g2.fill(circle9);
		g2.fill(circle10);
		g2.fill(circle11);

				
		g2.setColor(Color.BLACK);
		g2.drawImage(arrowBlack, 30, 10, null);
		g2.drawImage(arrowBlack, 130, 10, null);
		g2.drawImage(arrowBlack, 230, 10, null);
		g2.drawImage(arrowBlack, 330, 10, null);
		g2.drawImage(arrowBlack, 430, 10, null);
		g2.drawImage(arrowBlack, 530, 10, null);
		g2.drawImage(arrowBlack, 630, 10, null);
		g2.drawImage(arrowBlack, 730, 10, null);
		g2.drawImage(arrowBlack, 830, 10, null);
		g2.drawImage(arrowBlack, 930, 10, null);
		g2.drawImage(arrowBlack, 1030, 10, null);
		
		//draw counters in board
		for ( int r=0; r<spaces.length; r++ )
			for ( int c=0; c<spaces[0].length; c++ )
			{
				g2.setColor(Color.BLACK);
				g2.setStroke(new BasicStroke(6));
				g2.drawOval((int) circles[r][c].getX(), (int) circles[r][c].getY(), 80, 80);
				g2.setColor(getColour(spaces[r][c]));
				g2.fill(circles[r][c]);
			}
		
		
		if(hasWinner()) {
			
			g2.setColor(Color.WHITE);
			g2.fillRect(0, 0, getWidth(), 100);
			g.setColor(Color.BLACK);
			g2.drawRect(10, 2, 1115, 100);
			g.setFont(new Font("Ariel", Font.BOLD,70));
			g2.drawString("Wins", 550, 75);
			g2.drawOval((int) circle12.getX(), (int) circle12.getY(), (int) circle12.getWidth(), (int) circle12.getHeight());
			switchTurn();
			gameOver = true;
			curColour = getColour(currentTurn);
			g2.setColor(curColour);
			g2.fill(circle12);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(15));
			g2.drawLine((int) winCounter1X, (int) winCounter1Y, (int) winCounter2X, (int) winCounter2Y);
			
		
		}
		
	}
	
	static public void drawBoard() {
		
		board = new Rectangle(10, 100, 1115, 750);
				
		circle1 = new Ellipse2D.Double(30,10,80,80);
		circle2 = new Ellipse2D.Double(circle1.getX() + 100,10,80,80);
		circle3 = new Ellipse2D.Double(circle2.getX() + 100,10,80,80);
		circle4 = new Ellipse2D.Double(circle3.getX() + 100,10,80,80);
		circle5 = new Ellipse2D.Double(circle4.getX() + 100,10,80,80);
		circle6 = new Ellipse2D.Double(circle5.getX() + 100,10,80,80);
		circle7 = new Ellipse2D.Double(circle6.getX() + 100,10,80,80);
		circle8 = new Ellipse2D.Double(circle7.getX() + 100,10,80,80);
		circle9 = new Ellipse2D.Double(circle8.getX() + 100,10,80,80);
		circle10 = new Ellipse2D.Double(circle9.getX() + 100,10,80,80);
		circle11 = new Ellipse2D.Double(circle10.getX() + 100,10,80,80);
		circle12 = new Ellipse2D.Double(400,13,80,80);
		
		circles = new Ellipse2D.Double[8][11];
		spaces = new int[8][11];
		
		for ( int r=0; r<circles.length; r++ )
			for ( int c=0; c<circles[0].length; c++ )
			{
				circles[r][c] = new Ellipse2D.Double(30+c*100,120+r*90,80,80);
			}
		
		for ( int r=0; r<spaces.length; r++ )
			for ( int c=0; c<spaces[0].length; c++ )
			{
				spaces[r][c] = 9;
			}
		
	}
	
	static void importArrowImage() {
		
		int width = 80;    //width of the image
	    int height = 80;   //height of the image
	   
	    File f = null;

	    //read image
	    try{
	      f = new File("arrowBlack.png"); //image file path
	      arrowBlack = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	      arrowBlack = ImageIO.read(f);
	      
	    }catch(IOException e){
	    }
	}
	
	public void placeCounter(int col) {
		int row = 7;
		if(gameOver != true) {
		
		if(spaces[0][col] != 9) {
		}
		else {
			while (row >= 0) {
				if (spaces[row][col] == 9) {
					spaces[row][col] = currentTurn;
					break;
				}
				else {
					row --;
				}
			}
			switchTurn();
		}
		
	}
	}
	  
	static Color getColour(int state) {
		Color result = null;
		
		switch(state) {
		case 9:
			result = Color.WHITE;
			break;
		case 0:
			result = Color.RED;
			break;
		case 1:
			result = Color.YELLOW;
			break;
		}
		return result;
	}
		
	static void switchTurn() {
		if (gameOver != true) {
		if (currentTurn == 0) {
			currentTurn = 1;
		}
		else {
			currentTurn = 0;
		}
		}
	}
	
	public void mousePressed( MouseEvent evt )
	{
	}
	
	public void mouseReleased( MouseEvent evt )
	{
	}
	
	public void mouseEntered( MouseEvent evt )
	{
	}
	
	public void mouseExited( MouseEvent evt )
	{
	}
	
	public boolean isFocusable() { return true;	}
	
	public void mouseClicked( MouseEvent evt ){
		if (gameOver != true) {
		if (evt.getPoint().getX() > circle1.getX() && evt.getPoint().getX() < circle1.getX()+80 ) {
			placeCounter(0);
		}
		else if (evt.getPoint().getX() > circle2.getX() && evt.getPoint().getX() < circle2.getX()+80 ) {
			placeCounter(1);
		}
		else if (evt.getPoint().getX() > circle3.getX() && evt.getPoint().getX() < circle3.getX()+80 ) {
			placeCounter(2);
		}
		else if (evt.getPoint().getX() > circle4.getX() && evt.getPoint().getX() < circle4.getX()+80 ) {
			placeCounter(3);
		}
		else if (evt.getPoint().getX() > circle5.getX() && evt.getPoint().getX() < circle5.getX()+80 ) {
			placeCounter(4);
		}
		else if (evt.getPoint().getX() > circle6.getX() && evt.getPoint().getX() < circle6.getX()+80 ) {
			placeCounter(5);
		}
		else if (evt.getPoint().getX() > circle7.getX() && evt.getPoint().getX() < circle7.getX()+80 ) {
			placeCounter(6);
		}
		else if (evt.getPoint().getX() > circle8.getX() && evt.getPoint().getX() < circle8.getX()+80 ) {
			placeCounter(7);
		}
		else if (evt.getPoint().getX() > circle9.getX() && evt.getPoint().getX() < circle9.getX()+80 ) {
			placeCounter(8);
		}
		else if (evt.getPoint().getX() > circle10.getX() && evt.getPoint().getX() < circle10.getX()+80 ) {
			placeCounter(9);
		}
		else if (evt.getPoint().getX() > circle11.getX() && evt.getPoint().getX() < circle11.getX()+80 ) {
			placeCounter(10);
		}
		
		if(hasWinner()) {
			
			
		}
		repaint();
		
	}
	}
	
	static boolean hasWinner() {
		boolean result = false;
		
		if(checkHorizontal()) {
			result = true;
		}
		
		if(checkVertical()) {
			result = true;
		}
		
		if(checkDiagRight()) {
			result = true;
		}
		
		if(checkDiagLeft()) {
			result = true;
		}
		return result;
	}
	
	static boolean checkHorizontal() {
		boolean result = false;
		
		for (int r=0; r<spaces.length; r++ )
			for (int c=0; c<spaces[r].length -3; c++ ) {
				if(spaces[r][c] == 0 || spaces[r][c] == 1) {
					if(spaces[r][c] == spaces[r][c+1] &&
					   spaces[r][c] == spaces[r][c+2] &&
				       spaces[r][c] == spaces[r][c+3]) {
					winCounter1X = circles[r][c].getCenterX();
					winCounter1Y = circles[r][c].getCenterY();
					winCounter2X = circles[r][c+3].getCenterX();
					winCounter2Y = circles[r][c+3].getCenterY();
					result = true;
					break;
				}
			}
			}
		return result;
	}
	
	static boolean checkVertical() {
		boolean result = false;
		
		for (int r=0; r<spaces.length -3; r++ )
			for (int c=0; c<spaces[r].length; c++ ) {
				if(spaces[r][c] == 0 || spaces[r][c] == 1) {
					if(spaces[r][c] == spaces[r+1][c] &&
					   spaces[r][c] == spaces[r+2][c] &&
				       spaces[r][c] == spaces[r+3][c]) {
						
						winCounter1X = circles[r][c].getCenterX();
						winCounter1Y = circles[r][c].getCenterY();
						winCounter2X = circles[r+3][c].getCenterX();
						winCounter2Y = circles[r+3][c].getCenterY();
					result = true;
					break;
				}
			}
			}
		return result;
	}
	
	static boolean checkDiagRight() {
		boolean result = false;
		
		for (int r=0; r<spaces.length -3; r++ )
			for (int c=0; c<spaces[r].length -3; c++ ) {
				if(spaces[r][c] == 0 || spaces[r][c] == 1) {
					if(spaces[r][c] == spaces[r+1][c+1] &&
					   spaces[r][c] == spaces[r+2][c+2] &&
				       spaces[r][c] == spaces[r+3][c+3]) {
						
						winCounter1X = circles[r][c].getCenterX();
						winCounter1Y = circles[r][c].getCenterY();
						winCounter2X = circles[r+3][c+3].getCenterX();
						winCounter2Y = circles[r+3][c+3].getCenterY();
					result = true;
					break;
				}	
			}
			}
		return result;
	}
	
	static boolean checkDiagLeft() {
		boolean result = false;
		
		for (int r=0; r<spaces.length -3; r++ )
			for (int c = 3; c<spaces[r].length; c++ ) {
				if(spaces[r][c] == 0 || spaces[r][c] == 1) {
					if(spaces[r][c] == spaces[r+1][c-1] &&
					   spaces[r][c] == spaces[r+2][c-2] &&
				       spaces[r][c] == spaces[r+3][c-3]) {
						
						winCounter1X = circles[r][c].getCenterX();
						winCounter1Y = circles[r][c].getCenterY();
						winCounter2X = circles[r+3][c-3].getCenterX();
						winCounter2Y = circles[r+3][c-3].getCenterY();
					result = true;
					break;
				}
			}
			}
		return result;
	}
	public static void main( String[] args )
	{
		win = new JFrame("Connect 4");
		win.setSize(1140,900);
		win.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		win.add( new Connect4() );
		win.setVisible(true);
		win.setResizable(false);
		
		
	}
}
