LOCK TABLES emp [READ];
UNLOCK TABLES;
SELECT *FROM project
SELECT * FROM emp1
ALTER TABLE emp1 ADD proid INT;
ALTER TABLE emp1 ADD FOREIGN KEY(proid) REFERENCES project(project_id);
SELECT * FROM emp1 WHERE proid = 1;
SELECT * FROM emp1 INNER JOIN project ON emp1.proid = project.project_id;
SELECT * FROM emp1 e INNER JOIN project p ON e.proid = p.project_id;
SELECT e.id,e.designation,e.salary,e.location,p.project_name FROM emp1 e INNER JOIN project p ON e.proid = p.project_id
 WHERE p.project_name ="play_store";
 
 DELIMITER //
 CREATE TRIGGER tr_before_insert_productPrice
 BEFORE INSERT ON customer FOR EACH ROW
 BEGIN
 IF NEW.pro_price < 0 THEN SET NEW.pro_price =0;
 END//
 DELIMITER//
 SELECT * FROM customer;
   REPLACE INTO customer  
  SET cust_id = 101,  
    pro_name = 'Mike',  
     pro_price = 45; 
 
