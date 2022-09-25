import java.util.*;

/**
 *
 * @author yewch
 */
public class TestCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total quantity: ");

        // validation for total Quantity
        while (!sc.hasNextInt()) { // check if user enters not digit
            System.out.println("Please ensures that you are entering digit or integer");
            System.out.print("Enter total quantity again: ");
            sc.next(); // in order to let user enter value again, if not it will loop non stop
        }
        int totalQuantity = sc.nextInt(); // in order to store the total quantity

        while (totalQuantity <= 0) { // validate if it is <= 0
            System.out.println("No negative number or zero is allowed");
            System.out.print("Enter total quantity again: ");

            while (!sc.hasNextInt()) { // check if user enters not digit
                System.out.println("Please ensures that you are entering digit or integer");
                System.out.print("Enter total quantity again: ");
                sc.next(); // in order to let user enter value again, if not it will loop non stop
            }
            totalQuantity = sc.nextInt(); // in order to store the total quantity
        }

        System.out.print("Enter adult quantity: ");

        // validation for adult quantity
        while (!sc.hasNextInt()) { // check if user enters not digit
            System.out.println("Please ensures that you are entering digit or integer");
            System.out.print("Enter adult quantity again: ");
            sc.next(); // in order to let user enter value again, if not it will loop non stop
        }
        int adultQuantity = sc.nextInt(); // in order to store the adult quantity

        while (adultQuantity < 0 || totalQuantity < adultQuantity) { // validate because it must have the adult quantity
                                                                     // that more than total quantity
            System.out.println("No negative number is allowed or unmatched to the total quantity");
            System.out.print("Enter adult quantity again: ");

            while (!sc.hasNextInt()) { // check if user enters not digit
                System.out.println("Please ensures that you are entering digit or integer");
                System.out.print("Enter adult quantity again: ");
                sc.next(); // in order to let user enter value again, if not it will loop non stop
            }
            adultQuantity = sc.nextInt(); // in order to store the adult quantity
        }

        totalQuantity -= adultQuantity;
        System.out.print("Enter Children quantity: ");

        // validation for children quantity
        while (!sc.hasNextInt()) { // check if user enters not digit
            System.out.println("Please ensures that you are entering digit or integer");
            System.out.print("Enter Children quantity again: ");
            sc.next(); // in order to let user enter value again, if not it will loop non stop
        }
        int childQuantity = sc.nextInt(); // in order to store the children quantity

        while (childQuantity < 0 || totalQuantity < childQuantity) { // validate because it must have the children
                                                                     // quantity that more than total quantity
            System.out.println("No negative number is allowed or unmatched to the total quantity");
            System.out.print("Enter Children quantity again: ");

            while (!sc.hasNextInt()) { // check if user enters not digit
                System.out.println("Please ensures that you are entering digit or integer");
                System.out.print("Enter Children quantity again: ");
                sc.next(); // in order to let user enter value again, if not it will loop non stop
            }
            childQuantity = sc.nextInt(); // in order to store the children quantity
        }

        totalQuantity -= childQuantity;
        System.out.print("Enter Student quantity: ");

        // validation for student quantity
        while (!sc.hasNextInt()) { // check if user enters not digit
            System.out.println("Please ensures that you are entering digit or integer");
            System.out.print("Enter Student quantity again: ");
            sc.next(); // in order to let user enter value again, if not it will loop non stop
        }
        int studentQuantity = sc.nextInt(); // in order to store the student quantity

        while (studentQuantity < 0 || totalQuantity != studentQuantity) { // validate because it must have the student
                                                                          // quantity that more than total quantity
            System.out.println("No negative number is allowed or unmatched to the total quantity");
            System.out.print("Enter Student Student again: ");

            while (!sc.hasNextInt()) { // check if user enters not digit
                System.out.println("Please ensures that you are entering digit or integer");
                System.out.print("Enter Student quantity again: ");
                sc.next(); // in order to let user enter value again, if not it will loop non stop
            }
            studentQuantity = sc.nextInt(); // in order to store the student quantity
        }
        totalQuantity -= studentQuantity;

        // to pass value into customer class and those sub-classes for claculations
        // purpose
        Customer adult = new Adult(adultQuantity, childQuantity, studentQuantity);
        Customer child = new Children(adultQuantity, childQuantity, studentQuantity);
        Customer student = new Student(adultQuantity, childQuantity, studentQuantity);

        // to check the display value whether works or not. (it works by the way)
        System.out.println(adult.toString());
        System.out.println(child.toString());
        System.out.println(student.toString());
        sc.close();
    }
}
