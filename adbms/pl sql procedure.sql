CREATE PROCEDURE `factorial` ()
BEGIN
declare f int default 1;
declare num int default 5;
while num >0
do
set f=f*num;
set num=num-1;
end while;
SELECT f;
END
