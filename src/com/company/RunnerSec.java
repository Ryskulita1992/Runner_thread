//package com.company;
//
//public class RunnerSec  extends  Thread {
//    int id;
//
//
//    public RunnerSec(int id) {
//        this.id = id;
//    }
//
//    public int getId(int id) {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    @Override
//
//    public void run() {
//        try {
//            while (id == 5) {
//
//                int next = id + 1;
//                System.out.println("Runner " + getId(id) + " Берёт палочку и бежит к Runner " + next);
//                // sleep(1000);
//                // int previous = id - 1;
//                System.out.println("Runner 5 бежит к Runner 4");
//                //System.out.println("Runner " + getId(id) + " Берёт палочку и бежит к Runner " + previous);
//                System.out.println("Runner 5 берет палочку бежит к финишу");
//            } //catch (InterruptedException i) {
//            System.out.println(" ");
//        }
//    }
//}
//
//
//
//
//
