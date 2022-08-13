import java.io.*;
class disease
{
    void a()
    {
        System.out.println("                               MIX-Matching");
    }
    void input()throws Exception
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\u000C");
        System.out.println("                               MIX-Matching");
        System.out.println("There are many genetically linked disease. Some of these diease pass only from mother to son");
        System.out.println("or from father to son or from both the parents.");
        System.out.println("Please choose the disease. Just type the serial number.");
        System.out.println("1.Mother-linked disease: Mother is the carriers(X°X) and father donot have any disease(XY)");
        
        System.out.println("2.Father-linked disease: Mother is neither the carriers nor have any disease(XX) but father has the disease(XY°)");
        System.out.println("3.to Go back to mix-matching menu");
        int n=Integer.parseInt(br.readLine());
        System.out.print("\u000C");
        for(int i=1;i<7;i++)
           { 
               System.out.println("A moment please");
             for(int j=1;j<=11;j++)
                {
                  System.out.print("=");
                  Thread.sleep(70);
                }
                Thread.sleep(10);
             System.out.print("\u000C");
           }
           if(n==1)
           {
               m_linked();}
               if(n==2)
               {
                   f_linked();}
                   if(n==3)
                   { System.out.println("\u000C");
                       mix_matching obj= new mix_matching();
                obj.input();}
                   
        }
        void m_linked()throws Exception
        {
             BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
             System.out.println("                           Mother-linked disease");
             System.out.println("In this type the mother is the carrier(a person who carries it but does not show the disease)");
             System.out.println("and son only gets affected by this disease( in very very rarely daughters).");
             System.out.println("Fathers here cannot be the carrier.");
             System.out.println("Diseases that can be entered are:");
             System.out.println("1.Colour-Blindeness \n2.Haemophilia");
             System.out.println("Please enter the disease:");
             int choice=Integer.parseInt(br.readLine());
             String p1="",p2="";
             if(choice==1)
             { p1="X°X";
                 p2="XY";
                }
                else if(choice==2)
                { p1="X°X";
                    p2="XY";
                }
                else
                {
              System.out.println("Inavlind entry. Enter Again");
              System.out.println("Please enter the disease(in text):");
             choice=Integer.parseInt(br.readLine());
              if((choice==1))
             { p1="X°X";
                 p2="XY";
                }
                else if(choice==2)
                { p1="X°X";
                    p2="XY";
                }
                else
                {
                    System.out.println("\u000C");
                    mix_matching obj= new mix_matching();
                obj.input();
            }
        }
        
        char a1=p1.charAt(0);
         char a=p1.charAt(1);
         char A=p1.charAt(2);
         String a2=""+a+A;
          char b1=p2.charAt(0);
         char b2=p2.charAt(1);
         
         for(int i=1;i<7;i++)
           { 
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
         String s3="" +a2+b1;
         String s4=""+a2+b2;
                              
         System.out.println("This pattern represents how children inherit the trait");
         System.out.println("                     PUNNETT PATTERN(SQUARE)");
         System.out.println("                 ♂/♀ | "+ a1 +" | "+ a2 );
         
         System.out.println("                "+ b1+"   |  "+a1+b1+"  |  "+a2+b1);
         System.out.println("                "+ b2+"   |  "+a1+b2+"  |  "+a2+b2);
         System.out.println();
         System.out.println();
         System.out.println("KEYS");
         System.out.println("♂-Father(Normal)");
         System.out.println("♀-Mother(carrier"); 
         System.out.println("XX-NormalDaughter");
         System.out.println("°XX-Carrier Daughter");
         System.out.println("XY-Normal Son");
         System.out.println("°XY-Son who has the disease");
         System.out.println("'°'-represents the presence of the genes containing the disease");
         System.out.println("Carrier means person has the gene of the disease, but gene remains suppressed");
         System.out.println("and person remains unaffected by the diease.");
         System.out.println();
         System.out.println();
        if(choice==1)
        {
         System.out.println("Probability of daughter being carrier of colour-blindness is "+"25%");
         System.out.println("Probability of daughter being normal(not a carrier) is "+"25%");
         System.out.println("Probability of son being colour-blind is "+"25%");
         System.out.println("Probability of son being normal is "+"25%");
        }
        if(choice==2)
        {
        System.out.println("Probability of daughter being carrier of haemophilia is "+"25%");
         System.out.println("Probability of daughter being normal(not a carrier) is "+"25%");
         System.out.println("Probability of son being haemophilia is "+"25%");
         System.out.println("Probability of son being normal is "+"25%");
        }
        System.out.println("Press Enter to go back to previous menu");
        String go=br.readLine();
        if(go.equals(""))
        {
            input();
        }
    }
     void f_linked()throws Exception
        {
             BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
             System.out.println("                          Father-linked disease");
             System.out.println("In this type the father has the disease and passes the disease genes to son.");
             System.out.println("Daughter remains unaffected by this. They are not even carriers(a person who carries it but does not show the disease) in this case. ");
             System.out.println("Mothers have no role in transmitting this disease.");
             System.out.println("Diseases that can be entered are:");
             System.out.println("1.Factor Baldness \n2.Hyper criosis of ear(growth of hair in ears)");
             System.out.println("Please enter the disease");
             int choice=Integer.parseInt(br.readLine());
             String p1="",p2="";
             if(choice==1)
             { p1="XX";
                 p2="XY°";
                }
                else if(choice==2)
                { p1="XX";
                    p2="XY°";
                }
                else
                {
              System.out.println("Inavlind entry. Enter Again");
              System.out.println("Please enter the disease(in text):");
             choice=Integer.parseInt(br.readLine());
              if((choice==1))
             { p1="XX";
                 p2="XY°";
                }
                else if(choice==2)
                { p1="XX";
                    p2="XY°";
                }
                else
                {
                    mix_matching obj= new mix_matching();
                obj.input();
            }
        }
        
        char a1=p1.charAt(0);
        char a2=p1.charAt(1);
        char b1=p2.charAt(0);
        char b=p2.charAt(1);
        char B=p2.charAt(2);
        String b2=""+b+B;
         for(int i=1;i<7;i++)
           { 
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
         String s3="" +a2+b1;
         String s4=""+a2+b2;
                              
         System.out.println("This pattern represents how children inherit the trait");
         System.out.println("                     PUNNETT PATTERN(SQUARE)");
         System.out.println("                 ♂/♀ | "+ a1 +" | "+ a2 );
         
         System.out.println("                "+ b1+"  |  "+a1+b1+"  |  "+a2+b1);
         System.out.println("                "+ b2+"  |  "+a1+b2+"  |  "+a2+b2);
         System.out.println();
         System.out.println();
         System.out.println("KEYS");
         System.out.println("♂-Father(Normal-cc/hh)");
         System.out.println("♀-Mother(carrier-C°C/H°H"); 
         System.out.println("XX-Normal Daughter");
         System.out.println("XY°-Son having disease.");
         
         System.out.println("'°'-denotes the presence of the gene of the disease.");
         System.out.println();
         System.out.println();
         
        if(choice==1)
        {
         System.out.println("Probability of daughter being normal(not a carrier) is "+"50%");
         System.out.println("Probability of son having factor baldness is "+"50%");
        }
        if(choice==2)
        {
        
         System.out.println("Probability of daughter being normal(not a carrier) is "+"50%");
         System.out.println("Probability of son having hyper criosis is "+"50%");
        
        }
        System.out.println("Press Enter to go back to previous menu");
        String go=br.readLine();
        if(go.equals(""))
        {
            input();
        }
    }
}

       
                
                
                 
                 
             
             
        