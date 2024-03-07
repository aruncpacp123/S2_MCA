#!/bin/bash
read -p "Enter a number :" n
#a=2
r=`expr $n % 2`
if [ $r -eq 0 ]
then
echo $n is an even number
else
echo $n is an odd number
fi
