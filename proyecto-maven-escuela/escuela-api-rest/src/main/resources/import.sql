---------------------------------------------
-- DDL para llenar la DB con datos de prueba |
---------------------------------------------
--INSERT INTO NOVEDADES (nombre,descripcion) VALUES ('Acto','Acto realizado por todo el colegio')
INSERT INTO tipoaviso (id,codigo,descripcion) values (1,'1','Actividad');
INSERT INTO tipoaviso (id,codigo,descripcion) values (2,'2','Comunicado');
INSERT INTO tipoaviso (id,codigo,descripcion) values (3,'3','Evento');
INSERT INTO tipoaviso (id,codigo,descripcion) values (4,'4','Reunion');
INSERT INTO tipoaviso (id,codigo,descripcion) values (5,'5','Anuncio');
INSERT INTO tipoaviso (id,codigo,descripcion) values (6,'6','Nota');
INSERT INTO tipoaviso (id,codigo,descripcion) values (7,'7','Acto');
INSERT INTO aviso (id, tipo_aviso_id,fecha,descripcion) values (1,1,'2017-11-17 00:00:00','Actividades relacionadas con las vacaciones de invierno');
INSERT INTO aviso (id, tipo_aviso_id,fecha,descripcion) values (2,2,'2017-11-17 00:00:00','Mañana el horario de salida sera a las 3PM por la asamblea docente');
INSERT INTO aviso (id, tipo_aviso_id,fecha,descripcion) values (3,3,'2017-11-17 00:00:00','Evento por el dia de la primavera, invitamos a todos los padres');
INSERT INTO aviso (id, tipo_aviso_id,fecha,descripcion) values (4,4,'2017-11-17 00:00:00','Reunion de padres');
INSERT INTO aviso (id, tipo_aviso_id,fecha,descripcion) values (5,4,'2017-11-17 00:00:00','Reunion para debatir el presupuesto del dia de la bandera');
INSERT INTO aviso (id, tipo_aviso_id,fecha,descripcion) values (6,5,'2017-11-17 00:00:00','La cooperadora logro conseguir 4 computadoras nuevas');
INSERT INTO aviso (id, tipo_aviso_id,fecha,descripcion) values (7,5,'2017-11-17 00:00:00','La cena de fin de año dio un saldo de 20.000 pesos');
INSERT INTO aviso (id, tipo_aviso_id,fecha,descripcion) values (8,6,'2017-11-17 00:00:00','Se cargo las notas de el 2do parial');
INSERT INTO aviso (id, tipo_aviso_id,fecha,descripcion) values (9,7,'2017-11-17 00:00:00','Acto del 9 de julio');
INSERT INTO aviso (id, tipo_aviso_id,fecha,descripcion) values (10,7,'2017-11-17 00:00:00','Acto del 25 de mayo');