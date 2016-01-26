import static org.junit.Assert.*;

import org.junit.Test;

public class Main {

	@Test
	public void test() {
		
		Dipendente d1 = new Dipendente("cristo","dio","fefefef");
		Imprenditore i1 = new Imprenditore("buh","alemanno","sishsi","fdfd","effrfrgrgr",250);
		Libero l1 = new Libero("buh","bah","huhioj","dsodksok",250);
		Commercialista ferrari = new Commercialista(new Cliente[]{d1,i1,l1});
		
		Cassetta cas1 = new Cassetta("cristo","dio",1980,new String[]{""},3);
		Dvd dvd1 = new Dvd("cristo","dio",1980,new String[]{""},3);
		BluRay blu1 = new BluRay("cristo","dio",1980,new String[]{""},3);
		Videoteca wow = new Videoteca(new Film[]{cas1,dvd1,blu1});
		
		System.out.println(blu1.costoNoleggio());
		
		//System.out.println(ferrari.incassoTot());
		//assertEquals(875.0,ferrari.incassoTot());
		
		
	}

}
