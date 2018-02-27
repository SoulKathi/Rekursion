import java.lang.reflect.Array;
import java.util.ArrayList;


public class Rekursion {
	public static void main(String[] args){
		/*System.out.println(fakultaet(5));
		System.out.println(fakultaet(10));
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(20));
		System.out.println(summe(1,6));
		System.out.println(summe(15,20));
		System.out.println(ggt(960,30));
		System.out.println(ggt(144,27));
		System.out.println(getPascalWert(0,0));
		System.out.println(getPascalWert(4,1));
		System.out.println(getPascalWert(5,0));
		System.out.println(getPascalWert(5,2));
		rekursiveAusgabe(12345);
		System.out.println(umkehren("Nie fragt sie: Ist gefegt? Sie ist gar fein."));
		geldautomat1(7798);
		System.out.println(geldautomat2(5432));
		System.out.println(geldautomat3(5432)[0]);*/
		System.out.println(zahl(10));
	}
	public static long fakultaet(int n){
		if(n==0){
			return 1;
		}else{
			return n*fakultaet(n-1);
		}
	}
	public static long fibonacci(int n){
		if(n==1){
			return 1;
		}else if(n==2){
			return 1;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	public static int summe(int anfang, int ende){
		if(anfang>ende){
			return 0;
		}else{
			return anfang+summe(anfang+1,ende);
		}
	}
	public static int ggt(int a, int b){
		if(a==b){
			return a;
		}else if(a>b){
			return ggt(a-b,b);
		}else{
			return ggt(a,b-a);
		}
	}
	public static int getPascalWert(int i, int j){
		if(j==0||j==i){
			return 1;
		}else{
			return getPascalWert(i-1,j)+getPascalWert(i-1,j-1);
		}
	}
	public static void rekursiveAusgabe(int n){
		if(n<10){
			System.out.println(n);
		}else{
			rekursiveAusgabe(n/10);
			System.out.println(n%10);
			//rekursiveAusgabe(n/10);
		}
	}
	public static String umkehren(String s){
		if (s.length()<=1){
			return s;
		}else{
			return umkehren(s.substring(1))+s.charAt(0);
		}
	}
	public static void geldautomat1(int betrag){
		if(betrag < 5){
			System.out.println("");
		}else if(betrag<10){
			System.out.println("5€");
			geldautomat1(betrag-5);
		}else if(betrag <20){
			System.out.println("10€");
			geldautomat1(betrag-10);
		}else if(betrag <50){
			System.out.println("20€");
			geldautomat1(betrag-20);
		}else if(betrag <100){
			System.out.println("50€");
			geldautomat1(betrag-50);
		}else if(betrag <200){
			System.out.println("100€");
			geldautomat1(betrag-100);
		}else if(betrag <500){
			System.out.println("200€");
			geldautomat1(betrag-200);
		}else{
			System.out.println("500€");
			geldautomat1(betrag-500);
		}
	}
	public static ArrayList<Integer> geldautomat2(int betrag){
		ArrayList<Integer> ret=new ArrayList<Integer>();
		if(betrag < 5){
		}else if(betrag<10){
			ret.add(5);
			ret.addAll(geldautomat2(betrag-5));
		}else if(betrag <20){
			ret.add(10);
			ret.addAll(geldautomat2(betrag-10));
		}else if(betrag <50){
			ret.add(20);
			ret.addAll(geldautomat2(betrag-20));
		}else if(betrag <100){
			ret.add(50);
			ret.addAll(geldautomat2(betrag-50));
		}else if(betrag <200){
			ret.add(100);
			ret.addAll(geldautomat2(betrag-100));
		}else if(betrag <500){
			ret.add(200);
			ret.addAll(geldautomat2(betrag-200));
		}else{
			ret.add(500);
			ret.addAll(geldautomat2(betrag-500));
		}
		return ret;
	}
	public static int[] geldautomat3(int betrag){
		int[] ret=new int[7];
		if(betrag < 5){
		}else if(betrag<10){
			ret=geldautomat3(betrag-5);
			ret[0]++;
		}else if(betrag <20){
			ret=geldautomat3(betrag-10);
			ret[1]++;
		}else if(betrag <50){
			ret=geldautomat3(betrag-20);
			ret[2]++;
		}else if(betrag <100){
			ret=geldautomat3(betrag-50);
			ret[3]++;
		}else if(betrag <200){
			ret=geldautomat3(betrag-10);
			ret[4]++;
		}else if(betrag <500){
			ret=geldautomat3(betrag-200);
			ret[5]++;
		}else{
			ret=geldautomat3(betrag-500);
			ret[6]++;
		}
		return ret;
	}
	public static int zahl(int n){
		return anzahl(n,n);
	}
	private static int anzahl(int n, int m){
		if(n==1){
			return 0;
		}
		if(n==0){
			return 1;
		}
		int ret=0;
		for(int i=2;i<=m&&i<=n;i++){
			if(isPrime(i)){
				//System.out.println(i);
				ret+=1*anzahl(n-i,i);
			}
		}
		return ret;
	}
	private static boolean isPrime(int i){
		for(int j=2;j<i;j++){
			//System.out.println(i+"%"+j+"="+i%j);
			if(i%j==0){
				return false;
			}
		}
		return true;
	}
}
