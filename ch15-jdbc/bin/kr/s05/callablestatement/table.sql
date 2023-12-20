CREATE TABLE salary (
 name varchar2(30) primary key,
 pay number
);

INSERT INTO salary VALUES('JOHN',1000); 
INSERT INTO salary VALUES('SUNNY',2000);
INSERT INTO salary VALUES('PETER',3000);
COMMIT;

CREATE OR REPLACE PROCEDURE adjust(n in varchar2,rate in float)
IS
    newpay float;
BEGIN
	SELECT pay
	INTO newpay
	FROM salary
	WHERE name = n;
	
	newpay := newpay + newpay * rate;
	
	UPDATE salary SET pay = newpay WHERE name = n;
	COMMIT;
EXCEPTION WHEN others THEN
    dbms_output.put_line('error occurred');
    ROLLBACK;
END;