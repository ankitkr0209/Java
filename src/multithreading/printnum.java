// printing number 1 to  100 serially using ten Threads


package multithreading;

import java.lang.Thread;

class t1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

class t2 extends Thread {

    public void run() {
        try {
            sleep(200);
        } catch (Exception e) {
        }
        for (int i = 10; i < 20; i++) {
            System.out.println(i);
        }
    }
}

class t3 extends Thread {

    public void run() {
        try {
            sleep(300);
        } catch (Exception e) {
        }
        for (int i = 20; i < 30; i++) {
            System.out.println(i);
        }
    }
}

class t4 extends Thread {

    public void run() {
        try {
            sleep(400);
        } catch (Exception e) {
        }
        for (int i = 30; i < 40; i++) {
            System.out.println(i);
        }
    }
}

class t5 extends Thread {

    public void run() {
        try {
            sleep(500);
        } catch (Exception e) {
        }
        for (int i = 40; i < 50; i++) {
            System.out.println(i);
        }
    }
}

class t6 extends Thread {

    public void run() {
        try {
            sleep(600);
        } catch (Exception e) {
        }
        for (int i = 50; i < 60; i++) {
            System.out.println(i);
        }
    }
}

class t7 extends Thread {

    public void run() {
        try {
            sleep(700);
        } catch (Exception e) {
        }
        for (int i = 60; i < 70; i++) {
            System.out.println(i);
        }
    }
}

class t8 extends Thread {

    public void run() {
        try {
            sleep(800);
        } catch (Exception e) {
        }
        for (int i = 70; i < 80; i++) {
            System.out.println(i);
        }
    }
}

class t9 extends Thread {

    public void run() {
        try {
            sleep(900);
        } catch (Exception e) {
        }
        for (int i = 80; i < 90; i++) {
            System.out.println(i);
        }
    }
}

class t10 extends Thread {

    public void run() {
        try {
            sleep(1000);
        } catch (Exception e) {
        }
        for (int i = 90; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

public class printnum {

    public static void main(String[] args) {
        t1 n1 = new t1();
        t2 n2 = new t2();
        t3 n3 = new t3();
        t4 n4 = new t4();
        t5 n5 = new t5();
        t6 n6 = new t6();
        t7 n7 = new t7();
        t8 n8 = new t8();
        t9 n9 = new t9();
        t10 n10 = new t10();
        n1.start();
        n2.start();
        n3.start();
        n4.start();
        n5.start();
        n6.start();
        n7.start();
        n8.start();
        n9.start();
        n10.start();

    }
}