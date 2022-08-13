import java.io.*;
class Ft_instructions
{
    void read()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("DETAILS");
        System.out.println("This is small family tree which makes the concept of study of distribution of gene much more easy.");
        System.out.println(" Enter the details of Mother followed by the Father.");
        Thread.sleep(2500);
        System.out.println(" This software then presents you the family tree consisting of four children out of which two are boys and two are girls.");
        System.out.println(" These four children each represents the probability of 25%.");
        System.out.println(" Now that you know this family tree is the small representation of punnett square, we suggest you to");
        System.out.println(" enter brown/grey colour for both the parents to see some intresting results!");
        System.out.println("\n\n\n");
        Thread.sleep(2500);
        System.out.println("Press Enter to continue");
        String s=br.readLine();
        if(s.equals(""))
        {
             System.out.println("\u000C");
            family_tree obj=new family_tree();
            obj.main();
        }
    }
}
