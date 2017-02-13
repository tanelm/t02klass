public class Proov1{
	public static void main(String[] args){
		Kolmnurk pitsaloik1=new Kolmnurk(5, 7);
		Kolmnurk pitsaloik2=new Kolmnurk(4, 3);
		Kolmnurk pitsaloik3=new Kolmnurk(11, 0.5);
		System.out.println(pitsaloik1.toString());
		System.out.println(pitsaloik2.toString());
		System.out.println(pitsaloik3.toString());
	}
}
/*

[ukupode@greeny t02klass]$ java Proov1
Kolmnurk alusega:5.0m ja kõrgusega:7.0m, ymbermoot 19.866068747318508m, pindala 17.5 ruutmeetrit.
Kolmnurk alusega:4.0m ja kõrgusega:3.0m, ymbermoot 11.21110255092798m, pindala 6.0 ruutmeetrit.
Kolmnurk alusega:11.0m ja kõrgusega:0.5m, ymbermoot 22.04536101718726m, pindala 2.75 ruutmeetrit.


*/