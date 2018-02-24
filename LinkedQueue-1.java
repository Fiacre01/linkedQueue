
/**
 * linked list queue data structure 
 * 
 * @author Fiacre Indagiye
 * 
 */
public class LinkedQueue{

   //two customer objects are created
   private Customer first, last;
   
   private int size, total = 0, maxLength = 0;
   
   //Constructor
   public LinkedQueue(){
      first = last = null;
      size = 0;
   }
   
   //enqueu method to add a customer
   public void enqueue(Customer person){
      //checking if line is empty
      if(first == null){
         first = person;
      }
      //else
      else{
         last.setNext(person);
      }
      //keeping total number of customer
      total++;
      //increment size
      size++;
      //Always set Customer last to the current object
      last = person;
   }
   
   //Method that removes the first customer from the front of the list.
   public Customer dequeue(){
      if(maxLength < size){
          maxLength = size;
      }
      
      Customer person = first;
      
      //If the list is empty
      if(first == null){
         System.out.println("The line is already empty");
         return null;
      }
      
      //Update first to point to the next object on the list
      first = first.getNext();
      
      //If list is empty after updating, make sure last is also null
      if(first == null){
         last = null;
      }
      //Decrement size by one
      size--;
      return person;
   }
   
   //Method that returns whether or not the queue is empty or not
   public boolean isEmpty(){
      return first == null;
   }
   
   //Method that returns the first object of the queue
   public Customer peek(){
      //If line is empty, return null
      if(first == null){
         System.out.println("The line is empty");
         return null;
      }
      //If line isn't empty, return first Customer
      else{
         return first;
      }
   }
   
   //Return the size of the list
   public int getSize(){
      return size;
   }
   
   //Return all the customers serviced the entire day
   public int getTotal(){
        return total;
    }
    
   //Return the maximum line length
   public int getMaxLength(){
       return maxLength;
    }
}