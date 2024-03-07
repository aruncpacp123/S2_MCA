#!/bin/bash
sum(){
s=`expr $1 + $2`
echo "Sum = $s"
}
read -p "Enter any two numbers :" a b
sum $a $b
