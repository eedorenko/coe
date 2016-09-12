create table projects
(project_id number(10),
 name varchar2(30) not null,
 constraint pk_projects primary key (project_id),
 constraint UK_projects_name unique (name));
 

create table assignments 
(assignment_id Number(10),
 business_date Date not null,
 employee_id Number(10) not null,
 project_id Number(10) not null,
 StartTime Date not null,
 FinishTime Date not null,
 is_approved char default 'N' not null,
 constraint pk_assignments primary key (assignment_id),
 constraint fk_assignments_employee foreign key (employee_id) references employees(employee_id),
 constraint fk_assignments_project foreign key (project_id) references projects(project_id),
 constraint ck_assignments_times check (FinishTime > StartTime)
 );
 
create sequence assignments_seq;

alter table employees add Version_number Number(5);

update employees set Version_number=1;
 
 
insert into projects
 (project_id, name)
values
 (1, 'Save the world');
 
insert into projects
 (project_id, name)
values
 (2, 'Explore Space');


insert into projects
 (project_id, name)
values
 (3, 'Perpetuum Mobile');
 
insert into projects
 (project_id, name)
values
 (4, 'Time machine');


insert into projects
 (project_id, name)
values
 (5, 'Brexit');
 
commit;

 








 
 