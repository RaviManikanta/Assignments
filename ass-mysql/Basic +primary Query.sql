SELECT * FROM emp WHERE emp_salary >21000
SELECT * FROM emp WHERE emp_salary = 23500 AND emp_id =121
SELECT * FROM emp WHERE emp_salary BETWEEN 20000 AND 22000
SELECT * FROM emp WHERE emp_id  = '101';
SELECT * FROM emp WHERE emp_name ="Ravi";
SELECT * FROM emp WHERE emp_dept = '15'
SELECT * FROM emp WHERE emp_location = "Hyderabad"
SELECT * FROM emp WHERE emp_designatio IN ("devloper")
SELECT * FROM emp WHERE emp_designatio = "Tester" OR "Sap"
SELECT * FROM emp WHERE emp_salary NOT BETWEEN 21000 AND 23000
UPDATE emp SET emp_salary= 25000 WHERE emp_id =129 ;
SELECT * FROM emp ORDER BY emp_name ;
SELECT  DISTINCT emp_location FROM emp;
SELECT COUNT(emp_designatio) FROM emp; 

