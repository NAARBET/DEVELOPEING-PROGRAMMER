package javapro1;

import static java.time.Clock.system;
import java.util.Arrays;

public class Javapro1 {
public static void main(String[] args) {
int a[]={2,3,4,5,6};
int b[]={6,5,4,3,2};
int c=0;
for (int i : a) 
System.out.println(i);
Arrays.equals(a, b);
{
System.out.println("equal");
}
for(int i=0;i<4;i++)
c= c+a[i];
System.out.println(c);
for(int i=0;i<4;i++)
{
  Arrays.sort(b);
  System.out.println(b[i]);
}
        }    
}
