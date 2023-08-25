package DSA1.NQTRepeated;

public class NcoinCount {
    public static void main(String[] args) {
        count(10);
        count(13);
        count(4);
    }
    static void count(int n){
        int one = 1, two =0 ;
        int five = (n-4)/5; // 10 - 4 = 5 / 5 = 1 -> 5-1,2-2,1-1
        if((n-5*five) % 2 == 0) // 13 - 5 = 8 * 1 = 8  -> 5-1, 2-3, 1-2
            one = 2;
        two = (n-5*five-one)/2; //10 - 5 = 5 * 1 = 5 - 1 = 4 / 2 = 2

        System.out.println("total coins="+one+two+five);
        System.out.println("1"+one);
        System.out.println("2"+two);
        System.out.println("5"+five);
    }
}
