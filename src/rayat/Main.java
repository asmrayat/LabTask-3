/*
Name: Abu Shalehin MD.Rayat
Id: 2012020162
Section: D
Email:cse_2012020162@lus.ac.bd
Date:11/09/2021
 */

package rayat;

public class Main {

    public static void main(String[] args) {

	Player player=new Player("Sakib",75);
	Cricket cricket=new Cricket("International Match",20,player);
	cricket.display();
	Football football=new Football();

    }
}
