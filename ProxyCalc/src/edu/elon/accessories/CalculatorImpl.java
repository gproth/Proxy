package edu.elon.accessories;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator{
	private String name;
	protected CalculatorImpl(String n) throws RemoteException {
		super();
		name = n;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double runCalcs(String op, String input, double total) throws RemoteException{
		if (op.equals("+")) {
			total = total + Double.parseDouble(input);
		} else if (op.equals("-")) {
			total = total - Double.parseDouble(input);
		} else if (op.equals("/")) {
			total = total / Double.parseDouble(input);
		} else {
			total = total * Double.parseDouble(input);
		}
		return total;
	}
	
	
}
