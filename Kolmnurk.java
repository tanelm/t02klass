public class Kolmnurk{
	double a, h;
	public Kolmnurk(double alus, double korgus){
		if(alus<=0){throw new RuntimeException("Sobimatu aluse pikkus");}
		if(korgus <=0){throw new RuntimeException("Sobimatu kõrguse pikkus");}
		a=alus;
		h=korgus;
	}
	public double pindala(){
		return a*h/2;
	}
	//lisage funktsioon ristkyliku ymberm66du arvutamiseks
	public double umbermoot(){
		return Math.sqrt(Math.pow(a/2,2)+Math.pow(h,2))*2+a;
	}
	public String toString(){
		return "Kolmnurk alusega:"+a+"m ja kõrgusega:"+h+"m, ymbermoot "+
		       umbermoot()+"m, pindala "+pindala()+" ruutmeetrit.";
	}
}