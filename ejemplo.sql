--
-- PostgreSQL database dump
--

-- Dumped from database version 12.3 (Ubuntu 12.3-1.pgdg20.04+1)
-- Dumped by pg_dump version 12.3 (Ubuntu 12.3-1.pgdg20.04+1)

-- Started on 2020-07-29 12:53:45 CDT

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
-- TOC entry 203 (class 1259 OID 17146)
-- Name: departamento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.departamento (
    clave character varying,
    nombre character varying
);


ALTER TABLE public.departamento OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 17140)
-- Name: persona; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.persona (
    clave character varying,
    nombre character varying,
    direccion character varying,
    telefono character varying
);


ALTER TABLE public.persona OWNER TO postgres;

--
-- TOC entry 2963 (class 0 OID 17146)
-- Dependencies: 203
-- Data for Name: departamento; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.departamento (clave, nombre) FROM stdin;
001	Administracion
003	Mecatronica
088	PIso 4
259	Medicina
\.


--
-- TOC entry 2962 (class 0 OID 17140)
-- Dependencies: 202
-- Data for Name: persona; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.persona (clave, nombre, direccion, telefono) FROM stdin;
02	Jesus	Av 1	888
\.


-- Completed on 2020-07-29 12:53:45 CDT

--
-- PostgreSQL database dump complete
--

