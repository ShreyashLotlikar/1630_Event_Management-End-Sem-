
public class Client {

	String userName,password,address,dob;
	
	String H_type,H_Addon1,H_Addon2;
	int H_capacity;
	
	String C_type,C_Addon1,C_Addon2;
	int C_capacity;
	String t_mode,t_type;
	int t_capacity,t_quantity,TAX;
	
	
	public Client(String userName, String password, String address, String dob) {
		// TODO Auto-generated constructor stub
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.dob = dob;
	}
	
	

	public void BookHall(String Hall_type, int H_capacity, String H_Addon1, String H_Addon2) {
		// TODO Auto-generated method stub
		this.H_type = H_type;
		this.H_capacity = H_capacity;
		this.H_Addon1 = H_Addon1;
		this.H_Addon2 = H_Addon2;
	}
	
	public void Catering(String C_type, int C_capacity, String C_Addon1, String C_Addon2) {
		// TODO Auto-generated method stub
		this.C_type = C_type;
		this.C_capacity = C_capacity;
		this.C_Addon1 = C_Addon1;
		this.C_Addon2 = C_Addon2;
	}

	public void transport(String t_mode, int t_capacity, String t_type, int t_quantity) {
		// TODO Auto-generated method stub
		this.t_mode = t_mode;
		this.t_capacity = t_capacity;
		this.t_type = t_type;
		this.t_quantity = t_quantity;
	}

	public int Hall_Bill() {
		// TODO Auto-generated method stub
		int total_Hall_Bill =0 ;
		TAX=0;
		total_Hall_Bill = H_capacity * 50;
		
		TAX = (total_Hall_Bill/100)*20;
		total_Hall_Bill = total_Hall_Bill + TAX;
		
		System.out.println("Total Bill of Hall :"+total_Hall_Bill);
		return total_Hall_Bill;
	}

	public int Catering_Bill() {
		// TODO Auto-generated method stub
		int total_Cat_Bill =0 ;TAX=0;
		total_Cat_Bill = C_capacity * 200;
		
		TAX = (total_Cat_Bill/100)*20;
		total_Cat_Bill = total_Cat_Bill + TAX;
		
		System.out.println("Total Bill of Catering :"+total_Cat_Bill);
		return total_Cat_Bill;
	}

	public int transport_Bill() {
		// TODO Auto-generated method stub
		int total_trans_Bill =0 ;TAX=0;
		total_trans_Bill = (t_capacity * 20) * t_quantity;
		
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
