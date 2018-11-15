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
--NIVEL
INSERT INTO nivel (id,descripcion,numero,plan_id) VALUES (1,'Nivel 1 - Primer Grado',1,1);
INSERT INTO nivel (id,descripcion,numero,plan_id) VALUES (2,'Nivel 2 - Segundo Grado',2,1);
INSERT INTO nivel (id,descripcion,numero,plan_id) VALUES (3,'Nivel 3 - Tercer Grado',3,1);
INSERT INTO nivel (id,descripcion,numero,plan_id) VALUES (4,'Nivel 4 - Cuarto Grado',4,1);
--CURSO
INSERT INTO curso (id,anio_calendario,codigo,cupo,decripcion,nivel_id) VALUES (1,2018,'A',10,'Curso A',1);
INSERT INTO curso (id,anio_calendario,codigo,cupo,decripcion,nivel_id) VALUES (2,2018,'B',10,'Curso B',1);
INSERT INTO curso (id,anio_calendario,codigo,cupo,decripcion,nivel_id) VALUES (3,2018,'A',15,'Curso A',2);
INSERT INTO curso (id,anio_calendario,codigo,cupo,decripcion,nivel_id) VALUES (4,2018,'B',14,'Curso B',2);
INSERT INTO curso (id,anio_calendario,codigo,cupo,decripcion,nivel_id) VALUES (5,2018,'A',15,'Curso A',3);
INSERT INTO curso (id,anio_calendario,codigo,cupo,decripcion,nivel_id) VALUES (6,2018,'B',14,'Curso B',3);
INSERT INTO curso (id,anio_calendario,codigo,cupo,decripcion,nivel_id) VALUES (7,2018,'A',15,'Curso A',4);
INSERT INTO curso (id,anio_calendario,codigo,cupo,decripcion,nivel_id) VALUES (8,2018,'B',14,'Curso B',4);
--MATERIA
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (1,'Matematica 1','7am','Salon A',1);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (2,'Matematica 2','7am','Salon B',2);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (3,'Matematica 3','7am','Salon C',3);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (4,'Matematica 4','7am','Salon D',4);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (5,'Lengua 1','9am','Salon A',1);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (6,'Lengua 2','9am','Salon B',2);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (7,'Lengua 3','9am','Salon C',3);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (8,'Lengua 4','9am','Salon D',4);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (9,'Historia 1','10am','Salon A',1);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (10,'Historia 2','10am','Salon B',2);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (11,'Historia 3','10am','Salon C',3);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (12,'Historia 4','10am','Salon D',4);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (13,'Informática 1','11am','Salon A',1);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (14,'Informática 2','11am','Salon B',2);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (15,'Informática 3','11am','Salon C',3);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (16,'Informática 4','11am','Salon D',4);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (17,'Geografía 1','12am','Salon A',1);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (18,'Geografía 2','12am','Salon B',2);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (19,'Geografía 3','12am','Salon C',3);
INSERT INTO materia (id,descripcion,horario,salon,nivel_id) VALUES (20,'Geografía 4','12am','Salon D',4);
--PERSONA
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,persona_id) VALUES (1,'Pablo','Cerretto','93720038','1991-08-08 00:00:00','262464',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,persona_id) VALUES (10,'Benjamin','Cerretto','54891619','1986-08-11 00:00:00','65484848',1);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,persona_id) VALUES (2,'Matias','Lusardi','2565','1991-08-08 00:00:00','25888888',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,persona_id) VALUES (3,'Adolfo','Cia','1234','1991-08-08 00:00:00','126854',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,persona_id) VALUES (4,'Cristian','Calicho','12555554','1991-08-08 00:00:00','555555',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,persona_id) VALUES (6,'Agustin','Rios','1234578399','1982-08-11 00:00:00','1212',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,persona_id) VALUES (7,'Miguel','Calabro','1244393','1986-08-11 00:00:00','555468',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,persona_id) VALUES (9,'Ronaldo','Cristiano','54891619','1986-08-11 00:00:00','65484848',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,persona_id) VALUES (11,'Marcelo','Gallardo','58818181','1986-08-11 00:00:00','134444',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,persona_id) VALUES (5,'Federico','Medina','4444444','1991-08-08 00:00:00','444444',11);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,persona_id) VALUES (12,'Diego Armando','Maradona','65848488','1986-08-11 00:00:00','2888814',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,persona_id) VALUES (13,'Ricardo','Bochini','2928888','1986-08-11 00:00:00','213331',null);
INSERT INTO persona(id,nombre,apellido,nro_documento,fecha_nacimiento,telefono,persona_id) VALUES (8,'Lionel','Messi','18888888','1986-08-11 00:00:00','665555',13);
--USUARIO
INSERT INTO usuario (id,usr,password,fecha_inscripcion,persona_id) VALUES (1,'pablo','pablo',CURRENT_TIMESTAMP,1);
INSERT INTO usuario (id,usr,password,fecha_inscripcion,persona_id) VALUES (2,'mati','mati',CURRENT_TIMESTAMP,2);
INSERT INTO usuario (id,usr,password,fecha_inscripcion,persona_id) VALUES (3,'ado','ado',CURRENT_TIMESTAMP,3);
INSERT INTO usuario (id,usr,password,fecha_inscripcion,persona_id) VALUES (4,'admin','admin',CURRENT_TIMESTAMP,3);
--ALUMNO
INSERT INTO alumno (id,persona_id) VALUES (1,4);
INSERT INTO alumno (id,persona_id) VALUES (2,5);
INSERT INTO alumno (id,persona_id) VALUES (3,6);
INSERT INTO alumno (id,persona_id) VALUES (4,7);
INSERT INTO alumno (id,persona_id) VALUES (5,8);
INSERT INTO alumno (id,persona_id) VALUES (6,9);
INSERT INTO alumno (id,persona_id) VALUES (7,10);
INSERT INTO alumno (id,persona_id) VALUES (8,12);
--DOCENTE
INSERT INTO docente (id,persona_id) VALUES (1,2);
INSERT INTO docente (id,persona_id) VALUES (2,3);
--ROL
INSERT INTO rol (id,codigo,descripcion) VALUES (1,'ADMIN','Administrador');
INSERT INTO rol (id,codigo,descripcion) VALUES (2,'DOCENTE','Administrador');
--USUARIO/ROL
INSERT INTO usu_rol (id, fecha_desde, fecha_hasta, rol_id, usuario_id) VALUES (1,'2018-01-01 00:00:00','2019-01-01 00:00:00', 1, 4);
INSERT INTO usu_rol (id, fecha_desde, fecha_hasta, rol_id, usuario_id) VALUES (2,'2018-01-01 00:00:00','2019-01-01 00:00:00', 2, 1);
INSERT INTO usu_rol (id, fecha_desde, fecha_hasta, rol_id, usuario_id) VALUES (3,'2018-01-01 00:00:00','2019-01-01 00:00:00', 2, 2);
INSERT INTO usu_rol (id, fecha_desde, fecha_hasta, rol_id, usuario_id) VALUES (4,'2018-01-01 00:00:00','2019-01-01 00:00:00', 2, 3);
--ALUMNO/CURSO
INSERT INTO alumno_curso (id,anio,fecha_inscripcion,alumno_id,curso_id) VALUES (1,2018,'2018-08-08 00:00:00',1,1);
INSERT INTO alumno_curso (id,anio,fecha_inscripcion,alumno_id,curso_id) VALUES (2,2018,'2018-08-08 00:00:00',2,1);
INSERT INTO alumno_curso (id,anio,fecha_inscripcion,alumno_id,curso_id) VALUES (3,2018,'2018-08-08 00:00:00',3,1);
INSERT INTO alumno_curso (id,anio,fecha_inscripcion,alumno_id,curso_id) VALUES (4,2018,'2018-08-08 00:00:00',4,2);
INSERT INTO alumno_curso (id,anio,fecha_inscripcion,alumno_id,curso_id) VALUES (5,2018,'2018-08-08 00:00:00',5,2);
INSERT INTO alumno_curso (id,anio,fecha_inscripcion,alumno_id,curso_id) VALUES (6,2018,'2018-08-08 00:00:00',6,2);
--EVALUACION
INSERT INTO evaluacion (id,descripcion,materia_id) VALUES (1,'Evaluación 1',1);
INSERT INTO evaluacion (id,descripcion,materia_id) VALUES (2,'Evaluación 2',1);
INSERT INTO evaluacion (id,descripcion,materia_id) VALUES (3,'Evaluación 3',1);
INSERT INTO evaluacion (id,descripcion,materia_id) VALUES (4,'Evaluación 1',5);
INSERT INTO evaluacion (id,descripcion,materia_id) VALUES (5,'Evaluación 2',5);
INSERT INTO evaluacion (id,descripcion,materia_id) VALUES (6,'Evaluación 1',9);
INSERT INTO evaluacion (id,descripcion,materia_id) VALUES (7,'Evaluación 1',13);
INSERT INTO evaluacion (id,descripcion,materia_id) VALUES (8,'Evaluación 1',17);
INSERT INTO evaluacion (id,descripcion,materia_id) VALUES (9,'Evaluación 2',17);
--NOTA
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (1,'8','2018-05-15 00:00:00',1,1);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (2,'6','2018-08-08 00:00:00',1,2);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (3,'3','2018-05-15 00:00:00',2,1);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (4,'6','2018-08-08 00:00:00',2,2);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (5,'9','2018-05-15 00:00:00',3,1);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (6,'8','2018-08-08 00:00:00',3,2);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (7,'10','2018-06-02 00:00:00',1,4);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (8,'7','2018-06-02 00:00:00',2,4);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (9,'9','2018-06-02 00:00:00',3,4);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (10,'5','2018-06-20 00:00:00',1,8);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (11,'6','2018-06-20 00:00:00',2,8);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (12,'5.5','2018-06-20 00:00:00',3,8);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (13,'10','2018-08-15 00:00:00',1,6);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (14,'9','2018-08-15 00:00:00',2,6);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (15,'8.5','2018-08-15 00:00:00',3,6);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (16,'8','2018-05-17 00:00:00',4,1);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (17,'6','2018-08-10 00:00:00',5,2);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (18,'3','2018-05-17 00:00:00',6,1);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (19,'6','2018-08-10 00:00:00',4,2);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (20,'9','2018-05-17 00:00:00',5,1);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (21,'8','2018-08-10 00:00:00',6,2);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (22,'10','2018-06-06 00:00:00',4,4);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (23,'7','2018-06-06 00:00:00',5,4);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (24,'9','2018-06-06 00:00:00',6,4);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (25,'5','2018-06-24 00:00:00',4,8);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (26,'6','2018-06-24 00:00:00',5,8);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (27,'5.5','2018-06-24 00:00:00',6,8);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (28,'10','2018-08-10 00:00:00',4,6);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (29,'9','2018-08-10 00:00:00',5,6);
INSERT INTO nota (id,calificacion,fecha,alumno_curso_id,evaluacion_id) VALUES (30,'8.5','2018-08-10 00:00:00',6,6);

--DOCENTE_MATERIA
INSERT INTO docente_materia (id,anio,docente_id,materia_id) VALUES (1,2018,2,1);
INSERT INTO docente_materia (id,anio,docente_id,materia_id) VALUES (2,2018,2,5);
INSERT INTO docente_materia (id,anio,docente_id,materia_id) VALUES (3,2018,2,9);
INSERT INTO docente_materia (id,anio,docente_id,materia_id) VALUES (4,2018,2,13);
INSERT INTO docente_materia (id,anio,docente_id,materia_id) VALUES (5,2018,2,17);



