#!/bin/bash
 for i in $(seq 5)
 do
 if [ $i -ge 4 ]
 then
 break
 fi
 echo $i
 i=`expr $i + 1`
 done
#Write a shell script to check i value from 1 to 5 and print the values 1 ,2 and 3 only
