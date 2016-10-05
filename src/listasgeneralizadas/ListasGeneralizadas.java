/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasgeneralizadas;

import java.util.Stack;

/**
 *
 * @author Juan
 */
public class ListasGeneralizadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
        
        
        
        
    }
    
    public void conslg(String s){
    
        Stack pila =new Stack();
        nodoLg x = new nodoLg();
        nodoLg l=x;
        nodoLg ultimo=x;
        int n=s.length();
        for(int i=2;i<n;i++){
            switch (s.charAt(i)){
                case ',':
                    x=new nodoLg();
                    ultimo.setLiga(x);
                    ultimo=x;
                    break;
                case'(':
                    pila.push(ultimo);
                    x=new nodoLg();
                    ultimo.setSw(1);
                    ultimo.setDato(x);
                    ultimo=x;
                    break;
                case')':
                    ultimo=(nodoLg) pila.pop();
                    break;
                    
                default:
                    ultimo.setSw(0);
                    ultimo.setDato(i);
                    break;
                    
            }
                    
                    
        }
    }
    
}
