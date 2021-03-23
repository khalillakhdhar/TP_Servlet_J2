package codes;

public class Calcule {
	private int a,b;
	
	
	
	
	
public int getA() {
		return a;
	}





	public void setA(int a) {
		this.a = a;
	}





	public int getB() {
		return b;
	}





	public void setB(int b) {
		this.b = b;
	}





public Calcule(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}





public int pgcd()

{
	int x=this.a;
	int y=this.b;
	while(x!=y)
	{
		if(x>y)
			
		x=x-y;
		else
		y=y-x;
		
	}
	
	
	return x;

}

public int ppcm()
{
int multiple=this.a*this.b;
int diviseur=pgcd();
return multiple/diviseur;


}





@Override
public String toString() {
	return "Calcule [a=" + a + ", b=" + b + ", pgcd=" + pgcd() + ", ppcm=" + ppcm() + "]";
}



}
