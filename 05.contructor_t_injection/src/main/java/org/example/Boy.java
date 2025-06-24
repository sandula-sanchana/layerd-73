package org.example;

public class Boy {
    Agreement agreement;

    public Boy(Agreement agreement){//constuctor throught
        this.agreement=agreement;
    }
    public void chatWithGirl(){

        agreement.chat();

    }

    public static void main(String[] args) {
        Boy boy=new Boy(new Girl());
        boy.chatWithGirl();
    }
}
