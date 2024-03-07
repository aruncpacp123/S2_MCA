#!/bin/bash
read -p "Enter two numbers :" a b
echo Numbers are $a and $b
sum=$((a+b))
echo sum=$sum

#Now if i run this file using the command source ./prgm7.sh and after reading values of a and b
#and after completing execution of program ,if we try to echo $a in command line it will print
#the value of variable 'a' inside this program.ie,Global scope
