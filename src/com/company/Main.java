package com.company;

public class Main {

    public static void main(String[] args) {
        Runner R=new Runner();
        R.start();
        try {
            R.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }}
//