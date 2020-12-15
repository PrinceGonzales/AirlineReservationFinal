/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationfinal;

public class DList1<E> {
    
    private DNode<E> header, trailer,tempo;
    private int size;
    
    
    public DList1(){
        trailer = new DNode<>(null, null, null);
        header = new DNode<>(null, null, trailer);
        trailer.setPrev(header);
    }
    
    private void addBetween(DNode<E> prev, E element, DNode<E> next){ 
        DNode<E> newNode = new DNode<>(prev, element, next);
        prev.setNext(newNode);
        next.setPrev(newNode);
        size++;
 
    }
    
    public void addFirst(E element){
        addBetween(header, element, header.getNext()); 
    }
    
    public void addLast(E element){
        addBetween(trailer.getPrev(), element, trailer); 
    }
    
    private E remove(DNode<E> node){
        E temp = node.getElement();
        node.getNext().setPrev(node.getPrev());
        node.getPrev().setNext(node.getNext());
        node.setNext(null);
        node.setPrev(null);
        size--;
        return temp;
    }
    
    public E removeFirst()throws EmptyListException{
        if (isEmpty()){
            throw new EmptyListException("There is nothing to be removed!");
        }
        return remove(header.getNext()); 
    }
    
    public E removeLast()throws EmptyListException{
        if (isEmpty()){
            throw new EmptyListException("There is nothing to be removed!");
        }
        return remove(trailer.getPrev()); 
    }
    
    public int size(){ 
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public E first()throws EmptyListException{
         if (isEmpty()){
            throw new EmptyListException("The List is Empty!");
        } 
        return header.getNext().getElement();   
    }
    
    public E last()throws EmptyListException{
         if (isEmpty()){
            throw new EmptyListException("The List is Empty!");
        } 
        return trailer.getPrev().getElement();  
    }
        
    private E rotationB(DNode<E> node){
       
        tempo = node;
                
        node.getNext().setPrev(node.getPrev());
        node.getPrev().setNext(node.getNext());
        node.setNext(null);
        node.setPrev(null);
        node.setNext(header.getNext());
        node.setPrev(header.getNext().getPrev()); 
        header.getNext().setPrev(node);
        header.setNext(node);
        
        return tempo.getElement();
   
    } 
   
    public E rotatedB()throws EmptyListException{
        if (isEmpty()){
            throw new EmptyListException("There's nothing to be rotated!");
        }   
        return tempo.getElement();
       
    }
       
   public E rotateB()throws EmptyListException{
        if (isEmpty()){
            throw new EmptyListException("There's nothing to be rotated!");
        } 
       rotationB(trailer.getPrev());
       
       return tempo.getElement();
   }
     
   private E rotationA(DNode<E> node){
       
       tempo = node;
                
       node.getNext().setPrev(node.getPrev());
       node.getPrev().setNext(node.getNext());
       node.setNext(null);
       node.setPrev(null);
       node.setNext(trailer.getPrev().getNext());
       node.setPrev(trailer.getPrev());      
       trailer.getPrev().setNext(node);
       trailer.setPrev(node);
  
       return tempo.getElement();
   
    } 
   
   public E rotatedA()throws EmptyListException{
        if (isEmpty()){
            throw new EmptyListException("There's nothing to be rotated!");
        }   
        return tempo.getElement();
       
    }     
   
   public E rotateA()throws EmptyListException{
        if (isEmpty()){
            throw new EmptyListException("There's nothing to be rotated!");
        } 
       rotationA(header.getNext());
       
       return tempo.getElement();
   }
     
}
