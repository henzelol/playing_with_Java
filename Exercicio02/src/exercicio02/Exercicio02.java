/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

/**
 *
 * @author jw
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ponto p = new Ponto();
        Retangulo ret = new Retangulo();
        float px=Console.readFloat("digite a coordenada de X do ponto");
        float py=Console.readFloat("digite a coordenada de Y do ponto");
        p.setX(px);
        p.setY(py);
        System.out.println("seu ponto em X e : " +p.getX());
        System.out.println("seu ponto em Y É : " +p.getY());
        int p1x=Console.readFloat("digite a coordenada de X do primeiro vertice");
        int p2x=Console.readFloat("digite a coordenada de X do segundo vertice");
        int p1y=Console.readFloat("digite a coordenada de Y do primeiro vertice");
        int p2y=Console.readFloat("digite a coordenada de Y do segundo vertice");
        
        ret.setX1(p1x);
        ret.setX2(p2x);
        ret.setY1(p1y);
        ret.setY2(p2y);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
