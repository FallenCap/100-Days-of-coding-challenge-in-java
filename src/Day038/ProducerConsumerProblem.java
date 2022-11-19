/*Write a java program to implement producer consumer probelem.*/

package Day038;
class Shop {
	//Creating class for the producer-consumer problem.
      private int materials;
      private boolean available = false;
      
      public synchronized int get() {
    	  //Method for getting item 
            while (available == false) {
                  try {
                        wait();
                  }
                  catch (InterruptedException ie) {
                	  System.out.println(ie);
                  }
            }
            
            available = false;
            notifyAll();
            return materials;
      }
      public synchronized void put(int value) {
    	  //Method for putting element.
            while (available == true)
            {
                  try
                  {
                        wait();
                  }
                  catch (InterruptedException ie)
                  {
                        ie.printStackTrace();
                  }
            }
            materials = value;
            available = true;
            notifyAll();
      }
}
class Consumer extends Thread {
	//Class for cosumer problem.
	
	//Declaring variables globally.
      private Shop Shop;
      private int number;
      
      public Consumer(Shop c, int number) {
    	  //Mehtod for consumer problem.
            Shop = c;
            this.number = number;
      }
      public void run()
      {
            int value = 0;
            for (int i = 0; i < 10; i++)
            {
                  value = Shop.get();
                  System.out.println("Consumed value " + this.number+ " got: " + value);
            }
      }
}
class Producer extends Thread {
	  //Method for producer problem.
	
	//Declaring variables globally.
      private Shop Shop;
      private int number;

      public Producer(Shop c, int number) {
    	//Mehtod for producer problem.
            Shop = c;
            this.number = number;
      }
      public void run()
      {
            for (int i = 0; i < 10; i++)
            {
                  Shop.put(i);
                  System.out.println("Produced value " + this.number+ " put: " + i);
                  try
                  {
                        sleep((int)(Math.random() * 100));
                  }
                  catch (InterruptedException ie)
                  {
                        ie.printStackTrace();
                  }
            }
      }
}
public class ProducerConsumerProblem {
    public static void main(String[] args) {
          Shop c = new Shop();
          Producer p1 = new Producer(c, 1);
          Consumer c1 = new Consumer(c, 1);
          p1.start();
          c1.start();
    }
}


//-------------Test Case-------------
//Output: 
//Consumed value 1 got: 0
//Produced value 1 put: 0
//Produced value 1 put: 1
//Consumed value 1 got: 1
//Produced value 1 put: 2
//Consumed value 1 got: 2
//Consumed value 1 got: 3
//Produced value 1 put: 3
//Produced value 1 put: 4
//Consumed value 1 got: 4
//Produced value 1 put: 5
//Consumed value 1 got: 5
//Produced value 1 put: 6
//Consumed value 1 got: 6
//Consumed value 1 got: 7
//Produced value 1 put: 7
//Consumed value 1 got: 8
//Produced value 1 put: 8
//Consumed value 1 got: 9
//Produced value 1 put: 9
