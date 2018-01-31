package Builder.Decorator;


import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//https://docs.oracle.com/javase/tutorial/uiswing/events/keylistener.html
/*
//where initialization occurs:
        typingArea = new JTextField(20);
        typingArea.addKeyListener(this);

        //Uncomment this if you wish to turn off focus
        //traversal.  The focus subsystem consumes
        //focus traversal keys, such as Tab and Shift Tab.
        //If you uncomment the following line of code, this
        //disables focus traversal and the Tab events
        //become available to the key event listener.
        //typingArea.setFocusTraversalKeysEnabled(false);
 */
public class Clavier extends Listener implements KeyListener{


    private char keyChar;
    private int keyCode;
    private Boolean haut;
    private Boolean bas;
    private Boolean gauche;
    private Boolean droite;

   public void keyPressed(KeyEvent event){ }

   public void keyReleased(KeyEvent event){}

  public void keyTyped(KeyEvent event){}

  @Override
  public void ajoutComposant() {
      point = elementDuJeu.getForme();
  }

  public int getKeyCode() {
      return keyCode;
  }

  public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
  }

  public Boolean getHaut() {
    return haut;
  }

  public void setHaut(Boolean haut) {
    this.haut = haut;
  }

  public Boolean getBas() {
    return bas;
  }

  public void setBas(Boolean bas) {
    this.bas = bas;
  }

  public Boolean getGauche() {
    return gauche;
  }

  public void setGauche(Boolean gauche) {
    this.gauche = gauche;
  }

  public Boolean getDroite() {
    return droite;
  }

  public void setDroite(Boolean droite) {
    this.droite = droite;
  }

  public char getKeyChar() {
    return keyChar;
  }

  public void setKeyChar(char keyChar) {
    this.keyChar = keyChar;
  }


}