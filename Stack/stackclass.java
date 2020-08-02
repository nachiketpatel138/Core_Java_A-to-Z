class stackclass
{
	private int data[]=new int[10];
	private int top=-1;
	
	public void push(int value)
	{
		if(isFull())
		{
			System.out.println("Full Stack");
		}
		else
		{
			data[++top]=value;
		}
	}
		public void pop()
		{
			if(!isEmpty())
			{
				System.out.println(data[top--]);
			}
		}
		public boolean isFull()
		{
			if(top==data.length)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public  boolean isEmpty()
		{
			if(top==-1)
			{
				System.out.println("Empty stack");
				return true;
			}
			else
			{
				return false;
			}
		}
		public int peek()
		{
			return data[top];
		}
		public void display()
		{
			System.out.print("Data Value :" );
			for(int i=0;i<=top;i++)
				System.out.print(data[i]+" ");
				System.out.println();
		}
}