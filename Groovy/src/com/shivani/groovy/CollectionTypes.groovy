package com.shivani.groovy

list = [1,2,3]
println list
println list.class

LinkedList ll = [1,3,4]
println ll
println ll.class

ll << 4  // add 4 to list
println ll

ll = ll + [5,6,7]
println ll

ll -= 4

ll.each { print it }
println ()

ll.reverseEach { print it }
println ()

//  ll.permutations { println it }