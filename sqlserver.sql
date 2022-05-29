-- database name is 'teamforming', I created it manually
CREATE TABLE users (
    username varchar(80) not null unique,
    password varchar(30) not null,
    teams varchar(80)[],
    primary key (username)
);

CREATE TABLE players (
    id integer not null unique,
    name varchar(80) not null,
    rating float,
    teamname varchar(80),
    primary key (id)
);

insert into players (id, name, rating, teamname) values (1, 'Randall', 9.3, null);
insert into players (id, name, rating, teamname) values (2, 'Eden', 9.4, null);
insert into players (id, name, rating, teamname) values (3, 'Shay', 3.4, null);
insert into players (id, name, rating, teamname) values (4, 'Annecorinne', 7.2, null);
insert into players (id, name, rating, teamname) values (5, 'Maribel', 7.9, 'Yellow');
insert into players (id, name, rating, teamname) values (6, 'Alvina', 7.4, null);
insert into players (id, name, rating, teamname) values (7, 'Ardath', 3.3, 'Blue');
insert into players (id, name, rating, teamname) values (8, 'Rosalyn', 7.1, null);
insert into players (id, name, rating, teamname) values (9, 'Rhetta', 2.8, null);
insert into players (id, name, rating, teamname) values (10, 'Melantha', 8.7, null);
insert into players (id, name, rating, teamname) values (11, 'Waite', 4.8, null);
insert into players (id, name, rating, teamname) values (12, 'Marion', 7.9, null);
insert into players (id, name, rating, teamname) values (13, 'Holly-anne', 1.7, 'Blue');
insert into players (id, name, rating, teamname) values (14, 'Arnoldo', 1.3, null);
insert into players (id, name, rating, teamname) values (15, 'Kettie', 7.2, null);
insert into players (id, name, rating, teamname) values (16, 'Tarrance', 2.5, null);
insert into players (id, name, rating, teamname) values (17, 'Dodie', 9.5, null);
insert into players (id, name, rating, teamname) values (18, 'Artus', 3.0, 'Yellow');
insert into players (id, name, rating, teamname) values (19, 'Christy', 1.2, null);
insert into players (id, name, rating, teamname) values (20, 'Vincenz', 2.0, null);
insert into players (id, name, rating, teamname) values (21, 'Matthew', 6.2, null);
insert into players (id, name, rating, teamname) values (22, 'Roxi', 3.2, null);
insert into players (id, name, rating, teamname) values (23, 'Harriott', 3.1, null);
insert into players (id, name, rating, teamname) values (24, 'Grissel', 7.6, 'Yellow');
insert into players (id, name, rating, teamname) values (25, 'Tate', 9.9, 'Blue');
insert into players (id, name, rating, teamname) values (26, 'Alla', 2.6, null);
insert into players (id, name, rating, teamname) values (27, 'Kandace', 8.8, null);
insert into players (id, name, rating, teamname) values (28, 'Loy', 9.3, null);
insert into players (id, name, rating, teamname) values (29, 'Tiffi', 7.5, 'Blue');
insert into players (id, name, rating, teamname) values (30, 'Yolanda', 8.7, null);
insert into players (id, name, rating, teamname) values (31, 'Kerr', 9.5, 'Yellow');
insert into players (id, name, rating, teamname) values (32, 'Grete', 8.8, null);
insert into players (id, name, rating, teamname) values (33, 'Aindrea', 6.3, 'Yellow');
insert into players (id, name, rating, teamname) values (34, 'Finley', 2.8, null);
insert into players (id, name, rating, teamname) values (35, 'Dewie', 6.2, null);
insert into players (id, name, rating, teamname) values (36, 'Caressa', 4.7, 'Blue');
insert into players (id, name, rating, teamname) values (37, 'Juliana', 3.1, null);
insert into players (id, name, rating, teamname) values (38, 'Noelyn', 5.6, null);
insert into players (id, name, rating, teamname) values (39, 'Alicia', 9.4, null);
insert into players (id, name, rating, teamname) values (40, 'Hester', 9.0, null);
insert into players (id, name, rating, teamname) values (41, 'Carny', 9.9, 'Yellow');
insert into players (id, name, rating, teamname) values (42, 'Lela', 4.6, 'Blue');
insert into players (id, name, rating, teamname) values (43, 'Ramona', 2.1, null);
insert into players (id, name, rating, teamname) values (44, 'Georges', 3.4, null);
insert into players (id, name, rating, teamname) values (45, 'Rodd', 6.4, 'Yellow');
insert into players (id, name, rating, teamname) values (46, 'Bettine', 4.1, 'Blue');
insert into players (id, name, rating, teamname) values (47, 'Dav', 8.3, null);
insert into players (id, name, rating, teamname) values (48, 'Erda', 4.5, 'Blue');
insert into players (id, name, rating, teamname) values (49, 'Benoit', 3.9, null);
insert into players (id, name, rating, teamname) values (50, 'Freda', 8.9, null);

insert into users (username, password, teams) values ('tivic0', '6yOfJHtjlof', null);
insert into users (username, password, teams) values ('ihamlen1', '51j21XPxD', null);
insert into users (username, password, teams) values ('iwarwicker2', 'aMueS3', null);
insert into users (username, password, teams) values ('jcausbey3', '30pyGx8L7', '{"Yellow", "Blue"}');