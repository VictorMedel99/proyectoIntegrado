PGDMP     %    
                x           ejemplo     12.3 (Ubuntu 12.3-1.pgdg20.04+1)     12.3 (Ubuntu 12.3-1.pgdg20.04+1)     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    17139    ejemplo    DATABASE     y   CREATE DATABASE ejemplo WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'es_MX.UTF-8' LC_CTYPE = 'es_MX.UTF-8';
    DROP DATABASE ejemplo;
                postgres    false            �            1259    17146    departamento    TABLE     `   CREATE TABLE public.departamento (
    clave character varying,
    nombre character varying
);
     DROP TABLE public.departamento;
       public         heap    postgres    false            �            1259    17140    persona    TABLE     �   CREATE TABLE public.persona (
    clave character varying,
    nombre character varying,
    direccion character varying,
    telefono character varying
);
    DROP TABLE public.persona;
       public         heap    postgres    false            �          0    17146    departamento 
   TABLE DATA           5   COPY public.departamento (clave, nombre) FROM stdin;
    public          postgres    false    203   M       �          0    17140    persona 
   TABLE DATA           E   COPY public.persona (clave, nombre, direccion, telefono) FROM stdin;
    public          postgres    false    202   �       �   G   x�300�tL����,.)JL����200��MMN,)���LN�2����,�W0�22�J�d&g�%r��qqq |�]      �      x�30��J-.-�t,S0䴰������� D�     