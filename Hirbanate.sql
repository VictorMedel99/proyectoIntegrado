--
-- PostgreSQL database dump
--

-- Dumped from database version 12.3 (Ubuntu 12.3-1.pgdg20.04+1)
-- Dumped by pg_dump version 12.3 (Ubuntu 12.3-1.pgdg20.04+1)

-- Started on 2020-07-29 12:45:52 CDT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 202 (class 1259 OID 17179)
-- Name: empleados; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.empleados (
    id character varying NOT NULL,
    nombre character varying NOT NULL,
    apellidos character varying NOT NULL,
    direccion character varying NOT NULL,
    telefono character varying NOT NULL
);


ALTER TABLE public.empleados OWNER TO postgres;

--
-- TOC entry 2957 (class 0 OID 17179)
-- Dependencies: 202
-- Data for Name: empleados; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.empleados (id, nombre, apellidos, direccion, telefono) FROM stdin;
009	Jesus	fdgdgd	gdfgg	dggfd
0008	Alberto	Garcia	Av 22	4444
002	hhkkjhk	hkkhlhlkh	hklhklhklh	lkhklhhklhlk
005	Victor	Medel	hahahaha	899798797
\.


-- Completed on 2020-07-29 12:45:52 CDT

--
-- PostgreSQL database dump complete
--

