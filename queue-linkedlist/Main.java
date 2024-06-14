import java.util.*;
class que{
    node rear,front;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            next=null;
        }
    }
    que(){
        rear=null;
        front=null;
    }
    void enq(int d){
        node newone=new node(d);
        if(rear==null ){
            front=rear=newone;
        }
        else{
            rear.next=newone;
            rear=newone;
        }
    }
    void de(){
        if(front==null){
            System.out.println("Empty");
        }
        else if(front==rear){
            System.out.println(front.data);
            front=front.next;
            rear=null;
        }
        else{
        System.out.println(front.data);
        front=front.next;
        }
    }
}
public class Main{
    public static void main (String[] args) {
        que q=new que();
        q.enq(12);
        q.enq(15);
        q.enq(1);
        q.enq(125);
        q.de();
        q.enq(157);
        q.de();
        q.de();
        q.de();
        q.de();
        q.de();
            }
}