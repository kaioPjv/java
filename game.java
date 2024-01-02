import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public  class game extends Canvas implements Runnable{

	
	
	public static final int WIDTH =	640,HEIGHT = 480;	
	
	public int contador = 100;
	
	
	public game() {
		Dimension dimensiom = new Dimension(WIDTH,HEIGHT);
		this.setPreferredSize(dimensiom);
	}
	
	
	public void update() {
		//contador==;
		if(contador <= 0) {
			//game over
			contador = 100;
		}
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		/*
		g.setColor(Color.white);
		
		g.setFont(new Font("Arial",Font.BOLD,23));
		
		g.drawString("pontos: " + contador, WIDTH/2, 20);
	     
		*/
		g.setColor(Color.green);
		g.fillRect(game.WIDTH/2 - 100 - 70,20, contador*3, 20);
		g.setColor(Color.white);
		g.fillRect(game.WIDTH/2 - 100 - 70,20, 300, 20);
		
	 bs.show();
	}
	public static void main(String[] args) {
		game game = new game();
		JFrame jframe = new JFrame("meu jogo");
		jframe.add(game);
		jframe.setLocationRelativeTo(null);
		jframe.pack();
	    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jframe.setVisible(true);
		
		
		new Thread(game).start();
	}
	
	
	@Override
	public void run() {
		
		
		while(true) {
			update();
			render();
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
				
			}
		}
	
}

}