import java.io.*;
class mix_matching
{
    void input()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME TO THE MOST INTERESTING PART OF THE GENE APP");
        System.out.println("Please I suggest you to read the basics before you startup with the Mix-Matching");
        System.out.println("                               MIX-MATCHING ");
        System.out.println("Please choose which trait you want to mix-match by just typing its serial number");
        System.out.println("1.Hair colour");
        System.out.println("2.Eye colour");
        System.out.println("3.Right/Left-Handedness");
        System.out.println("4.Diseases");
         System.out.println("5.Blood Group");
         System.out.println("6.Back to main menu");
        int n=Integer.parseInt(br.readLine());
        System.out.print("\u000C");
        for(int i=1;i<7;i++)
           { 
               System.out.println("Loading Please Wait");
             for(int j=1;j<=11;j++)
                {
                  System.out.print(".");
                  Thread.sleep(70);
                }
                Thread.sleep(10);
             System.out.print("\u000C");
           }
           if(n==1)
           {
              hair_colour obj= new hair_colour();
               obj.main();
            }
            if(n==2)
            {
                eye_colour obj= new eye_colour();
                obj.main();
            }
            if(n==3)
            {
                right_left_handedness obj=new right_left_handedness();
                obj.main();
            }
            if(n==4)
            {
                disease obj=new disease();
                obj.input();
            }
            if(n==5)
            {
                 Blood_grp obj=new Blood_grp();
                 obj.input();
            }
            if(n==6)
            {
                MAIN obj=new MAIN();
                obj.display();    }
}
}
        