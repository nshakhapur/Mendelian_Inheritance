import java.io.*;
class right_left_handedness
{
    void a()
    {
        System.out.println("                               MIX-Matching");
    }
    void input()throws Exception
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter mother's Details");
        
        System.out.println();
        System.out.println("Is she right or left handed ?");
        String hand1=br.readLine();
        hand1=hand1.toLowerCase(); String p1="";
        if(hand1.equals("left"))
        { p1="rr";}
        else if(hand1.equals("right"))
        { p1="RR";}
        else
        {System.out.println("Invalid Entry.\n Please enter again");
         System.out.println("Is she right or left handed ?");
          hand1=br.readLine();
        hand1=hand1.toLowerCase();
        if(hand1.equals("left"))
        { p1="rr";}
        else if(hand1.equals("right"))
        { p1="RR";}
    }
     System.out.println("Enter father's Details");
       
        System.out.println();
        System.out.println("Is he right or left handed ?");
        String hand2=br.readLine();
        hand2=hand2.toLowerCase(); String p2="";
        if(hand2.equals("left"))
        { p2="rr";}
        else if(hand2.equals("right"))
        { p2="RR";}
        else
        {System.out.println("Invalid Entry.\n Please enter again");
         System.out.println("Is she right or left handed ?");
          hand2=br.readLine();
        hand2=hand2.toLowerCase();
        if(hand2.equals("left"))
        { p2="rr";}
        else if(hand2.equals("right"))
        { p2="RR";}
    }
    char a1=p1.charAt(0);
    char a2=p1.charAt(1);
    char b1=p2.charAt(0);
    char b2=p2.charAt(1);
     for(int i=1;i<7;i++)
           { System.out.print("\u000C");
               System.out.print("Loading");
             for(int j=1;j<=5;j++)
                {
                  System.out.print(".");
                  Thread.sleep(70);
                }
                Thread.sleep(10);
             System.out.print("\u000C");
           }
         
         String s1=""+a1+b1;
         String s2=""+a1+b1;
         String s3=""+a2+b1;
         String s4=""+a2+b2;
                              
         System.out.println("This pattern represents how children inherit the trait");
         System.out.println("                     PUNNETT PATTERN(SQUARE)");
         System.out.println("                 ♂/♀ | "+ a1 +" | "+ a2 );
         
         System.out.println("                "+ b1+"   |  "+a1+b1+"  |  "+a2+b1);
         System.out.println("                "+ b2+"   |  "+a1+b2+"  |  "+a2+b2);
         System.out.println();
         System.out.println();
         System.out.println("KEYS");
         System.out.println("♂-Father");
         System.out.println("♀-Mother"); 
         System.out.println("RR-Right handed");
         System.out.println("Rr-Right handed");
         System.out.println("rr-Left handed");
         System.out.println();
         System.out.println();
         
         int x=0;
         int z=0;
         
         
         
         
         
         
         if(s1.equals("RR"))
         { x+=1;}
           if(s2.equals("RR"))
         { x+=1;}
          if(s3.equals("RR"))
         { x+=1;}
          if(s4.equals("RR"))
         { x+=1;}
         if(s1.equals("Rr")||s1.equals("rR"))
         { x+=1;}
           if(s2.equals("Rr")||s2.equals("rR"))
         { x+=1;}
          if(s3.equals("Rr")||s3.equals("rR"))
         { x+=1;}
          if(s4.equals("Rr")||s4.equals("rR"))
         { x+=1;}
         
         
       
          if(s1.equals("rr"))
         {z +=1;}
         if(s2.equals("rr"))
         {z +=1;}
         if(s3.equals("rr"))
         {z +=1;}
         if(s4.equals("rr"))
         {z +=1;}
         int y;
         
         System.out.println("Probability of child being right-handed is "+(x/4)*100+"%");
         System.out.println("Probability of child having left-handed is "+(z/4)*100+"%");
        }
          void exiting()throws Exception
        {
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
            System.out.println("Please press E to go back to mix-matching menu");
            String back=br.readLine();
            back=back.toLowerCase();
            if(back.equals("e"))
            {
                System.out.print("\u000C");
                mix_matching obj= new mix_matching();
                obj.input();
            }
            
        
    }
    void main()throws Exception
    {
        a();
        input();
        exiting();
    }
}
    
    