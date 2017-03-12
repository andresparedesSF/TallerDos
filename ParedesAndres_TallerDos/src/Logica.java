import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private ArrayList<Banda> imagenes = new ArrayList<Banda>();
	private Banda selector; 
	private String[] nombres;
	private String dato;
	
	public Logica(PApplet app){
		
		nombres = app.loadStrings("../data/nombres.txt");
		
		for (int i = 0; i < 5; i++) {
			dato = nombres[i];
			imagenes.add(new Banda(app, (i*50) + 100, 100, dato));
		}
		
	}
	
	public void pintar(){
		for (int i = 0; i < imagenes.size(); i++) {
			Banda p = imagenes.get(i);
			p.pintar();
		}
		
	}
	
	public void selecionar(float mouseX, float mouseY){
		for (int i = 0; i < imagenes.size(); i++) {
			Banda p = imagenes.get(i);
			if(PApplet.dist(p.getPosX(), p.getPosY(), mouseX, mouseY)<150){
				selector = p;
			}
		}
	}
	
	public void arrastrar(float mouseX, float mouseY){
		if(selector != null){
			selector.mover(mouseX, mouseY);
		}
	}
	
	public void soltar(){
		selector = null;
	}
}
