package singleton;

import java.util.ArrayList;

import model.User;

public class UserSingleton {
	
	private static volatile ArrayList<User> instance = null;
	
	public static ArrayList<User> getInstances() {
		if(instance == null) {
			synchronized(UserSingleton.class) {
				if(instance == null) {
					instance = new ArrayList<User>();
				}
			}
		}
		return instance;
	}

}

