
public class EventClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client = new Client("Ram","password","margao","23-04-1991");
		
		client.BookHall("Open Air Hall",200,"music","light");
		client.Catering("Veg",200,"cake","Soup");
		client.transport("Bus",50,"AC",4);
		
		client.Hall_Bill();
		client.Catering_Bill();
		client.transport_Bill();
		
		client.Total_Bill();

	}

}
