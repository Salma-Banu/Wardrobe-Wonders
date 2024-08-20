package abstractrevisiondemo;

//Refrigerator class is inherited from Device base class
public class Refrigerator extends Device {
	
	private int capacity;  //special data member

	public Refrigerator(int id, String brand, int capacity) {
		super(id, brand);
		this.capacity = capacity;
	}

	//override the Device i.e base class methods
	@Override
	public String toString() {
		return super.toString()+ "capacity=" + capacity;
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Refrigerator turning on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Refrigerator turning off");
	}
	
	//special method of Refrigerator class
	public void freeze()
	{
		System.out.println("Refrigerator freezing mode on");
	}
}
