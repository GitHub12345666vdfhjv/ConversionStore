import java.util.*;
class constore{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Conversion store");
        System.out.println("1. Rupees to paise");
        System.out.println("2. Paise to rupees");
        System.out.println("3. Kg to g");
        System.out.println("4. G to kg");
        int cho=sc.nextInt();
        switch(cho){
            case 1:
                System.out.println("Enter the amount in rupees ");
                double n=sc.nextDouble();
                double n1=n*1000;
                System.out.println("result is  "+n1);
                break;
                case 2:
                    System.out.println("Enter the amount in paise ");
                    double n2=sc.nextDouble();
                    double n3=n2/1000;
                    System.out.println("Result is "+n3);
                    break;
                    case 3 :
                         System.out.println("Enter the weight in kilogram");
                double w =sc.nextDouble();
                double c =w*1000.0;
                System.out.println("Result is:  "+c+"g");
                break;
                case 4:
                       System.out.println("Enter the weight in gram");
                 w =sc.nextDouble();
                 c =w/1000.0;
                System.out.println("Result is:  "+c+"kg");
                break;
                default:
                    System.out.println("Invalid option number :0");
        }
    }
}