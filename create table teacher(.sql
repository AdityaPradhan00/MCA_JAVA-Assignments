create table teacher(
    ID int NOT NULL,
    FName varchar(255) NOT NULL,
    LName varchar(255) NOT NULL, 
    PNumber double NOT NULL,
    EMail varchar(255) NOT NULL,
    Unique(ID),
    Primary Key(ID)
);

insert into teacher(ID, FName, LName, Pnumber, Email)
values(1, 'Triyon', 'Lannister', 9876543210, 'LannisterDwarf@gmail.com');
insert into teacher(ID, FName, LName, Pnumber, Email)
values(2, 'Cersie', 'Lannister', 7458324103, 'CersLaniss@gmail.com');
insert into teacher(ID, FName, LName, Pnumber, Email)
values(3, 'Ned', 'Stark', 6652412078, 'Stark@gmail.com');
insert into teacher(ID, FName, LName, Pnumber, Email)
values(4, 'Night', 'King', 8977423510, 'Knight@hotmail.com');
insert into teacher(ID, FName, LName, Pnumber, Email)
values(5, 'Catlynn', 'Stark', 5102350155, 'S.Cat@yahoo.com');

SELECT Fname, Lname FROM student
WHERE Lname='Lannister'
UNION
SELECT Fname, Lname FROM teacher
WHERE Lname='Lannister';
ORDER BY ID;