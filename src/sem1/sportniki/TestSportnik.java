package sem1.sportniki;

public class TestSportnik {

	private final String[] IME_PRIIMKI = {	"Andre Agassi", "Fred Alexander", "Goran Ivanisevic", "Barbara Mulej", "Martina Hingis", 
		"Tina Pisnik", "Katarina Srebotnik", "Martina Navratilova", "Pete Sampras", "Monika Seles", "Lleyton Hewitt", "Novak Dokovic", 
		"Jana Novotna", "Boris Becker", "Roger Federer", "Martina Hingis", "Stefan Edberg", "Sofia Arvidsson", "Martina Navratilova"};
	private final String[] DRZAVE = {"ZDA", "Anglija", "Avstralija", "Belorusija", "Hrvaska", "Slovenija", 
		"Italija", "Nemcija", "Spanija", "Svedska", "Svica", "Slovaska"};
	private final String[] VRSTE = {"kladiva", "diska", "kopija", "krogle"};
	
	private Metalec[] testni;
	
	
	public TestSportnik(){
		makeTab(IME_PRIIMKI.length);
		napolniTab();
	}
	
	public void makeTab(int velTab){
		testni = new Metalec[velTab];
	}
	
	public void napolniTab(){
		for (int i = 0; i < Math.min(IME_PRIIMKI.length, testni.length); i++) {
			Metalec t = new Metalec();
			t.ime = IME_PRIIMKI[i].substring(0, IME_PRIIMKI[i].indexOf(" "));
			t.priimek = IME_PRIIMKI[i].substring(IME_PRIIMKI[i].indexOf(" "), IME_PRIIMKI[i].length());
			t.drzava = DRZAVE[(int) (Math.random() * DRZAVE.length)];
			t.orodje = VRSTE[(int) (Math.random() * VRSTE.length)];
			t.stevilka = i+1;
			t.letoRojstva = (int)(Math.random() * 34) + 1960;
			t.rang = (int)(Math.random() * 100);
			t.dan = (int) (Math.random() * 27) + 1;
			t.mesec = (int) (Math.random() * 12) +1;
			t.osebniRekord = (int) (Math.random() * 50) + 80;
			t.prvoLeto = Math.min((int) (Math.random() * 25) + 18 + t.letoRojstva, 2012);
			testni[i]  = t;
		}
	}
	
	public void vnesiSportnika(){
	
	}
	
	public static void main(String[] args) {
		new TestSportnik();
	}
}
