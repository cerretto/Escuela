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

--PLAN
INSERT INTO plan (id,anio,codigo,descripcion) VALUES (1,'2008','08','Plan 2008');
INSERT INTO plan (id,anio,codigo,descripcion) VALUES (2,'1995','95','Plan 1995');
--NIVEL
INSERT INTO nivel (id,descripcion,numero,plan_id) VALUES (1,'Nivel 1 - Primaria',1,1);
INSERT INTO nivel (id,descripcion,numero,plan_id) VALUES (2,'Nivel 2 - Primaria',2,1);
INSERT INTO nivel (id,descripcion,numero,plan_id) VALUES (3,'Nivel 3 - Primaria',3,1);
INSERT INTO nivel (id,descripcion,numero,plan_id) VALUES (4,'Nivel 1 - Primaria',1,2);
--CURSO
INSERT INTO curso (id,anio_calendario,codigo,cupo,decripcion,nivel_id) VALUES (1,2017,'A',10,'Curso A',1);
INSERT INTO curso (id,anio_calendario,codigo,cupo,decripcion,nivel_id) VALUES (2,2017,'B',10,'Curso B',1);
INSERT INTO curso (id,anio_calendario,codigo,cupo,decripcion,nivel_id) VALUES (3,2017,'A',15,'Curso A',2);
INSERT INTO curso (id,anio_calendario,codigo,cupo,decripcion,nivel_id) VALUES (4,2017,'B',14,'Curso B',2);
--MATERIA
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (1,'Matematica 1','7am','Salon A',1);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (2,'Matematica 2','9am','Salon B',2);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (3,'Matematica 3','11am','Salon C',3);
--PERSONA
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,responsable_id) VALUES (1,'Pablo','Cerretto','93720038','1991-08-08 00:00:00','262464',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,responsable_id) VALUES (2,'Matias','Lusardi','2565','1991-08-08 00:00:00','25888888',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,responsable_id) VALUES (3,'Adolfo','Cia','1234','1991-08-08 00:00:00','126854',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,responsable_id) VALUES (4,'Alumno','Alumno','12555554','1991-08-08 00:00:00','555555',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,responsable_id) VALUES (5,'Docente','Docente','4444444','1991-08-08 00:00:00','444444',null);
--USUARIO
INSERT INTO usuario (id,usr,password,fecha_inscripcion,persona_id) VALUES (1,'pablo','pablo',CURRENT_TIMESTAMP,1);
INSERT INTO usuario (id,usr,password,fecha_inscripcion,persona_id) VALUES (2,'mati','mati',CURRENT_TIMESTAMP,2);
INSERT INTO usuario (id,usr,password,fecha_inscripcion,persona_id) VALUES (3,'ado','ado',CURRENT_TIMESTAMP,3);
--ALUMNO
INSERT INTO alumno (id,persona_id) VALUES (1,4);
--DOCENTE
INSERT INTO docente (id,persona_id) VALUES (1,5);
--ROL
INSERT INTO rol (id,codigo,descripcion) VALUES (1,'admin','Administrador');




