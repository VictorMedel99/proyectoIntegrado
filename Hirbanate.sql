PGDMP         
                x        
   Hiebernate     12.3 (Ubuntu 12.3-1.pgdg20.04+1)     12.3 (Ubuntu 12.3-1.pgdg20.04+1)     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    17153 
   Hiebernate    DATABASE     ~   CREATE DATABASE "Hiebernate" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'es_MX.UTF-8' LC_CTYPE = 'es_MX.UTF-8';
    DROP DATABASE "Hiebernate";
                postgres    false            �            1259    17179 	   empleados    TABLE     �   CREATE TABLE public.empleados (
    id character varying NOT NULL,
    nombre character varying NOT NULL,
    apellidos character varying NOT NULL,
    direccion character varying NOT NULL,
    telefono character varying NOT NULL
);
    DROP TABLE public.empleados;
       public         heap    postgres    false            �          0    17179 	   empleados 
   TABLE DATA           O   COPY public.empleados (id, nombre, apellidos, direccion, telefono) FROM stdin;
    public          postgres    false    202   �       �   }   x�-��
�0D��W��1-��L�B�L]�ؖRN��J{w�I謍�����fR�r%B&��XkF�K?6\S_ք�}rg���[{r�����n��T|G��/����:�%��b�1���c0�| O,�     