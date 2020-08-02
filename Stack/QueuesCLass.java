class QueuesClass
{
	private int data[]=new int[10];
	private int top=-1;
	
	public void enqueues(int value)
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
		public void dequeues()
		{
			int j=0;
			if(!isEmpty())
			{
					System.out.println(data[0]);
				while(j<=top-1)
				{
					System.out.println();
						data[j]=data[j+1];
						j++;
						
				}
				top--;
				
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
			for(int i=0;i<=top;i++)
				System.out.print(data[i]+" ");
				System.out.println();
		}
}