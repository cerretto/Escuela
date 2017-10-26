---------------------------------------------
-- DDL para llenar la DB con datos de prueba |
---------------------------------------------
--INSERT INTO NOVEDADES (nombre,descripcion) VALUES ('Acto','Acto realizado por todo el colegio')
INSERT INTO TIPOAVISO (id,codTipoAviso,descTipoAviso) values (1,'1','Actividad');
INSERT INTO TIPOAVISO (id,codTipoAviso,descTipoAviso) values (2,'2','Comunicado');
INSERT INTO TIPOAVISO (id,codTipoAviso,descTipoAviso) values (3,'3','Evento');
INSERT INTO TIPOAVISO (id,codTipoAviso,descTipoAviso) values (4,'4','Reunion');
INSERT INTO TIPOAVISO (id,codTipoAviso,descTipoAviso) values (5,'5','Anuncio');
INSERT INTO TIPOAVISO (id,codTipoAviso,descTipoAviso) values (6,'6','Nota');
INSERT INTO TIPOAVISO (id,codTipoAviso,descTipoAviso) values (7,'7','Acto');
INSERT INTO AVISOS (idTipoAviso,fechaAviso,descAviso) values (1,current_timestamp,'Actividades relacionadas con las vacaciones de invierno');
INSERT INTO AVISOS (idTipoAviso,fechaAviso,descAviso) values (2,current_timestamp,'Mañana el horario de salida sera a las 3PM por la asamblea docente');
INSERT INTO AVISOS (idTipoAviso,fechaAviso,descAviso) values (3,current_timestamp,'Evento por el dia de la primavera, invitamos a todos los padres');
INSERT INTO AVISOS (idTipoAviso,fechaAviso,descAviso) values (4,current_timestamp,'Reunion de padres');
INSERT INTO AVISOS (idTipoAviso,fechaAviso,descAviso) values (4,current_timestamp,'Reunion para debatir el presupuesto del dia de la bandera');
INSERT INTO AVISOS (idTipoAviso,fechaAviso,descAviso) values (5,current_timestamp,'La cooperadora logro conseguir 4 computadoras nuevas');
INSERT INTO AVISOS (idTipoAviso,fechaAviso,descAviso) values (5,current_timestamp,'La cena de fin de año dio un saldo de 20.000 pesos');
INSERT INTO AVISOS (idTipoAviso,fechaAviso,descAviso) values (6,current_timestamp,'Se cargo las notas de el 2do parial');
INSERT INTO AVISOS (idTipoAviso,fechaAviso,descAviso) values (7,current_timestamp,'Acto del 9 de julio');
INSERT INTO AVISOS (idTipoAviso,fechaAviso,descAviso) values (7,current_timestamp,'Acto del 25 de mayo');