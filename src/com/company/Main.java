package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(" На старт, внимание марш!!!");

        RunnerSec First = new RunnerSec(1);
        First.start();
        try {
            First.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RunnerSec Second = new RunnerSec(2);
        Second.start();
        RunnerSec Third = new RunnerSec(3);
        Third.start();
        RunnerSec Fourth = new RunnerSec(4);
        Fourth.start();
        RunnerSec Fifth = new RunnerSec(5);


    }
}

