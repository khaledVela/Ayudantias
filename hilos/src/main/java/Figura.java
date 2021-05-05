import java.awt.Color;
import java.awt.Graphics;

public class Figura {
	private int x = 100;
	private int y = 100;
	private int tamanio = 100;
	private int velocidad = 1;
	int r= 255;
	int b= 0;
	private boolean irDerecha = true;
	private boolean irArriba = true;
	private boolean seleccion = false;

	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void mover() {
		if(seleccion==false) {
			if (irDerecha)
				moverDerecha();
			else
				moverIzquierda();
			if (irArriba)
				moverArriba();
			else
				moverAbajo();
		}
	}

	public void moverIzquierda() {
		x -= velocidad;
	}

	public void moverDerecha() {
		x += velocidad;
	}

	public void moverArriba() {
		y -= velocidad;
	}

	public void moverAbajo() {
		y += velocidad;
	}
	public void cambiarSeleccion(){
		seleccion= !seleccion;
		if(seleccion==true){
			r=0;
			b=255;
		}else{
			r=255;
			b=0;
		}
	}

	public boolean isSeleccion() {
		return seleccion;
	}

	public void cambiarHorizontal() {
		irDerecha = !irDerecha;
	}

	public void cambiarAltura() {
		irArriba = !irArriba;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void dibujar(Graphics g) {

		g.setColor(new Color(r,0,b));
		g.fillOval(x - 5, y + 5, tamanio, tamanio);
		g.fillOval(x, y, tamanio, tamanio);
	}

}
