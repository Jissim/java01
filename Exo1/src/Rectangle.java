import java.util.*;

public class Rectangle {
	private int a=0;
	private int b=0;
	
	public int surface(int a,int b) {
		int res=a*b;
		return res;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle R = new Rectangle();
		Scanner in =new Scanner(System.in);
		System.out.println("Entrez la largeur(a) du rectangle :");
        R.a = in.nextInt();
        System.out.println("Entrez la longueur(b) du rectangle :");
        R.b= in.nextInt();
        int R1 =  surface();
        
	}

}
