package edu.elon.accessories;

import javax.naming.Context;
import javax.naming.InitialContext;

public class CalculatorServer {
	public static void main(String args[]){
		try{
			System.out.println("Construction server implementations....");
			
			Calculator i1 = new CalculatorImpl("calculations");
			
			System.out.println("Binding server implementations to registry....");
			Context namingContext = new InitialContext();
			namingContext.bind("rmi:calculations", i1);
			System.out.println("Waiting for invocations from clients...");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
