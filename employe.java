package employe;
import java.util.Scanner;

public class employe {
	int eno;
	String ename;
	double esalary;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id ");
		eno=sc.nextInt();
		System.out.println("enter name");
		ename=sc.next();
		System.out.println("enter salary");
		esalary=sc.nextDouble();
	}
	void display()
	{
		System.out.println("employee id is : "+ eno);
		System.out.println("employee name is : "+ ename);
		System.out.println("employee salary is : "+ esalary);
	}
	

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int i,n,c,f=0;
		System.out.println("enter the number of employees");
		n=sc1.nextInt();
		employe e[]=new employe[n];
		for(i=0;i<n;i++) {
			e[i]=new employe();
			e[i].getdata();
		}
		System.out.println("Employee details are :\n");
		for(i=0;i<n;i++) {
			e[i].display();
		}
		System.out.println("Enter the id to be search");
		c=sc1.nextInt();
	for(i=0;i<n;i++) {
		if(c==e[i].eno) {
			f=1;
			break;
		}
	}
	if(f==1) {
		System.out.println("details of employee is ");
		e[i].display();
	}
	else
		System.out.println("item isnt found");	

	}
}
