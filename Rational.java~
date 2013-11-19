//Jim Yuan
//pd 8
//HW27
//2013-11-18


public class Rational{

    private int numerator, denominator;
    private double value;

    public Rational(){

	numerator = 0;
	denominator = 1;
	value = numerator / denominator;
    }

    public Rational(int numer, int denom){
 
	numerator = numer;
	denominator = denom;
	if (denominator == 0){
	    numerator = 0;
	    denominator = 1;
	}
      	value = numerator / denominator;	

    }

    public String toString(){
	String ans = "";
	if (denominator == 0){
	    ans += "You have an invalid denominator (it's probably zero). Meanwhile, I set it to 0/1";
	    value = 0;
	}
	ans += value;

	return ans;
    }

    public static void main(String []args){

	//make a Rational
	Rational num = new Rational();
	System.out.println("This is the default value of my default Rational: " + num);
	Rational numOV = new Rational(4, 0);
	System.out.println("This is Rational(4,0): " + numOV);
	Rational anotherNum = new Rational(3, 4);
	System.out.println("This is Rational(3,4): " + anotherNum);

    }


}
