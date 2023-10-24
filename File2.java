//exp8
//2)
import java.util.*;

public class main1{
public static void main(String[] args)   
  {  
     Q q = new Q(100);
    System.out.println("press ctrl-C to stop");

     new producer(q);
     new consumer(q);
  }
}
class Q {
  private static int MAX;  
  private static int[] queue;  
  private static int front;  
  private static int rear;  

   Q(int max){
      this.MAX = max;
      this.queue = new int[max];
      front=0;
      rear=-1;
  }

synchronized static void enqueue()
{      Scanner obj = new Scanner(System.in); 
       System.out.println("enter no of elements");
        int n = obj.nextInt();
        
    while(n!=0){
    try{
        Thread.sleep(1000);
    }    
      catch(InterruptedException e)
    {
    System.out.println("InterruptedException caught");
    }  
    if(front ==  MAX-1){
         System.out.println("Queue is full!");  
          return;
    }
    if(rear == MAX - 1)  
    {  
          rear = -1;  
        }
    System.out.print("enter element to insert ");
        int item = obj.nextInt();
        rear++;
        queue[rear] = item;  
       
        System.out.println("Item added to queue: " + item); 
      n--;
    
}
        queueDisplay();

}
static void queueDisplay()
    {
        int i;
        if (front == -1) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
       System.out.print("the queue:");
        for (i = front; i <=rear; i++) {
            System.out.printf("%d ", queue[i]);
        }
        System.out.printf("\n");
        return;
    }

synchronized static int dequeue()
{  
    Scanner obj = new Scanner(System.in);
    int temp;
    System.out.print("enter how many element to dequeue ");
    int n = obj.nextInt();
    while(n!=0){
    try
    {
        Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
        System.out.println("InterruptedExceptioncaught");
    }
    if(front == -1)  
    {  
      throw new RuntimeException("Queue is empty");  
    }  
    front = front+1;
    temp = queue[front];
 
    n--;
   System.out.println("deleted ");

    }   
    queueDisplay();  
       
      return 0;
}

}

class producer implements Runnable{
    Scanner obj = new Scanner(System.in);

    Q q;
    producer(Q q){
        this.q=q;
        new Thread(this,"enqueue").start();
    }
    public void run(){
        Q.enqueue();
}

}
class consumer implements Runnable{
    Q q;
    consumer(Q q){
        this.q=q;
        new Thread(this,"dequeue").start();
    }
    public void run(){
      Q.dequeue();
    }
}
