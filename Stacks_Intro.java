import java.util.*;
class Stacks_Intro
{
    int max=1000;
    int top=-1;
    int stack[]=new int[max];
    //Comment is added
    void push(int x)
    {
        if(top==(max-1))
        {
            System.out.println("Stack is full");
        }
        else
        {
            stack[++top]=x;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.print("-1 ");
        }
        else
        {
            System.out.print(stack[top--]+" ");
        }
    }
    void main()
    {
        Stacks_Intro s=new Stacks_Intro();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int i=0;
            sc.nextLine();
            String str=sc.nextLine();
            while(i<n)
            {
                char ch=str.charAt(i);
                int key=ch - '0';
                if(key==1)
                {
                    char ch2=str.charAt(i+2);
                    int val=ch2-'0';
                   s.push(val);
                   i=i+4;
                }
                else if(key==2)
                {
                    s.pop();
                    i=i+2;
                }
            }
            for(i=top;i>=0;i++)
            {
                System.out.print(stack[i]+" ");
            }
            top=-1;
        }
    }
}