package DSA1;


import java.util.*;
public class time_12_to_24_hrs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Time in 12 Hrs : 'hh:mm:ssAM/PM' : ");
        String ar = sc.next();
        int h1 = (int)ar.charAt(0) - '0';
        int h2 = (int)ar.charAt(1) - '0';
        System.out.println(h1+" "+h2);
        int hh = (h1 * 10 + h2 % 10);
        System.out.println(hh);
        if( ar.charAt(8) == 'A'){
            if(hh == 12){
                System.out.println("00");
                for(int i = 2; i < 8; i++){
                    System.out.print(ar.charAt(i));
                }
            }else{
                for(int i = 0; i < 8; i++){
                    System.out.print(ar.charAt(i));
                }
            }

        }else{
            if(hh == 12){
                for(int i = 0; i < 8; i++){
                    System.out.print(ar.charAt(i));
                }
            }else{
                hh = hh + 12;
                System.out.print(hh);
                for(int i = 2; i < 8; i++){
                    System.out.print(ar.charAt(i));
                }
            }
        }


    }
}