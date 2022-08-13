import java.io.*;
class instructions
{
    void read()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INSTRUCTIONS");
        System.out.println();
        System.out.println("1.This quiz consists of 10 questions. If you answer question correctly then");
        System.out.println("  20 marks will be awarded");
        
        System.out.println("2.You have NO TIME LIMIT to answer each question");
        System.out.println("3.Once you get into the quiz, you can't leave it in middle");
        System.out.println("4.You should go through the basics before taking up the quiz");
        System.out.println("5.Every next question will e displayed after 5 seconds so please wait");
        System.out.println("6.Now, if you are clear with instruction, then press Enter and give it GO!");
        String s=br.readLine();
        if(s.equals(""))
        {
            quiz obj=new quiz();
            obj.QUIZ_menu();
        }
        else
        {
            System.out.println("Invalid...Enter again");
            s=br.readLine();
            if(s.equals(""))
        {
            quiz obj=new quiz();
            obj.QUIZ_menu();
        }
    }
}
}
    


