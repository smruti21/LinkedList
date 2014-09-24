import java.io.*;
class Node
{
private int data;
private Node next;
void setData(int v)
{
data=v;
}
int getData()
{
return data;
}
void setNext(Node n)
{
next=n;
}
Node getNext()
{
return next;
}
}
class LinkedList
{
Node first;
void insertEnd(int v)
{
Node n=new Node();
n.setData(v);
if(first==null)
first=n;
else
{
Node temp=first;
while(temp.getNext()!=null)
temp=temp.getNext();
temp.setNext(n);
}
}
void insertAtBegin(int v)
{
Node n=new Node();
n.setData(v);
if(first==null)
first=n;
else
{
n.setNext(first);
first=n;
}
}

void display()
{
Node temp=first;
while(temp!=null)
{
System.out.println(temp.getData());
temp=temp.getNext();
}
}
}
class Demo
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
LinkedList ll=new LinkedList();
System.out.println("1.Insert an element");
System.out.println("2.Display all elements of LinkedList");
System.out.println("3.Exit");
while(true)
{
System.out.print("Enter your choice:");
int n=Integer.parseInt(br.readLine());
switch(n)
{
case 1:
System.out.print("Enter the element to be inserted:");
ll.insertEnd(Integer.parseInt(br.readLine())); ;
break;
case 2:
ll.display();
break;
case 3:
System.exit(0);
default:
System.out.println("Enter valid choice");
}
}
}
}
