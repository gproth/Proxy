package edu.elon.accessories;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote{
	
	public double runCalcs(String op, String input, double total) throws RemoteException;
}
