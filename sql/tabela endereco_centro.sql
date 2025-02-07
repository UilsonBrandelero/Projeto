--
-- PostgreSQL database dump
--

-- Dumped from database version 16.2
-- Dumped by pg_dump version 16.2

-- Started on 2024-07-03 19:37:31

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
-- TOC entry 226 (class 1259 OID 16678)
-- Name: endereco_centro_recebimento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.endereco_centro_recebimento (
    id_endereco_centro_recebimento integer NOT NULL,
    id_centro_recebimento_endereco integer NOT NULL,
    cep_centro_recebimento character varying(256) NOT NULL,
    rua_centro_recebimento character varying(255) NOT NULL,
    bairro_centro_recebimento character varying(255) NOT NULL,
    nro_centro_recebimento integer NOT NULL,
    complemento_centro_recebimento character varying(255) NOT NULL,
    cidade_centro_recebimento character varying(256) NOT NULL,
    uf_centro_recebimento character varying(256) NOT NULL
);


ALTER TABLE public.endereco_centro_recebimento OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 16677)
-- Name: endereco_centro_recebimento_id_endereco_centro_recebimento_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.endereco_centro_recebimento_id_endereco_centro_recebimento_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.endereco_centro_recebimento_id_endereco_centro_recebimento_seq OWNER TO postgres;

--
-- TOC entry 4869 (class 0 OID 0)
-- Dependencies: 225
-- Name: endereco_centro_recebimento_id_endereco_centro_recebimento_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.endereco_centro_recebimento_id_endereco_centro_recebimento_seq OWNED BY public.endereco_centro_recebimento.id_endereco_centro_recebimento;


--
-- TOC entry 4715 (class 2604 OID 16681)
-- Name: endereco_centro_recebimento id_endereco_centro_recebimento; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco_centro_recebimento ALTER COLUMN id_endereco_centro_recebimento SET DEFAULT nextval('public.endereco_centro_recebimento_id_endereco_centro_recebimento_seq'::regclass);


--
-- TOC entry 4863 (class 0 OID 16678)
-- Dependencies: 226
-- Data for Name: endereco_centro_recebimento; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.endereco_centro_recebimento (id_endereco_centro_recebimento, id_centro_recebimento_endereco, cep_centro_recebimento, rua_centro_recebimento, bairro_centro_recebimento, nro_centro_recebimento, complemento_centro_recebimento, cidade_centro_recebimento, uf_centro_recebimento) FROM stdin;
6	9	11.111-111	rua res	bom	78	lá	Cândido Mota	SP
5	8	12.333-333	XGN	SFG	4235	PERTO DALI	Capinzal	SC
\.


--
-- TOC entry 4870 (class 0 OID 0)
-- Dependencies: 225
-- Name: endereco_centro_recebimento_id_endereco_centro_recebimento_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.endereco_centro_recebimento_id_endereco_centro_recebimento_seq', 6, true);


--
-- TOC entry 4717 (class 2606 OID 16685)
-- Name: endereco_centro_recebimento endereco_centro_recebimento_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco_centro_recebimento
    ADD CONSTRAINT endereco_centro_recebimento_pkey PRIMARY KEY (id_endereco_centro_recebimento);


--
-- TOC entry 4718 (class 2606 OID 16686)
-- Name: endereco_centro_recebimento endereco_centro_recebimento_id_centro_recebimento_endereco_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco_centro_recebimento
    ADD CONSTRAINT endereco_centro_recebimento_id_centro_recebimento_endereco_fkey FOREIGN KEY (id_centro_recebimento_endereco) REFERENCES public.centro_recebimento(id_centro_recebimento);


-- Completed on 2024-07-03 19:37:32

--
-- PostgreSQL database dump complete
--

