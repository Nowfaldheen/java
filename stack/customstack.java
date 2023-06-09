
public class customstack
{
    protected int[] data;
    private  static final int DEFAULT_SIZE = 10;
    int ptr=-1;

    public customstack()
    {
        this(DEFAULT_SIZE);
    }
    public customstack(int size) {
        this.data =new int[size];

    }
    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
public int pop() throws StackException {
    if(isEmpty())
    {
        throw new StackException("Cannot pop the element since  it is empty");
    }
//    int removed= data[ptr];
//    ptr--;
//    return removed;
    return data[ptr--];

}
public int peek() throws StackException {
    if(isEmpty())
    {
        throw new StackException("Cannot display the last ele");
    }
    return data[ptr];
}

    public boolean isFull() {
        return ptr==data.length-1;
    }
    public boolean isEmpty() {
        return ptr==-1;
    }


}