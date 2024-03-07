#!/bin/bash
sum(){
read -p "Enter two number :" a b
s=`expr $a + $b `
echo "Sum =$s"
}
sum
