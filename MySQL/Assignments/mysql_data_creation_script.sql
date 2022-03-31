
 CREATE TABLE DEPT
   (	
   ID INT(4) PRIMARY KEY, 
	NAME VARCHAR(30)
   );


  CREATE TABLE EMP
   (	ID INT(4) PRIMARY KEY, 
NAME VARCHAR(30), 
	SALARY FLOAT(8,2), 
	COMMISSION FLOAT(8,2), 
	ROLE VARCHAR(30), 
	DEPT_NO INT(3), 
	HIRED_DATE DATE, 
	MANAGER_ID INT(4)
   );
   
   
 ALTER TABLE EMP
 ADD CONSTRAINT EMP_DEPT_ID_REF FOREIGN KEY (DEPT_NO)
	  REFERENCES DEPT (ID) ON DELETE CASCADE;
	  
	  
	  
Insert into DEPT (ID,NAME) values (1,'Sales');
Insert into DEPT (ID,NAME) values (2,'Marketing');
Insert into DEPT (ID,NAME) values (3,'RnD');
Insert into DEPT (ID,NAME) values (4,'Accounts');
Insert into DEPT (ID,NAME) values (5,'Support');
Insert into DEPT (ID,NAME) values (6,'Production');


Insert into EMP (ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO,HIRED_DATE,MANAGER_ID) values (1,'Tom',100000,2000,'Clerk',5,null,null);
Insert into EMP (ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO,HIRED_DATE,MANAGER_ID) values (2,'Jerry',25000,10000,'Manager',4,null,3);
Insert into EMP (ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO,HIRED_DATE,MANAGER_ID) values (3,'Ivan',50000,20000,'President',3,null,null);
Insert into EMP (ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO,HIRED_DATE,MANAGER_ID) values (4,'Robert',22000,8000,'Manager',1,null,6);
Insert into EMP (ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO,HIRED_DATE,MANAGER_ID) values (5,'George',30000,12000,'Manager',2,null,null);
Insert into EMP (ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO,HIRED_DATE,MANAGER_ID) values (6,'Obama',18000,100,'CEO',5,null,null);
Insert into EMP (ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO,HIRED_DATE,MANAGER_ID) values (7,'Bill',22000,200,'Clerk',3,null,null);
Insert into EMP (ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO,HIRED_DATE,MANAGER_ID) values (8,'Steve',18000,20000,'Clerk',3,null,null);
