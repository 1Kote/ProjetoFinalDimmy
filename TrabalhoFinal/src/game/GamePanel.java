package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import entitys.Player;

public class GamePanel extends JPanel implements Runnable
{
	
	final int originalTileSize = 16;// temos que definir isso ainda
	final int scale = 3; // numero de escala aleatorio, devemos definir isso depois
	
	public final int tileSize = originalTileSize * scale;
	// variaveis para definir o tamnho da tela baseado no numero de blocos que deve ser renderizado
	// quantos blocos devem ser renderizados
	
	public final int maxScreenCol = 16; // devemos definir o tamanho depois mas resumindo, 16 pixels horizontal
	public final int maxScreenRow = 12; // 12 pixels vertical
	public final int screenWidth = tileSize * maxScreenCol; // tamanho da tela horizontal 16 * 48 = 768
	public final int screenHeight = tileSize * maxScreenRow; // tamanho da tela vertical 12 * 48 = 578
	
	// essas são as configurações do mundo, os valores aqui são apenas para exemplo, definiremos depois
	public final int maxWorldCol = 50;
	public final int maxWorldRow = 50;
	public final int worldWidth = tileSize * maxWorldCol;
	public final int worldHeight = tileSize * maxWorldRow;
	

	// FPS do jogo
	int FPS = 60;
	
	public Thread gameThread;
	public Player player = new Player();
	
	// gerar a janela do jogo
	public GamePanel() 
	{
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(null);
		this.setFocusable(true);
		
	}
	
	public void setupGame() 
	{
		
	}
	
	public void startGameThread() 
	{
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	
	
	
	
	
	
	//metodo advindo de JPanel para rodar o jogo
	public void run() 
	{
		double drawInterval = 1000000000/FPS;
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;
		
		long timer = 0;
		int drawCount = 0;
		
		while(gameThread != null) 
		{
			
			currentTime = System.nanoTime();
			
			delta += (currentTime - lastTime) / drawInterval;
			timer += (currentTime - lastTime);
			lastTime = currentTime;
			
			if(delta >= 1) 
			{
				update();
				repaint();
				delta--;
				drawCount++;
				
				
				
			}
			
			if(timer >= 1000000000) 
			{
				
				System.out.println("FPS" + drawCount);
				drawCount = 0;
				timer = 0;
				
				
				
			}
			
		}
		
	}
	
	public void update() 
	{
		player.update();
	}
	
	
	
	
	
	
}
