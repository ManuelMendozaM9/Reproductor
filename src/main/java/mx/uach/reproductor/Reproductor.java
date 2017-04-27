/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.reproductor;

/**
 *
 * @author Manuel
 */
public class Reproductor {
    private Cancion c;
    void Play(){
        c=   Cancion.getInstance(); //.getInstance();
        c.Play();
        c.Stop();
        c.Play();
        c.Stop();
        c.Play();
        c.Stop();
    }
    public static void main(String[] args) {
        Reproductor r = new Reproductor();
        r.Play();
        Reproductor2 r2 = new Reproductor2();
        r2.play();
        
    }
 
}
