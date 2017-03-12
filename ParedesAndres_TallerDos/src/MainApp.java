import processing.core.PApplet;

public class MainApp extends PApplet{
	
	public static void main(String[] args) {
		PApplet.main("MainApp");
	}
	
	Logica app;
	
	@Override
	public void settings() {
		size(1200,700);
	}
	
	@Override
	public void setup() {
		app = new Logica(this);
	}
	
	@Override
	public void draw() {
		background(0);
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
	}
	
	@Override
	public void mouseReleased() {
		app.soltar();
	}
	
}
