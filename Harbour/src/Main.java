import static org.junit.Assert.*;

public class Main {

	@org.junit.Test
	public void test() {
		int nAttacks = 0;
		Porto porto = new Porto("P2",15,500);
		Sottomarino s = new Sottomarino("s1","fighter",5,30);
		Aereo a = new Aereo("a1","falker",5,2);
		Gioco g = new Gioco(porto);
		
		while(!g.portoDistrutto()){
			g.attacco(new Invasore[]{s,a});
			nAttacks++;
		}
		assertEquals(150,s.potenzaFuoco());
		assertEquals(100,a.potenzaFuoco());
		System.out.println(nAttacks);
	}

}
