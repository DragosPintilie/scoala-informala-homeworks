import java.util.Scanner;
public class DaysMonth {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int month, year;
System.out.print("Enter a Month : ");
month = input.nextInt();
System.out.print("Enter A Year : ");
year = input.nextInt();
switch (month) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
System.out.println("Month has 31 days");
break;
    case 4:
    case 6:
    case 9:
    case 11:
System.out.println("Month has 30 days");
break;
    case 2:
if (month == 2 && ((year % 400 == 0) || year % 4 == 0)) {
System.out.println("Month has 29 days");
} else {
System.out.println("Month has 28 days");
}
}
}
