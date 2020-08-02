class year extends student
{
    private int sub1,sub2,sub3,sub4,sub5,sub6;
    private int sp,nog;
    private String msg="";
    
    
    public void setmsg(String name)
    {
    	this.msg=name;
    }
    public String getmsg()
    {
    	return msg;
    }
	public void setsub1(int j)
	{
		sub1=j;
	}
	public int getsub1()
	{
		return sub1;
	}
	public void setsub2(int j)
	{
		sub2=j;
	}
	public int getsub2()
	{
		return sub2;
	}
	public void setsub3(int j)
	{
		sub3=j;
	}
	public int getsub3()
	{
		return sub3;
	}
	public void setsub4(int j)
	{
		sub4=j;
	}
	public int getsub4()
	{
		return sub4;
	}
	public void setsub5(int j)
	{
		sub5=j;
	}
	public int getsub5()
	{
		return sub5;
	}
	public void setsub6(int j)
	{
		sub6=j;
	}
	public int getsub6()
	{
		return sub6;
	}
	public void check_gr()
	{
		String str="fail";
		
		sp=0;
		sp+=spn(sub1);
		sp+=spn(sub2);
		sp+=spn(sub3);
		sp+=spn(sub4);
		sp+=spn(sub5);
		sp+=spn(sub6);
		
		if(sp >2)
		{
			msg=str;
		}
		else
		{
			nog=0;
			int gm=12;
			
			int di = cg(sub1);
			if(!(di>gm)&&di!=0)
			{
				gm-=di;
				setsub1(sub1+di);
				nog=1;
			}
			
			 di = cg(sub2);
			if(!(di>gm)&&di!=0)
			{
				gm-=di;
				setsub2(sub2+di);
				nog+=1;
			}
			
			 di = cg(sub3);
			if(!(di>gm)&&di!=0)
			{
				gm-=di;
				setsub3(sub3+di);
				nog+=1;
			}
			
			 di = cg(sub4);
			if(!(di>gm)&&di!=0)
			{
				gm-=di;
				setsub4(sub4+di);
				nog+=1;
			}
			
			 di = cg(sub5);
			if(!(di>gm)&&di!=0)
			{
				gm-=di;
				setsub5(sub5+di);
				nog+=1;
			}
			
			 di = cg(sub6);
			if(!(di>gm)&&di!=0)
			{
				gm-=di;
				setsub6(sub6+di);
				nog+=1;
			}

		}
	}
	
	
	public int cg(int m)
	{
		if(m<33)
			return 33-m;
		else
			return 0;	
	}
	
	public String cp()
	{
		if(sp==2 && nog==2)
		{
			msg="pass with grace :";
		}
		if(sp==2 && nog==1)
		{
			msg="re-exam + grace in one subject :";
		}
		if(sp==2 && nog==0)
		{
			msg="re-exam :";
		}
		if(sp==1 && nog==1)
		{
			msg="pass with grace :";
		}
		if(sp==1 && nog==0)
		{
			msg="re-exam :";
		}
		return msg;
	}
	
		public int spn(int m)
		{
			if(m>32 && m<=100)
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
		public String check_pr()
		{
			int p=0;
			
			p+=sub1;
			p+=sub2;
			p+=sub3;
			p+=sub4;
			p+=sub5;
			p+=sub6;
			
			int r=0;
			r=p*100/600;
			System.out.println("sp "+sp);
			System.out.println("nog "+nog);
			if(r<=32 || sp>2)
			{
				msg="fail";
			}
			else if(r<44)
			{
				if(!(cp().equals("re-exam + grace in one subject :") || cp().equals("re-exam :")))
					msg="3 division "+msg;
			}
			else if(r<59)
			{
				if(!(cp().equals("re-exam + grace in one subject :")|| cp().equals("re-exam :")))
					msg="2 division "+msg;
			}
			else if(r<=100)
			{
				if(!(cp().equals("re-exam + grace in one subject :")|| cp().equals("re-exam :")))
					msg="super division "+msg;
			}
			return msg;
		}
		/*public String result()
		{

			int c=0;
			c+=check(sub1);
			c+=check(sub2);
			c+=check(sub3);
			c+=check(sub4);
			c+=check(sub5);
			c+=check(sub6);
			
			if(c>2)
			{
				return "Fail";
			}
			else
			{ 
				int i=check(sub1);
				i=check(sub2);
				 i=check(sub3);
				 i=check(sub4);
				 i=check(sub5);
				 i=check(sub6);
				while(i<33)
				{
					i++;	
				}
				System.out.println(i);
			
						return "pass";}
			
		}*/
			
		}
