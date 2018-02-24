import java.util.Random;
/**
 * GrStore uses the linkedQueue class to run a customer service at the store
 * 
 * @author (Fiacre Indagiye) 
 * 
 */

public class GrStore{
    public static void main(String [] args){

        //Creating a new line
        LinkedQueue line = new LinkedQueue();
        //Create a customer
        Customer person = new Customer();

        Random ranLuck = new Random();

        int luck, lineSize = 0;

        //for the 60 minutes
        for(int x = 0; x < 60; x++){
            //ceate random number from 0 to 4
            luck = ranLuck.nextInt(4);

            
            if(luck == 3){
                
                line.enqueue(new Customer());
                
                System.out.println("New customer added, Queue length is now: " + line.getSize());
            }
            //remove first customer in line 
            if(line.getSize() != 0){
                person = line.peek();
                if(person.getServiceTime() == 0){
                    line.dequeue();
                    System.out.println("Customer serviced and removed from the queue, Queue length is now " + line.getSize());
                }
                else{
                    person.decServiceTime();
                }
            }

            lineSize++;
            System.out.println(lineSize + "  minutes -----------------------------------\n");
        }

        System.out.println("Total number of customers served: " + line.getTotal());
        System.out.println("Maximum line length during simulation: " + line.getMaxLength());
    }

}
