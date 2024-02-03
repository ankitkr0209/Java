import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter number of subject ");
        // int  n = sc.nextInt();
        float m,c,p,h,e;
        System.out.println("Enter the marks of each subject ");
        System.out.print("\n enter the marks of maths = ");
        m = sc.nextFloat();
        System.out.print("\n enter the marks of chemistry = ");
        c = sc.nextFloat();
        System.out.print("\n enter the marks of physics = ");
        p = sc.nextFloat();
        System.out.print("\n enter the marks of hindi = ");
        h = sc.nextFloat();
        System.out.print("\n enter the marks of english = ");
        e = sc.nextFloat();
        float sum = m+c+p+h+e;
        float percentage = (sum/500)*100;
        System.out.print("\n total marks :- "+sum);
        System.out.print("\n percentage :- "+percentage);

    }
}
