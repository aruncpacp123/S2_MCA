#!/bin/bash
read -p "Enter password :" p
pass="arun"
if [ $p = $pass ]
then 
echo Password is correct
else
echo incorrect password
fi
