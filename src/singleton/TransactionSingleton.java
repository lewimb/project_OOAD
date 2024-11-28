package singleton;

import java.util.ArrayList;

import model.Transaction;

public class TransactionSingleton {

	private static volatile ArrayList<Transaction> instance = null;
	
	public static ArrayList<Transaction> getInstance(){
		if(instance == null) {
			synchronized(TransactionSingleton.class) {
				if(instance == null) {
					instance = new ArrayList<Transaction>();
				}
			}
		}
		return instance;
	}
	
}
