import java.util.Scanner;
public class student 
{
String usn,name,branch,ph;
Scanner input=new Scanner(System.in);
void read()
		{
			System.out.println("Enter the Student Deatails");
			System.out.println("Enter the USN");
			usn=input.nextLine();
			System.out.println("Enter the Name");
			name=input.nextLine();
			System.out.println("Enter the Branch");
			branch=input.nextLine();
			System.out.println("Enter the Phone No");
			ph=input.nextLine();
		}
		void display()
		{
			System.out.println("\t"+usn+"\t"+name+"\t"+branch+"\t"+ph);
			
		}
	}
	class studentdetails
	{
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Number of Students");
			int num=input.nextInt();
			student s[]=new student[num];
			for(int i=0;i<num;i++)
			{
				s[i]=new student();
				s[i].read();
				
			}
			System.out.println("\t"+"USN"+"\t"+"NAME"+"\t"+"BRANCH"+"\t"+"PHONE NO");
			for(int i=0;i<num;i++)
			{
				System.out.println();
				s[i].display();
			}
		input.close();
		}
	}
			
				
			
			