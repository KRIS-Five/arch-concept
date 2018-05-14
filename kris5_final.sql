--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.12
-- Dumped by pg_dump version 9.6.8

-- Started on 2018-05-14 10:22:09 EEST

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 8 (class 2615 OID 16387)
-- Name: kris5; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA kris5;


--
-- TOC entry 191 (class 1255 OID 16388)
-- Name: generate_persons(integer); Type: FUNCTION; Schema: kris5; Owner: -
--

CREATE FUNCTION kris5.generate_persons(number_to_generate integer) RETURNS void
    LANGUAGE plpgsql
    AS $$
BEGIN
  INSERT INTO person (personal_code)
    SELECT
      substring(md5(random()::text), 0, 16) as personal_code
    FROM generate_series(1,number_to_generate) id;
END;
$$;


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 182 (class 1259 OID 16389)
-- Name: decree; Type: TABLE; Schema: kris5; Owner: -
--

CREATE TABLE kris5.decree (
    id bigint NOT NULL,
    create_date timestamp with time zone DEFAULT now() NOT NULL,
    status character varying(20) DEFAULT 'CREATED'::character varying NOT NULL,
    finalized_date timestamp with time zone,
    number_of_items integer DEFAULT 0 NOT NULL
);


--
-- TOC entry 183 (class 1259 OID 16395)
-- Name: decree_id_seq; Type: SEQUENCE; Schema: kris5; Owner: -
--

CREATE SEQUENCE kris5.decree_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2162 (class 0 OID 0)
-- Dependencies: 183
-- Name: decree_id_seq; Type: SEQUENCE OWNED BY; Schema: kris5; Owner: -
--

ALTER SEQUENCE kris5.decree_id_seq OWNED BY kris5.decree.id;


--
-- TOC entry 184 (class 1259 OID 16397)
-- Name: item; Type: TABLE; Schema: kris5; Owner: -
--

CREATE TABLE kris5.item (
    id bigint NOT NULL,
    create_date timestamp without time zone DEFAULT now() NOT NULL,
    owner_person_id bigint,
    decree_id bigint NOT NULL,
    registry_part_id bigint NOT NULL,
    processed_date timestamp without time zone,
    status character varying(20) DEFAULT 'CREATED'::character varying NOT NULL
);


--
-- TOC entry 185 (class 1259 OID 16402)
-- Name: item_id_seq; Type: SEQUENCE; Schema: kris5; Owner: -
--

CREATE SEQUENCE kris5.item_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2163 (class 0 OID 0)
-- Dependencies: 185
-- Name: item_id_seq; Type: SEQUENCE OWNED BY; Schema: kris5; Owner: -
--

ALTER SEQUENCE kris5.item_id_seq OWNED BY kris5.item.id;


--
-- TOC entry 186 (class 1259 OID 16404)
-- Name: person; Type: TABLE; Schema: kris5; Owner: -
--

CREATE TABLE kris5.person (
    id bigint NOT NULL,
    personal_code character varying(32) NOT NULL
);


--
-- TOC entry 187 (class 1259 OID 16407)
-- Name: person_id_seq; Type: SEQUENCE; Schema: kris5; Owner: -
--

CREATE SEQUENCE kris5.person_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2164 (class 0 OID 0)
-- Dependencies: 187
-- Name: person_id_seq; Type: SEQUENCE OWNED BY; Schema: kris5; Owner: -
--

ALTER SEQUENCE kris5.person_id_seq OWNED BY kris5.person.id;


--
-- TOC entry 188 (class 1259 OID 16409)
-- Name: registry_part; Type: TABLE; Schema: kris5; Owner: -
--

CREATE TABLE kris5.registry_part (
    id bigint NOT NULL,
    part_uid character varying(32) NOT NULL
);


--
-- TOC entry 189 (class 1259 OID 16412)
-- Name: registry_part_id_seq; Type: SEQUENCE; Schema: kris5; Owner: -
--

CREATE SEQUENCE kris5.registry_part_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2165 (class 0 OID 0)
-- Dependencies: 189
-- Name: registry_part_id_seq; Type: SEQUENCE OWNED BY; Schema: kris5; Owner: -
--

ALTER SEQUENCE kris5.registry_part_id_seq OWNED BY kris5.registry_part.id;


--
-- TOC entry 190 (class 1259 OID 16414)
-- Name: status; Type: TABLE; Schema: kris5; Owner: -
--

CREATE TABLE kris5.status (
    code character varying(20) NOT NULL
);


--
-- TOC entry 2012 (class 2604 OID 16417)
-- Name: decree id; Type: DEFAULT; Schema: kris5; Owner: -
--

ALTER TABLE ONLY kris5.decree ALTER COLUMN id SET DEFAULT nextval('kris5.decree_id_seq'::regclass);


--
-- TOC entry 2015 (class 2604 OID 16418)
-- Name: item id; Type: DEFAULT; Schema: kris5; Owner: -
--

ALTER TABLE ONLY kris5.item ALTER COLUMN id SET DEFAULT nextval('kris5.item_id_seq'::regclass);


--
-- TOC entry 2016 (class 2604 OID 16419)
-- Name: person id; Type: DEFAULT; Schema: kris5; Owner: -
--

ALTER TABLE ONLY kris5.person ALTER COLUMN id SET DEFAULT nextval('kris5.person_id_seq'::regclass);


--
-- TOC entry 2017 (class 2604 OID 16420)
-- Name: registry_part id; Type: DEFAULT; Schema: kris5; Owner: -
--

ALTER TABLE ONLY kris5.registry_part ALTER COLUMN id SET DEFAULT nextval('kris5.registry_part_id_seq'::regclass);


-- Completed on 2018-05-14 10:22:13 EEST

--
-- PostgreSQL database dump complete
--

