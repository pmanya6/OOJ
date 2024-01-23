package CIE;
import java.util.Scanner;

public class Student
{
int USN;
String Name;
int Sem;
Scanner S1=new Scanner(System.in);
public void accept()
{
System.out.println("Enter the usn:");
USN=S1.nextInt();
System.out.println("Enter the Name:");
Name=S1.next();
System.out.println("Enter the Sem:");
Sem=S1.nextInt();
}
public void display()
{
System.out.println("Name is:"+Name);
System.out.println("USN is:"+USN);
System.out.println("Sem is:"+Sem);
}
}




