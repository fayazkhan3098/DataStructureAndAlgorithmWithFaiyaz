package DSA.Recursion.Patterns;

public class diamond {
    public static void main(String[] args) {
        Diamond1(4,0);
        Diamond2(4,0);
    }
    public static void Diamond1(int r, int c) {
        if (r == 0)return;
        if(r > c) {
            System.out.print("* ");
            Diamond1(r,c+1);
        }else {
            System.out.println();
            Diamond1(r-1,0);
        }
    }

    public static void Diamond2(int r, int c) {
        if (r == 0)return;
        if(r > c) {
            Diamond2(r,c+1);
            System.out.print("* ");
        }else {
            Diamond2(r-1,0);
            System.out.println();

        }
    }
}
