package com.shivani.groovy

//int product(int x, int y) {
//	return x*y;
//}

def product(x=3,y=2) {
	x*y
}

//println product(10, 5)
result = product 5
println result

//supports named params
void display(Map productDetails) {
	println productDetails.name
	println productDetails.price
}

//display([name:'iPhone',price:1000])
//display(name:'iPhone',price:1000)
display name:'iPhone',price:1000