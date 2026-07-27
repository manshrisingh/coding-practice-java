import java.util.Scanner;
public class Student
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name:");
		String name=sc.nextLine();
		System.out.println("Enter student roll number:");
		int rollNo=sc.nextInt();
		System.out.println("Enter marks for subject 1(0-100)");
		float marks1=sc.nextFloat();
		System.out.println("Enter marks for subject 2(0-100)");
		float marks2=sc.nextFloat();
		System.out.println("Enter marks for subject 3(0-100)");
		float marks3=sc.nextFloat();
		float total=marks1+marks2+marks3;
		float percentage=(total/300)*100;
		System.out.println("\n---student Report---");
		System.out.println("Name          :"+name);
		System.out.println("RollNo        :"+rollNo);
		System.out.println("Subject1 marks:"+marks1);
		System.out.println("Subject2 marks:"+marks2);
		System.out.println("Subject3 marks:"+marks3);
		System.out.println("Total marks  :"+total);
		System.out.printf("Percentage    :%.2f%%%n",percentage);
		sc.close();
	}
}