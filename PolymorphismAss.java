/* java assignment for Polymorphism
comparing two numbers and three number using same method name
 */
public class PolymorphismAss {
   int num1, num2, num3;

    public void findingLargestNum(int num1, int num2) {
        // comparing two numbers to find the biggest number
        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        } else {
            System.out.println("The largest number is: " + num2);
        }
    }
   public void findingLargestNum(int num1, int num2, int num3){
        //comparing three number to find the biggest number
       if (num1 > num2 && num1 > num3)
           System.out.println("The largest number is: "+num1);
       else if (num2 > num1 && num2 > num3)
           System.out.println("The largest number is: "+num2);
       else if (num3 > num1 && num3 > num2)
           System.out.println("The largest number is: "+num3);
       else
           System.out.println("The numbers are same.");
   }
}
class LargestApp extends PolymorphismAss{
    public static void main(String[]args){
        PolymorphismAss ps = new PolymorphismAss();
        // calling methods with different number of arguments
        ps.findingLargestNum(345,567);
        ps.findingLargestNum(25,56,78);
        }
        }