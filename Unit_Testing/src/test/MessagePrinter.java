package test;

public class MessagePrinter {
    public String message;

    public MessagePrinter(String message){
        this.message = message;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
