package com.bix.soap.ws;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.bix.soap.ws.CalcServiceStub.Add;
import com.bix.soap.ws.CalcServiceStub.AddResponse;

public class TestClient {

	
	//Main client
	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		
		
		try {
			CalcServiceStub cal =new CalcServiceStub();
		
			
			Add getDataInput =new Add();
			
			getDataInput.setNum1(100);
			getDataInput.setNum2(200);
			
			AddResponse addReponse = cal.add(getDataInput);
		
		int result=	addReponse.get_return();
		
		
		System.out.println( "The result of the method is" + result);
		
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
