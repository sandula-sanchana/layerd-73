package org.example;

public class Boy {
    Agreement agreement;

    public void setter(Agreement agreement){//constuctor throught
        this.agreement=agreement;
    }
    public void chatWithGirl(){

        agreement.chat();

    }

    public static void main(String[] args) {
        Boy boy=new Boy();
        boy.setter(new Girl());
        boy.chatWithGirl();
    }
}
