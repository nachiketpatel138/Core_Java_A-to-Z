import java.io.*;
import java.lang.String;


class Yearly extends Student
{
	private int sb1;
	private int sb2;
	private int sb3;
	private int sb4;
	private int sb5;
	private int sb6;
	  
	private int sp;
	private int nog;
	private String msg="";
	


		public void setmsg(String name)
		{
			this.msg= name;
		}
		public String getmsg()
		{
			return msg;		
		}
	public void setsb1(int sb1)
	{
		this.sb1 = sb1;
	}
	
	public int getsb1()
	{	
		 
		 return sb1;		
	}
	
	public void setsb2(int sb2)
	{
		this.sb2 = sb2;
	}
	
	public int getsb2()
	{	
		 
		 return sb2;		
	}
	public void setsp(int sb2)
	{
		this.sp = sb2;
	}
	
	public int getsp()
	{	
		 
		 return sp;		
	}
	public void setsb3(int sb3)
	{
		this.sb3 = sb3;
	}
	
	public int getsb3()
	{	
		 return sb3;		
	}
	
	public void setsb4(int sb4)
	{
		this.sb4 = sb4;
	}
	
	public int getsb4()
	{	
		
		 return sb4;		
	}
	
	public void setsb5(int sb5)
	{
		this.sb5 = sb5;
	}
	
	public int getsb5()
	{	
		 
		 return sb5;		
	}
	
	public void setsb6(int sb6)
	{
		this.sb6 = sb6;
	}
	
	public int getsb6()
	{	
		 
		 return sb6;		
	}
	
	public void check_grad()
	{
	
		String str = "fail";
		
		sp = 0;
		sp += spn(sb1);
		sp += spn(sb2);
		sp += spn(sb3);
		sp += spn(sb4);
		sp += spn(sb5);
		sp += spn(sb6);
		
		if(sp > 2)
		{
			msg= str;
		}
		else
		{
			int nog=0;
			int GM = 12;
			
			int di = cg(sb1);
			
			if( ! (di > GM) && di!=0)			
			{
				GM -= di;
				setsb1(sb1 + di);
				nog=1;
			}
			
			di = cg(sb2);
		
			if(! (di > GM) && di!=0)			
			{
				GM -= di;
				setsb2(sb2 + di);
				nog += 1;
			}
			di = cg(sb3);
		
			if(! (di > GM) && di!=0)			
			{
				GM -= di;
				setsb3(sb3 + di);
				nog += 1;
			}
			
			di = cg(sb4);
		
			if(! (di > GM) && di!=0)			
			{
				GM -= di;
				setsb4(sb4 + di);
				nog += 1;
			}
			
			di = cg(sb5);
		
			if(! (di > GM) && di!=0)			
			{
				GM -= di;
				setsb5(sb5 + di);
				nog += 1;
			}
			
			di = cg(sb6);
		
			if(! (di > GM) && di!=0)			
			{
				GM -= di;
				setsb6(sb6 + di);
				nog += 1;
			}
			
			
			this.nog=nog;
			
			
		}
	
	}
		public int cg(int m)
		{	
			if( m < 33)
				return 33-m;
			else
				return 0;
		}
		public String cp()
		{
			if(sp == 2 && nog ==2)
			{
				msg="pass with grace: ";
			}
			
			if(sp == 2 && nog ==1)
			{
				msg="re-exam + grace in one subject : ";
			}
			if(sp == 2 && nog ==0)
			{
				msg="re-exam : ";
			}
			if(sp == 1 && nog == 1)
			{
				msg="pass with grace: ";
			}
			if(sp == 1 && nog ==0)
			{
				msg="re-exam : ";
			}
			return msg;
		}
	public int spn(int m)
	{	
		if(m >= 33 && m <= 100)
			return 0;
		else
			return 1;
	}
	
	public String check_percent()
	{
		int p = 0;
		
		p += sb1;
		p += sb2;
		p += sb3;
		p += sb4;
		p += sb5;
		p += sb6;
		
		int r = 0;
		r = p * 100 / 600;
		
		
		if(r <= 32 || sp > 2)
		{
			
			msg = "fail";
		}
		else if(r < 44)
		{
			if(!(cp().equals("re-exam + grace in one subject : ") || cp().equals("re-exam : ")))
					msg = "3 division " + msg;
		}
		
		else if(r < 59)
		{
			if(!(cp().equals("re-exam + grace in one subject : ") || cp().equals("re-exam : ")))
				msg = "2 division " + msg;
		}
		
		else if(r < 74)
		{
			if(!(cp().equals("re-exam + grace in one subject : ") || cp().equals("re-exam : ")))
				msg = "1 division " + msg;
		}
		
		else if(r <= 100)
		{
			if(!(cp().equals("re-exam + grace in one subject : ") || cp().equals("re-exam : ")))
				msg = "Super division " + msg;
		}
		
		return msg;
		
		
	}
	
	/*public int check_grace()
	{
		if(check_grad().equals("pass"))
		{
			grace(sb1);
			System.out.println("Pass with grace : " + sb1);
			
		}
		return ;
	}*/
	
	/*public int grace(int g)
	{
		int a = 0;
		int b =0;
		int c = 0;
		
		if(check_grad().equals("pass"))
		{
			if(g < 33)
			{
			
				 a = g + 12;
				 b = a - 33;
				 c += a - b;
				 
			}
			System.out.println(""+ c);	
		}
		
		return c;
	
	}*/
	

	

}