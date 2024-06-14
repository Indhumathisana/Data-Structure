import java.util.*;
/* method-1
 class queue{
    final static int size = 30;
    int arr[];
    int front,rear;
    queue()
    {
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    public void enqueue(int n)
    {
        if(rear==size-1)
         throw new IndexOutOfBoundsException("queue is full");
         if(front==-1)
         front++;
//    rear=rear+1;
        arr[rear]=n;
    }
    public int dequeue()
    {
        if(front==-1||front>rear)
        throw new IndexOutOfBoundsException("queue is empty");
        return arr[front++];
    }
 }
*/      // shifting method


//method-2
class queue{
    final static int size = 30;
    int arr[];
    int rear;
    queue()
    {
        arr=new int[size];
        rear=-1;
    }
    public void enqueue(int n)
    {
        if(rear==size-1)
         throw new IndexOutOfBoundsException("queue is full");
    //    rear=rear+1;
        arr[rear]=n;
    }
    public int dequeue()
    {
        if(rear==-1)
        throw new IndexOutOfBoundsException("queue is empety");
        int temp=arr[0];
        for(int i=1;i<=rear;i++)
            arr[i-1]=arr[i];
            rear--;
        return temp;
    }
}
  
  
  
     
public class Main
{
	public static void main (String[] args) {
		queue q=new queue();
		q.enqueue(5);
		q.enqueue(9);
		q.enqueue(4);
		q.enqueue(9);
		q.enqueue(7);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}

