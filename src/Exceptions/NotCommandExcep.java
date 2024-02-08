package Exceptions;

public class NotCommandExcep extends Exception{
    String MyStr;
    public NotCommandExcep(String message,String str){
        super(message);
        this.MyStr = str;
    }
}
