import java.util.*;
public class SimpleCompoundIntrest {
    public static void main(String[] args) {
        float p,r;
        float t;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount :");
        p = sc.nextFloat();
        System.out.println("enter the rate of intrest : ");
        r = sc.nextFloat();
        System.out.println("enter Time :");
        t = sc.nextInt();
        float  SimpleINtrest, CompoundINtrest;
        SimpleINtrest = (p*t*r)/100;
        System.out.println("**************************************************");
        System.out.println("Simple INtrest : " + SimpleINtrest);
        CompoundINtrest = (float)(p*(Math.pow((1+r/100),t))) - p;
        System.out.println("**************************************************");

        System.out.println("Compound INtrest : " + CompoundINtrest);
        System.out.println("**************************************************");


        

        

    }
}
