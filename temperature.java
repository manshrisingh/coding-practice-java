import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Menu:");
        
            System.out.println("1-FtoC");
            System.out.println("2-CtoF");
            System.out.println("3-FtoK");
            System.out.println("4-KtoF");
            System.out.println("5-CtoK");
            System.out.println("6-KtoC");
            System.out.println("0-Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    {
                    System.out.print("Enter temperature in Fahrenheit: ");
                    float temp = scanner.nextFloat();
                    float celsius = (temp - 32) * 5 / 9;
                    System.out.printf("Temperature in Celsius: %.2f\n", celsius);
        // FtoC conversion
                    break;}
                case 2 :{
                    System.out.print("Enter temperature in Celsius: ");
                    float temp = scanner.nextFloat();
                    float fahrenheit = temp * 9 / 5 + 32;
                    System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
        // CtoF conversion
                    break;}
                case 3:{
                    System.out.print("Enter temperature in Fahrenheit: ");
                    float temp = scanner.nextFloat();
                    float kelvin = (temp - 32) * 5 / 9 + 273.15f;
                    System.out.printf("Temperature in Kelvin: %.2f\n", kelvin);
        // FtoK conversion
                    break;}
                case 4:{
                    System.out.print("Enter temperature in Kelvin: ");
                    float temp = scanner.nextFloat();
                    float fahrenheit = (temp - 273.15f) * 9 / 5 + 32;
                    System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
        // KtoF conversion
                    break;}
                case 5:{
                    System.out.print("Enter temperature in Celsius: ");
                    float temp = scanner.nextFloat();
                    float kelvin = temp + 273.15f;
                    System.out.printf("Temperature in Kelvin: %.2f\n", kelvin);
        // CtoK conversion
                    break;}
                case 6:{
                    System.out.print("Enter temperature in Kelvin: ");
                    float temp = scanner.nextFloat();
                    float celsius = temp - 273.15f;
                    System.out.printf("Temperature in Celsius: %.2f\n", celsius);
        // KtoC conversion
                    break;}
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice!=0);
    
    
        scanner.close();
    }
}