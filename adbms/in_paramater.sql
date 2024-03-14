CREATE DEFINER=`root`@`localhost` PROCEDURE `fact_parameter`(IN num int)
BEGIN
declare f int default 1;
while num >0
do
set f=f*num;
set num=num-1;
end while;
SELECT f;
END