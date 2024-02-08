import java.util.Scanner;

public class UsingMaths {
    public static void main(String[] args) {
        int a;
        double b;
        int trigo;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of integer : ");
        a= sc.nextInt();
        System.out.println("enter the value of double : ");
        b = sc.nextDouble();
        System.out.println("enter the value of trignomertic value : ");
        trigo= sc.nextInt();
        System.out.println(" square root of "+a+" :"+Math.sqrt(a));
        System.out.println("absolute value of "+b+" :-"+Math.abs(b));
        System.out.println("value of sin("+trigo+") :- "+Math.sin(trigo));
        System.out.println("value of cos("+trigo+") :- "+Math.cos(trigo));
        System.out.println("value of tan("+trigo+") :- "+Math.tan(trigo));
        System.out.println("value of e^"+a+" :- "+Math.exp(a));
        System.out.println("Square of "+a+" :- "+Math.pow(a, 2));


    }
}
