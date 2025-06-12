// Write a method that throws a checked exception and handle it in the calling method using throws and try-catch.

class MyCheckedException extends Exception{
    String errormessage;

    public MyCheckedException(String message){
        this.errormessage = message;
    }

    @Override
   public String getMessage(){
      return errormessage;
    }
}


public class ActivityTen {
    public static void test(int num) throws MyCheckedException {
        if (num < 0) {
            throw new MyCheckedException("Negative number not allowed");
        } else {
            System.out.println("Number is: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            test(-5); 
        } catch (MyCheckedException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
