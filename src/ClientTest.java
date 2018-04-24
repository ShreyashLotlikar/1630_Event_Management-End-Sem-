import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {

	Client client = new Client("Ram","password","margao","23-04-1991");
	
	
	@Test
	public void testGetUserName() {
		//fail("Not yet implemented");
		assertEquals("Ram", client.getUserName());
	}

	@Test
	public void testGetPassword() {
		//fail("Not yet implemented");
		assertEquals("password", client.getPassword());
	}
	
	@Test
	public void testHall_Bill() {
		//fail("Not yet implemented");
		client.BookHall("Open Air Hall",200,"music","light");
		assertEquals(12000, client.Hall_Bill());
	}

	@Test
	public void testCatering_Bill() {
		//fail("Not yet implemented");
		client.Catering("Veg",200,"cake","Soup");
		assertEquals(48000, client.Catering_Bill());
	}

	@Test
	public void testTransport_Bill() {
		//fail("Not yet implemented");
		client.transport("Bus",50,"AC",4);
		assertEquals(4800, client.transport_Bill());
	}
	
	@Test
	public void testTotal_Bill() {
		//fail("Not yet implemented");
		client.BookHall("Open Air Hall",200,"music","light");
		client.Catering("Veg",200,"cake","Soup");
		client.transport("Bus",50,"AC",4);
		
		assertEquals(64800, client.Total_Bill());
	}

	@Test
	public void testGetAddress() {
		//fail("Not yet implemented");
		assertEquals("margao", client.getAddress());
	}

	

}
