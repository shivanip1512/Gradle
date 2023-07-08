package com.shivani.groovy

class Patient {
	def firstName, lastName, age
	static hospitalCode="RUBY001"
	
	void setAge(age) {
		if (age == null || age<=0) {
			throw new IllegalArgumentException("Invalid Age");
		}
		this.age = age;
	}
	
	static void display() {
		println hospitalCode
	}
}

//named constructor (mapped based)
p=new Patient(firstName: "John",lastName: "Justin", age: 30);
//groovy internally generates getters and setters internally
println p.firstName+" "+p.lastName+" "+p.age

Patient.display()