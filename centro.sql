PGDMP      6                |            projeto    16.2    16.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16517    projeto    DATABASE     ~   CREATE DATABASE projeto WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE projeto;
                postgres    false            �            1259    16641    centro_recebimento    TABLE     �  CREATE TABLE public.centro_recebimento (
    id_centro_recebimento integer NOT NULL,
    nome_completo_centro_recebimento character varying(256) NOT NULL,
    cpf_cnpj character varying(18) NOT NULL,
    telefone_centro_recebimento character varying(16) NOT NULL,
    nome_centro_recebimento character varying(256) NOT NULL,
    senha_centro_recebimento character varying(256) NOT NULL
);
 &   DROP TABLE public.centro_recebimento;
       public         heap    postgres    false            �            1259    16640 ,   centro_recebimento_id_centro_recebimento_seq    SEQUENCE     �   CREATE SEQUENCE public.centro_recebimento_id_centro_recebimento_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 C   DROP SEQUENCE public.centro_recebimento_id_centro_recebimento_seq;
       public          postgres    false    224            �           0    0 ,   centro_recebimento_id_centro_recebimento_seq    SEQUENCE OWNED BY     }   ALTER SEQUENCE public.centro_recebimento_id_centro_recebimento_seq OWNED BY public.centro_recebimento.id_centro_recebimento;
          public          postgres    false    223            _           2604    16644 (   centro_recebimento id_centro_recebimento    DEFAULT     �   ALTER TABLE ONLY public.centro_recebimento ALTER COLUMN id_centro_recebimento SET DEFAULT nextval('public.centro_recebimento_id_centro_recebimento_seq'::regclass);
 W   ALTER TABLE public.centro_recebimento ALTER COLUMN id_centro_recebimento DROP DEFAULT;
       public          postgres    false    223    224    224            �          0    16641    centro_recebimento 
   TABLE DATA           �   COPY public.centro_recebimento (id_centro_recebimento, nome_completo_centro_recebimento, cpf_cnpj, telefone_centro_recebimento, nome_centro_recebimento, senha_centro_recebimento) FROM stdin;
    public          postgres    false    224   �       �           0    0 ,   centro_recebimento_id_centro_recebimento_seq    SEQUENCE SET     [   SELECT pg_catalog.setval('public.centro_recebimento_id_centro_recebimento_seq', 1, false);
          public          postgres    false    223            a           2606    16648 *   centro_recebimento centro_recebimento_pkey 
   CONSTRAINT     {   ALTER TABLE ONLY public.centro_recebimento
    ADD CONSTRAINT centro_recebimento_pkey PRIMARY KEY (id_centro_recebimento);
 T   ALTER TABLE ONLY public.centro_recebimento DROP CONSTRAINT centro_recebimento_pkey;
       public            postgres    false    224            �      x������ � �     