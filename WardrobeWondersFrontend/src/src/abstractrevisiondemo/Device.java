package abstractrevisiondemo;

public abstract class Device {
	
	private int id;
	private String brand;

	public Device(int id,String brand)
	{
		this.id=id;
		this.brand=brand;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id-"+this.id+" brand-"+ this.brand;
	}
	
	public abstract void on();
	public abstract void off();
	
}
