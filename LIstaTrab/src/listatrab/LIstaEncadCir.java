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
public class LIstaEncadCir {
    private No primeiro;
    private No ultimo;
    private int tamanho;
    private No antecessor;
    private No aux;
    
    
    
    public LIstaEncadCir(){
        primeiro = null;
        ultimo = null;
        tamanho = 0;
        antecessor = null;
        aux = null;
    }
    
    public boolean vazio(){
        return (primeiro==null);
    }
    
    public double item_frente(){
        return primeiro.item;
    }
    
    public double item_fim(){
        
        return ultimo.item;
    }
    public void tamanho(){
        System.out.println(tamanho);

    }
    
    public void Inserir_fim(double valor){
        
        No novo= new No();
        novo.item = valor;
        novo.proximo = null;
        if (vazio()){
            novo.anterior = null;
            primeiro = novo;
        }else {
            novo.anterior = ultimo;
            ultimo.proximo = novo;
        }
        ultimo = novo;
    }
    
    public void Apagar(double valor){
        No atual, anterior, proximo;
        anterior = null;
        tamanho--;
        atual = primeiro;
        proximo = atual.proximo;
        while (atual != null){
            if (atual.item == valor) break;
            anterior = atual;
            atual = atual.proximo;
            if (atual !=null){
                proximo = atual.proximo;
            }
          
        }
        if (atual == null){
            return;
        }
        if (atual ==primeiro && atual == ultimo){
            primeiro = ultimo = null;
        }else if (atual == primeiro){
            primeiro = primeiro.proximo;
            primeiro.anterior = null;
        }else if (atual.proximo == null){
            ultimo = anterior;
            ultimo.proximo = null;
        }else {
            anterior.proximo = proximo;
            proximo.anterior = anterior;
        }
    }
        
    public void Inserir( int pos, double valor)  {
        
        if ( pos < 0) {
            return;
        }
        No novo = new No();
        novo.item = valor;
        tamanho++;
        
        
        if ( pos == 0){
            novo.proximo = primeiro;
            novo.anterior = novo;
            primeiro = novo;
            return;
        }
        No atual, proximo;
        atual = primeiro;
        proximo = atual.proximo;
        for(int i = 1;i < pos && atual.proximo !=null;i++){
            atual = atual.proximo;
            proximo = atual.proximo;
            
        }
        
        novo.proximo = atual.proximo;
        novo.anterior = atual;
        atual.proximo = novo;
        
        if (novo.proximo == null){
            ultimo = novo;
            
        }else{
            proximo.anterior = novo;
            
        }
        
   
    }
        
    public void imprimir(){
        
        No atual = primeiro;
        while (atual != null){
            System.out.println("{" + atual.item + "}");
            atual = atual.proximo;
        }
        System.out.println("");
        
    }
 public void ApagarPrimeiro(){
    aux=primeiro.proximo.proximo;
    primeiro=primeiro.proximo;
    primeiro.proximo=aux;
 
     
 }  
    
  public void ApagarAt(int pos){
        pos--;
        if(pos < 0 && pos > tamanho-1){
            return;  
        }
        AcharAnterior(pos);
        aux=antecessor;
        antecessor.proximo=antecessor.proximo.proximo;
        antecessor=aux.proximo;
        tamanho--;
        
    }
   
       
    public void ApagarTodos(){
            primeiro=ultimo=null;
            tamanho = 0;
    }
    
    public void AcharAnterior(int pos){
      No aux=primeiro.proximo;
      antecessor=primeiro;
      for(int i=0;i<tamanho;i++){
         if(i==pos){
             return;
         }
         antecessor=aux;
         aux=aux.proximo;
      }

      return;
    }
}


    
    
    
    
    
    
    
    
 
