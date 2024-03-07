#!/bin/bash
read -p "Enter two numbers:" a b
if [ $a -gt $b ]
then
echo $a is larger
elif [ $a -eq $b ]
then
echo Both are equal
else
echo $b is larger
fi
