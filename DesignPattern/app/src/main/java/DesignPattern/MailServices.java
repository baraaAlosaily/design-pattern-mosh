package DesignPattern;

public class MailServices {
    public void sendEmail(){
        connect();
        disconnect();
        authentication();
    }
    private void connect(){
        System.out.println("connect");
    }
    private void disconnect(){
        System.out.println("disconnect");
    }
    private void authentication(){
        System.out.println("authentication");
    }
}
