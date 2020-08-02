import java.io.*;
class s1use
{
	public static void main(String[] args)
	{
		Console con=System.console();
		System.out.println("1)- sem");
		System.out.println("2)-year");
		int value=Integer.parseInt(con.readLine("enter the chioce"));
		
			if(value==1)
			{
				s2 s=new s2();
			s.setRollno(Integer.parseInt(con.readLine("enter the number")));
			s.setname(con.readLine("enter the name"));
			s.sets1(s.vm(Integer.parseInt(con.readLine("enter the subject 1 ")),"Subject 1"));
			s.sets2(s.vm(Integer.parseInt(con.readLine("enter the subject 2 ")),"Subject 2"));
			s.sets3(s.vm(Integer.parseInt(con.readLine("enter the subject 3 ")),"Subject 3"));
			s.sets4(s.vm(Integer.parseInt(con.readLine("enter the subject 4 ")),"Subject 4"));
			s.sets5(s.vm(Integer.parseInt(con.readLine("enter the subject 5 ")),"Subject 5"));
			s.sets6(s.vm(Integer.parseInt(con.readLine("enter the subject 6 ")),"Subject 6"));
			s.sets7(s.vm(Integer.parseInt(con.readLine("enter the subject 7 ")),"Subject 7"));
			s.sets8(s.vm(Integer.parseInt(con.readLine("enter the subject 8 ")),"Subject 8"));
			s.sets9(s.vm(Integer.parseInt(con.readLine("enter the subject 9 ")),"Subject 9"));
			s.sets10(s.vm(Integer.parseInt(con.readLine("enter the subject 10 ")),"Subject 10"));
			
			
				System.out.println("\t\t\troll_no ="+s.getRollno());
				System.out.println("\t\t\tname ="+s.getname());
				System.out.println();
				System.out.println();
				System.out.println("Subject\t\tM   \t\tGrade");
				System.out.println();
				System.out.println("Subject 1 \t"+s.gets1()+"\t\t"+s.gr(s.gets1()));
				System.out.println("Subject 2 \t"+s.gets2()+"\t\t"+s.gr(s.gets2()));
				System.out.println("Subject 3 \t"+s.gets3()+"\t\t"+s.gr(s.gets3()));
				System.out.println("Subject 4 \t"+s.gets4()+"\t\t"+s.gr(s.gets4()));
				System.out.println("Subject 5 \t"+s.gets5()+"\t\t"+s.gr(s.gets5()));								
				System.out.println("Subject 6 \t="+s.gets6()+"\t\t"+s.gr(s.gets6()));
				System.out.println("Subject 7 \t="+s.gets7()+"\t\t"+s.gr(s.gets7()));
				System.out.println("Subject 8 \t="+s.gets8()+"\t\t"+s.gr(s.gets8()));
				System.out.println("Subject 9 \t="+s.gets9()+"\t\t"+s.gr(s.gets9()));
				System.out.println("Subject 10 \t="+s.gets10()+"\t\t"+s.gr(s.gets10()));
			}
				else
				{
					year st=new year();
					st.setRollno(Integer.parseInt(con.readLine("enter the roll_no")));
					st.setname(con.readLine("enter the name"));
					st.setsub1(st.vm(Integer.parseInt(con.readLine("enter the subject 1 ")),"Subject 1"));
					st.setsub2(st.vm(Integer.parseInt(con.readLine("enter the subject 2 ")),"Subject 2"));
					st.setsub3(st.vm(Integer.parseInt(con.readLine("enter the subject 3 ")),"Subject 3"));
					st.setsub4(st.vm(Integer.parseInt(con.readLine("enter the subject 4 ")),"Subject 4"));
					st.setsub5(st.vm(Integer.parseInt(con.readLine("enter the subject 5 ")),"Subject 5"));
					st.setsub6(st.vm(Integer.parseInt(con.readLine("enter the subject 6 ")),"Subject 6"));
					
					
					st.vm(st.getsub1(),"subject 1");
					st.vm(st.getsub2(),"subject 2");
					st.vm(st.getsub3(),"subject 3");
					st.vm(st.getsub4(),"subject 4");
					st.vm(st.getsub5(),"subject 5");
					st.vm(st.getsub6(),"subject 6");
					
					System.out.println();
					System.out.println();
					
					st.check_gr();
				System.out.println("student ID"+st.getRollno() + "\t\tname"+st.getname());
				System.out.println("Subject 1 \t"+st.getsub1());
				System.out.println("Subject 2 \t"+st.getsub2());
				System.out.println("Subject 3 \t"+st.getsub3());
				System.out.println("Subject 4 \t"+st.getsub4());
				System.out.println("Subject 5 \t"+st.getsub5());
				System.out.println("Subject 6 \t"+st.getsub6());
			//	System.out.println("Result \t"+st.result());	
			
			System.out.println("GRADE IS  "+st.check_pr());		
				}
		}
				
	
	}



