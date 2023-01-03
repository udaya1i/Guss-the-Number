
import java.util.Scanner;
import java.util.Random;
class guss{
		int r;
		int u;
		int howmanuattempt =0;
	

void getter(int n){
	this.howmanuattempt =n;
	}

int setter(){
	return howmanuattempt;
	}

	guss(){
	Random rd = new Random();
	r = rd.nextInt(100);
	}
	void userGuess(){
		howmanuattempt++;
		System.out.println("Guess the number between 1 to 100");
		Scanner sc = new Scanner(System.in);
		u = sc.nextInt();
	}
	boolean isTrue(){

		if (u > 100){
		System.out.printf("invalide input\n please input the number between 1 to 100!!");
	}
	else if(u == r){
		
		System.out.printf("Correct the number was %d \n" , r);
		System.out.printf("you guessed it in %d'th try", howmanuattempt);
		return true;
	}
	else if(u > r){
		System.out.println("Too High.......");
	}
	else if (u < r){
		System.out.println("Too Low.....");
	}
	return false;
	}
	
public static void main(String [] args){
	guss g = new guss();
	boolean b = false;
	while (!b){
		g.userGuess();
		b = g.isTrue();
		}
	}

}