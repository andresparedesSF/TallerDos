import processing.core.PApplet;
import processing.core.PImage;

public class Banda {

	private PApplet app;
	private float posX;
	private float posY;
	private float tamano;
	private String nombre;
	private PImage nucleos;
	
	public Banda(PApplet app, float posX, float posY, String nombre){
		
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.nombre = nombre;
		tamano = 150;
		nucleos = app.loadImage(nombre);
		
	}
	
	public void pintar(){
		
		
		//app.imageMode(PConstants.CENTER);
		app.image(nucleos, posX, posY, tamano, tamano);
		
	}
	
	public void mover(float x, float y){
		this.posX = x;
		this.posY = y;
	}
	
	
	
	
	
	

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public float getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
}
