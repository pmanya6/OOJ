import CIE.Student;
import CIE.Internals;
import SEE.Externals;
import java.util.Scanner;
public class Final
{
public static void main(String xx[])
{
Scanner S1=new Scanner(System.in);
int n;
System.out.println("Enter the value of n");
n=S1.nextInt();
CIE.Student S[]=new CIE.Student[n];
CIE.Internals I[]=new CIE.Internals[n];
SEE.Externals E[]=new SEE.Externals[n];
for (int i=0;i<n;i++)
{
S[i]=new CIE.Student();
I[i]=new CIE.Internals();
E[i]=new SEE.Externals();
S[i].accept();
I[i].accept();
E[i].accept();
S[i].display();
I[i].display();
E[i].display();
for (int j=0;j<5;j++)
{
int finalmarks=I[i].IMarks[j]+E[i].EMarks[j];
System.out.println("Marks in :"+(i+1)+"subject is"+finalmarks);
}
}
}
}