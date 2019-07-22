CREATE TABLE users (
  usr_id INT NOT NULL AUTO_INCREMENT,
  usr_rank INT NOT NULL,
  usr_username VARCHAR(20) NOT NULL,
  usr_email VARCHAR(20) NOT NULL,
  usr_password VARCHAR(20) NOT NULL,
  usr_firstname VARCHAR(20) NOT NULL,
  usr_lastname VARCHAR(20) NOT NULL,
  usr_requests VARCHAR(45),
  PRIMARY KEY (usr_id),
  UNIQUE (usr_id, usr_email, usr_username)
);


insert into requests(rq_admin_id,rq_admin_note,rq_balance,rq_purpose,rq_requester_id,rq_type)
value(null,null,10000,'visiting family',100,'travel');
insert into requests(rq_admin_id,rq_admin_note,rq_balance,rq_purpose,rq_requester_id,rq_type)
value(null,null,12717,'visiting family',100,'travel');
insert into requests(rq_admin_id,rq_admin_note,rq_balance,rq_purpose,rq_requester_id,rq_type)
value(null,null,28103,'annual company party',100,'company');
insert into requests(rq_admin_id,rq_admin_note,rq_balance,rq_purpose,rq_requester_id,rq_type)
value(4,null,10000,'visiting family',100,'travel');


insert into users(usr_rank,usr_username,usr_firstname,usr_lastname,usr_email,usr_password,usr_requests)
values(0,'Lei1','Lei','Raion','lei@gmail.com','pw', null);
insert into users(usr_rank,usr_username,usr_firstname,usr_lastname,usr_email,usr_password,usr_requests)
values(0,'Kiba1','Michael','Holler','mh@gmail.com','pw', null);
insert into users(usr_rank,usr_username,usr_firstname,usr_lastname,usr_email,usr_password,usr_requests)
values(0,'J55','Jayce','Bheart','JB55@gmail.com','pw', null);
insert into users(usr_rank,usr_username,usr_firstname,usr_lastname,usr_email,usr_password,usr_requests)
values(1,'old1','Eugene','Rotwell','old1@aol.com','pw', null);