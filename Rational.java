//Jim Yuan
//pd 8
//HW27
//2013-11-18


public class Rational{

    private int numerator, denominator;
    private double value;
    private String msg = "";
    public Rational(){

	numerator = 0;
	denominator = 1;

    }

       public Rational(int numer, int denom){
	   System.out.println(numer);
	   System.out.println(denom);

	if (denom == 0){
	    numerator = 0;
	    denominator = 1;
	    msg  += "You have an invalid denominator (it's probably zero). Meanwhile, I set it to 0/1; ";
	}
	else{
	    numerator = numer;
	    denominator = denom;
	}
	System.out.println(numerator);
	System.out.println(denominator);

    }
    
    public String toString(){
	System.out.println(numerator);
	System.out.println(denominator);
	value = (double)numerator / (double)denominator;//now i feel stupid
	System.out.println(value);
	String ans = "";
	System.out.println(ans);
	ans += msg;
	System.out.println(ans);
	if (msg.equals("")){
	    ans +=  value;

       	}
	else{
	 
	    ans += "The value be here: " + value;	    

	}
	System.out.println(ans);
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
