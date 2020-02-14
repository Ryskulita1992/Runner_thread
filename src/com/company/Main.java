package com.company;

public class Main {

    public static void main(String[] args) {

        Runner First=new Runner();
        First.start();
        try {
            First.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Runner Second=new Runner();
        Second.start();
        try {
            Second.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runner Third=new Runner();
        Third.start();
        try {
            Third.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runner Fourth=new Runner();
        Fourth.start();
        try {
            Fourth.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Runner Fifth=new Runner();
        Fifth.start();




    }}
//