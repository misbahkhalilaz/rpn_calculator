import java.util.ArrayList;

public class RPNStack
{
    private ArrayList<String> x;

    public RPNStack()
    {
       x = new ArrayList<String>();      
    }

    public boolean isEmpty()
    {
         return x.isEmpty();
    }

    public String pop()         
    {
        String last;
        last = x.remove((x.size()- 1));
        return(last);      
    }

    public void push(String s)     
    {
        x.add(s);
    }

    public String top()
    {
        return(x.get(x.size() -1));
    }
    
}