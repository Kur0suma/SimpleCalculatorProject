import java.util.Scanner;

public class SimpleCalculatorProject {
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int input1, input2 ;


        System.out.print("first :   ");
        input1 = sc.nextInt();
        System.out.print("second :  ");
        input2 = sc.nextInt();
        
        System.out.print("operator (/, *, -, +):  ");
        String operation = sc.next();
        System.out.println("");

        int result = performOperation(input1, input2, operation);
            System.out.println ("=" + result);
    }

public static int performOperation(int input1, int input2, String operation) {

            int result = 0 ;
            if      ( operation.equals ("+") ) { result = input1 + input2;  }
            else if ( operation.equals ("-") ) { result = input1 + input2;  }
            else if ( operation.equals ("*") ) { result = input1 + input2;  }
            else if ( operation.equals ("/") ) { result = input1 + input2;  } 
            else {System.out.println("Invalid Operation");}
        
        return result;
        }
        


    }
