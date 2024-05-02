public class estFinallyBlock2 {
    public static void main(String[] args) {
        try{
            System.out.println("inside the try block");
            int data=25/0;
            System.out.println(data);
        }
        catch(ArithmeticException e){
            System.err.println("Exception handled");
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of code...");
    }
}    