package javapro6;
import java.util.Scanner;
public class DocDetails {
public static void main(String args[])
{
   int id;
   System.out.println("Enter the id of doctor :");
   Scanner s = new Scanner(System.in);
   id=s.nextInt();
   Physiotherapist p = new Physiotherapist();
   p.getDetails();
   Doctor n = new Doctor();
    if(id>=10 && id<=20)
        p.dis(id);
   if(id>=20 && id<=30)
       n.dis1(id);
    
}
    
}
