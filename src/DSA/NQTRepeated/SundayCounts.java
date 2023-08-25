/*
TCS NQT Coding Question Day 1 Slot 2 – Question 1
Jack is always excited about sunday. It is favourite day, when he gets to play all day.
And goes to cycling with his friends.

So every time when the months starts he counts the number of sundays he will get to enjoy.
Considering the month can start with any day, be it Sunday, Monday…. Or so on.

Count the number of Sunday jack will get within n number of days.

 Example 1:

Input

mon-> input String denoting the start of the month.

13  -> input integer denoting the number of days from the start of the month.

Output :

2    -> number of days within 13 days.

Explanation:

The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days.
And then next Sunday in next 7 days and so on.

Now total number of days are 13.
It means 6 days to first sunday and then remaining 7 days will end up in another sunday.
Total 2 sundays may fall within 13 days.
* */

package DSA1.NQTRepeated;

import java.util.Scanner;

public class SundayCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int TotalDays;
            String Sday;
            System.out.print("Enter Total Number of Days: ");
            TotalDays = sc.nextInt();
            System.out.print("\nEnter Starting Day: ");
            Sday = sc.next();
            System.out.println("\nTotal Number of Sundays will be : "+
                    FindSundays(TotalDays,Sday));
        }
    }
    public static int FindSundays(int TotalDays, String StartDays){
        int sdayNumbers = sday(StartDays);
        if(sdayNumbers < 0) {
            System.out.println("wrong Start day given :");
            return -1;
        }
        int TotalWeeksOrSunInTotalDays = TotalDays / 7;
        int RemainingDays = TotalDays % 7 ;

        int SunInRemainingDays = (sdayNumbers + RemainingDays > 7) ? 1 : 0 ;

        return TotalWeeksOrSunInTotalDays + SunInRemainingDays;
    }

    private static int sday(String sdays) {
        int ind = -1;
        String[] Week = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        String[] week = {"sunday", "monday", "tuesday", "wednesday",
                "thursday", "friday", "saturday"};
        String[] wee = {"sun", "mon", "tue", "wed",
                "thu", "fri", "sat"};
        for (int i = 0; i < 7; i++) {
            if(Week[i].equals(sdays) || week[i].equals(sdays) || wee[i].equals(sdays))
                ind = i+1;
        }
        return ind;
    }


}