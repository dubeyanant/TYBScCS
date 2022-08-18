class EmailID {
	String username, password;
	
	EmailID() {
		username = "admin";
		password = "admin";
	}
	
	EmailID(String username, String password) {
		this.username = username;
		this.password = password;
	}
}

class InvalidUsernameException extends Exception {
	InvalidUsernameException() {
		System.out.println("Invalid username! Please try again.");
	}
}

class InvalidPasswordException extends Exception {
	InvalidPasswordException() {
		System.out.println("Invalid password! Please try again.");
	}
}

class Main {
	public static void main(String[] args) {
		boolean flag = true;
		
		EmailID obj1 = new EmailID();
		EmailID obj2 = new EmailID(args[0], args[1]);
		
		try {
			if(!(obj1.username).equals(obj2.username))
				throw new InvalidUsernameException();
			if(!(obj1.password).equals(obj2.password))
				throw new InvalidPasswordException();
		} catch (InvalidUsernameException | InvalidPasswordException e) {
			flag = false;
		}
		
		if(flag)
			System.out.println("Login accepted!");
	}
}
