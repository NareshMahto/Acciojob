import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
    static class Node //user defiend data type int a int b int c int d ; node a ; node b ;node c ; node d  class person 
    {
        int  val;    // data 2  
        Node next;  //address of next node address --> hexagonal ;p1.age=23p1.name hasrh sop(p1)
    }
    public static class LinkedList { //its is collection of code phle node head se point se karega ist node ko point out krta hai 
        Node head; //node head first node ko point out krega ya store krega ..[   temp 2 head                         ]// int a; sop(a)--> null?
        public void insert(int x){ // 2 //3 
            Node n = new Node(); // person p = new person()//
            n.val = x; // p.age ,p.namep.age =23  // n.val
            n.next = null; // address 3// null 
            if(head == null){
                head = n;// head == 2;
                return;
            }
            Node temp = head;// head ==2 temp==2 // head2 temp 2  temp next 2 se 3 2se 4 2 se 5  2se 10 
            while(temp.next != null)// null nahi hai  2--3 4
                temp = temp.next;//  point temp= 3 temp =3 temp++
                temp.next = n; //3  //4
            return;
        }
        public void print(){
            Node temp = head;// //2 
            while(temp != null){
                System.out.print(temp.val + " "); 
                temp = temp.next; // point krdiye//3//3
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // 2 
        int m = in.nextInt();

        LinkedList ll1 = new LinkedList();//constructor //
        LinkedList ll2 = new LinkedList();

        for(int i=0;i<n;i++)
        {
            int x = in.nextInt(); 
            ll1.insert(x);//2  //3  //4
        }

        for(int i=0;i<m;i++)
        {
            int x = in.nextInt();
            ll2.insert(x);
        }

        ll1.print();
        ll2.print();
    }
}
