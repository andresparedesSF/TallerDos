import processing.core.PApplet;
import processing.core.PImage;

public class MainApp extends PApplet{
	
	public static void main(String[] args) {
		PApplet.main("MainApp");
	}
	
	Logica app;
	PImage fondo;
	
	@Override
	public void settings() {
		size(1200,700);
	}
	
	@Override
	public void setup() {
		app = new Logica(this);
		fondo = loadImage("Fondo_TallerDos.png");
	}
	
	@Override
	public void draw() {
		//background(0);
		image(fondo,0,0,1200,700);
		app.pintar();
	}
	
	@Override
	public void keyPressed() {
		
	}
	
	@Override
	public void mousePressed() {
		app.selecionar(mouseX, mouseY);
	}
	
	@Override
	public void mouseDragged() {
		app.arrastrar(mouseX, mouseY);
		println(mouseX + " " + mouseY);
	}
	
	@Override
	public void mouseReleased() {
		app.soltar();
	}
	
}
