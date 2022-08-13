import java.io.*;
class family_tree
{
    void main()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press D to read the instructions about this family tree(preferred) OR C to continue...");
        String s=br.readLine(); s=s.toLowerCase();
   if(s.equals("d"))
   { Ft_instructions obj = new Ft_instructions();
       obj.read();
    }
    System.out.print("\u000C");
    if(s.equals("c"))
    {System.out.println("CHOOSE FROM BELOW...(just enter serial number)");
     System.out.println("1.Hair colour");
     System.out.println("2.Eye colour");
     System.out.println("3.To go back");
int ch=Integer.parseInt(br.readLine());
if(ch==1)
{
    MAIN obj=new MAIN();
    obj.display();
}
if(ch==2)
{
    haircolour obj=new haircolour();
    obj.main();
}
if(ch==3)
{
    eyecolour obj=new eyecolour();
    obj.main();
}
}
Thread.sleep(2500);
System.out.println("\u000C");
}
}

     
        



  