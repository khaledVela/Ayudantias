import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Dibujo extends JPanel implements MouseListener, KeyListener, Runnable {

    private ArrayList<Figura> lista = new ArrayList();

    public Dibujo() {
        setBackground(Color.white);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).dibujar(g);
            if (i > 0) {
                g.setColor(Color.black);
                g.drawLine(lista.get(i - 1).getX() + 50, lista.get(i - 1).getY() + 50, lista.get(i).getX() + 50, lista.get(i).getY() + 50);
            }
            repaint();
        }
    }

    private void verificarLimites() {
        for (Figura aux : lista) {
            if (aux.getX() < 0) {
                aux.cambiarHorizontal();
                aux.setX(0);
            }

            if (aux.getX() > this.getWidth() - aux.getTamanio()) {
                aux.cambiarHorizontal();
                aux.setX(this.getWidth() - aux.getTamanio());
            }
            if (aux.getY() < 0) {
                aux.cambiarAltura();
                aux.setY(0);
            }

            if (aux.getY() > this.getHeight() - aux.getTamanio()) {
                aux.cambiarAltura();
                aux.setY(this.getHeight() - aux.getTamanio());
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                for (int i = 0; i < lista.toArray().length; i++) {
                    verificarLimites();
                    lista.get(i).mover();
                    Thread.sleep(1);
                }
                repaint();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON3) {
            int X = e.getX();
            int Y = e.getY();
            Figura circulo = new Figura(X, Y);
            lista.add(circulo);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            int X = e.getX();
            int Y = e.getY();
            for (Figura aux : lista) {
                if (X >= aux.getX() && X <= (aux.getX() + 100)) {
                    if (Y >= aux.getY() && Y <= (aux.getY() + 100)) {
                        aux.cambiarSeleccion();
                    }
                }
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            for (Figura aux : lista) {
                if (aux.isSeleccion() == true) {
                    aux.moverAbajo();
                }
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            for (Figura aux : lista) {
                if (aux.isSeleccion() == true) {
                    aux.moverArriba();
                }
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            for (Figura aux : lista) {
                if (aux.isSeleccion() == true) {
                    aux.moverIzquierda();
                }
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            for (Figura aux : lista) {
                if (aux.isSeleccion() == true) {
                    aux.moverDerecha();
                }
            }
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
