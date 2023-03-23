import java.util.*;

public class Main {

    public static void main(String[] args) {
        int max=-1, min=21;
        for(int i=0; i<5; i++)
        {
            int in=input();
            if(in>max)
                max=in;
            if(in<min)
                min=in;
            System.out.println("The value is : " +in);
        }
        System.out.println("The minimum value is : " +min);
        System.out.println("The maximum value is : " +max);

    }
    public static int input()
    {
        int buffer=30;
        while(buffer<=0 || buffer>=20){
            System.out.print("veuillez entrer le nombre entre 0 et 20 : ");
            Scanner in = null;
            in = new Scanner (System.in);
            buffer = in.nextInt();
        }
        return buffer;

    }

}