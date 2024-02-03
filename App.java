import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st Grade: ");
        float grade1 = scanner.nextFloat();
        System.out.print("Enter Units for 1st Grade: ");
        int units1 = scanner.nextInt();

       System.out.print("Enter 2nd Grade: ");
        float grade2 = scanner.nextFloat();
        System.out.print("Enter Units for 2nd Grade: ");
        int units2 = scanner.nextInt();

        System.out.print("Enter 3rd Grade: ");
        float grade3 = scanner.nextFloat();
        System.out.print("Enter Units for 3rd Grade: ");
        int units3 = scanner.nextInt();

      
        scanner.close();

     
        double totalGradePoints = (grade1 * units1) + (grade2 * units2) + (grade3 * units3);
        int totalUnits = units1 + units2 + units3;
        double qpi = totalGradePoints / totalUnits;

        System.out.println("QPI = " + qpi);
    }



    }


