package com.syntax.class12;

public class Methods {
	int times;

	void sayHello() {
		System.out.println("Hello Batch11");
	}

	void sayHelloManyTimes() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hello Batch 11");
		}
	}
		void sayHelloManyTimesWithState() {
			for(int i=0;i<=times;i++) {
				System.out.println("Hello Batch 11");
	}

}//dynamic type and we can change it if we want		//parameters (times)
		void sayHelloManyTimesWithParameter(int times) {
			for(int i=0;i<=times;i++) {
				System.out.println("Hello Batch 11");	
}
		}
}