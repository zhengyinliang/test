CREATE TABLE student(
                        id BIGINT(20) UNSIGNED NOT NULL,
                        stud_name varchar(128) not NULL,
                        sex tinyint(3) UNSIGNED not NULL,
                        grade int(10) not NULL,
                        PRIMARY KEY (id)
) CHARSET=utf8;

insert into student values('1','lzy','1','2');
insert into student values('2','zyl','1','2');
insert into student values('3','lll','1','2');
insert into student values('4','kk','0','2');
insert into student values('5','zhangsan)','1','6');
insert into student values('6','lisi','0','2');
insert into student values('7','wangwu','0','2');
insert into student values('8','zhaoliu','0','2');


CREATE TABLE course(
                       id BIGINT(20) UNSIGNED NOT NULL,
                       course_name varchar(128) not NULL,
                       credit float(10) not NULL,
                       PRIMARY KEY (id)
) CHARSET=utf8;

INSERT into course(id, course_name, credit)
VALUES
(1,'Chinese',4.0),
(2,'Math',4.0),
(3,'English',4.0)
(4,'history',4.0),
(5,'mysql',4.0),
(6,'python',4.0),
(7,'java',4.0)


CREATE TABLE course_to_student(
                                  sc_id int not NULL auto_increment,
                                  s_id BIGINT(20),
                                  c_id BIGINT(20),
                                  PRIMARY KEY(sc_id)
)

INSERT INTO course_to_student (s_id, c_id)
VALUES
( 1, 2 ),
( 6, 3 ),
( 1, 7 ),
( 2, 1 ),
( 2, 4 ),
( 2, 7 ),
( 3, 1 ),
( 3, 5 ),
( 4, 4 ),
( 1, 4 ),
( 5, 2 ),
( 7, 5 )

SELECT
    course.course_name,
    student.stud_name
FROM course_to_student
         LEFT JOIN student on course_to_student.s_id=student.id
         LEFT JOIN course on course_to_student.c_id=course.id
where student.id=4

SELECT
    course.course_name,
    student.stud_name
FROM course_to_student
         LEFT JOIN student on course_to_student.s_id=student.id
         LEFT JOIN course on course_to_student.c_id=course.id
where course.course_name='Chinese'