# Acceso a IDE de la DB H2:
- localhost:8081/h2-console


# Tumbar el schema con las tablas y volver a crearlo:

DROP SCHEMA public CASCADE;
CREATE SCHEMA public;
--
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO public;