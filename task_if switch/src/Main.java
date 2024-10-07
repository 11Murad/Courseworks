import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int number = sc.nextInt();
            if (number > 0 && number < 10) {
                switch (number) {

                    case 1:
                        System.out.println("bir");
                        break;
                    case 2:
                        System.out.println("iki");
                        break;
                    case 3:
                        System.out.println("üç");
                        break;
                    case 4:
                        System.out.println("dörd");
                        break;
                    case 5:
                        System.out.println("beş");
                        break;
                    case 6:
                        System.out.println("altı");
                        break;
                    case 7:
                        System.out.println("yeddi");
                        break;
                    case 8:
                        System.out.println("sekkiz");
                        break;
                    case 9:
                        System.out.println("doqquz");
                        break;
                    case 0:
                        System.out.println("sıfır");
                        break;
                    default:
                        break;
                }
            }
            else if (number > 9 && number < 99) {
                switch (number / 10) {
                    case 1:
                        System.out.print("on");
                        break;
                    case 2:
                        System.out.print("iyirmi");
                        break;
                    case 3:
                        System.out.print("otuz");
                        break;
                    case 4:
                        System.out.print("qırx");
                        break;
                    case 5:
                        System.out.print("əlli");
                        break;
                    case 6:
                        System.out.print("altmış");
                        break;
                    case 7:
                        System.out.print("yetmiş");
                        break;
                    case 8:
                        System.out.print("səksən");
                        break;
                    case 9:
                        System.out.print("doxsan");
                        break;
                    case 0:
                        System.out.print("sıfır");
                        break;
                    default:
                }
                switch (number % 10) {
                    case 1:
                        System.out.println(" bir");
                        break;
                    case 2:
                        System.out.println(" iki");
                        break;
                    case 3:
                        System.out.println(" üç");
                        break;
                    case 4:
                        System.out.println(" dörd");
                        break;
                    case 5:
                        System.out.println(" beş");
                        break;
                    case 6:
                        System.out.println(" altı");
                        break;
                    case 7:
                        System.out.println(" yeddi");
                        break;
                    case 8:
                        System.out.println(" sekkiz");
                        break;
                    case 9:
                        System.out.println(" doqquz");
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("0<99 arası ədəd daxil edin");
            }
        }
    }
}