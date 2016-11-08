import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class RoomaNumbridTestid {

	@Test
	public void addTwoRomanNumerals(){
		RoomaNumbrid roomaNumbrid = new RoomaNumbrid();
		assertThat(roomaNumbrid.romanToArabian("XX"), is(20));
	}
	@Test
	public void subtractTwoRomanNumerals(){
		RoomaNumbrid roomaNumbrid = new RoomaNumbrid();
		assertThat(roomaNumbrid.romanToArabian("IX"), is(9));
	}
	@Test
	public void worksWithThreeRomanNumerals(){
		RoomaNumbrid roomaNumbrid = new RoomaNumbrid();
		assertThat(roomaNumbrid.romanToArabian("CMX"), is(910));
	}
	@Test
	public void worksWithFourRomanNumerals(){
		RoomaNumbrid roomaNumbrid = new RoomaNumbrid();
		assertThat(roomaNumbrid.romanToArabian("CMIX"), is(909));
	}
	@Test
	public void worksWithFiveRomanNumerals(){
		RoomaNumbrid roomaNumbrid = new RoomaNumbrid();
		assertThat(roomaNumbrid.romanToArabian("MDLCX"), is(1560));
	}
}
