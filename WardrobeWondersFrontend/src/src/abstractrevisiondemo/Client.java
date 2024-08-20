package abstractrevisiondemo;

import com.interfacedemo.ILoggable;
import com.interfacedemo.IPrintable;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m1=new Mobile(1, "Samsung", "Snapdragon");
		//m1.print();
		//m1.log();
		
		ILoggable il1=m1;
		il1.log();
		il1.monitor();
		ILoggable.getInsights();
		
		IPrintable ip1=m1;  //ip1 can refer to same object as that of m1
		ip1.print();
		//ip1 can invoke only interface methods
		

		
	/*
		Device [] devices=new Device[2];
		
		devices[0]=new Refrigerator(1, "LG", 25);
		devices[1]=new Mobile(2, "Samsung", "Snapdragon");
		
		for(int i=0;i<devices.length;i++)
		{
			System.out.println(devices[i]);
			devices[i].on();
			if(devices[i] instanceof Refrigerator)
			{
				Refrigerator r=(Refrigerator)devices[i];
				r.freeze();
			}
			if(devices[i] instanceof Mobile)
			{
				Mobile m=(Mobile)devices[i];
				m.runApp();
			}
			devices[i].off();
		}
		*/
		
	}

}
