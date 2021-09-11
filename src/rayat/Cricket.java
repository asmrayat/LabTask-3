/*
Name: Abu Shalehin MD.Rayat
Id: 2012020162
Section: D
Email:cse_2012020162@lus.ac.bd
Date:11/9/2021
 */

package rayat;

public class Cricket extends Sports{
    String matchType;
    int over;
    Player p;

    Cricket(String matchType, int over, Player p)
    {
        this.matchType=matchType;
        this.over=over;
        this.p=p;
    }

    void display()
    {
        System.out.println("The match type is : "+matchType);
        System.out.println("Over of the match is : "+over);
        System.out.println("The name of player is : "+p.playerName
                +" and the jersey number is : "+p.jerseyNumber);
    }

}
