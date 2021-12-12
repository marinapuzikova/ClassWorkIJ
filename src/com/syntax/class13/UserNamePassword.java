package com.syntax.class13;

public class UserNamePassword {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password from a user and check
		 * following requirements:
		 * 1.Username and Password cannot be empty, if so→
		 * message=”Username and Password cannot be empty”. 
		 * 2.Password should be minimum 8 characters, if less → message=”Password is too short”. 
		 * 3.Password cannot contains username if so, → message=”Password cannot contain username”.
		 * 4.Password should match confirmed password, if not → message=“Passwords do not  match”.
		 * Only after all requirements met → message “Your username and password
		 * has been created”
		 */
		String userName = "marina";
		String password = "mar35768";
		String confirmPass = "mar35768";
		if (!(userName.isEmpty() || password.isEmpty())) {
			if (password.length() >= 8) {
				if (!password.contains(userName)) {
					if (password.equals(confirmPass)) {
						System.out.println("your user name and password has been created");
					} else {
						System.out.println("Password do not match");
					}

				} else {
					System.out.println("Password can not contain username");
				}

			} else {
				System.out.println("Password is too short");
			}

		} else {
			System.out.println("Username and Password can not be empty");
		}
	}
}
