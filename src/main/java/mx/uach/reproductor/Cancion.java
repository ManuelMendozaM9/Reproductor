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
public class Cancion {
    private static Cancion Instance;
    int i =0;
    private Cancion(){
        
    }
    
    public static Cancion getInstance(){
        if(Instance==null){
            Instance=new Cancion();
        }
        return Instance;
    }
    
    void Play(){
        i++;
        System.out.println(i);
    }
    
    void Stop(){
      
    }
}
