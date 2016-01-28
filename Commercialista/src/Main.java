import static org.junit.Assert.*;

import org.junit.Test;

public class Main {

	@Test
	public void test() {
		Dipendente d1 = new Dipendente("cristo","dio","fefefef");
		Imprenditore i1 = new Imprenditore("buh","alemanno","sishsi","fdfd","effrfrgrgr",250);
		Libero l1 = new Libero("buh","bah","huhioj","dsodksok",250);
		Commercialista ferrari = new Commercialista(new Cliente[]{d1,i1,l1});
		
		
	}

}
