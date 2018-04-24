
//File after refactoring
public class Client {

	
	//Extract Constants
	private static final int HALL_PRICE = 50;
	private static final int PLATE_PRICE = 200;
	private static final int TICKET_PRICE = 20;
	
	String userName,password,address,dob;
	
	//Renamed Varibles to meaningful names
	String Hall_type,Hall_Addon1,Hall_Addon2;
	int Hall_capacity;
	
	String Catering_type,Catering_Addon1,Catering_Addon2;
	int Catering_capacity;
	
	String transport_mode,transport_type;
	int transport_capacity,transport_quantity,TAX;
	
	
	public Client(String userName, String password, String address, String dob) {
		// TODO Auto-generated constructor stub
		Intialise_Client(userName, password, address, dob);
	}


	//Extract method
	private void Intialise_Client(String userName, String password, String address, String dob) {
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.dob = dob;
	}
	
	

	public void BookHall(String H_type, int H_capacity, String H_Addon1, String H_Addon2) {
		// TODO Auto-generated method stub
		Intialise_Hall(H_type, H_capacity, H_Addon1, H_Addon2);
	}


	//Extract method
	private void Intialise_Hall(String H_type, int H_capacity, String H_Addon1, String H_Addon2) {
		this.Hall_type = H_type;
		this.Hall_capacity = H_capacity;
		this.Hall_Addon1 = H_Addon1;
		this.Hall_Addon2 = H_Addon2;
	}
	
	public void Catering(String C_type, int C_capacity, String C_Addon1, String C_Addon2) {
		// TODO Auto-generated method stub
		Intialise_Catering(C_type, C_capacity, C_Addon1, C_Addon2);
	}


	//Extract method
	private void Intialise_Catering(String C_type, int C_capacity, String C_Addon1, String C_Addon2) {
		this.Catering_type = C_type;
		this.Catering_capacity = C_capacity;
		this.Catering_Addon1 = C_Addon1;
		this.Catering_Addon2 = C_Addon2;
	}

	public void transport(String t_mode, int t_capacity, String t_type, int t_quantity) {
		// TODO Auto-generated method stub
		Intialise_transport(t_mode, t_capacity, t_type, t_quantity);
	}


	//Extract method
	private void Intialise_transport(String t_mode, int t_capacity, String t_type, int t_quantity) {
		this.transport_mode = t_mode;
		this.transport_capacity = t_capacity;
		this.transport_type = t_type;
		this.transport_quantity = t_quantity;
	}

	public int Hall_Bill() {
		// TODO Auto-generated method stub
		int total_Hall_Bill =0 ;
		TAX=0;
		total_Hall_Bill = Hall_capacity * HALL_PRICE;
		
		TAX = (total_Hall_Bill/100)*20;
		total_Hall_Bill = total_Hall_Bill + TAX;
		
		System.out.println("Total Bill of Hall :"+total_Hall_Bill);
		return total_Hall_Bill;
	}

	public int Catering_Bill() {
		// TODO Auto-generated method stub
		int total_Cat_Bill =0 ;TAX=0;
		total_Cat_Bill = Catering_capacity * PLATE_PRICE;
		
		TAX = (total_Cat_Bill/100)*20;
		total_Cat_Bill = total_Cat_Bill + TAX;
		
		System.out.println("Total Bill of Catering :"+total_Cat_Bill);
		return total_Cat_Bill;
	}

	public int transport_Bill() {
		// TODO Auto-generated method stub
		int total_trans_Bill =0 ;TAX=0;
		total_trans_Bill = (transport_capacity * TICKET_PRICE) * transport_quantity;
		
		TAX = (total_trans_Bill/100)*20;
		total_trans_Bill = total_trans_Bill + TAX;
		
		System.out.println("Total Bill of transport :"+total_trans_Bill);
		return total_trans_Bill;		
	}
	
	public String getAddress() {
		return address;
	}
	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getDob() {
		return dob;
	}

	public int Total_Bill() {
		// TODO Auto-generated method stub
		int total=0;
		System.out.println("\n\n-----Total Bills of Services------");
		
		total = Hall_Bill() + Catering_Bill() +transport_Bill();
		System.out.println("-----Total Amount :"+total+"------");
		return total;
	}

}
