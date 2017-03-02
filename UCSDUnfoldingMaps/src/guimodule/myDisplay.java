package guimodule;

import processing.core.PApplet;

public class myDisplay extends PApplet{
	
	private static final long serialVersionUID = 1L;
	
	public void setup()
	{
		size(400, 400);
		background(130, 50, 0);
	}
	
	public void draw()
	{
		fill(255, 224, 179);
		ellipse(200,200,400,400);
		fill(250, 250, 250);
		ellipse(100,100,30,50);
		fill(0, 0, 0);
		ellipse(100, 110, 23, 28);
		

		fill(250, 250, 250);
		ellipse(300,100,30,50);
		fill(0, 0, 0);
		ellipse(300, 110, 23, 28);
		
		fill(255, 0, 0);
		ellipse(190,200,50,50);
		
		noFill();
		arc(190,300,75,75,0,PI);
		
	}

}
