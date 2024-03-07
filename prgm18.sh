#!/bin/bash
for i in $(seq 5)
do
if [ $i -ge 4 ]
then
continue
fi
echo $i
i=`expr $i + 1`
done
