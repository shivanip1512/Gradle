package com.shivani.groovy

closure = { n = 0 ->
	println(n%2==0? "even" :"odd")
}

closure.call()

4.times { n->print n }
4.times { print it }