package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(" На старт, внимание марш!!!");

        Thread r1 = new Thread(new Runner());
        Thread r2 = new Thread();
        Thread r3 = new Thread();
        Thread r4 = new Thread();
        Thread r5 = new Thread();

        r1.start();
        r2.start();
        r3.start();
        r4.start();
        r5.start();

    }
}

//
//        Runner First = new Runner(1);
//        First.start();
//        try {
//            First.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Runner Second = new Runner(2);
//
//
//
//        Runner Third = new Runner(3);
//
//
//        Runner Fourth = new Runner (4);
//
//    }
//
//    Runner Fifth = new Runner (5);
//}
