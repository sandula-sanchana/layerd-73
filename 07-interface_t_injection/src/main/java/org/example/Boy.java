package org.example;

public class Boy implements Di{
    Agreement agreement;
    public void chatWithGirl(){

        agreement.chat();

    }

    public static void main(String[] args) {
        Boy boy=new Boy();
        boy.chatWithGirl();
    }

    @Override
    public void Inject(Agreement agreement) {
         this.agreement=agreement;
    }
}
