package org.example;

public class Girl implements Agreement {
    public void chat(){
        System.out.println("chat");
    }

    @Override
    public void chatNimal() {
        System.out.println("nimal");
    }
}
