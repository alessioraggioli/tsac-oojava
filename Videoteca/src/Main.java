import static org.junit.Assert.*;

import org.junit.Test;

public class Main {

	@Test
	public void test() {
		
		Cassetta cas1 = new Cassetta("cristo","dio",1980,new String[]{""},3);
		Dvd dvd1 = new Dvd("cristo","dio",1980,new String[]{""},3);
		BluRay blu1 = new BluRay("cristo","dio",1980,new String[]{""},3);
		Videoteca wow = new Videoteca(new Film[]{cas1,dvd1,blu1});
		
		
	}

}
