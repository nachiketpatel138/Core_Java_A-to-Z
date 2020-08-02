import java.io.*;
import java.lang.String;


class single_inhertance
{
	public static void main(String...arg)
	{
		System.out.println("1 Semester : ");
		System.out.println("2 Yearly : ");
		Console con=System.console();
		int sn = Integer.parseInt(con.readLine("PLZ Select "));
		
		S2 s = new S2();
		Yearly y = new Yearly();
		if(sn == 1)
		{
	
	
			s.setId(Integer.parseInt(con.readLine("Enter a ID : ")));
			s.setName(con.readLine("Enter a name : "));
			s.sets1(Integer.parseInt(con.readLine("Enter a subject 1 : ")));
		//	s.sets1(s.vm(Integer.parseInt(con.readLine("Enter a subject1 : ")),"Subject 1"););
			s.sets2(s.vm(Integer.parseInt(con.readLine("Enter a subject2 : ")),"Subject 2"));
			s.sets3(s.vm(Integer.parseInt(con.readLine("Enter a subject3 : ")),"Subject 3"));
			s.sets4(s.vm(Integer.parseInt(con.readLine("Enter a subject4 : ")),"Subject 4"));
			s.sets5(s.vm(Integer.parseInt(con.readLine("Enter a subject5 : ")),"Subject 5"));
			
			
			s.vm(s.gets2(),"Subject 2");
			s.vm(s.gets3(),"Subject 3");
			s.vm(s.gets4(),"Subject 4");
			s.vm(s.gets5(),"Subject 5");
			
			System.out.println("\t\tStudent ID : "+s.getId() + "\t\tStudent Name "+s.getName());
			System.out.println();
			System.out.println("Subject\t\tGrade");
			System.out.println("Subject 1\t"+s.grade(s.gets1()));
			System.out.println("Subject 2\t"+s.grade(s.gets2()));
			System.out.println("Subject 3\t"+s.grade(s.gets3()));
			System.out.println("Subject 4\t"+s.grade(s.gets4()));
			System.out.println("Subject 5\t"+s.grade(s.gets5()));
		
			
			//for semester2
	
		
			s.sets6(Integer.parseInt(con.readLine("Enter a subject6 : ")));
			s.sets7(Integer.parseInt(con.readLine("Enter a subject7: ")));
			s.sets8(Integer.parseInt(con.readLine("Enter a subject8 : ")));
			s.sets9(Integer.parseInt(con.readLine("Enter a subject9 : ")));
			s.sets10(Integer.parseInt(con.readLine("Enter a subject10 : ")));

			// for semester 2
			s.vm(s.gets6(),"Subject 6");
			s.vm(s.gets7(),"Subject 7");
			s.vm(s.gets8(),"Subject 8");
			s.vm(s.gets9(),"Subject 9");
			s.vm(s.gets10(),"Subject 10");
			
			// for semester 2	
			System.out.println();
			System.out.println("Subject\t\tGrade");
			System.out.println("Subject 6\t"+s.grade(s.gets6()));
			System.out.println("Subject 7\t"+s.grade(s.gets7()));
			System.out.println("Subject 8\t"+s.grade(s.gets8()));
			System.out.println("Subject 9\t"+s.grade(s.gets9()));
			System.out.println("Subject 10\t"+s.grade(s.gets10()));	
		
	}
		
		// for yearly semester 
			
		else if(sn == 2)
		{
			y.setId(Integer.parseInt(con.readLine("Enter a ID : ")));
			y.setName(con.readLine("Enter a name : "));
			y.setsb1(Integer.parseInt(con.readLine("Enter a subject1 : ")));
			y.setsb2(Integer.parseInt(con.readLine("Enter a subject2: ")));
			y.setsb3(Integer.parseInt(con.readLine("Enter a subject3 : ")));
			y.setsb4(Integer.parseInt(con.readLine("Enter a subject4 : ")));
			y.setsb5(Integer.parseInt(con.readLine("Enter a subject5 : ")));
			y.setsb6(Integer.parseInt(con.readLine("Enter a subject6 : ")));
			
			// for yearly
			
			y.vm(y.getsb1(),"Subject 1");
			y.vm(y.getsb2(),"Subject 2");
			y.vm(y.getsb3(),"Subject 3");
			y.vm(y.getsb4(),"Subject 4");
			y.vm(y.getsb5(),"Subject 5");
			y.vm(y.getsb6(),"Subject 6");
			
		
			System.out.println();
			System.out.println();
			
			y.check_grad();	
			
			System.out.println("\t\tStudent ID : "+y.getId() + "\t\tStudent Name "+y.getName());
			System.out.println();
			System.out.println("Subject\t\t%");
			System.out.println("Subject 1\t"+y.getsb1());
			System.out.println("Subject 2\t"+y.getsb2());
			System.out.println("Subject 3\t"+y.getsb3());
			System.out.println("Subject 4\t"+y.getsb4());
			System.out.println("Subject 5\t"+y.getsb5());
			System.out.println("Subject 6\t"+y.getsb6());
			
			
			System.out.println("GRADE IS: " + y.check_percent());
			
		
		}
	
		
	}
	
		
	
}

