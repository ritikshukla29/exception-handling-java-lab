//Arithmetic exception
public class JavaExceptionExample{
public  static void main(String args[]){
    try {
        int data=100/0;
    }catch(ArithmeticException e){System.out.println(e);}//sope.toString();e.printStackTrace();sope
    System.out.println("rest of code..");
}
}