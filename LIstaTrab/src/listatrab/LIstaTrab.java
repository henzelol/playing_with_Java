/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listatrab;

/**
 *
 * @author jw
 */
public class LIstaTrab {

   
    public static void main(String[] args) {

        // 1) Adicione 6 numeros.  
        LIstaEncadCir list=new LIstaEncadCir();
        list.Inserir(0,1);
        list.Inserir(1,2);
        list.Inserir(2,3);
        list.Inserir(3,4);
        list.Inserir(4,5);
        list.Inserir(5,6);
        list.tamanho();
        
  //      list.imprimir();
        System.out.println("------------------------");
   //     list.Apagar(456);
   //     list.imprimir();
  //     System.out.println("------------------------");
   //     list.tamanho();
  //      list.ApagarTodos();
  //      System.out.println("------------------------");

         list.ApagarAt(0);
     //   list.ApagarPrimeiro();
         list.imprimir(); 
          System.out.println("------------------------");

          


        

        
    }
    }
    
    
    
    
    

