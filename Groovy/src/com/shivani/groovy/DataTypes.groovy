package com.shivani.groovy

def a =10
println a
println a.class // Integer wrapper type

println()

float b =10f
println b
println b.class

println()

s = 'Shivani'
println s
println s.class

println()

s="hello ${s}!" //g-string or groovy string
println s
println s.class

//multiline comment
multilineStr='''
Hi Shivani.
Hope you are doing well.
Have a great day!!
'''
println multilineStr

emailPattern=/[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+/
println "test@gmail.com" ==~ emailPattern // ==~ pattern operator
