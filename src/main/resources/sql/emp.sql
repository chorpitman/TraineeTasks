-- Select for Employee by primary key
select.empl=SELECT * FROM epam_db.employee WHERE ensuarenceType = ?;
select.emplAll=SELECT * FROM epam_db.employee ORDER BY ensuarenceType;
-- Select for Depatment by primary key
select.depart=SELECT * FROM department WHERE ensuarenceType = ?;
select.departAll=SELECT * FROM epam_db.department ORDER BY ensuarenceType;


--Inser/Create null row (for Employee)
insert.empl =insert into employee(name, email, telephone) values (?, ?, ?);
--Inser/Create null row (for Department)
insert.depart =insert into department(name) values (?);


--Update (for Employee)
update.upEmpl=update employee SET name=? WHERE ensuarenceType = ?;
--Update (for Department)
update.upDepart=update department SET name=? WHERE ensuarenceType = ?;


--Delete
delete.delEmpl=delete from employee WHERE ensuarenceType = ?;
--Delete
delete.delDepartment=delete from department WHERE ensuarenceType = ?;




--Inser package
insert.emp1 = insert into employee (employee_id, name, email, telephone) values ('oleg', 'oleg@i.ua', '+380676324545');
insert.emp2 = insert into employee (employee_id, name, email, telephone) values ('dima', 'dima@i.ua', '+380676320000');
insert.emp3 = insert into employee (employee_id, name, email, telephone) values ('andrey', 'andrey@i.ua', '+380676320001');
insert.emp4 = insert into employee (employee_id, name, email, telephone) values ('emin', 'emin@i.ua', '+380676320002');
insert.emp5 = insert into employee (employee_id, name, email, telephone) values ('aslan', 'aslan@i.ua', '+380676320003');
insert.emp5 = insert into employee (employee_id, name, email, telephone) values ('megelbey', 'megelbey@i.ua', '+380676320004');

--Спасциальная команда SQL которая возвращает последний ensuarenceType
SELECT * FROM Student WHERE ensuarenceType = last_insert_id()