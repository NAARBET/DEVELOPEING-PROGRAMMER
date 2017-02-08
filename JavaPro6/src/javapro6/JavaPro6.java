package javapro6;
public class JavaPro6 {
int id1,id2,add,add1;
String name1,name2,name3,name4,Open,open,specialist;
public void getDetails()
    {
        id1=11;
        name1="Anand Hospital";
        add=45547777;
        name2="Anand";
        specialist="Physiotherapist";
        Open="12PM to 4PM";
        id2=22;
        name3="Arul Hospital";
        add1=345444224;
        name4="James";
        specialist="Psycotherapist";
        open="10AM to 6PM";
    }
}
class Physiotherapist extends JavaPro6
{
  public void dis(int id)
    {
          if(id1==id)
            {
                System.out.println("Doctor details");
                System.out.println("Reg id : " + id1);
                System.out.println("Hospital name : " + name1);
                System.out.println("Doctor name : " + name2);
                System.out.println("aadhar id : " + add);
                System.out.println("Specialization : " + specialist);
                System.out.println("Available timings : " + Open);
            
            }
        }
}
class Doctor extends JavaPro6
{
    public void dis1(int id)
    {
        if(id2==id)
            {
                System.out.println("Reg id : " + id2);
                System.out.println("Hospital name : " + name3);
                System.out.println("Doctor name : " + name4);
                System.out.println("aadhar id : " + add1);
                System.out.println("Specializtion : " + specialist);
                System.out.println("Available timings : " + open);
            }
    }
}


    


