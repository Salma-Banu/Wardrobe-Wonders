package abstractrevisiondemo;

import com.interfacedemo.ILoggable;
import com.interfacedemo.IPrintable;

//Mobile class is inherited from  Device class and implements
//2 interfaces i.e IPrintable and ILoggable
public class Mobile  extends Device implements IPrintable,ILoggable{
		
	private String processor;  //special data member
	
	public Mobile(int id, String brand, String processor) {
		super(id, brand);
		this.processor = processor;
	}
	
	//overriding the Device i.e base class methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Processor-"+this.processor;
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Mobile turning on");
	}
	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Mobile turning off");
	}

	//special method of Mobile class
	public void runApp()
	{
		System.out.println("Mobile running apps");
	}
	
	//implementation of IPrintable interface method
	public void print()
	{
		System.out.println("Print() in Mobile");
	}
	
	//implementation of ILoggable interface method
	public void log()
	{
		System.out.println("Logging the activities of Mobile Objects");
	}
	
	public void monitor()
	{
		System.out.println("Monitoring the app using abc insights");
	}
	
	
	

}
