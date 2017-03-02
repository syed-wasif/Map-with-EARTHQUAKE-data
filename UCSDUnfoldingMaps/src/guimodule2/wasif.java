package guimodule2;

import processing.core.PApplet;
import processing.core.PImage;

public class wasif extends PApplet{
	private static final long serialVersionUID = 1L;
	PImage img;
	
	
	public void setup(){
		size(400,400);
		background(255,255,255);
		noStroke();
		img = loadImage("https://upload.wikimedia.org/wikipedia/commons/4/47/DirkvdM_corcovado-palmtrees.jpg","jpg");
		img.resize(0, height);
		}
	
	public void draw(){
		float[] ratio = ratio1(second());
		int[] rgb = new int[3];
		int dimension = img.width*img.height;
		
		loadPixels();
		for(int i=0;i<dimension;i++){
			for(int j=0;j<dimension;j++){
			rgb[0] = (int)(red(img.get(i, j)) * ratio[0]);
			rgb[1] = (int)(green(img.get(i,j)) * ratio[0]);
			rgb[2] = (int)(0);
			
			img.pixels[i] = color(rgb[0], rgb[1], rgb[2]);
			updatePixels();
		}
		}
		image (img,0,0);	
	}
	

	
	public float[] ratio1(float seconds){
		
		float[] ratio2 = new float[1];
		float diffFrom30 = Math.abs(30-seconds);
		ratio2[0] = diffFrom30/30;
		return ratio2;	
	}

}
