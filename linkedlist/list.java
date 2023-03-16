package linkedlist;

public class list
{
    private  node head;
    private node tail;
    private int size;
    public list()
    {
        this.size=0;
    }

public void insertFirst(int value)
{
    node n =new node(value);
    n.next=head;
    head=n;
    if(tail==null)
        tail=head;
    size+=1;
}
    public void insertLast(int value)
    {
        if(tail==null) {
            insertFirst(value);
            return;
        }
        node n =new node(value);
        n.next=tail;
        tail=n;
        size+=1;
    }
    public void insert(int value,int index)
    {
        if(index==0)
        {
            insertFirst(value);
            return;
        }
        if(index==size)
        {
            insertLast(value);
            return;
        }
        node temp = head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        node n= new node(value,temp.next);
        temp.next=n;
        size++;
    }
    public int deletelast()
    {
        if(size<=1)
        {
             return deleteFirst();

        }
         node secondlast= get(size-2);
        int val=tail.value;
        tail=secondlast;
        tail.next=null;
        return val;
    }
public int delete(int index)
{
    if(index==0)
        return deleteFirst();
    if(index==size-1)
        return deletelast();
    node prev=get(index-1);
    int val=prev.next.value;
    prev.next=prev.next.next;
    return  val;
}

public node get(int index)
{
    node n =head;
    for(int i=0;i<index;i++)
    {
        n=n.next;
    }
    return n;
}

public int deleteFirst()
{
int val=head.value;
head=head.next;
if(head==null)
{
tail=null;

}
size--;
return val;
}
public void display()
{
    node temp =head;
    while(temp!=null)
    {
        System.out.print(temp.value+" ");
        temp=temp.next;
    }
    System.out.println("END ");
}

    private class node
    {
        private int value;
        private node next;

        public node(int value)
        {
            this.value=value;
        }
        public node(int value,node next)
        {
            this.value=value;
            this.next=next;

        }


    }

}