import java.util.Scanner;

public class UseOfSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the expression : ");
//        String fruit = in.next();
//
//        switch(fruit) {
//            case "Mango":
//                System.out.println("King of fruits.");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit.");
//                break;
//            case "Grapes":
//                System.out.println("A small green fruit.");
//                break;
//            default:
//                System.out.println("Invalid input!");
//        }

//        System.out.println("Enter the day number : ");
//        int day = in.nextInt();
//
//        switch (day) {
//            case 1 -> System.out.println("The day is Monday.");           //Enhanced switch case.
//            case 2 -> System.out.println("The day is Tuesday.");
//            case 3 -> System.out.println("The day is Wednesday.");
//            case 4 -> System.out.println("The day is Thursday.");
//            case 5 -> System.out.println("The day is Friday.");
//            case 6 -> System.out.println("The day is Saturday.");
//            case 7 -> System.out.println("The day is Sunday.");
//            default -> System.out.println("Invalid day!");
//        }

//        System.out.println("Enter the day number : ");
//        int day = in.nextInt();
//
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("These are weekdays.");
//                break;
//            case 6:
//            case 7:
//                System.out.println("These are weekends.");
//                break;
//            default:
//                System.out.println("Invalid day!");
//                break;
//        }

        //Nested switch case.
        System.out.println("Enter employee id : ");
        int empId = in.nextInt();
        System.out.println("Enter department : ");
        String dept = in.next();

        switch(empId) {
            case 1:
                System.out.println("Katyayini Singh.");
                break;
            case 2:
                System.out.println("Shatakshi Singh");
                break;
            case 3:
                System.out.println("Kunal Kushwaha.");
                switch(dept) {
                    case "IT":
                        System.out.println("IT department.");
                        break;
                    case "Finance":
                        System.out.println("Finance department.");
                        break;
                    default:
                        System.out.println("Wrong department entered.");

                }
                break;
            default:
                System.out.println("Invalid employee ID!");
        }
    }
}
