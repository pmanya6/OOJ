package SEE;
import CIE.Student;
import java.util.Scanner;
public class Externals extends Student
{
public int EMarks[]=new int[5];

public void accept()
{
System.out.println("Enter marks in 5 subjects:");
Scanner S1=new Scanner(System.in);
for (int i=0;i<5;i++)
{
System.out.println("Marks in :"+(i+1)+"subject is");
EMarks[i]=S1.nextInt();
}
}
public void display()
{
System.out.println("External details");
for(int i=0;i<5;i++)
{
System.out.println("Marks in :"+(i+1)+"subject is"+EMarks[i]);
}
}
}
