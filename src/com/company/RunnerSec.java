package com.company;

public class RunnerSec  extends  Thread{
    int id;

    public RunnerSec(int id) {
        this.id = id;}

    public int getId(int id) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override

    public void run(){

        int next=id+1;
        try {
            System.out.println("Runner " + getId(id) + " Берёт палочку и бежит к Runner " + next);
            System.out.println("Runner 5 берет палочку бежит к финишу" );
            sleep(1000);
            System.out.println("Runner 5 бежит к Runner 4");
            sleep(1000);
        }catch (InterruptedException e){
            System.out.println(" Прервано");
        }try {
            int previous=id-1;
            System.out.println("Runner " + getId(id) + " Берёт палочку и бежит к Runner " + previous);
            sleep(1000);
        }catch (InterruptedException e){}

      System.out.println("Финиш!!!");
    }


}


