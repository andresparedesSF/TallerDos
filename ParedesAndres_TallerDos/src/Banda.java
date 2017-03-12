import processing.core.PApplet;
import processing.core.PImage;

public class Banda {

	private PApplet app;
	private float posX;
	private float posY;
	private PImage nucleoUno;
	private PImage nucleoDos;
	private PImage nucleoTres;
	private PImage nucleoCuatro;
	private PImage nucleoCinco;
	
	public Banda(PApplet app, int posX, int posY){
		
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		
		nucleoUno = app.loadImage("../data/nucleo1.png");
		nucleoDos = app.loadImage("../data/nucleo2.png");
		nucleoTres = app.loadImage("../data/nucleo3.png");
		nucleoCuatro = app.loadImage("../data/nucleo4.png");
		nucleoCinco = app.loadImage("../data/nucleo5.png");
		
	}
	
	public void pintar(){
		
		app.image(nucleoUno, posX, posY);
		app.image(nucleoDos, posX, posY);
		app.image(nucleoTres, posX, posY);
		app.image(nucleoCuatro, posX, posY);
		app.image(nucleoCinco, posX, posY);
		
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
