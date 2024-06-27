PGDMP  5    +                |            projeto    16.2    16.2 *               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16517    projeto    DATABASE     ~   CREATE DATABASE projeto WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE projeto;
                postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
                pg_database_owner    false                       0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                   pg_database_owner    false    4            �            1259    16641    centro_recebimento    TABLE     �  CREATE TABLE public.centro_recebimento (
    id_centro_recebimento integer NOT NULL,
    nome_completo_centro_recebimento character varying(256) NOT NULL,
    cpf_cnpj character varying(18) NOT NULL,
    telefone_centro_recebimento character varying(16) NOT NULL,
    nome_centro_recebimento character varying(256) NOT NULL,
    senha_centro_recebimento character varying(256) NOT NULL
);
 &   DROP TABLE public.centro_recebimento;
       public         heap    postgres    false    4            �            1259    16640 ,   centro_recebimento_id_centro_recebimento_seq    SEQUENCE     �   CREATE SEQUENCE public.centro_recebimento_id_centro_recebimento_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 C   DROP SEQUENCE public.centro_recebimento_id_centro_recebimento_seq;
       public          postgres    false    224    4                       0    0 ,   centro_recebimento_id_centro_recebimento_seq    SEQUENCE OWNED BY     }   ALTER SEQUENCE public.centro_recebimento_id_centro_recebimento_seq OWNED BY public.centro_recebimento.id_centro_recebimento;
          public          postgres    false    223            �            1259    16519    doadores    TABLE       CREATE TABLE public.doadores (
    id_doador integer NOT NULL,
    nome_doador character varying(256) NOT NULL,
    cpf_cnpj character varying(18) NOT NULL,
    telefone_doador character varying(16),
    email_doador character varying(256),
    senha_doador character varying(256)
);
    DROP TABLE public.doadores;
       public         heap    postgres    false    4            �            1259    16518    doadores_id_doador_seq    SEQUENCE     �   CREATE SEQUENCE public.doadores_id_doador_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.doadores_id_doador_seq;
       public          postgres    false    216    4                       0    0    doadores_id_doador_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.doadores_id_doador_seq OWNED BY public.doadores.id_doador;
          public          postgres    false    215            �            1259    16617    endereco_doadores    TABLE     �  CREATE TABLE public.endereco_doadores (
    id_endereco_doador integer NOT NULL,
    id_doador_endereco integer NOT NULL,
    rua_doador character varying(256) NOT NULL,
    bairro_doador character varying(256) NOT NULL,
    numero_doador character varying(256) NOT NULL,
    complemento_doador character varying(256),
    cep_doador character varying(256) NOT NULL,
    cidade_doador character varying(256),
    uf_doador character varying(254)
);
 %   DROP TABLE public.endereco_doadores;
       public         heap    postgres    false    4            �            1259    16616 (   endereco_doadores_id_endereco_doador_seq    SEQUENCE     �   CREATE SEQUENCE public.endereco_doadores_id_endereco_doador_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ?   DROP SEQUENCE public.endereco_doadores_id_endereco_doador_seq;
       public          postgres    false    4    222                       0    0 (   endereco_doadores_id_endereco_doador_seq    SEQUENCE OWNED BY     u   ALTER SEQUENCE public.endereco_doadores_id_endereco_doador_seq OWNED BY public.endereco_doadores.id_endereco_doador;
          public          postgres    false    221            �            1259    16551    estado    TABLE     �   CREATE TABLE public.estado (
    id_estado integer NOT NULL,
    nome character varying(50) NOT NULL,
    uf character(2) NOT NULL
);
    DROP TABLE public.estado;
       public         heap    postgres    false    4            �            1259    16550    estado_id_estado_seq    SEQUENCE     �   CREATE SEQUENCE public.estado_id_estado_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.estado_id_estado_seq;
       public          postgres    false    4    218                       0    0    estado_id_estado_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.estado_id_estado_seq OWNED BY public.estado.id_estado;
          public          postgres    false    217            �            1259    16563 	   municipio    TABLE     �   CREATE TABLE public.municipio (
    id_cidade integer NOT NULL,
    codigo integer NOT NULL,
    nome character varying(255) NOT NULL,
    uf character(2) NOT NULL
);
    DROP TABLE public.municipio;
       public         heap    postgres    false    4            �            1259    16562    municipio_id_cidade_seq    SEQUENCE     �   CREATE SEQUENCE public.municipio_id_cidade_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.municipio_id_cidade_seq;
       public          postgres    false    4    220                       0    0    municipio_id_cidade_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.municipio_id_cidade_seq OWNED BY public.municipio.id_cidade;
          public          postgres    false    219            h           2604    16644 (   centro_recebimento id_centro_recebimento    DEFAULT     �   ALTER TABLE ONLY public.centro_recebimento ALTER COLUMN id_centro_recebimento SET DEFAULT nextval('public.centro_recebimento_id_centro_recebimento_seq'::regclass);
 W   ALTER TABLE public.centro_recebimento ALTER COLUMN id_centro_recebimento DROP DEFAULT;
       public          postgres    false    223    224    224            d           2604    16522    doadores id_doador    DEFAULT     x   ALTER TABLE ONLY public.doadores ALTER COLUMN id_doador SET DEFAULT nextval('public.doadores_id_doador_seq'::regclass);
 A   ALTER TABLE public.doadores ALTER COLUMN id_doador DROP DEFAULT;
       public          postgres    false    216    215    216            g           2604    16620 $   endereco_doadores id_endereco_doador    DEFAULT     �   ALTER TABLE ONLY public.endereco_doadores ALTER COLUMN id_endereco_doador SET DEFAULT nextval('public.endereco_doadores_id_endereco_doador_seq'::regclass);
 S   ALTER TABLE public.endereco_doadores ALTER COLUMN id_endereco_doador DROP DEFAULT;
       public          postgres    false    221    222    222            e           2604    16554    estado id_estado    DEFAULT     t   ALTER TABLE ONLY public.estado ALTER COLUMN id_estado SET DEFAULT nextval('public.estado_id_estado_seq'::regclass);
 ?   ALTER TABLE public.estado ALTER COLUMN id_estado DROP DEFAULT;
       public          postgres    false    217    218    218            f           2604    16566    municipio id_cidade    DEFAULT     z   ALTER TABLE ONLY public.municipio ALTER COLUMN id_cidade SET DEFAULT nextval('public.municipio_id_cidade_seq'::regclass);
 B   ALTER TABLE public.municipio ALTER COLUMN id_cidade DROP DEFAULT;
       public          postgres    false    220    219    220                      0    16641    centro_recebimento 
   TABLE DATA           �   COPY public.centro_recebimento (id_centro_recebimento, nome_completo_centro_recebimento, cpf_cnpj, telefone_centro_recebimento, nome_centro_recebimento, senha_centro_recebimento) FROM stdin;
    public          postgres    false    224   �3                 0    16519    doadores 
   TABLE DATA           q   COPY public.doadores (id_doador, nome_doador, cpf_cnpj, telefone_doador, email_doador, senha_doador) FROM stdin;
    public          postgres    false    216   �3       
          0    16617    endereco_doadores 
   TABLE DATA           �   COPY public.endereco_doadores (id_endereco_doador, id_doador_endereco, rua_doador, bairro_doador, numero_doador, complemento_doador, cep_doador, cidade_doador, uf_doador) FROM stdin;
    public          postgres    false    222   5                 0    16551    estado 
   TABLE DATA           5   COPY public.estado (id_estado, nome, uf) FROM stdin;
    public          postgres    false    218   U5                 0    16563 	   municipio 
   TABLE DATA           @   COPY public.municipio (id_cidade, codigo, nome, uf) FROM stdin;
    public          postgres    false    220   �6                  0    0 ,   centro_recebimento_id_centro_recebimento_seq    SEQUENCE SET     [   SELECT pg_catalog.setval('public.centro_recebimento_id_centro_recebimento_seq', 1, false);
          public          postgres    false    223                       0    0    doadores_id_doador_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.doadores_id_doador_seq', 13, true);
          public          postgres    false    215                       0    0 (   endereco_doadores_id_endereco_doador_seq    SEQUENCE SET     V   SELECT pg_catalog.setval('public.endereco_doadores_id_endereco_doador_seq', 1, true);
          public          postgres    false    221                       0    0    estado_id_estado_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.estado_id_estado_seq', 27, true);
          public          postgres    false    217                       0    0    municipio_id_cidade_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.municipio_id_cidade_seq', 5570, true);
          public          postgres    false    219            r           2606    16648 *   centro_recebimento centro_recebimento_pkey 
   CONSTRAINT     {   ALTER TABLE ONLY public.centro_recebimento
    ADD CONSTRAINT centro_recebimento_pkey PRIMARY KEY (id_centro_recebimento);
 T   ALTER TABLE ONLY public.centro_recebimento DROP CONSTRAINT centro_recebimento_pkey;
       public            postgres    false    224            j           2606    16526    doadores doadores_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.doadores
    ADD CONSTRAINT doadores_pkey PRIMARY KEY (id_doador);
 @   ALTER TABLE ONLY public.doadores DROP CONSTRAINT doadores_pkey;
       public            postgres    false    216            p           2606    16624 (   endereco_doadores endereco_doadores_pkey 
   CONSTRAINT     v   ALTER TABLE ONLY public.endereco_doadores
    ADD CONSTRAINT endereco_doadores_pkey PRIMARY KEY (id_endereco_doador);
 R   ALTER TABLE ONLY public.endereco_doadores DROP CONSTRAINT endereco_doadores_pkey;
       public            postgres    false    222            l           2606    16556    estado estado_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.estado
    ADD CONSTRAINT estado_pkey PRIMARY KEY (id_estado);
 <   ALTER TABLE ONLY public.estado DROP CONSTRAINT estado_pkey;
       public            postgres    false    218            n           2606    16568    municipio municipio_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.municipio
    ADD CONSTRAINT municipio_pkey PRIMARY KEY (id_cidade);
 B   ALTER TABLE ONLY public.municipio DROP CONSTRAINT municipio_pkey;
       public            postgres    false    220            s           2606    16625 ;   endereco_doadores endereco_doadores_id_doador_endereco_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.endereco_doadores
    ADD CONSTRAINT endereco_doadores_id_doador_endereco_fkey FOREIGN KEY (id_doador_endereco) REFERENCES public.doadores(id_doador);
 e   ALTER TABLE ONLY public.endereco_doadores DROP CONSTRAINT endereco_doadores_id_doador_endereco_fkey;
       public          postgres    false    4714    216    222                  x������ � �           x���1R�0Ek�� �=�#�v�#p �@<;��x'�ق�p.��f��/~���/Y���)��{�2�����#�Ć�FP�%����n^󠬫�p��������M�v�Y*�!9m1�Z�E���������8��P�L����*��U�ʰX��ؒ�2���w��|�Ɵ�ܗ�J���YZL�K��K3�	�|�k��<x��dO�����-}��G� 玉�x=Nl9�%�BD$���W���^`v>ޖs���a!�MQ߭���      
   D   x�3�44�,NK��(��,�JKϨ��44
UUd���eq��뙛��1�sb^~f^Fb1g�3W� e         D  x�]Q�n�0��_�/("�ՎN��F�2va��H�l/���s����t���:)����5i�Dn�������rC����aT*�c�g�X���q��uAK<��K���Ɲ\��zD�^�۝������臯��'��;��I)��\�ض��I�Lv��AeIMQy	��2ͷ�JR3�{ #N���v`����Q�I-a\
|9��S�z���7�RO���rٖ��)�ޒ���R<D�o1u�i�O֖�F�i�	r�zGz*X�^դg/�ٚ;N����V.��kH/`]��W[�^b��ʇ��?�/症�            x�t����H�-*�|Ei[����ǐ��M{Ǝ��BA�LT#�jG<��a�Ǭ��G�~��Z�#�LֱM�=���X�����{r�$��*).������v����������x��R�������2u�� q&q�\\���kY.Yޘl3�[�
Ɋ����]?���R�2���Wۻ����_�W���[���B^K^�L�}׎�N|b#��/^����f$+�ɪ�x5������?���~G0��o�q�H�N���M��������$[]�k7�ڻ~����DC��?_��g��~��_�����D�$Eq��4�7cw<%!II�\���no�}6u���JW���0���m?	Gi�_�#���aw���~�ϔ���L/����)=�/Sq�����a��.���I̧�(mʋ-^�����A�(�V��O��S��߉�����]?u[�Ӿ��0>�F-��eNڻv!��u�/�*��*���A.���������պM�Α��|�I�����-��"�x6����B,�o4\�e�o�\~�L��+��M;�w&$ª���v�0\�1F��a���{�i�
�f���?�ݵ#�V&��Um
������DZc�]������S�Y��oO����yF�Ш�W×n�ۨ/��}wy��_�`�,��_�>���?N�L��Ը|�����:���n��o�����FHj
6p�Y{������%�q����`_�_"O���|���e��B����晤e��Ԝ�l�K�*m4��֚�~��BJu�>����ݲ��.oRװf�Kl�󎜋�¾�5�$~�\�Es�l?��`�L�8+��~��8��j�Ȫ����A�x����v�y���R��z5c��^e)�|������O6_��^��'.B!t��~�)X�x6}�@XIX�K?�_۵tk��m���5��}���P{���������Q���]���
	m�Z�CO�4��:�;{�=��}wBj{f}�]�l�8��S�3��:اv{y���v�q�"�ڦ��㯛����r���Ț��俶�c7'��s����o�Jn���n��x�9십i@�
�&��á�'�Ɖ������i@��z�<�aq��Ǽz7�� E��u���X��\<���͆��j%�Я�8tFK�[X��w�'q�۷�"�x��+�k�������&�}��~�d�d���l�2[�!K�ƫc���d�`��Nۿ����~Ӌ�)��5�Y;n�� qFqa�41H���%�)��Ϻ��v��/��=&�#q����Y7Nz�Z�-����O=�{���������,�gÆ�(4Hͯmb~6�k���_gE6����h�Ac��Vk�Nb�悉�1�Z�� b:J3I�&H1C��������H�}pS£�l�g+�p�~~���j�p�Ϋ��8���	!g{m&,/^쿰˙�-�i��xɹ߸����&�`�A�׆������br�����M1Ӿ�X��mym��Mk����ᶢ�mz�AIH-ml���a�\��W�����o0>�;��ij�}c�3H��4�?zcK�8Y��in?�����(֓��M�g(3(�铐D���@~�z}�$a��r%`:H����v�o�<`s�z�y���K��Y���󇰝�?|jw���jSf ����~w:����`������ 6>��(h�&���.)9�`������^�����M;��!i*iV.�ݗ=��N��fR��ӯ����/�=%+�8ͳ��ZV*�e�P�De0ꠈu�3�K���:A���UGs�U�{<���b�i�|8$���uGEkؖ��Q���?���DfcK+�>tk[u`�w?����6އ^ˈI����8��rl�zW��i�Qp�>���f$5�Z}���]'�$4��vط��r6��Ӈ�HU�5�,�M��ɱB�;S�9��
K�����b[�&����8���	�f�g��g��&�ښes'&JSJ9�٘��\�	��2tk�*�J�kN3�n�YP�	�5�s|JI9fH�V; jonf��OR�s[��ێ��GK�ڌ������~`��v��
5�,u�N�7b �G넻�h���P�I�~�vǎ_��ʐL���+���"�N�u���)-(���~��������?m�ry�m���U*���~�����%�)/���uܹS�P^�r�����9,��L`fp��8����`]ئ�n�?P�k{�!��jzc=�j������q|��������]�~l����� �Ë�/\z)%		֗g-�1�l��}fa���PZKj_�Y������l3&4����>m��v�f��&��D��
R��b��fN�ŦN�Te*X*��7�a�����zj��F4�޾?�+����5��-�0jve3���R�+����}��k��5�nj�':*v�7+��(�W|�oH->r؞��⣁O*L��p֩��դv������I� G),��w�����6�l�i�s>\bV�]�&Cf&@��c������p�t�r0<�S�ɑ��h�H��6y}jc�ɇ�Ȱն�C$nH��������Kk�	�M"50dj��w�Y�n�P�f�t:��S��g3�'0�"��qa�h����Zو��f�k�P���f���8ilxn��=��'nDJcsӋ�]p/�}��a;q���LW+�l����3v����u�W�qhv
c��i�a,�z�����
��&m�)&5���������z��$����� |�I��M��k���?8P	���M�7!WfV��8�R��\3������e^�`/U/*f%�#���,I�ECct�f>���%����Cp\}�4�Ӥ��M��l��v� ���~g������4�]�B>r��:�	i0s��xC{� �0{�$`#VKO�����Ǚ�4��:�N��� H"l�p{���NS����m��&**���g�>U�+�d {�����a8HA԰���r�����`0ѩM�Zߘ�@����9y�Όi*6��M��������`��n=}�M�D���V��8�;j�
-}O�{h�#�z�@�
�9��u�M��O���c��͝;#U�?���޶�!G�?�Nk%l[J��&�n��ѝ�ҩe�}l$�������џ��\�hc3�`oӪ���.���X���La˷�.���ըE/�E	v-7p(��٠񓋔�ZcS|�+~���^ԭ��������f��ǖޛ�n�(�^��n+�H��E� �|F&J�An`�~үl~��Ft�
H�$�mN�0�MZb��v�-�T6i	{4�?V.��?m7�O?�����i\,J�l���H')(��1�Km�Tfi	��6����%��J-󸿄�ĠHe����,�[��92_K����0�:"��3�!9�?�,8�MEq�߉���D'\������-��JK2t�fU�@4�RY���'vҷ�^�W��p#sm[�v�-�m���1���!x��u?�{]��V��aw��e3W�$����۶�
����/]�a�r&0S(k���⿲n�����JeOWyy��㠔J!�*?Q�0A�a���]���J�&�����Xn^]�Wa��t;��󆛺� UW��m��d�W�m������5k����їm������*��Uc���=YFe~W��[�Kl���Ʀja�D�j�Ho��Ҳ��]�tqkk�MBaՒ�]��`�|X�ג���N�_(&5���[C.û�c���bv��]c+�q�b���]�����vˮ��b�)X����:�q����Q<�T��5�>{��.�X��5i��~�OruchEի]��ZR/c��.Lӂi�W��j)wP[�rl�	 #�@�����NKi"���/;MR���M�Z?0[�L��ę������s��٩��>����Mh\��~k�閄\l`?�c�>�L�����Q�����F����peP��0��%N��JG.6'Nf�~����h��y�/[3�p��8�[7g�@�սY�c�dDs����Ѳ���T*��M��v׺��{�p�.y9B�J����Zb����7S�҆Rlw    �x�+��]�,�
����j���$D�O�4F�R��KG0�	��4�����$�����[���$���<��IB�����>�.I0k#w�Q�1R��¨��F��"#)�������_�P!'8#�xf���{��T�M
�X�����ɤXћ�wA@�@R��+p8���a���#Nsۿc8&eY�C�'�H�"��w'�2�+��=8�uc+�6�q�AҚ���@����ξڧ��g��
�8\����g���-�6ǧ�-"����	W�x���YC�Jp�aQ��}�0?SL
s���8ְA���y�1�\�i��f��͜���������:�_l���E%V�a�}ߪb%�.�ݺ�.�t����������t�����I[���Ē�������a���������9j)�p��|��"�N�+{��eO���^���O)��
+��ݲ$���|[��� rX�T�����g���U�Q����{�$�����~�ޙi���U��:��u�é�G�B*Ƭ���7��v=l��-�Z��,�}	��F!D�<?����J�j��	�$����^��Ҋ�4�1�~����F�y��rgMyJy%W�rZ�mmH�J���@Eo@è(���ڔ�u޴��~B��BM�ζD"�g�<���S[6~��A��аQ��=�$<_~�~�°��lb��m���-���̸�Y���:��>(v�']�&?~�<������I�#��罚�y�G��d�������y��/#�b��I`߅ ;N�BIO]�j����r�cכ��DO�hy�a�;k��#H6y�y6Y6���E�!qy]��g����!x��HY�H���a�^�T�䏋G��HU�!3�l�J�<p����W��bj�i�oE{}8'y�]	ֲ�eBnO��p�A	�Bf�!19*a=-\XDHQ	w(v�П���1�S�%J�����6c�t�L=�Ȅ��F�-f;��QNR*�I7X������'䥂1���/��$')�o�i'��jw�u�|��Αɨ:Ζjg�Lrj�z`U�`=W$W5�TR�Qr{�%[56;p���$D�j|�E��������ߥQK>��~��#�\����6���I��X7Ժ���l)nb���,l��1�� �5vA԰������f�a���0��oDSMO���],R�q�gݝ��(�7q�������<9u��{�N�OEQ�o��������&x�b�ީ�{[?���m7���Tdbw�.a�>��R7	��g�S�dN�?���o�L/�^��.r�L��^�~0�H���^��f<f�a,g�u��u���7�~snR8B�rb����n?�!����0=�J>LeI.ʱ׼uk��� ���X\�\�6��߶�F;��HqA��k�ڤ.�������%m�4�T~a�H���"v�W���v�`��|~3�b�K.�
�b\Z�i�}��Z���^���F���?gܻ�?!^>M�?�Y��z�^�X&��Ez<6��p������j9�RF{l��Gl}�D2�{(,��A`I0_}<��JJYyv1�\��^U��a��:O��j������k����D���ʾ��RTb�v�0C�rΔ�)fF���<T$ B1�1<῔������C��vrj�u�-�D_#gF?:�C`��w���]谂B�� �A�	J+��������p�Q�H���i�`c}	`�gW��F�����mE��!ۃw���L
���C�Ո�K��MJ�eW�`>e���Z����������_�C��|D7�|�{�1k�Q�Abk���/�v�Q�֢Q�`��⟉�5D�
�ݵz��(j��Xc�cQ�\!�^��D
!�It����ͤjx]J�ȁ����-��Bu$�%�c�N�D%Yi�2�6�&�Rྚgc�E�ka"f���t�
A���U"��j��Z��#�5�϶U|�Cr���Z����C�v�����ш�H\s^�W���pjDL�k��?u�eD	,m9����(8S�~
5��#]3����QG�d��nt�� �ސ���#�VH��\�Y��4�4�[iԯ��9u�x��_t���q�/YJ�K%��g�"MV2��z_%��'ߒY����PF�ҝ>��(���z�}����~$!3��]Y�8bϜTؕǹ�HD�65�QSZ��*n*lp��mc&������w$L� �aI����>�~��K��l���۔�Kt��F
F����[��$�y�%{=���}�4��M;/1���|���n"�
��)�Q/m�C�ϒ��v��{t�7��F�r즠6y�M�Z��{t7��R��� ��<��	'�_�|:sJ�rt���5�JZ���(,�,^���a�vXǦ�I���z���p�LG�~2��=y��`Z��7ދ31[���P�������>l���.6�P���ƗXw4�21?�M_8���g����y.V8�LA���ѝ��!BJ8����#5<V�d��e�������#ʹ��2X�K�y�-r�V�U�z��|�oB!�ma&���19y*������RWu	g��7��e�}W�s��z��=k�y!��o�������?�s���&`�����A��b
�o�fZ�V��*m�|3�7OL��C f��cF&X�/8D�|�@Q�0
�?u��,�h��į�� �h�����x�L��1�R>�ݞ��l񢩣�Ra�HNY��.{��Go�1L�2�K�_��?x F|)�Tf����`P�#%����]�TN�z6��d�2�K���)ړ�;�cd`����F���(I+sr��?#We���c\�db�%�����!��1�.�2�˲��-��߳.û���R�,$A���uy���������a��GRQNB�U�r��_P�x���'E����^����^%s���j,K�©����T	*��+E���$�r�8y�^�K��~>������O��ˢl�
���1iL��We�U9�K�^�z���v��KJ@�պ�d|��HVy�0�phﻝ&w��>�Ñn���#�ܾ*<������\Vy���K���W��+�7�L'��Fܛ<�8�:a��,��Y76zlo 1�szl�~13�8�sF��q>�n��6�aw�-��FN�V�n��8���U�o�_K,"p G�C����ze�̋��T �*�`}���aEp¾�K���P����Qy)��aV�3������T:��>����4��R�����R eM�:I��S;ޫ�����w�g��9X
��㽭�u��`#Awnl�X�2��z��/�d�	qh����2�]�ۭ������T1��e�v����Y�xo����n��x)��iB`������x��tZ-�$����''�	%����ݥ��S���W������WXH-$����g�H��C���D�����2w��J̲}�<P��Ox�<8��u�H���
������b!�2�h�B��-C,�I�巎�V�(����gm�uD�h쎂��LEs]�O�Z���&֛�S�g?L���q��lu?�'����ӜER��[�jI�D�g*1��RiU�!����.%�~�ة
���r\��O���8J$����R!���w%�%����mFޓ�JcL�Nb\��4ۑ}k���K�p������ć��7�A��U����,.�e.�a~,5q�a�L���E}�`}����<�x��'�ڕ�� �י2���~��Ơn*�[�<�����0}��S�хcD-���U��z���Z,sQ^�IBa�����S.��Hj�2c4�����q[���xeK8���'zw.�v;�*D/Cm���Ą,1�,F4�,��=�����,�4����Q��n�wI
����^�BB��M��?��%R(�P!����D�-F� ����i')�Is��ش�N��{DJ��/����AL&R��J����0����)7o��R����T����'���I��:�O%0�a�����i �1��g'B���^����3���/턠��&m(�7�~4�'FZ��Ӷ�'�X"����±�M�2    �*�Tx����cw��Q#+o��=B���
�),$,�9�|����TR	n�p�"yEy�c��~#���m��]�6���f#�V���O?.�ak
�]��_�S�P,�p!��10>��ȓ�iH��8��>�/�\�%��~���&�B OS���M�����Rj���3����8���K��g������r��둱$���o'�ц\!Zߐ����KM"qQ���,ڈ��
7��q�V�G/F�^�]�]lZ��̕�Ȫx�r������x����/��ӈ8���z�E��sl��$3�������o�ziHcp��+3�������(�+����������)�V�x��ܷ� q3���R(��43�n�D��@�S2|n�=�SK��������q.Rh���Z����/���єG"��!�.5i$�'n�O�_�0��RK���P{��2i�\
Zom�8':�<!�һ�FA�S,.����KD.OHB8���<+	��g�/5�*�ڣƫn���+f�@&U���8��NU*.�L�3p���Td� �V/Dӝk�G���c�=g'��*p�e����5|mZ%�H!�|���R��J��!�aqVe8t꿴>�U���iϵ�����ɒ�gR��O��D��������7����|�}�u#�'!�eC�G�Ē�)�8	�>Ǡ~�a��,f�I!��qw��0��l�{���M%�.��u~�jAf(�G���!q�(��Y45?���[zޏ�nP���te85b��~��<��u׸E^���A+x����y�2�	[8vz��kZ�H"�؂[G	h�1IPQ�yz�MH�U�2������ϔ�<�(�9.ސ�d��`�Q�:�A�ܒ�2䇹�y���t����}����l�`�G�]�a>��+GLό��L����y9��QH)�w�}��}IU�x�W�v�U����`��Ӄ�D�(VG���%	ᭉ�L����fw������6cs��8�B�z�i����A9�=��(EBm^�����ɵPR��8<;�
%���y�SqYIn���M��p�|�d����M�o��6�T� �RL[��_������=W�~���n�v��gU���\��^�*r��!k�wU�'ɼ/��{�̗���W!�9��9����_�����l���Q8�~���-v����\��f;��2��_�}r;Sɼ�m����
����q�,޳g�.�7\��<uVIM��">n���u���,�J)���a��x��3�v���2&;��� ���V���_�n܅�C%�hV1�����w�"2򋆉�Ɠ�e%K�W��)eoX�d㗸z��%��:�@V>��T�׏f͛Q�?M�J�<vu^�e���%�m�d�8�z�oy��� �d��{�l݃$��e���e��K���Ƕ��&ۿ�Sa���m�,�>��]F8�-ַ�q��إK��'��O������փ����1Uk;P��������L��Vr�������[?�|�JPO����p8��p2����&�_�q�����Ơ�-j�zǥB�y�Ǹ�������1����ů�N:�Ra�w�nZ[�1ʴ��e�W��v�~�t�h�X��a�ƹ	�xb���l)�l>��6�e�We8r��@�x[lY% b*�99�<{Y�&T���a���8_�8�Y<������������L��$�(�a���_K.b�,w��v��R�e���nt��8�!L�j��Kʺ�y�7g�D�x�g���F��xގ�$T��e��<w����ə g�kf~�񢄙�� g?��X���9���B����f$�Z?�H6jx��)��\j�5�����w�;�ٮ�	_׼���J�$>�d�׵���%���L��t�l����A�x�TOm�k���|��,u2�٩��`!5����u��Q(�l�x��@�������e�7�x��y�C"��fy�ׅ0#�5�+�H1z���M�3���͹����ႆ�f����o��|'dV�s�v%v���~�Z[�&.N�luc2��w�ǃ��Sz�"U�{��>��C�����CŃĘdΕ�����Ƣ���L-�X��OO��r�CE;��)�3������Ӓ6MS%g�Wp�-kn�5������ÿK^p֨�$Y-N]G��RP������J����76��9�{�݆Ddt�{t�����9K�yO�Ѵ��%$d;���T����}��ۮ�.�����jj&��*q�4c����*q�������Tu%�q������T�<���v��+��#��}�����������qd�c �"������b�
�NѪt;��MJ]��Ʀ�X���E���Jʳ[c�=�[��<-R���d���q�����[]�����"�"����)���qT8窛����(�����n&a��.:75��JF,��&a��)�򗹱I�����v���VkI�9�����-Ӑc
�Vb\ B&��N�b��P��o���(e3<�O))�Y�U?����3��C��خ0�=/I�{Nm���T���dDp��Cj��V�rll���б2�r�py@��q���w�����l{�	\6��N1۞x����{31(x��&$�$��'����2�=Q�ݴ��-Gr;��A����	�Զ�qOC1��̹\$e[��W�����K�К7�l��z}�&QSބ�<
�\mm�U<^��MMW�LM�J��s����65U�#	�۳��r���Ѭ4�S66e���1x� ���<����B��~R&�]&e�Ӓ)owæ��`�ӊo�pE>
blyZ�>�;�)W˕)��g�$$��3Ǔ���,��E�[ʖgJP��. ���Y�K6���F[��l�m���� �l�a�~�\�VgL�b�;�GP�K�S�����YŖ)�lp���5o�P���g#�ox�oz��ї���LwlR�v����J�^:�\��͙���E��Μ����?m�Ih�y��f(�%�F�:y!�-�ϻ��8��6�M��2F~R���-n/�n|���������Y������/qu�k��v�0��k܇�U��,��X��. �=�P�N��aB� bb !��w�^���BUt�CRq���W�\&�?	���Bm����X~���od'��=ӏQΆ#k��l0K�N�%)(��|�E�����B�5�/�ݜ��X*̺w��% `���Ϳ�LB�X�_�{\xsy!� �o�^7�	����U0l]��<X�_o�����J���5�K�E����Xp���Wj;�k�qdny��c�6d�1L�����#��JfU��ǆr��d�/@1�[��dbX2��*6���	� �GP	(<s��b��Lq�{��*��̙�و~@���.��(�����D�R��]k��,u2q�N��p&�����G��蚧�:t	���r�zL͆#��S^�-�&���UJ��
�7��ɐu����:��aL(��а�\6��y44�ʙ�g�dv����`��/Lh���!'4�dՋG�R�p��e3���o3�t��e�U�w������F�\U�
��P(Ze���HOKp�CNc@B���$'5��u���a����@V�k9.�%�*^Gy�}�ٺ�U����OM?�-��,Ax�?��pD��s�:6���������������X�<��V7�ʏ����������q9�|�]�i;!��䤡I��'��F.l����6Nm���`۹�g;X
���ǍwY�/���G��I��7%}�H�l{S���:������m��;ːk��7�g-ܸ�mr����[Wd�<��3�ȉ���P
���m|��H�y�v���9g��mk����:�`C��tlp�F~�o���p�PB�wt�1����,y�z��8��:21^���#"����0"x�yr�:L>�Mo�%׎)O<�v\H�!������Zz|���f��;6�l�Ž�n��K
���o.��_�v���n�����    �
|���d��%��E��"��%�%d��[���2��^�L��1rQ�Ud9zr���ѹf�s��6ɶ?��ui����I��y��D�$������ABpzy~�q�������$&̓�n鑌1��$Siq�y�Z�Z*������-^:9Z��I�����.��1��?��OSA��Ňa=jO�k�g�M3l��ڂGLգ������?��JR�-r P�$�h�oM39� L��hC�����3���2ьL2�4�=��7$#�"����YiD��7��юD
����� ��E +p�(+������h$�$�X�>��zZ��J-�"�q��Vj/��',9[�zR�?�����<a���?���c�hiX�Y��憎x���t�`�+aM!=$J��Cn�S�cR.��`X��D���(!D��v� 3O�&4%Z����~.�J#�F���<��<���q��H���B�
WÝ7�&	\!�!,!�J�"V#.�IJZ���O�/��@Z�B�s��6+�,ބig �^���Ar�0.swy���H�	���I1$%	3�� c!"�	q=g�⢦�"�Ci��Yf�k3K�)��TnD��ܤ� ��� �c 
#��/�y#!����QT�#�'�.@<{��9(��T��i� ����nY� �J��p1`(	#_)�0�����t[W ])21fS'��F�2�[P���*K�dG����N�U�2��tĔ�>��8)$R�A�5x7�)!a|#/��6|4�����L�[.9	���xqx�����N�2�:^|��v7|s�e�gx��WS�?IM�V��{�G*߂��������wD�4'���ϝ���U���8!�2�&99�,��T�&�g�)n��Brr8��:��_���{8�h7��|�������)����,@�rVU�;U.	�� �����E��QPM���%o$���s谙Xi�7�GR���uHw�O&@2
U4��L����EMQP���뚶��7/����ے��"�^��w!�_,���r9��$4`5���`R.���BN�Ȉb�aFDUHh��������%4'7Es|0�Z	*�Й'�tĞ����^	Vw8���3�����w}�9I*aA*H��\�ð��P	�1��uu�$��ql�U9�*���8�ʨ	�>	Bf��F(�)a$"��?� -e������p'�����icz�hAV�#uU4���T�2l|$��T��fp�BRT�j?c�぀0�Q1���&,
�nq�Q�&�� RXAN_C�u��$�6U�}l��}&ג�Tr70�W �$!���"[ŉ�[��jw����S����=`�C�-IN�0���5�$95]��f���};N���~��]���|@�۟�n+5U��0��J�0�T��3߇^��Zn�1�4ɩ�t�o�W��Z~�!��Jl���V���>�	i�|@� *��톒� �P �$���!Uٿ�΋|����&�<Ű,��Nfp3;!������L�-/��se	7rC0˱��9JFy"�r�;FRz��_�v0<5��~˳���N@���;�
fj?��E��wMȁ�K�H��xM<;M~1'��RC%�6NHi+1�a������g�mB�;�,(�b,8%\���ى��16#I��$�݇Y���1������6 ���s�;���ps}ۯ�\E9�m�~�;�:���Oh�6)�h��$!h!/��{YJ�kM�TX�o)-d���� &YI��<��}��J��]�����E֒X�:Xo�����(��C�-�B1�'=!�$�i���<!��t߻�M�9�������J�9;�r���G�^��P��ib�Cs�
ٱTX�]@ѫ9|�,��p�4'��Q�U�=i��:	<r�l�1�M��11�X��!R�Ű1OX� �������?z�a�ћ��'�j������T����f
J�ՆgqØ�"�'���N��U_N �z���@�_��R��S����TP�{��Ë�9�<��}~?��̔�aΛ LTbQÉ��]�5 MEgCX��]�&:ˎ#��ʔF:\8���n�ٔE�}�Oi�G��s��<����Q������;9�4�Q��f.�y��N�o���9�),y)�xc��i�3�k��+��k"�c���$+g��r,99ʙ5An-��%�!�	����'r��T
ݸ�K�\5���$ռ�;�c�U�˳l� �1������3����-���c�f���X�<�~�ȑZ�S3��ցF �%�w~mwޕQ�:��#g�'8����z�@ݤ�O��R������!\����=��l�IK�j�_��� R������$��֒"3�sL $���UH�.�8c%�H2fN<v�@"�$w�Cl{�3�
�;�&��-U�:c���炲|��	(TE�4=[!R'��K��Up�S��}�EGJ��f@�߻髋EQ�p.���"EH�q1gK�7�9���H����i�0ф�HR!sV��MFS��U&���X�K��R��@"��J#[����L�K�(��J��	"G)fz&)����$)�o�����@j�	�	vj���=��x��
�&c��V%� 1K\��v��K5��ҕR$�a!@b��9�����o�[R�"EY�$ ��s�m)����{6*<g�fר��4 ��&OYI�\�ҔU�ކ�%�xW_�ҩA5=�[V��눋�Fq���Id	N����dn
�L������2�B�#!)�0��C�1�k�HJm����[l����<%�G�-����8�FZ��t���)���)���9�WϥR����`��-wA.JJf?L�"e�p���b�V� fL�\<�����:lë���5�t���,=�Q��?��CqB*
:����		(�����}PO%7�@�4���FJ��l�z*d��}袾e�B�Y���Xd��]�M�K���خ�c HL�3e�Q���[d��1���y�(:p��|؇���RQ���u|��sM�������uR҂J�s9v�HF�������t��L��z?<��Pd�n� � RQf!`p�uJ.�\5��aaYA�˔%��vz�iMICYz�_xPF
J��޵�i����/����O������+>@����vc,� P%�=z��6c�QM�Am����m�2��=D@ �^��ψ2$���
���<�������o����~9Y����H����䡪��i��>T
��j����s�e���z����:Y�-q���:�d��KB&���V���.p(��Ι��0��֦���!q��E[#�������W2ck����?|^�5���=���s$uM7���j|C����!��Y1:n?љ��Ap(��IW�k�0���Ӕ��h��lI@_��:�&˵��wd�� ٮ�������vmP*��K�.9�
�Mn�#�G�,49s<��>墠��ٝ�D����-k'N�jS�����D��Cl��� g�?,��R�)K]+��=��i�B�YG��Є(�e����Xƻ䆅{ҎfD1�/�w;�d�gd9�sk*�1�l�r�/�ڢ�5Q�[�4?�뉾g5�Z�������y䌖g�pʓ�6���'����ՙ���#����O�3��qc3h��hx2G �B��Ť��tn��o�3��	K�W��l>��H��s�$,sӏ�=�	ږ	�������ӴLX��f�,F�2a�9��X`*7�	b���Cؠd�/��C��n�;Ȍ�%�W+]�v)�@��ӳu[�f���"'�(s3}��<MBV0Q�;��EI	+�0�n�:�	k� ����>_�!ȣ�Á��������D
R	��D�h@�H68�vs%_�$�Yj�B�3��q�W_&Y�������WS���k��}X!r��	k��2�9фls�^Qv�FjE�}�m��V�2�=����/����I�i����<I2-���2˴0��b4х��YJ��r�	K��~~�z�¯�R���)r���tǛ�DE\u�}Z���O��*O�X]̷��F    7��T|5'�/ܶ����R�[Aߥ}��J�<��8�sT��J�y^�$��r�K�<��c��S�۞�z�C�X�f��o/e�ܲl���NV�9=s���Ҝvo��5�Jf����K�i	ëzz��$(L�/%2�r7�O��RK�vv廻����qּ9=�PZIWʥT��|��3}�����HI_�^}���TeX��M��m��isZ�I���Kw)'���}O���%��h��*�!����G[��E�'�e�J��	�񤈇G!��ٞ�4OXUF���=����������K�4�TOX7F����NOX7F����)�����P\t4 yg�,�E$s ��9m���^>�>X�O����̋�]
H�7�������(��0�)�P��	+�|`5I�~Vd��w*(���r�"h�/���X$��rk��&R��	�����a��	��v{�Z��,�`������j/܀��������T�z��uT��l2+�0�e��`�F�:�X��r�5�D���i�/�=�� X�s���%�,ٮZn:ת�EO�ό�hЗ��JV�:\�8�(�AXBݛ�U�0?L	�{/�@�dDе���{7�j�W�Յ�rth�]NFxE�j�m1�Q^I^�:��UqAd���>7���}�gHM
�苎�W=%�5��=�����&̒\𝇞'�f?���W?*�&��\�~=N	b�����1D�5��k�"�q6��PN~��n�k\�چ�P�"d,Y֖$Ԑ#ܵr����3��j��xy� e����}�A�Rp�U1��7$�)؟M��\�]� �`
�g��A�|�IF*/�ziҚ��n���t^��:�Ӑ�,Y���^ݐ�L.b���mXұ�?������r����n�ݺwy*93碻��"� ���'����Y�T#;]��n:�WD��dt�-1̭fU�>zb<��4"�N�9����r�ӊ<)%Ü���:�p��q	���t��7B���)	;v{���X���MyIIB��ε�pTJ����K��S�a}%F.�~s��SN&r��������D�3RC��-P����z��6�l{��p���M/~8>�q�6M���=���/�l}7��Æ�+�l~���W�䂗�c�H�JA��"���1��C�l}����r�c����3Һ��/�; 25�a��VӲ��b&x�=�N:B��sx���e�d��6�Nx5�̔GRR����H�R2�۞�.�P,��F����s�C�q�G�����^��HB��n,��0zr�P2��́G��/�}�[���6̯����M�&�].���X��D��g����m���}�0��'g��\���_�M�
���	 g�+�e�9׺��#'�M|�F*
T߭a�A^��U�H���+������V���%$&�C_##�����xG)�I�|��L3YI�W�?��ЁR@Qź����:��W[fjr����e��?�i�F0C�7�����xL�����y>�ck�S��lN{ʹ0��H],�ȍ�.RV���\-�H�8�?�j�C/�1z٣5�M�=��!(jj5�� ���w� ͊n��N��)�I�D�|j����l����5K1YiR��{5�IGǱ
(�����lrz�mV�w���`��iQa��YL�gC��;�)f������B�gS�Vw4�
��<�?"=��A��s�m�J[3a��}�%��f-7�>��K�CC����t%('Dw�|�HPA�pw'4*�R�i��6؇,GX&��2{�	��@�҆R����r$ҚL�w�;�iH���.&06�V%��J�.g�yj�o�?4"�Q,�����g�9rQ06�x��	�q���,;���?�(�����H�^F݁]�04�D��ub1��$	^S�0H�7eb#���t�����Kx�kBSx,)X��?�v����`�����Ԏ�_YD@q�,�T%'�8Cƾ�⎊�K8ʋM�^H^V�bR��y;ӄL��J�Ɗ?9�!QQ��SWdX�z
�+�Iz�=��|V,�t� ���y)%R�E?e��ߛ�f�Iy���֧�!,�lᝌ���g�-��ZWI�t<�"�ٹ;%Y��i���$;�5❷���4W��{'��`.�a�d�/�����4Y��L��<��&���ro�"!�]x�e��'�T�/�w+�Yj�LX����le DFY� S��iXT�LX~��M3w�;аMX��$�1Y8�LXf��#)(&5,"pk�[���		�2�89�	(��ڵ*��������۱��+--��2g}�vm�2�
�� V ,f��1Î�
����. ����o�dI.܄��oG,�����M��>��('�A;=`�����	���Â���+.�1�D��s����>Mc������}�<�uH����#��Y�{�)!�I��n˳�Їh�&L�����o��a�x^v��-�� }T��T�b|�+3t{�ɉ�]�m����8�5==ޓ^I=z���I�RE%z�����5��J1(U�b���a�"�Z%�Jm�8s$3�CN<ˡ �(����#9��)UCʁ\@�rO�"��$
��A9HJV��$�B'���*1�H8�`v���D��H��DD�r�
")�S���l�r�pr��I��톇a{CI:�$��J��8��81�I�Ɖy3����KNp���-��=}��;�D^<��*Jƶ��#8�U ���"��(���q��&W��+��.�w��*���z���ʭ%DD���ʤ��0`$��ߒ&�<Eb�cǽ�C�ɇ�w��w�IP�k�0�}nF�2x�^[�]�&5�a�c����	/J�������GMZ��[^l�4]k�JV1����oA(ۂ\(���I��d��x���
+pi�;ϒ������HkHn��$�n���L�S�9�����!K�� #N����\Wqo�������tj�ýHgu�
�=fSk��a�b]�
>�T�l����4�g��^G�"���m!����ێ0wwt�$9�d�H�ef9�
^?4�8ZV�����I*�����.'3E�Z'������+�4R!IE�W��M��R�͎
�H���?���}X�N^�^qVC��6����*��9��q�2����[��Ήڒ�����K�[<3B�<��,���)7�[?�B�ʌ;�X�c���y+�����+�U��F�+4RHYb��aAb�< 9����A�+ސF�'>vJ�ʒ{���=��%aeŰ�}xL�Q�$e���F�$��R�`�mx���`�VʳuxE�S%���d�����pm��払�*8�O|�n��Kf$���������N�����J�b-����!A6$�9uk^����T�{�EG�P������'���:��:�j)��zu�6�_q�
y��e�Jm�
׿]��iL6"� �Vgg{1D�|�w��^�����҅��º�.[��MqH夰.O��z�kEJ�l��wi�%)�Hr�:�z�
�Ir�����@�E+R��+��~���mV�_���6Pr�$qCԆa�7B�k�<e�O�6X`,�W�W�2S؃��eJH�ۤ�'���q� Jn��+�K���'�|}xŜ�0Z����]?�Ñ�H���juyIy�|�Hw&qEq�V�Wk�<P�� -��i���X�%�5��9�ޓ���I���0C�_��Q�����N�SR�����S��D�4�%&9I�z1�It4:��
'��v����r�H�<q}�ژ��.A����zڭ���1� m �p�;U䈙Ͳ}�/���f\��	"CL.ȳ1. �f����ݢ"#��Q�k��[|����//�1to�`��ԁ:Ù�q�d��_�72ƏY�f�/j�I���5�����.%%L8���8�<݅?$5����^�&5�hO 9�h�g;�Z�f�{�z���[\��LF r��^V��L�}R�R=�~R��LF �Q@CF��Ϭ�8�r�l~�l7��-��$OC ~    ,�!���2鑗<c\>��a�7d%g���dH4��N+��w�G�r8
�*����cVW$g9<犇��soj�`^Ѭ<+��]T$�y��5�.�t	Y0��ݝ�	p��b����wH`)��""���B�e��&�����ag�&B��$�ȣI��	%}�=�r�#cE9�BH$��ޞD����a�}�ga�f�i����S%!%EҢ0�r� �p���mWØFJ��R{�Z?vG����N+0���̢K?�P��<��E���$���ٟ��j��1ę�.=�M*$�,�l(;.��^:�d��2:�9�?��%~ڄ���%����䲌�g�j��s��נEb�Duyb�1ad�
��w1	�`����$��x;�Y� �f��;d���w;��|�`�V�
����
0��3]�uS����X�M4�0�9��#NR�$B̂�����������K��2BX��vQqy���}�ӺsyAy�̱pp�$T3K�fP�q!,�8���ߏ0z�=�9���~�v��j�J�����6��=�ز��'w����0m�՞)�%&%��{����@& )���+�r�L��n]N.:v�����D�������$�^��G���\d0�CPX�xi�k�M(.D
W\=L�+ �$��Ӵ�S�������$����$ U*��Yy%/$W���o�I@�����	!	��s5�J*��[B�@�$�D���T����+�<��o��\����.U��ٿ��p�%�b�y�z���4��\�&���W�N^��'⺙.��0�O(3���iۀ��轣�Uz�a���d!Nv�����"-�������c��)��aƞg��r9BZ2erp�Y����C8��	��"Jx�RRh��"V���DC���BzrT������u�+1��U�JW��d%W@�qR�!���{8����IJ"jch�@�+�+���7�A:�(W����.9y�=�v\ݺ>X0#�!��v^j��='���~.�7���QL�g�Ґ��ƥ�0m6dw/M�C%ISIQ��p���mHI��0)� �Pd�G�����,2Q��J���iC��sX(V�d�7$��jW���r�Qx�+�qa�j��BŮv�N?�Jk̷�����`"K�T��x�D���R���nVI)=�&HJ����K?O	����vc��]�+Y~����H��? ��`)�Jr�Q2�2{//mc�HJY�uph=�d%,�Ow��Y�r��=�ISV8������t!�v�@q�o¬!���"m,@0��WDHI���ᎮJ�'���G�����SI1[��ZΪm�>�yXLb,����c]�#'߰�p[���N�?��5��T`̅��EMa�����D���q�3%U�c�f����D�m����n����=���]J�麸ڸ��n[o)��7�K��S�Xǔ(�Ź��]Zg<](��]׻���N�s�����ԵHP]�0�D+��I�|�%�Eàod�֕R��u4�����Vīk
���7�`jd��ӹx�����TH`�RԹߞB
�DQ�8>��6�"k��S?�_%�M����,�&s���L�j	��`/{��!']O�lS2�yX�K��٦b]9 Yjj��.���S��Dz�4mY_<�F���?h�"�r�?������oZ�
b[=�@peاڵ�,	ⴑ��dT���X�����x��wcXGYH5���e��&��]��"�\��l�R���D���f��G9�/�Ͷ���'�S�Kh���De�S}!���~�����Ep��6k!T���"��Dl�F��~}�C��_��
@�ᄕ�¥�˫o�O>4�&���
!��lL��\�0K�+��pi.i��>���&Tz��>�0g�$�W�CKr�k:��Q�ާ-��	4Y�����H�@���s�V�5	]_��n�-X��>[��@�>�_l�r2|*Q��.B��X��A�h�D<�ô�}��5�X{o�v�]�QU��N�����&*���L�$�]��h�"������#B4x��A�ĝ*��5ЬtK���H@Z�n*G��̺t�1�r����l����ڹ��LÌB3q�hΰ�rY��Aإ5h��9���(� ����t P��~5�ѦE�eŋ�H���,��m�K�!�CFv�)�ŴjE�� ��ͼ��ͻ#=�%f�s�y���C�1��<�,іE�$k�Ί�lu΋# (�MK��%��M�e �92��üw1/����N���X�E��6<�����Ⱥ��K!lo�WB��>���F��6�y�z%+]�Q��.�h���.��2��ul \d:ĸ�?�h��^_V��A���h�"�R��ph-� E�v}�vH�JtHF���>���(*�
ޑ�5��U6�
����o��}�h�M1ű���%�t�~t󀠇�'��7�'h�"PR�y����R�I&��������F�t��u儰�e�v,�������պ�mR��s#�t�L�K�U��e���A����툳켔U��ˠ��;&�7e�� hc��@� ��3�>E�.KDK�I�p�v=��#lt���e� ��U��L�a݇QAS'�^xsAmIi�^�3v�L�Yу��BW���e=B�Z"�"q6�x����8�X!�Z��E���5|!oz�H�`쥬5���l��m�PS֚P�Xr��G����P�ӁR@�y�o#˱.�č�\^K��Z�;72�r%y�jd&�c�~n�����t�V���������yXռ��9<Q$4�����s��S�����BHQ�-,��M�%2K�4P�&>�P ��,&M�q���qL�{�t%ð���[����wDfa�3U���wx��wl�J�a���9��.�.� ]7�.�c�ˋ�	^l���[*�������#a1KW��JQ�����dljF�-�g�J�b�0�='�+�lwO/�o��ߵ�َ�"�I�(���a	���2i�;���4�4�}���HYf�I��:�M��*id��I�~�m�O���qi6b؀������Ɣ	���rgxdI�T��X�@�1]�b�a:�՘�B%�~�s��i�"NT�����DZ�i��tzgaRI��;��8�тL�{�6k�A_������eM�]��Q;JV��5F<	 )�*�2\!t,��)s�� %����@_)U���DpǇ�T�=�&^�V��?a��9�-^��8��шF#�<w�,�i��o�гhU��~<��n�aޤq��*������H3=��K�
.�����`��J��!�!��S�3 �ݻ�0�h{�L��4)g�9�3$��"Y'J_i��\pD"��{����/�Une�s�D,�b;�M5����6�YeΠ:$<�1�N��xK�纩��I�!~��*��
sO
�h�Y�޹n;a�,/8��H~����[#;�LSf�f,n���<�F���[A�}�\X�K�KOR�Rs����g�r/G�:D
�G�*&��Qq{7�XkΐJ��v�Zs��O;gW%��#�i'����Cd�ɩ��e.�Q�c���Q�Js�0�$~gZ�)�L{� /����l�T�7=c�$&L#�l���>n���r�bME���:SV�39�E��V��R-d�%@�ր�f���s��pQR1٘�?5���e��zz����{ӺM�cڡ �f��5_?KYe΀�5Lv q%q��b�q�bI9��n���w�P�jr��I	 +��y�2O�M�7YEΤ%�I�BIϧc��qS�^VRb"�����l���i��̚�6S"���]_B�s��ќtR�xjt��3��;"����5�8Q�� ����1Fә�f�B��6�w¼dnr#�tP�N��z�Yj�v�N��zִ���,9gJy��4�9&S�38�ण ��	c�ꅆ��F!���oe�n CɥB�����X���4�S����Z�p���^�ro�c$�L2�5��+`I:�r���)Tʂt&��jY�J	c�k��޷9z�{���9c�kS� E���    ������q6E,LgpSa>��4>�1���7R*=��=�fs��ק����IW#cL����)��պo�v�&@�3�NRu
#iuc������U]����ɖ�c��e�H�Ȓ��$�H��^b��!>����5�9W�pX�����y�Í���1.�lH����F;����%.9���x��9&݁%.��Ʊ�ip�P��īJX*����<]�*Md{7�*���:F�x���X<�K☏�Θu1T�H�xg~Q�,�t�b%�����i����ݧw�Og*Y�M���m b��)ӽ���OsQ�~P0fe�7
v|��Z�|���_1�*�P�����D#W�<3y��Y RF|���Fb���J7��.æ�VQM�Q_��B-0*��G��W�F�)0�;��|�C��?]D�q���b�꾬���Ä�a2�'�<Y�X ǣ`����@�	O����*��_��0ö��B@�rmF��ܡr%F�>��߆����l��^�Ü�U9˩F�>K��̧�WX�@��{4�b9;�t�F��B��h<��@��b����w�1b��b�n���X��a�{\��K[�m����&f�3����ќϘK��S�4�n�"��T���<���;_\Y�΀��6���K�d<�����L����/�����[M��F����2l@0�Yt��Xx?��`����6s"�(���m���?�ó�Z��8;�Yd��X}?����0�����	b19c����ꆥ 6�Y�	����q�����M��v����f���K�����0)Z����5�.�)`N�*��F��fH&��3}�����	���z����w��S�mi�+���m�wGD�vH����᫩�5�\a��z�[��(#\׸ꬊ�r`.޽�NIƻ�uX%yE9�Z�c�Q��jBlݴ=Ba%o(���
�It� Ǔg����I���{��(8%�t���m_,yFyj�<.��F���Wx����Q��(Ik�F��@:�����i�+�S�*q���Ӳ^m��H����W̺z�1_�KrFW۟�}x�2�<Cd9s�]��}�����+ɑdY�t�S�[�D�~�~H �B��F�rZ�����=�0Y�f���	j��)�z�b��V�w���9@��w�cf�WU�=g��Y-Tl�޶��9 /��<��qtk�B�H����cI�������yD�D@# �ESfk5QO�pJ��������(�0�<ߙ\��B`%׈\��^�s�����Vy�z�ʮ����[�a�WS�g�* vJidd߳1ޘO��?�<��j�<�Q_�x��SԀW���I��S��=k!�׌E	�,t_3ʲ��ڡ	X����64`Ifgb]���/�� 
���G�9 Q��>�<3=�� �j20�|K� ����  Z�|}NZ�߼]t��y���Sh�F��ܟG���q;�)��G��+G��T��cz�������O��%#���x?!�$�@z������	⢑q}n'��d\��Θ;kF(׍����`�#�G�����r��%G�u�=Y���h�� @��Ű3Ydk��Ț���T�7�"&k/�˷�Y�e6����/ i�	�	$\_G���㠿�F�uR�NɄ���:�z��[0����PC�\��&?F6��{)�%�R�d5��u�|5,�>1�p����O.�	eV� �}j���B+��qu7�0�L+��(��:�/���[�J�/L'l1��aX���ڪZq}�R�Z!���9S�&R,�z1m4 ��b���#%��j��7�P���)#M�k�Kh@ѕO����Pu�r������A�@�u����hHA�uU!�gu��\]���⭫>�X�����j]ޏ��Kz�J�C�ui
VAB���T3���Js�ˮ��*��nz�]��$���nN�
�h��8�m��ڐ_���Di���*�	�����Pg�^��\w�/$Z��mDa⫓\��tj�e��|Y=�5�!ê�V��`	V$�gO������O��Q@b��j��XUV�z�j�jW↰VX����q��R�U�p��mAH�r�` |��Ba�[W1Ȃr��}��gM��!�z��\K��f�+bb�������*�t��"����T�����r���K��1��-���X�PD��r�]UK�
���N��Ķ��`� ����W���ښ.=���kD����~�0_�\H�+�WA6�;(�fu��c���������s�PA�UۃL�N1��^|��ts	~���g�j�j��8�DK�7�+'ؕ�k�����ٲ]���Jv���o����1,����;ؔ��D`or��\UI�KaUV��?a�9f��n-��	o%՚;��?����-��c��k'bzY\���%Ε"�j{�V��{���"Е+���O�R�n���<�XW��7��Y�T�;�J�AtT�;j[W 4T*����|�'�z�������>�J;Ր���Re���F��1�2�g���Qut5�KK�a[I}�M��S����wkrk�b��>�<�٥`�&@���B�e�[j�e�
�1E�T�F�#�8��� �l�b��&6�$�Ç��7�ռSK�5b[��xI��c 1�t �v�B����)�m..�(Y�7�ŧ1A� ��3%4��o��t��/��p�����D���:�O�7�j�L��)o�%d_o�ߑ�P;!��R;��^�\Յ����:��Jqe�$�!-p�Bt�6��ǧ�m��JM�,�����w4K�������
�P����^�Pi�1}.�  {�q�\T퐂����x8�KĠ�j��!: 3��KR*�/��4����v��&.��f+%�n�uCHC��awI<U���Zӑ��DE�� 1�4D��v~o�-���~$geu����.������T�]wK��o�:�.��n�غ+��X�\73VW�l�(}���u�����/;ـ4��5�%A_���&Z
�_��	Y������ʙ�Z�[��+��b�W��		�cC\m��mF���lW�Y!W�7!��TC�ow�Ǯ����fJU�N0��b0wz�vj�m˖��S�	��&�:7�9c�@�m�ћ�>�.�����u1�γ���^��w�i�l�[���c�=�Z!���Q,�?���$˜�ZҒ��EvI���c����\�
,�3giǪ��AE�ty{9&�u��.�]���4a(���E�Z5�Ѣ���5V �����?�G{ܨ�u���j]�9�}X�������K�t�X� ��a�P&6N+�\M��W#;�U�^#���Om���D4E�5�z���jG��1������9W�	�K4�]����(�D���x�N���X�D��N�$F;��3��/�WE/&��K��Bė��ܘL�9�8"�L
��r�o9`����r��35�{�*��C��	�K䰿w���45��Hb������	;C�] p/���~<m��(�$�#t�J�_��� �=w��W������'[�η��D*���p��_��D�%2]ߓ:~Jsd'�l�C�o��k����-��PD
�����it#�/9�W�on����%;���%߄�%�yc��BaM��B��&�/����G�J��) ���+n?`ȜB7�1m�\��11eӡa�d�\ �"��@C�j,,lĒ�`��B�����ǭ߁@8_������>�mD�%r���XUq�$���]�^��f�<חl��{�~ \!��$2ڗHl��*��c���M�?�-��_��1%���� ������ܹخ	��%2ۋ?�{�	�o�G�W����"ͦ��=\?����D�����<z��M��L�ǭmh���8S(q�n�N#�}�w��nZ��)p7�e�+����bGj�1T������(��D�;��_=��%�܋.��$�t��ܯ�(�~�@���q;�������~ȏA�L������"�e���M�r�@b��!=��%zܑا�o'ő���@���Yk�jxu�6���>-��    B�D�۠ߗ3]`P"�����SW��i�d�fqej���xw���p��\������De�t�~L!ҝ�k�KHt�����&x/�.��C�@�^��=���3�{�������	TyXBl{��Kz��#jL8�z���K4�s}5�bL�����*�����D��Z�Y�%�	�Eb��K��%lG�}Fx�~EdG}:�i��.:�{3N�b�p`��D�%��1D\N�ؽD��U\�χ���="�nd7G�D���۫�p�"���2l��/��="qf��1ݏ Rl�g!X'H��<�/��11a;pɳB���E�!�<D
��Iڈۇ{�a���8Y�����z�����G,^" ��4�(G4��� S�@P �!z�P�n�'�����m�ąM�h��61�`�p�?��͐�8�sI��/�g+��$i1��VHP���'L��$
��~eE��<�*�F���yt�`oSȰT��O��������\}/�
�
:��AAu����K��Z�v�������@�PW�g5_RE�}��ҮXP�ܻ��U�_��"g���嘶{��i-�k�����6t@�F�"f�|ۍ�y�:3[�m�T�9?VD͖k����� ٲl�����@\+�7遫�FdlY��omO�N>KB+��0�L/S-A�C�w���-����xM��buLX�"
�~��������L楜�<�av*�{��Z�`�y�-��`~���<7D���H������
��׏i��)g|u��ܪHJ����*�N�;W�ŻT����D4���S�(}�l��k+Ҡ����h�"�$Szي�y�.n��k�^+b�����@��A��D��+���a��P�X˂�$M�om"6D��+�SR;�T]�C�Uib-�ե3�'!����Z���?���T��í?�񪥤J;c��Z�T!�glG�8�AKո|��9��E��J��0]��F���}~����U�mN�b)z=f���j�;�hU#>t����5�C��4�dhUW�ИS(BЪ���qL�SC�Y��vZ15�_7Hb������
	B��Ec���Ъ��ئ�����{1������z�3Ʉ��/l�L�0�!�4I �����%�Hb�* �a�g������2���N���t2t�;M����a���І82`v��A��E�v���f�zu�CV��Ѵ��y�����qN�oD�m���D�m�8ߐ<Dqa�;�u9��=�xU=�==Ď���Z�"�i���̮�o�]|M|��!���
�f�M>��4đUc�5�+���4����x�����8�jh�Q��%��=�թ���w���B`k�|Z�c�˪���zp��8&���/�W���]�/���!EPM#�l��ǋ+r8"�l�'"��R�4bȴ.~��WS�m�/mO��C�|�o0�e����4<����jm�'[��	;!f�V��>-i�iVm�-���:�f�����;Z�����@Xi�l��K�wo�9�����|���Uۡ��p�z�V���`I#A���7���!�:���Nq�鿉����Q>�5VC�Yu�c�f�b�ì͠�:�W����滼Y�(��l_ga#(:�5�H��wHg���;�G�4C*��lB�X�p�ٶ��C��Zs؟��!v_�\�����ήԐ��Q��ٶћ8�����Q���~ћ�o2��~��M~�q������ۡ�Gc��r�N+��QȈ�ȭ���GF�g�<�E���Gcȓ�B�%�H\��*���)�g�Vh� 4cr���CB�ʶN^x'����[9���S�ZE�}/�uU���1]Kjzs���u�Ta�ȃ��j7��y.��[��$��G�,\����X&���v��	Gk\�"����x��֘'E�Yg��Ħ�ed;~Jy�+��%i�����y)B�q�X���i��l��z��������i\j1ա������^N����0l"�]�R"��&��H�C������t	Nkܙ���0�?���n��3i�<N�6���jKxZ���v<n��[퐁/�[3�OG�-Ai���g&�� !�ݥ��%,���3]�Lk�X�74[bӚ�ϷSNk	Lkj����<˷��5��o�]j���K�������#F!�霫% �Y7���w�ie%��煷��C,��cӵo�╩DF�l!��ʖP�ƾIPάl	Wk̛��N%�*G�[�-�k���B���g�֘<�餴��B>O�9�i�d�
�%þ\�Ĳu%�%�������*`ұ��R�[�ںZ�0�L8�3T�.�v}�f�%	�8&�񑈶��%.m��du�2`d�WG@[c�S\�<.C���꧸$Hg�-�ll���O��ڪ51?�a�r`"z�e5��0���_g����Q[��Z�O����jT2�%E��a�.�4n�D	Y~�e�'Q�5�r]N����@�ۧܥqK�Z��.��[BU'�t<��������(ʕ�Nc
[���(�2Y�[��\k�WJ��B���zI��#I�{��UQLK�Zc<��nȳQkl2g=���T�'��~�k��ǉ|���j[q���*q'�T�K��>-�]�VD���϶��t�΋���2'��co����ĕ�jD"�,��N<�����U��e�C:�o�hk|�@�Ӳ�p�ƿ
�i��v���'����Ju������4���x\��+����%���2$��j5��a"y�?�����*"������Y!��"Æ!k]�8����z�˫L<!m�{�]D��n�ik�Ȗ�b�X�Ƴj��!��Ƿʠu�BK@[�_e��h!Ѐu��^�i<�jkl�@L))m�u��u����1�Bw��u����?�:�ק#�������	�6"���2rJ��a֛߱�\��)��
.9�2�[:]�gL���t�)��*�����g�!���ಳ)�nE�]��?���SX�5(��� 8�Z��Y�S,�٤!�Ŝ��)���ZJ�(�"�6�2�<��Ӛ��wX.�;����/4�w
fM�Y�)[#p<�U[���t4��o��u�oM8�e�|!�\)��kWc;<K��X`l��������Kj�������t�o�"��1�/c�y����x��;�����G���鳌���zOۜ����w�.u�JvD����Ħ�V�ʿY�t�1ݬ:1W��Hqo��A�^�HX�t��1�G�.�Z��t�öj�u�H_�^������#,V��0��.�u:wq,KAvW�,�'3 ��}���_r��[:�n���v	�ZG��d��,��}C�s�Dv�`2��E���tC�4��G;��P0�L������/�,v1�_���l/�9��#�Xh�y^VN�j�<��x�~��jb��H��
JI�BۀD�T�n>N)"�n�]IW8�|�↲t��e���r��3߉���R��_o	s�i��t������^<b�PJ�/�tt��`�ɻ�]#6�c,�Y~u�V�Q���B�*&�Y��% SrYG�*f��������;�JŜ2w�/���|�~��{�OU�E�t�e}ap�V����^��wD¡b�9^�r({�_x��ʢFh��;��{��Ce�˿\���Kꈁ�p`Zy��35����[��t��F)o�S�_G�l"��]�W@T����{7|
A��}܍�<���f��Ut;�CDp�~��	���o�,bhn��R�+ �u��`� ̊��3u��`��R*�D��96F?ߦS׉"�t(���%G )lPP\h�tĽ!'���Qo�a]Q���R�\�-��B�(Ԯ����;"������8���;d��1�p��(2#�a��	j����Ą���ҡ#&6uO]�i"��\��U'"�m!�����o���v�L�1-;B��؞�{ss�EQO@��h;����QKO\�Yz�s�}OP�Y�����ái���y?=�ph:do�qU�!=ڈ���POHlN!�Nz;\���;�+��q�hˬ�'��Cy#ϙ�z��د���    OG��gO��j�O�p��g{��صjVr����G�>m{�g�uhm'k��^��D8�$�!�[>{�[*�c�����Ɋ�?\'��ط�u�����>H��M��q^�����-�&�D5�J��g��YhT8Dw�|w=��-sUz"���~x7l�F��2�7wb5�;�=y���^"��y=RO`�:'B�J,{��ЅYT[1�K�={�,
���>�)���!�kE����F���.	��ӏncC��]�v�^���;�[tZmW����y�G���i�S[�8�5rr͛f����L�
�M���:��W��[�º��U��כ�>��=&a�^���X͕���^뀾�:���/��e���{-�6K�ʒ|X�[�Z�]~³x�`��ϖ�Y�u%�ҳ^�4��[?ǁ�r�E�"�����ޯrvLϚ�����~�H=zV�ۺ�2E�g�����uϷy��g����$�{:��7;N���:�Y�4������k��Ǟ�J�K�����=˕�p��_ :jj|���nC��ᥲ��Ŀe<�Dr�ب6�~����U��"��g9cƭ�Z9w���i0&��Qݘ�_k�$��m\ȿ��KN�Y�4X��ś����1#W��%��X58�/A�:�S��*�K�ù���O����R���We˲���1��r��}�3�.�X>z,��ƾ�8X=5�CxϳE�r����L�E��w��\VQڋ���W'�Þ�T��غOy�YT5�,���g#=��r�U�8�O�Sޥ�Yl5T�-�����q�.A]���]���X�5�s��<���o�}�����4XߊwU�ws._ߊ�v�u��4ى�.������`R������}��Ju�:�;�o���R"Y|�f������s-H-y��}W}�3W��#~���r��k0�������;�������b��g�����(��Y�5¯;Q���=��w��Ŷ}#�g5�������yQ��6��f�mB�	�o��W�݋���a�{<}�a|�ʳ�Y(6��/;�q~QEճbl0�_���[X=6x��-��/�i\�3M��<�"��0�+�q�]]��z#�K��VoE͋����Ж�R0O���i�B�~��2������x��sNc��:��v\��o0�ַ����j�O^�u�7߼��6U���~>L�}��P������۬�m�(���,t��c���ʑǳ�Zݲ������C�j�j���>MCz����+��_l��WmX�ZƩņ�[V{�v�q���6��.�1��?��SG!��U8e�z��M!�вw�&%W�B��h��;.��w\�����[I}�d���<��Kê�R�o\�������ڰ&m�Y��Ŭ���q�z�p�s`��w~�ZmX�6���O�)�,B��%짼�6,<�&	����Ꭓ�l��e�U�pI�T�a��4�ٻ����R\�ڰ�l��:��X�ӫΒ�ilG����J�Y�*�[rMՆ��m1���>���i�wBYS6m	#�)��b0�2̶��F��>���s ��mץAՆ���Kڟ��8�hV�Mk[�>̙�Նub������jj�����_�|z��x�M���p{٥�[�aMiG^:�愁j�U`g�],��O���|]����Z:��V�&�j��\g{�d��'���Kg���W=�C��n]@O_G��`��m���?~3��,������C�!R����׬eYg��,�.�|U��:ۑ���
��b��O���d#R��eD��z{��~��yDwyP�
�lc��m�(0g��>�����Uh����:u�w`�)���כ��%��O}�_�aZ��Z1�vr���׹f��h�������!�aU-�z;�D�`��Um�0�{
��"��g;�xk�Vs��dr�a-��^q�e�w��|e��o��l��y�yJ���%���<����r%��OA��s�Z%�1P���2\mWV�)��E|�X�D��?���.lz�FDӊ���� ̳Ch|���w�!�ʮڴb��e]mZQd�:���%w"�f���B���6�8��s��`uњ���,���Qv�����j��n`�0�Z����Sj�w0���C�j�b�5�����SRG�6,Z�/�.�f,�;�/����0X�GKz~s����
�����oܔ�
���"�&?�-'!���<C��Lы�����#�o1 ���A����Vm��[|#=���*�jCl��Q3{H�(�Ñ%��7ms��eY�����d�0�����M�u���Y L}
�`��W@�%ͲS�́�N	��~���A1]�o?NV�   ��8����7�7��ZR��[�1R8O����y����q�ӡG>�~@1��⠸�dw-ū}2����ҕ�`Bei%Z��(�%����i��J<���$8~��8j~U?Cw���;�tʐ]���˳V;���ts���V ����-EI�qE�����K�е�����g:�Ⱇj�v4�X�;����4ϼ�RXD�����f!AЈ ���*Q����d�Phx3��kg�{���2�Jkp��Z�f�H+$k�o5��P������b���;� �P��zK���E�U�6mo�
~=�R�(�R�����B�z_���u�8}MɮZ������\3/�q���}�}o���t�Rm�K�Z��*��T�Z͞9ܗԡ�����rL�I�l�m�/�BK��L����K��JXM�θ�8��lӌz��a�Vl��0�CA�d5
I+H�x��
�Of`����W�*2d�l�
#j�CE�Ii�5��>��/��m��b�nz'�Z5�j�g+�$n����S�[M��:��P8PsP�%�z�" �zZ&���x�W�ҪKPŋ����0��Pi�Xq ��O���th6��<MR�G�&��ol�g����<rY�h˻�n!�aW���(��i�vqʸs�Q�7�U��8���ewH&����Q�2�BM��8e�r8��]��M/�j�6ͺ�FX��I�z������^�����[�:�Q�-�j��32>�񷭄ŀ�WS��bW�b	3�-� ���GDrlK���}�A����n[����N+t ���Ո�(F3;�Zxm����<��닧~���*�+>9��=���n���������i�-�����%>��h۰`$��ǻ� ��>8 7�'�C"�Iv)��t�ۦ~bJfJ��L��E��Iܳ�����D[/���K�h�E���[���x{q�z�e���7�翺�U|��'�Q��
���j*"6���Q�8k���Dۭ�1_
�=*�V��\1�8ӃGbf����CY�bc�6���B��G�j	�2����d�V/��+`��ߡ�~�2y�2.� �)�g���;����\���	g��h�=�y�!T�y�p{��M�"@m
;���XR��a�bI�+A�[ �P+I��D��^H�����F@k"�N{3�����4.�%�Â�)���͕�)��^�o��Ue9��κlfr6}�B����*e[��]��<.�G5��-�8�
�uSc�Ӥ��\r���L)��~�R?ş�yb'W����iʵ̂�|J'��1����YB U���q8P��P��:��G�a��HU�̏��2���]8�Pi����ܫY6���o6c��IOY�����J��������^i!��s��\����ǭ�(m-�A`-��x���1\T��:u@jn��J�Z?$�pT?���8���6S��ၒM"'���P@�l� ��$�L��YtX,�Te�>��8T���i���>afVip�^�p��pg��NZ-f�o$���=���:��6|+�j������s��yP��^��~ΟP���Iy�:�A+^���s����-g-ީP�j}P>>cU]Ju	���&��^ժ?�S!�>.~�3C��T�~�u�?�L���# ��|�mw?�#�"��ãEm��z�1ɰ4�Ǵ�p;��<L*�iD�0�4Ʃi����B_W�x�����Ӱ?����60E1�6�ߧ@wL�$�m��L+ ����O�    ~+���W���w���7��~�;�p��ȉ�7�]�]����A=�ͣ���PP�^��yj�TsA�md��i�^�ۆf�G�.☝�T��ݹ�UR�:�t���E���y�@'�����-57j� w�4Z�Pm��m������<LGo�'̧c�
��&������B��<�.��YP?�O�J}�3���+��s��Ѣp�մ:�Nu��E��\>O��] ���~���Zz0:��m���-��� ���4�O�B�ӹӬ��."�N=���p�~�V���1l�e����0��)I=	�(���	�&s��N5�M7f���	س��AX0#Ͼ����������W���jwI=�y�C�XX�Wh��i��
@$
����%��>�|5Æma3M��xs�f�x1��߈�f��ڂRG��v�@'on��@=�������,B?�O��c��?	�������Qf���(��Ï�Y�����|9�U�=���{�^/�☭f]�e�>?=>��4��\m����);�^�@��b�ܛk�m�}���v�n�,ȉ��9=xc�ojkE#qH�\}m�y��I�K.��q��k����:���kl��-.���ħ��bTvp���@�-+�s�6�.�Sc����$��
, ˣvH%V���L����j���P�[fDd� � ��,:H��������+	�\`U)) FB�M���!�c��4���`�E���� ͆�5�/��AS�{��B��)�u�-�C�%)~畎~ܰ q��NvВT{jhh,^~���ZᠱX��dc�_j���/8��<?J0L4-�/����Q/�i8{��������>�iiȜ2M�Kz�khi����B��խS7����������0Ԗ���[��e�*F\[���@Q��!>��BJ!�A�}���2��u��)z�ec�|}!,Ix�imO�I�]ܘ������,-���x�;��ӿ��"Nz�Q�4z(�l{��C���@g�IX��񩁀ζ4�k4�t�0�\��j �c�(v���D6�=�ᭁ��Yn�],|tXR\�T�o�2��v�G�J��Ŭ=�Q���(j��2!XR���E�(�T�^�=Դ��VE�=&RçCzH���F�P�A͡�>��oy���a���}�F�+x|<\����o�)(ۣ�p��E
P�nހ������(R�{m@��h�Zqj߳�1�	H����;��O�@�J��Ý�J�'B�]0ƴ)¹'*5X�0��V�����;^�d��rĜ>��ˀa9;�(|ϑ�������,]>���ۥXo/h�=��";��� �Q���� Opjg�(���cw�"���P��B`��8*>���Q&<��#��Z���e���(�g7O��D���ة��G@J!kC��}c����Z3�k�K�>z�P3�`�d���FKHO��&���nn�������?n��@EIN�aog����������A�oX/J|+CQ*��x����P�J$p��a;�z
��P�J!8^����;|*CQʕ����>�Ԣ�5���pLC16����������zܘ8%ʄB ���d�~�����R��H��,�% :*��6�Ӡ�+e0��xM�MaHL϶�0��v�XM��0���4��IM������-Ab ��є�0Q�B���.BVv4��AriK
	�l�v��zS�`Ju�=�vx�1K�}��\��`��d�� ��ml�;�	P���e|&cP���C������W��TPK��a���		V��Ӥ�oA�����qDHE �f�YO�m.
l���Dk�ū{�0��Ă;�qF[Z<�4f�i=�0�S$��N�/1�I����9��XH�Wb��.I�U7V���E��	���աR����lw�iq���=�WoQ."�bd:��.Jm�ĭ�V�Ԣ����M�S����m�[V�P�J�J��˵�z�T�K�] +��yk�`��A�C�]]�,c�8�]_*�]��r��W���<�a'���_َfzV�w��S�}M "} ,5����r��:�Rc;,�����ћ��j���6N^��S�!w�}��ز�����=8�~H?�E���j�[��e��������ሟ/�\El���w�����J[����m�������f�n���Hik���{��h�;�L�;J�k6��#�_ �m���l!����M�Ui�"�5�"��x;��mtV��~刃͉�u��F9Ba3`m�O'�h������>��lW���2�/�9_ Tt��k̿"��/lJ��٭���&���V��s�幕7"K���)��p5�|YOQ�r{K<��x�^�`-0�>�Vs�O
p{�<��í�.z�4�-9�j��3�a�Qm����c��yk�V4��as�˵�ؾ��N�@��=���7��=����/@�ݺkPZ��
[{|3�&g�V]/��cz��W�g���VJo|����l|Ҫ�F��R8�����c�G=��5r˾{��(d��粇�c��ť��8ŀ�r؝�#��2�z����	���͈��'���I��9>�����������WF��� '�����E�Oң��{3Lx =��a�h�q�x�8�p^�j힍* 
��/����?jg�<��!) 	��ܑ�}����/0?�v_*c�����1�*.���!�o>~���O1��qM1M)��ÉL���w���d�h����ç:��9�vK����;���O[u��G~C�N�p�dS�C �j�_N\Zbvd��#.-q��v#��� H-KY ��C)B�iu[+��&H���-qjY��c
��Fe��G��b���q~�T��M��=:CY�	R�(�1��� ���APQ��<�`��}�.ƘH32����GG�G<j���D���ӌD1��6�����e�c���j?��?B��چ��/�o�#\rmp�޹����`���w�ۤ��`��<��5��/�;���<�Ah���H��a0gP3�����a0CP��y�͑^�&����n:A�Y�ڏ�=�e؋�a0#P���i�L(�'�?��F.;�:�G�=��\wɸf�\~h�u���|N�����5ncE�=�m;��l��ǧZAE�V'D4?�x��O����/~��8��1��$�7̞ݔ��%44C0s��_��1Cs���>?��f�᫒.p3f��f;��מ�<�̯���cj�S'��b��~�4������f�R�����y����Ά�|G�da����n�=Y���j̊�3�������%�av����H��X�*����[���v3�\��7� .���7W�W\�������)g�&:4sLU�L���巶������	�D�ma�����. :���"4 ,4c�V�KM���3�����?0ѩd�>E'��&�j9��j�B�S�_Da���z�x�N�3&Z���ۧ�]=����#ɰ��Q��(�DbIN�_�A/��i53*ZV+rL }�&+�[����P�ݘ5
!}%'���
{,��(R�H0��}ZX6
{|�PuGy��B�����(T�ۜ��Fa��+�tm�/��F!c߻#G>i���S�6�v@�&�� �	��j_�C;��2�����ܬQ�:��cg&��΁ ���M����a���q�9�Ol@���?�����|��������iz6T�h9�8qX�v�:������|���a�(f�����]lCE���1d>���0`�������?�=�/O�<��s�μ�Y�Q� ������фB5ki�$��
�(�����O+��N�o�O���i�DNnӯi�س�I�7Cejoc�N8�b��Ӓ�[s�H;^"������%�gE}ڜ껎�1H�jXoĹ}��hEe��0�P���e[�C�dȡ��8.���[b��7#%�9{�iD�č铃�1��b������$�LW�;-�{0Q%m2 ����Ī�6�����b�(b���"��T1T�+�9���;��S�J}�    �D��A[�$�)�gEC����w&	���������C0�1��tY�^�����8;�q��������ݍN\96ø��mE-��V$�A0B�X�R;,P.������Vua?W# amE���'۷�f.�J��O1���h���Wq�p�|�����a�ʬ��M���h���d��0OUZ�ŇC���8��~R�m�m�cӰC'�/���Y�m�z��fټ�G���A,c5���88([Y
�~>�B1��]�k\-Ąƽ;��K��0Z�wH	���B;�v�g=�Z�|��e#6����� �4���и 'M�� z?z�_b\~���4y3|4�,�2��M�kA#/�9�'�`�A �� �)�f�śK�k�M��\t�ܲ`�i����~N��\1�'$_�9��M�L-V��������%D��)����h�t���"� ��2�����'�a��n .n���EP����)��2���Y%���Pؼ0���L�	���|!��an�=�����Xk5��΅9(�1����6���bRr�x����S%�������9�Ս�S�6E0YvN[���`֖�L�,H�9M��-��AD׹k�����k��f_C�h��ne�����«\]�*��y/��K��x<���*�+��8�.�K�lZŽ}헶��k����Ȏb~Z�=��;˦�g�U���6�2j��7����b����D��ld���k"N�[ck�� �w�7�3��ͭ�C���9�1@�s�U��?���҇����D���Ӥ�n8�l���R���c%��c��%�?�`��>�=��>�才Z�Va��L<���;{�Ҟ	މ�ń�İZa�h	�>�g8�

��^�y��A1X�T�,	��g�0���}�:AO�8?wz�h��i/��`F�ͲS���>�U0��}~MZ*�	�
������K�=}G����p����NҜNS0]f9YR�u<��D���2��f�2��	C8[ 1��M�߽~��x3��6v�,�'�@�*���[���J��5��&���~�O~���b0�����N����&K���7B�T5��	��p@�Z��%���Ϟ��5\�Lcel�9t ��Q��;�ą�|׉fkJZ��\���u��U�ӳ���G�O�*�
բ��5 έ��;đ1=�D�5I\<Ϙ�/��S�����xʿ��Zy?����1_5���i�͏iie�[׈��M)T+(���f.����pTT�V���yNb�����b4Ȅ��h�%��sA�k��\'�k>&.j�X�-�^�+��{"]dԨ���fۚ9�U��r�H��C���(���w�=,�y?n|8\����֖i���<�ؚ%�����)����m�������9$�5�Fj.���r��lͰ1i�?��w�1V�ژ$��n�9m{�`��յ��r�Ӣ��d��En'f������=�� _M�Ofv��K��gP��\�\(3�#�6I�>w<=K�0������V�rm��M�\����i�L7M���~�Q� ٌ�mūH�MW�C���ˎ�Ov��(�g1���	���2w��=�ec6���q�v�m˥���}�qaJ��m�������w�	J�:S�a��X��c���v���Q]!�m2/�U�;a<ު.��+$���o�2��&W%[T&��f9�)ܥ#Y� �yA~m�0h'�o��f�����;���	��M�9��Yu������#�w�g�q�L��d07�d3�����.���Is��Y���ѹ
o�`ޒ��ɛ!����^гP�W7(ﲤ�ǀ�3f&���]�Թ�3����i	�eA���˿��,o>�	��~!l���I�Z��_(�'�{�<�,𮝺^	��^���zAr�PAϪԗ��<O��N��~���b�]� ��VB_)x�#��_����OGܝ�}�B��֣b��G�+���r��i�����,��"�1�Y	ɭ�2�/��-�P�a�"�
#�@�q�Z�_|H�3�MVNw�����}��r%l���,�@Y8}.�����yY�}���Ӧ��R�ɡ����o*��碎g�r��Btv�b�B[�9�8��`�B���x9��S�P��߳�y^���b::�\�CІxN��V;T����)�	�+�s"f���n�! ��D�����n~?���^�2ͪ�.R�����i�_[;-�vhA����wv0���_.wq���/[�V�%3Tj~�<� \2C@��˗t��C�5��y�;�Cf��|0팴�/f � `�n����D$�{��,����픯	P��0̚�b��(͇a���3ib{>&�3j�?��{;�OẎ������=�Y�Z ��髀�.��A�K������li	X,9�i/�u�F�c��"l�`I���V�,���ְ���|��c���0\�T,-C@*�����^=V,�c��.>�q�}xRpâ#���i�����,N������4�+��nWoKn1��i�/�&,-0"1��pbc�b��0b0%D$�|!�T��b'2l��p�.^s�oe`j0���4����Kl�֛�W����p���t�Y�Wfqm!��`
��<T�h�����!�H��Ų�?�V�*C@f�/ۏ���壯���L�PS��q�Ý2�T��٢�R����1r�� �|�uS�1�xe�!�.���O��A)��qy��'�a&�,=kƒ2Lￒ�NS���)��u�յ�P̺����W �A�{<�a!v��l,M�p�1{�T����a.LǨ2���i���"�!�7�Zi�B�]��qkQ�>�m+8m��X����fΫ�]\*�\�7�}LRs������G��d0��ʪ{��,2}5�I��E]�f�8~�{o�5�������@m�F�0�	m@k��<k�I��1��S�N��[ά�?���[+�K@����|��+����UN���h%� DTe��jȆ�o����RT��rE��s;Q8��^�=������
A�ˬP)��F�&�����\���W\:B _���;���I��m%ŰRA	�Sb�~�*8 ����T��C���.�ҥ#�bR��t鮻r�Ze]�t��$�4'��CL��W��"�?GEĴ-�c�����>pB6��S|u�ӗ�9����nH?��	��_���L�
��_ذ���y��Ls��x�3����s�H�^�@��Y�#9q�CP�`�i-���p<ܦ�Cd�/;-<��M��H�"%�����4�+�r�����hE��gبg���8I���Z��g����.����:@��$£�a���-�:�f�Y:w�aR���a�U^)_,�jI�q�;��B+4�.L1�[ĨI!h(�����Ek���odM�ވĚZ�Y�A�h��+þH66d#�5��8�䑰S�ˮy�i�P+����5"�����j#�+L��C�:��`!��G����S����^�z���~��B�m}<�Y��LQ0�z�iR
+���ao��c �r�|k^(\QP���،z�(�v�,moo�n�YsV|Q�p�rf���;`Ǘ�W1�ȎO"2 � ���Җnp��0ى�Vj���ۉ����v��J"�wg��M7A
���>
b(^�Z�q��~v0C��H��AU7O\��P�p��-Ѕ��7�7|L���*n���*��6��Jnvq��z�z8����3�o�����r��Hda�T�@hi$��?�;Uq+�|�o�	bW]8����Hv�x��!�Ҹ����0;l������'4Yd!��r@#_�`�I*��W2E���!,�w+B��w.)\M�EC֧Y�"�v{�!"Q}X���E\��`�,I�O�8��87KW ���H��X��↥��@�O(5.�MԣW�8'.{�[l��"��C����~��h�$��N��0�B�����Τt�E�k����z��7
�)�X�
Ġ�Ƹz����R��    T�"�z�x��B���s\͘��սT<�Z�U���ކ.B���B�yk�M?Ĉ��S`N����)��]�YZ�����e�"�lK�3��ݛE�%_�j�eZ���wu� ����vDZ�������m�Y{��Z=��)Z���9}*Q���bl�7
�)]I��S������i֊{���p����;����c#��t����p�3Y����$���I��q���L+��l/�����׬�.ƨ�yu����?cvHg��q�vQe��z\�P!=�4��_�b�w� ������.B^(r��A��r!pB)�!R;�Ѥ���4^�?�$����>�2��O�:�4@���g��SO���KB�SO���ޞ(��?>&>��y}k� �\�9r��6_��nJl^�Ny�o����z��#���PPY���=i��]�IE��V�1
z��]5w4[���v'��������lNX�*'�çt����nT=�z	��n^?.�邲�׋�'�����J�뗳���ˍ(���[o�]�*ۍ�|Rt^o�ЫVyz�,��zC�\P�Q�1�#r�>����J�j�O�<�(�#tI�?�C���+���~=6��䅽e!�j�Gl]>F��MD��'BE<֜m��� {�X�(����;Z�#XO���K[x�DP�㥾����ȸ�DǊw�i}�D��8�V�!rA-Ώ�:W3,P~󣕀��DL\Pu�c��c'*(�q�g��
�
o~4]������n�姿��}��e9�����l��q��So�B�յ���ֵ?^lN�'��x9���y�A=�L��2�p!3�!O��e3�B���d�`�{�,lP;�O�[B�[ 0�f�~�"��+�=�7� �-��ys�WZ�T�x���E��Oo{K�O�ŀ�R;d@Xjޛ����䐈����%��W?Yl�
t����
@�&M�alQ� 4^�"P(a�Z���#^�Zş�k9嗱 t-0m��o��R��Q�n�aa'=!�R��J�}��B
�<ّk�whe���(�Q*ӟG,��;���	GԄ�v^�� X-��K�P�Ղ2��o�'�w������ J-(ڡZw���Ih��?����yb�ø�UA�ZX.�w���u/�Qj}�����A�҂�3�Z��iA����<�J�R�o���,��M%,�����,X�x��߷��g9�+*1a��9�L�h���p�vh�\�2�1�A�N���64~׈6ʈ<�|�N�A-�p����Bo/��/rtإ+�
�~:X�Y�厣�+�����@�V厫m�  -�R7)�k�W��a��嘆��`(�Gz8UԢ�OE��M޺�E�m�^�z���kAy�_��v�����P.Fe� �T ��jL$�-�1R�c*5%�5�S'�ʱ@}
�)�eK�s��~`�p�L*qc����0恈 7B}�z��lm��_-E�TA�|</W��B]������!]�����|��u�X(�U�zg&4/D�5�/|H�S�*�<k�1�yM!%�DM�Z�C�B)�>���"�"_UHq����uBT"Dv� Q���i�Q(��j�ʰ�]Q���f�;��|���B��j�ܧqJ��꫆�n�G1E@�B`YQ��̱�B����v::��};Kxyg%^�L�*����a�ץ�W�Wj_�م�_��z�����Z�I�&�4[(��z,K�L��B�ooI�B�99��8�K���?+��Z�P�P��Z��@d�X�J��^��HZVx	#^ȵ����o]( VYW� jT�Ej��Fd�OOœf}���S�%`1�H+Ђ���0��z�0�+뿚x�\�s��X�b��lID\zE�A٨Pp-�Reբ�Kp��Jy�sB�z]�J�����Tq��7��R��Ԙ�(j������ŤZ���t)7bϢ\��K_nD�E��N�uB�[��)C==V���)���/���,�8��~=X���%�f*�����ǒ����_L�h�#Ԓ ;b�r5<L˸�$�.)<���\�����]��%AwI]���_����Kj�ޏ��K/J����1 =m�<���%�ffv���ő�*{�W4��[�� H�H�)?Z�Iy���@5j�M�Nu�X�T��d�ޫ�8ʶe_�4��ث-�����TI�]��m�'�a%!x��73��ӥ��*v;��0!x�:��~��Ғ �T�ۼ)��MQ���|$�����%[����]�S��=� *B�T�J�ܧ�2���zP�{�P���HIL^R
��;���.	�K�༮e�"���s�(J���2�e��l-����GI[.rq�(f�X���%m^ڲ�44a�GQ۲��eb�����%�Z�{��%Y�*�Zt�,���Y}B-N�u)M��Z����譝�n
�s�ژ�{J_r>2���W�
ղ�Df�ӣ�I�%;_צ��j��gF篫C��A���o��,�Q�P��l�뮫GI�_Rǧ����(���o��z�KU�QC���Wk�2�>ts�B~փ���r��l?@�_�\]�;-��\X��|8N��o���<������5Ar���\}Y�>���P�POe�E	sH.gQ�B�º�cU��p¦���Xư%���2\s��a�*P+Yb�!=��z5�7"??xU��҈�6U���u/�+%�^3��n@.��}ֿ�[��r�u�����W��Tţu�pxH�?���i�T�4)��Qژj����[{����E�J)U�8����{�*%���X�c�? ./Ɉ���)�*�k�"��]-Y���x��W��y��3;��咷?�N���%���ډ��iIRv"��"@���>�x3�P�a�~׆QΗ�KV+%�����<v@z8ަ��j!�0�����S����2���q�e/"(v�0��~o�:������]oz�Z�P��-j�J�5|ɼjM�Z}�R���(kq�Z�����[Du�}ލ_ZZ��v�J���.I�X�j��
5�E���jJ-B(m�˃-A�u��������M�j�ƪ���1v�m�\��Ջ�'��V�*��$�`1��k�1����a��%�Cp�%_�Qi�A������2�3	����'�J�Δ�<�/���N��VZit	�Ǉ��aM��v��d�V�.@d؞���vz������e,�Ơ6>g%��Z���l"�V}��r�k@Ҕc`�������?��`�-a�}���l8�Z [��N�fh#�x�N]�8�]~P�;`hKZ����ڢ�,u�-I��p���C��,�Ud8ے|̀X"{y?� �X�>7G�g���ߙ�18,�F5<�k��+�3��U�Vx0cMW*��S{����+ �)�w��$�����\��@PR�a2%(}�E!���a"��'B�J(	ߟG�( D����B2�E�=�X�wR��j���N��a����_B&*&�t����7�MVQF�^�B��ӵ)@�~�F��j���0}>�_\���$r�Ja}��i,��:�>&�VW��q�O��A},Mz�=�o�C��/�=e�8�9
���_L>�q�D~��<ĥZD��׸uኣ �l�;.�o]-D��ҚDnj�%��E&N�P�?&J�Jw� ��&L>c���re �������у�'���pdՋ3��h���� ������2뫀�-�B��5���@S����>� X���<��Kڔj�A��7CJ�)��G����l��r$0Ȩ��d���='�v�w���*d��6���������s**�)�m�L�w+2���?,��Vl(M�r�����vr�����0��W����E*� �aQ|3�>�괸�6�L�qwB&=]D�k;Oq֮��VXO���p�K�7��8����"��뙭�X�x|�v����A�I��0'ϵ]!(lph�H@�3�4�tP�"<e��3�"ʪ�f�6�U	[����JiM����YlP�$TD58�M��`>��#�l��Q��;&}&�
�c����O7�;�j�Gm���+��-���'��q���V���`��!�о�� �eӧ��۰H�u(�?���!    ��V�/�8�!>a��2��aYD��H��.���֓Q��078��7|��a���qYd��'��a��|�1.�/��*��B-Y�8���=TqQs�N�b��kj�9�T[IZ{�ٔ��ަ/E� ���sj;�5���7���W�ϖ�{g��W�%�Y7[o���֐����ܯ̋��L]���W��oT��rس=��W��z�M����p�QZ񯐙�0���>��
�Y��y��J9�����А�N�t�!R�� ��˅HZ֮�5�kwڢX
���95�+��q�~�V,��W����¬~#p�R3W��W�?Ά��ּ	^�4��
{Y�~����6���jž����~�c�Z�/+�ؾ�Y
|[��R���*(�ey��2z�U�mkk%}�U���3�������E��sz��]��?p��y͎'���B\�$m�;�������P9l�����0�I_��U��E�1��*{��/\9KN�Y���T�!Xy*��O�(z�%��������]�����=?�G�{~����i���@�ko�#��d:��߅*p�����㔮OQ+�>o�p�[�
ū���,�Z�I�ؚ/X�io|o�Od�6`�@���`�6g4뀠Q�"ŗxU>
*BE���x������?PlX���`�mVa�^3E����$Ñ�-P��*���S	R�u,�1	x��*s�bc��Wj�(����[�RM��rk�G��S�_��m� �@vG��lk%�[2��t A	�C|4�[Mlj�f�g�W���@���@bk#Ӄ֊,�3v�i��n�v�Ƨv�`ELX1̛u+�3p�q�Q�b ��'���.���� �<WV���F����À4zu�wX>�D�E!���㽋 A�=J0��4��Z��uɘ,����>J�:�)��	@�}�~���/��D�M�����b����8��OC6i�|8�<,�_'�l����n^'^�h)oP/VL/��<��"��:b�~L͢�Wr��C&���@X�,/KXHP-ȴ�S�� @rH�^)�!�,�zgE�w9�"ִ��~���	�L��:iS�>�&��,[����L/���Y������-��$!�OT��=�wc�h�Fd4�{M� Qa��;��]M�s�E�M����zc2lD��ދ�wx���-l�OO��B��7J�eI���8B;�83&��M�ew �,Azg��.��
һd��>���޾��bI��f�]��B3���(�:T�i��AB���b��xgI����ԣ�64��ײ���&����.��Ϙ�yx#1��Ѫ�աT#�*rǓ_;��%����:`P����Z�C�h1k��"	�>ߧ�t r-xPާ�s�
��$�(5��#	�3��5��8���O��P��ޥz��휂�@([ x��`槙`��wu)�/��)6њb�}]\/I�;H%��i�D�I���z�jd���&ͭ�C���D����7'�Hj�Ϗ$!m���:��a�B�N?(��
�D�L���hr����t�E�YE\�d8.��b᫜*�M�8]e-�̵�:O�����⮝�:�*�����eu����)2-l)���s->�MƓg�� f���Z��V�`����ps�N����6�`�)��*vGa���D��3�z��ԍ�+F]�L��<�
D�UW�ĥ�@`]�X��7� �E�j)�)�Ⱥ@�jΛpH|�sz�Kf�HA�>ⵛ�Kr��qJ��bnĩ��2W�(G��2����U����d�"q4�V�+�T:�+�TWy�ҩ�Uֆ�l�8��ӶDP��*'��V��$�m?f����$����������d�^��$��y�\�E�-Yiq�H;^A�zkR��A�*_@��CSp�mߠX�������
�[���0�'�".���m�P�B�ζ�M�o!/��w%I��W\�ٶ��W��������9�#w1\�<��K1yg;���˘�BCg�����3���m�t�B��qH�-]��iܤ	@�yg[�.��ajPt��ޱ+��*BL3��F���*��x�������77���X
���{V��N�b�����˿Y1zo	�I��V�m���'�AQz_"Fw7�[�Az_!Gw�W	���
���m�Ɲ�5���6T��t�S����$�ā��y'�Qx��Y��"1����罝������>HX��������Q`)���l_@�H���wϷ#�����8Z�=��$`^u��l�>Z-
�,g������Q;B
��w��v�^���8�z|:TL �%��^�=7��K����r������1}x# �"�JA�ذ�L�0�D��.h��0�<�3�x�:����|�?��t��h)v��L��6��?�ގp���>��c��R<q���ypXt����D��pD�֨�%L�t�K�CR����bL��9�E��;��11g
�
{��M$��p�X�`���g��<[n�Y���l�N EEE.���Ba��I���	� ��8����r�d!�'<������|j������>�Z�$CW`R��C<YF��jA��GW,�9�����/�G-i�Z 廪�H�=��	=����WH����b�C���_P���wM����[H_!�L�q����C����z�p٧縆8�.C��
T���8� ���W󦰻t^�I54�V�w��_a���)�FB���;=��W�X�&K��b,{Y�)�T�r��t���J��n���~{�k���ӱ蒯*@mY���6�4B�r2X�?��1��A�V��1�����z�б�b�i��/2�3�1?Z��~��6�mGD�2/i�Y�5J	�O��SC"���|�lĎ��/.���Y�(�!�����F�(�a;Ƶ���I�ą���8��Z*�/��<Z40R�_0lm�WS�;E[���#&iG���$JOӽo!�
�+��w� @���� '�կo��V�'�zs���ns� ��Њ�n�<��G,��Y\����,B:P?�?x�˥��� �.!)��;��
�'R3�d����+�A���!l|q�MZLj�&6#o���? ��ɒe���Z5����	7;�	/˔4�^e�:1c��wB�4~��^�46>�҈�1.&�� {Wf|�*�"ɞ�9kg���H��qKu��V��x�e��I1���r����l��0�4$����xͨ&qaW��WG��Czz����|8�gZ-oh8aK� �T�r�ӎ%(���O�'آ)�.k/���b����jj�J�O�U���8�
\� ���`��Kp�� %�ё����}��ی�=��YQ�mn��n�7rbu�')���G��I���)>	�sBĉn�|����*�6W/k�+�tKa�3��D�C���Ä�8i�}H)���&C���t[�duH�n��7��Y�UH:elL��
��u�h�:x�`]}GF������:�A@��RL���	_/�R']��`��	�.�Qӓvv�&!b��Oo�sv�v�i��ʶ�N��aH?�d�\���M7�7����S,�ؙ����)�� �aߊ�?�����Jr�Thi�����t������x�������ϩb�ƒP����m]�r�F�\�_�ݬ|��(TaI�e*DYcٺ���ْ����f���#f67<^�n���[�yNhjň�"H ���s�d����?���r��^���|�n���i���it~%�;�����\�񅀕9�����; ��8*���<'Lף�(��a����O�bu���qFj��5�k�����[���pʯ�Za�ׇ[?���S�2f��rIuw���b{ͷnqO��;��د�(�)*�����<���^�(����]^��*a����/Qa����ᲴȜ.�`7������~\R���;�jj��T:NI��UT�5���=C�·si�}C��7> H4G�	�������jI�X�sw�MI����+7R�9b��E~�U�O��X�y�����Wt�p�K�}���#v_@#n���@�.k_L���ҋ�g؃    j�*�cu3���9p��0�~@�`��%F���4�I?��d[*_�����.)鴢�)�LZ$JM'�ٹ��<��a��$+a?sZ؉�ԩ6��-u�i_N+7�R���u�]���4_���˃��a��t&�Cei�����񕑡��q��^X~ڰ�H;��d�郑4u��#����������ʊX'����)KF�(�L�$��K9����y�G�2�]la����>�sW�5I넨'�g�fq�]T�c�s��?R�=��^�G_���=�^���t_ɴtWF&���]�NƸ93iFI����k~ä�{�GYܪk!i���\��d�d�od��b�j'=¥dkjS�(��E�"���!���o?�D����.��2,D�`Eأu|�K��=V~<��Jy	#��?f���)�F�ˏCy��s������� Q�P+��揳�\�~�{E�����@��zb���x� d������$
f���'�zXk�ֆA���D�b��&kw"Q&�����g�	��@(_��&�(�C1���^�sZ3lSH+$+�˛�YcPc��u>��J@4_���T��my7�[�*]z����-Ct���¦��DC�u�\}=$պz�f��;oՕǕ�~\�j�+gT��tٵ.�a���r,]7��E˾@�u��z�/b���T�閙!�K�V%�տ����y�;����Ϋ��D���&ja�"
ֻ�jDh,�6��׌ ����˾|0��"�M=xڂ;
a����SN�*�������-�L�=Ս�T����"!�2�W�9��h�vQC�N���z����Vђs�?.'˩Ot�Yx������Zq�mz}n?!�o��	[j���0*��S+�"CT�<=�����
�|VvC�����
����"(1sB�0�;ފ |ԯ�,�}h�>_-�_1IV���ZE��B�k�[yV�p��a���;�3���F��2L$�X<j����R�!�ɬ���;z獝�${I�}})���&H��7�i�'Q���ȼ)KT�P�S����q7nyƜ��6�)�D��G�ڒ�@�(o���\�^(��S����]�D���,
�*��ڥ�'Ɛ6�~��:�e4Ne���	q��� ���1��_���r�:�I�`^�*�M����4F��^��=�|8E�D�V�L�Ya���42$z�)Z!E1�����ř��Gq����^|���V*^���6kGd��!e&QS=�v���`�&���F��M��Lr�ʋ�L"DӻI�����M"�w�)�E0��n��YRݖo2�l�����XIN��ֿ���i7�*q�f����W���d'����'?:��&1�����vQ��.�	�.bQW3_M�zA��o��j/�T{����"��s?O��K�(C:������T/�0uQ8�9}U2�b	�FD=7E�xB��_�B�a@�pq�t�˟x]{q��oB�P���[�[�X��=���P�I�x��M�+qWS �c9ޯ�Tb�7��˗�_����{�{�v1��w\i_,��+���v[{ia��ۅN��74ݬ�i���(f��w�qf߷^�������ޣ-z�b��[d:f��*l/�LGou�֭c���C��)��)��^�^���UH�YB�1O�z6�˽d2���4m�����g|�G��xb�s����'�Er�I@�}�^j��3n�9�D�%���b���J>3�����,��zih͗X����KM3Ɣ��O���`���!��}����fH��ǽ=�R���(���fx�*��A��E�#���^��SwE�#T��N�D�O�#fz��.�ozI�b�;s�N��ޏ�
�*Ae���AK�Q��$ �D�l��KQ�?(�~z���L�g�����b{���pY�H��Ȏ�(��$u@H˻������|?�1A
:�6�|=�۽Tt��J�n������«S����^R:аq�k<�C&)�s�3���ٔ�AƘ<{,�����x���߱+k�$I����饫C�-�׺"^����i��KI�n�|X�9� �җpz��'T�  ��{|s������v_襟;D���r�vNz�箦���
 ]C�K��:�f�OP��k�{y���&�^�x�3k��v��W�ZF�_��'��	�1��j�$�;d��x�����I<w��^��ef1i�PBD�d0�f����ezl�9���U�������ɩ�-�����c�0�9s�t����@/�����z}Paj�Cd6.)��l/��A�/2|y3�)�n��J�G��4;vAQP�����n����𠄬#���%��R�qr�D5]�1	���9w�t��K��n���@œ�`��1��Yt=,��c��u�󋏜T{�-��*��P��[~��R(�{�n9<}����~�[�=�J�����_R/(T����Kǧ�fyy֋
�֏��ړ�h�n�Hyj<=�U�����$���^������z�~1<����A���,G��a���qoæt~BZ��iP�3��B��2!c�ZJ�'$ʞu� ��-���Z���g���5A�pf����#��s�ΧLlUq�ءe��a�IBB�Й����̘�J��=Y���pC�*��9y�"e�-Q�{�3��Q�}���=��?`X�:���򇪤��<�G9����a��D��ˬ��m+M-�ڟR[�0�����M>�q�V��l�6�gԧk�}�S�x�V:�&���!}���:�{�	I�>��L1�ַ9�47�;���77�����'}�ۈy��È Z����$�G`�w��̲�X.	n6XO�v�5G�K~ۇq����T���b�!t";_�T,�����`�O�lY՞�Δ����ћ{57�6�ȵ�L�e�-L7���,Fa�^�~̳/k��^#�I�7Kq�j���I0�nv����%���'�Z����_~^A������F�0�mS&O��ю���y�^`�G�����=׌�_���Q��+���X����N�Z�[�-�*uk�}�g����F�b��u\=�F�VT1�n�õ���(��/����"½x�
 5; �������~��r��l��4`����y⽵c�uqG9=AN7Lr��i�v^:Vl�Xm�n�Y�C`�G�Mg�� �^���&�9Q�8�d��K~5<}6F���n�֖�*N�{���x��)���>�fq�1�L	5~3:тԐ�3@˟�N� �B{UJ���v�A׾�e!��A�D���C>�����L7�b�uB�X���¶�:L����s�낁b���G�^j�� �
�]r0�C6�̐I?�Oe"XH0�_k�՚�<w%��N5�bP;|�؎y`UH�xj ���9*3�=���tBj��=�9�0$��k
�`U����Wc��}9�x�s_�k��H�Q�z�Z{�8�D���O��C�=1��2A"��UoD�x@:1�0DL`z�a��JX`i��&��3��cy���d��X�AQ���~��X`~g?lno�[�t���	����t�E=�M� veħ�G��|i�i}~�s��Qd��k���:�O�%-��Q���M�a�XܢR�?��J~�ve��t���3�_*B�Q�?���x^��,�_`���(��}���W zE�tKg_U�*��7MfϕKI�W����ݧ�VL�I6�e�"���q�~k����`�S)�\_xrE,˯��v=�e	�b��b�]���#�#}���S^��D�c:�����B��sS�-��d�[e���+�p�zrqí�J���w�T�H��C��p«)�!�j�����Oh�[�w���U���a`���ۓA�^ׄ�Waς�>�3�]�� ���xVN���� ��<6פ��΀2���$�n��1h�\ ɨ;e�d�V��:�����S
$uZ)�!�K��,�=�_n��A<`�saa��G�FÌ�<KVJ!I�,��%�u '�(T�j�J �ı�,�|A�aRˁ���4���9\{���FX�!�ʍ���!;B��#�z�[א�&2v����	��x,����U'qAY    #bX^���]hHI�)﫭�ך�lKvX��i䫄o�Y˩yj黈
ۛ�]gK���y�?�-8L���M �ߒf�+�K��HS].�'�����^��p�O&��BH�dmͤ����|��a��<��>�M��P3"�Z�1j�2>�#!�`^yhU�q6^y�g�H�T{P;be���A���/���~FU��|�ߎ����2𺻕o�{P��	d��}�Y׳g�[	����� ]�^1��h�wH��ևLu,T�R�B:@_����R�"t\9Pf�02ձ�+������Tu�����N�6#��E:�&���j�E]�]��\�#�4v?���ؘ�����D�[�V�ڛ����E-A�H�"���_6�ñV{��ق�f'�W�g�l9sr�P/��,��j�F�"�*6���?���FR�B1^O�fE����F����_i�b	�6�,_�D�V;�D����J�"��!��s��$,!H ��4+bH%~��xB���@K �&R1��"$	47pEx�hG�'�E��2:��B�>��Dq"�_G����n(�8ph�Y�hq��)��� B..n�a��;fVƁ���)�� 2�*�a;NP+(�� ?UaS�A\O�6��D�A�D�ƛ,���!-�`�%�_m��D�.���F���K?8٩ %���}������9���v���Ϟk�BHU�l��@7��й :���U�M�%��[�u��
���ҤMX',u���Q�u���3�qG�3�=u!{5 s���e�]�RHG~N T��f�߀��/R��HR�l:�Q>�x���91U�n�L[+*(��5̝����W"d�a~\@��3��  I���>���Nr��g�]�G?R�������z���I�Y9@͹[�z���^x���j��@�<�J�������N��b.'PD0n����;�h`܈�"��
�ֆ�E����o���!�0���2��e-.�7�V�I���R�#(���2�\�RQ��|��_hHS[��8�]�~�!c(� ��DP�-��"�	i���G��۪GKŘ�,����?���Y����H-i yj����NzZ�B�S�w�!+��z=�c�֖\p���T��VjE<���O�Z͈��Gؔv^8G�ק�����ƶ� �����^�Ax��7^��(�BV�2]hK��!򼒓�k?f�v�i�/��$�GZYD��=h�OGo�;Vi`{Cع���Jg��� �zF�~,#o Y݊
���d��s�H�<��ԷUߐ<�v>/g���bG�_i$��j/6n?�(�_�G��Q=�YW{!�崛=z����;<z���:�v�W���ΠJPS���*�-�̈́����''-��5�ʘFA�u�� �'.�P;��N��!Qk�g w��"�YE�f�H'�P�K^D7�Ok،d���	m�$`���q���0�"�`�U<s�ڮz���������(�:�zI��"0��Q��b{�*M�t�|�HCn�<H���(�R	%䗜_��=�Q4"eH]�=^�k�=�HL�*=�+�4F$���=��Z@~�P����Jv(o��y�>�TG� ����ۧ�g[���5��Z�ϰY����t��b̊M�;c;?������:)I��,�lP/�-QU�q��G\�=rsU��j��(M�~x�9>��˙m�u�Y�b���Йw��S�����Z6���7Ƃt~�&)KM/�+	�8ա.˼DE �=Zo6�K�Gd�/c��'(&�X��=�!��ҏH�^N��*+��F�FZ?"���W�(E�㸨�m4����`�����F����Z�aQ��Go~��@DZ���f��Fs���Y�rH�b���襡j�7�*V��98�΁�D-v�mU�& A�n���M��"�S�b��ڃ���i�i4H�j��N�x6� $n6��G����fVO���vB�p����ӥM�z��������)�߂�R®.6������C[_���@J��v38�b'�w�?�Ѭ ��Y�"VM�N��0i6Tn,��zr�q�ֲ�È�����!�6�!�v�iA� �U7,�( 
���u�S����HjA����ٳ����f���0' �W�D��
hΏ��sb�c���1/`�M]�'�yKnZ�ҩĂ`qխ�
�>�iQ�E�����[�sH��K���5��;0*�����#���r����P�ǒe�HK�X�S��NAd��..�����!W,t1����N���z��s�х��~��c�%߫�l����N�L�X�����"G,Yhy*����t3|5���kun��2úG�(����2��l[P�a���{�a-�HJX�|{��?�?���j
",0/}�|�Ya��yeɳN䇵fkTg}��pCo����{���<,��T�Z�c������~�c��td���9�{�B�28=;�N�!�^�N�ܱ~Bc��"K�1�M�<�, �\�6�̂��Ǔ�p����R=�W��.�<T�|³�M�Q(� ��	����~ʱ��E��H��g���Ӎ���b8��x��Ip��xJ�D�u����W
������X�۵�LvPd��q��#CIc`0��a�Π.�����i���2��PɁn�bv!��q�tܾ@�(y��Y�v=�?�/�gxƥZ�vj��[U�2x�( ��)ST�GR���d�i�L����Dr*�pQ�bv����%A̹�E�`�	߳���T`�:��D#7�O?�	����]�]&���J�y�zƲ�f���:�����ϑ9Vxv<��,oJO�X>��i��5�'�x>��~۝�5W@�Cg`Y���hg�HfX��x`���I��������#���z3���f`)@ ��$����봐��`�,$^���]��Q�Q��-�_����eU����ݨ�z�Lk'4�W�������cݯ�au ���$�D��n$���yXHT�,����~f�����?n�ߊD�8�SP2�B_��)����V��٣?]-���t8�/F ����[�f����ܪ9����Kx��@�I_쇖Ii�����`p�,Л����}Tk%��M��|U ��w%�<d��=�H/m�Z��	���,�'I�#/�K��@EE��������iSIW�����s�=��%����
J������k�l� ~y{�w������cs�(��hD1��+�p2�"�K��>�rE�v��d���Ъ�JS2�IY��:݁�/�D�C=Cy�-��˧}zN�eo��+Z�_���z�T���/�������EI�N9\Ѽ��U�����kq��O����i�x���^�Y�>�g�bSWt}��������_�X���;����vTA���ܞ��٧��!���;�����O��`_�q�9���S�V�����vRA�kD�(	P���U�����%Hۉ�ƯP�h���������p6�h)o�04O�F��/E.��#�^�SAu[�?;��sM ��	��a��GT�M��/�����[}�ec.>ܩss?X������h�F���XϠ�!�nE����b��B|��\X���ϋ8��W��ۇ�6.4[
ފ��W����S�bڻ�D�h����凖ڶ������P�V4�~;�D�hs�.�����v��rS֎�ڼ	����ڊ.T��魖¶��֜��j���3�
Xj����$�z7�ى!��j�2����d'2-l�Ե7u��*�������O*�$q]�'����갩���eP�V�G������Im�Y���ov��q��;z����0��;<�#�]Gr��_<Y��3A(p�N�3���^�@q[u�M�},��(n+�r�����mE��w��T�}gUd��u�ܪS�<<��U�Z�y���K�@�[�������Dbh뚁�������h�T�mX�9qy�s��r����%P�V�;}�j�w'C!A{[�*������|�X Y��<�l��Sk�*��O�8>}��0[��=D�z���m�TV�)�j I  &I�:P�f,���_O����*y��i�j��:��,&��0P�V����v9
T��@�-��EoE[���Y�N����K�2��!at��o�?��-����mV�F:�pEg��^O�Oa7��ܭXx7�I�9ؓA�\�RtYhq~N���A�v����X�6��)���p���π6�'�a�}��쀺14�ؔ��V�m�;�<�l���==u�+��M܌�棳\�����*�:�Ӽ�C�zM�RK�~�S�k�-ӺT���u��~]
�@9_�������I�������{�޲��V�<}'�p�;�mIPwe����Ra[rcQY���D8(���\$	�x����A�"V0���{Dh�m��n��Α�d�����=���p����o|Q8=�L#���o��jp*\Wel%s��,�E� �����r8C�黉�ysFz!L�;.'��S|��_9���b���S��S��GQ�x�?��x��67��U�DFb����ۻN�����g�s�)Hg[>������%NBh5�ȭ��*��{$��)��=���&������w��_�}����'^     