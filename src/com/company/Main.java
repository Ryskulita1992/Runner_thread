package com.company;

public class Main {

    public static void main(String[] args) {



            for (int i = 1; i <=6 ; i++) {
                Runner rn = new Runner(" Runner" + i ) ;
                System.out.println("Runner " +  i  + "  " +"берет палочку"  + " "+ "бежит к Runner"+  ++i);
                try{Thread.sleep(5000);
                }catch(InterruptedException e){System.out.println(e);
            rn.start();





                    }
                }
            }
    }

