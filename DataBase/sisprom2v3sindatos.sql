--------------------------------------------------------
-- Archivo creado  - viernes-enero-23-2015   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence ADMINISTRADOR_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "ADMINISTRADOR_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence ANTECEDENTE_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "ANTECEDENTE_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence CONSULTA_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "CONSULTA_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence DIAGNOSTICO_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "DIAGNOSTICO_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence HISTORIA_CLINICA_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "HISTORIA_CLINICA_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence MEDICAMENTO_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "MEDICAMENTO_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence MEDICO_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "MEDICO_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence PACIENTE_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "PACIENTE_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence SECRETARIA_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SECRETARIA_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence TIPO_ANTECEDENTE_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "TIPO_ANTECEDENTE_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence TRATAMIENTO_MEDICAMENTO_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "TRATAMIENTO_MEDICAMENTO_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence TRATAMIENTO_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "TRATAMIENTO_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence TURNO_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "TURNO_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Table ANTECEDENTE_GENERAL
--------------------------------------------------------

  CREATE TABLE "ANTECEDENTE_GENERAL" 
   (	"ANTECEDENTE_GRAL_ID" NUMBER(8,0), 
	"HISTORIA_CLINICA_ID" NUMBER(8,0), 
	"ANTECEDENTE_PESOALNACER" VARCHAR2(20), 
	"USUARIO_CREACION" VARCHAR2(20), 
	"FECHA_CREACION" DATE, 
	"USUARIO_MODIFICACION" VARCHAR2(20), 
	"FECHA_MODIFICACION" DATE, 
	"ANTECEDENTE_TALLA" VARCHAR2(20), 
	"ANTECEDENTE_CCEFALIC" VARCHAR2(20), 
	"ANTECEDENTE_PARTO_NORMAL" VARCHAR2(20), 
	"ANTECEDENTE_PARTO_DISTOCICO" VARCHAR2(20), 
	"ANTECEDENTE_PARTO_CESARIA" VARCHAR2(20), 
	"ANTECEDENTE_COMPLICACIONES" VARCHAR2(20), 
	"ANTECEDENTE_SCOREDEAPGAR" VARCHAR2(20), 
	"ANTECEDENTE_SOCIO_ECONOMICO" VARCHAR2(20), 
	"ANTECEDENTE_DIABETES" VARCHAR2(20), 
	"ANTECEDENTE_ASMA" VARCHAR2(20), 
	"ANTECEDENTE_TBC" VARCHAR2(20), 
	"ANTECEDENTE_HIPERTENSION" VARCHAR2(20), 
	"ANTECEDENTE_PADRE" VARCHAR2(20), 
	"ANTECEDENTE_MADRE" VARCHAR2(20), 
	"ANTECEDENTE_HIJOS" VARCHAR2(20), 
	"ANTECEDENTE_HERMANOS" VARCHAR2(20), 
	"ANTECEDENTE_TABACO" VARCHAR2(20), 
	"ANTECEDENTE_ALCOHOL" VARCHAR2(20), 
	"ANTECEDENTE_ADICCION" VARCHAR2(20), 
	"ANTECEDENTE_OPERACIONANTERIOR" DATE, 
	"ANTECEDENTE_TIPOOPERACION" VARCHAR2(20), 
	"ANTECEDENTE_TRAUMATISMOS" DATE, 
	"ANTECEDENTE_LOCALIZACION" VARCHAR2(20), 
	"ANTECEDENTE_PESO" VARCHAR2(20), 
	"ANTECEDENTE_GENERAL_TALLA" VARCHAR2(20), 
	"ANTECEDENTE_TENSIONARTERIAL" VARCHAR2(20), 
	"ANTECEDENTE_PIELYFANERAS" VARCHAR2(20), 
	"ANTECEDENTE_VISION" VARCHAR2(20), 
	"ANTECEDENTE_AUDICION" VARCHAR2(20), 
	"ANTECEDENTE_ODONTOLOGIA" VARCHAR2(20), 
	"ANTECEDENTE_OBESIDAD" VARCHAR2(20), 
	"ANTECEDENTE_PESONORMAL" VARCHAR2(20), 
	"ANTECEDENTE_PESOBAJO" VARCHAR2(20), 
	"ANTECEDENTE_REACCION_ADVERSA" VARCHAR2(20)
   ) ;
--------------------------------------------------------
--  DDL for Table ANTECEDENTE_PER_PATOLOGICO
--------------------------------------------------------

  CREATE TABLE "ANTECEDENTE_PER_PATOLOGICO" 
   (	"ANTECEDENTE_PER_PAT_ID" NUMBER(8,0), 
	"ANTECEDENTE_PER_NOMBRE" VARCHAR2(20), 
	"ANTECEDENTE_PER_DESCRIPCION" VARCHAR2(200), 
	"USUARIO_CREACION" VARCHAR2(20), 
	"FECHA_CREACION" DATE, 
	"USUARIO_MODIFICACION" VARCHAR2(20), 
	"FECHA_MODIFICACION" DATE, 
	"HISTORIA_CLINICA_ID" NUMBER(8,0), 
	"DETALLE_PAT_ID" NUMBER(8,0)
   ) ;
--------------------------------------------------------
--  DDL for Table CONSULTA
--------------------------------------------------------

  CREATE TABLE "CONSULTA" 
   (	"CONSULTA_ID" NUMBER(8,0), 
	"HISTORIA_CLINICA_ID" NUMBER(8,0), 
	"CONSULTA_DESCRIPCION" VARCHAR2(200), 
	"USUARIO_CREACION" VARCHAR2(20), 
	"FECHA_CREACION" DATE, 
	"USUARIO_MODIFICACION" VARCHAR2(20), 
	"FECHA_MODIFICACION" DATE, 
	"CONSULTA_FECHA" DATE, 
	"CONSULTA_EXAMEN_FISICO" VARCHAR2(200), 
	"CONSULTA_EVOLUCION" VARCHAR2(200)
   ) ;
--------------------------------------------------------
--  DDL for Table DETALLE_PATOLOGIA
--------------------------------------------------------

  CREATE TABLE "DETALLE_PATOLOGIA" 
   (	"DETALLE_PAT_ID" NUMBER(8,0), 
	"PATOLOGIA_ID" NUMBER(8,0), 
	"DETALLE_PAT_NOMBRE" VARCHAR2(20), 
	"DETALLE_PAT_DESCRIPCION" VARCHAR2(200), 
	"FECHA_CREACION" DATE, 
	"FECHA_MODIFICACION" DATE, 
	"USUARIO_CREACION" VARCHAR2(100), 
	"USUARIO_MODIFICACION" VARCHAR2(100)
   ) ;
--------------------------------------------------------
--  DDL for Table DIAGNOSTICO
--------------------------------------------------------

  CREATE TABLE "DIAGNOSTICO" 
   (	"DIAGNOSTICO_ID" NUMBER(8,0), 
	"CONSULTA_ID" NUMBER(8,0), 
	"DIAGNOSTICO_DESCRIPCION" VARCHAR2(200), 
	"USUARIO_CREACION" VARCHAR2(100), 
	"FECHA_CREACION" DATE, 
	"USUARIO_MODIFICACION" VARCHAR2(100), 
	"FECHA_MODIFICACION" DATE
   ) ;
--------------------------------------------------------
--  DDL for Table HISTORIA_CLINICA
--------------------------------------------------------

  CREATE TABLE "HISTORIA_CLINICA" 
   (	"HISTORIA_CLINICA_ID" NUMBER(8,0), 
	"PACIENTE_ID" NUMBER(8,0), 
	"USUARIO_CREACION" VARCHAR2(100), 
	"FECHA_CREACION" DATE, 
	"USUARIO_MODIFICACION" VARCHAR2(100), 
	"FECHA_MODIFICACION" DATE, 
	"USUARIO_ID" NUMBER(8,0)
   ) ;
--------------------------------------------------------
--  DDL for Table MEDICAMENTO
--------------------------------------------------------

  CREATE TABLE "MEDICAMENTO" 
   (	"MEDICAMENTO_ID" NUMBER(8,0), 
	"MEDICAMENTO_NOMBRE" VARCHAR2(100), 
	"MEDICAMENTO_DESCRIPCION" VARCHAR2(200), 
	"USUARIO_CREACION" VARCHAR2(100), 
	"FECHA_CREACION" DATE, 
	"USUARIO_MODIFICACION" VARCHAR2(100), 
	"FECHA_MODIFICACION" DATE
   ) ;
--------------------------------------------------------
--  DDL for Table PACIENTE
--------------------------------------------------------

  CREATE TABLE "PACIENTE" 
   (	"PACIENTE_ID" NUMBER(8,0), 
	"PACIENTE_NOMBRE" VARCHAR2(100), 
	"PACIENTE_APELLIDO" VARCHAR2(100), 
	"PACIENTE_DNI" VARCHAR2(50), 
	"PACIENTE_TELEFONO" VARCHAR2(50), 
	"PACIENTE_DOMICILIO_CALLE" VARCHAR2(50), 
	"PACIENTE_OBRA_SOCIAL" VARCHAR2(100), 
	"PACIENTE_EDAD" VARCHAR2(3), 
	"USUARIO_CREACION" VARCHAR2(100), 
	"FECHA_CREACION" DATE, 
	"USUARIO_MODIFICACION" VARCHAR2(100), 
	"FECHA_MODIFICACION" DATE, 
	"PACIENTE_ESTADO_CIVIL" VARCHAR2(20), 
	"PACIENTE_FECHA_NACIMIENTO" DATE, 
	"PACIENTE_SEXO" VARCHAR2(20), 
	"PACIENTE_LUGAR_NACIMIENTO" VARCHAR2(50), 
	"PACIENTE_PROFESION" VARCHAR2(50), 
	"PACIENTE_NUMERO_AFILIADO" VARCHAR2(20), 
	"PACIENTE_DOMICILIO_NUMERO" VARCHAR2(50), 
	"PACIENTE_DOMICILIO_BARRIO" VARCHAR2(50)
   ) ;
--------------------------------------------------------
--  DDL for Table PATOLOGIA
--------------------------------------------------------

  CREATE TABLE "PATOLOGIA" 
   (	"PATOLOGIA_ID" NUMBER(8,0), 
	"PATOLOGIA_NOMBRE" VARCHAR2(50), 
	"PATOLOGIA_DESCRIPCION" VARCHAR2(200), 
	"FECHA_CREACION" DATE, 
	"FECHA_MODIFICACION" DATE, 
	"USUARIO_CREACION" VARCHAR2(100), 
	"USUARIO_MODIFICACION" VARCHAR2(100)
   ) ;
--------------------------------------------------------
--  DDL for Table PERMISO
--------------------------------------------------------

  CREATE TABLE "PERMISO" 
   (	"PERMISO_ID" NUMBER(8,0), 
	"PERMISO_NOMBRE" VARCHAR2(20), 
	"PERMISO_PERMISO" VARCHAR2(50), 
	"PERMISO_DESCRIPCION" VARCHAR2(250), 
	"FECHA_CREACION" DATE, 
	"FECHA_MODIFICACION" DATE, 
	"USUARIO_CREACION" VARCHAR2(100), 
	"USUARIO_MODIFICACION" VARCHAR2(100)
   ) ;
--------------------------------------------------------
--  DDL for Table TRATAMIENTO
--------------------------------------------------------

  CREATE TABLE "TRATAMIENTO" 
   (	"TRATAMIENTO_ID" NUMBER(8,0), 
	"DIAGNOSTICO_ID" NUMBER(8,0), 
	"TRATAMIENTO_DESCRIPCION" VARCHAR2(200), 
	"USUARIO_CREACION" VARCHAR2(100), 
	"FECHA_CREACION" DATE, 
	"USUARIO_MODIFICACION" VARCHAR2(100), 
	"FECHA_MODIFICACION" DATE
   ) ;
--------------------------------------------------------
--  DDL for Table TRATAMIENTO_MEDICAMENTO
--------------------------------------------------------

  CREATE TABLE "TRATAMIENTO_MEDICAMENTO" 
   (	"TRATAMIENTO_MEDICAMENTO_ID" NUMBER(8,0), 
	"MEDICAMENTO_ID" NUMBER(8,0), 
	"TRATAMIENTO_ID" NUMBER(8,0), 
	"USUARIO_CREACION" VARCHAR2(100), 
	"FECHA_CREACION" DATE, 
	"USUARIO_MODIFICACION" VARCHAR2(100), 
	"FECHA_MODIFICACION" DATE
   ) ;
--------------------------------------------------------
--  DDL for Table TURNO
--------------------------------------------------------

  CREATE TABLE "TURNO" 
   (	"TURNO_ID" NUMBER(8,0), 
	"PACIENTE_ID" NUMBER(8,0), 
	"TURNO_FECHA" DATE, 
	"TURNO_HORA" DATE, 
	"USUARIO_CREACION" VARCHAR2(100), 
	"FECHA_CREACION" DATE, 
	"USUARIO_MODIFICACION" VARCHAR2(100), 
	"FECHA_MODIFICACION" DATE
   ) ;
--------------------------------------------------------
--  DDL for Table USUARIO
--------------------------------------------------------

  CREATE TABLE "USUARIO" 
   (	"USUARIO_ID" NUMBER(8,0), 
	"PERMISO_ID" NUMBER(8,0), 
	"USUARIO_NOMBRE" VARCHAR2(100), 
	"USUARIO_APELLIDO" VARCHAR2(100), 
	"USUARIO_DNI" VARCHAR2(50), 
	"USUARIO_TELEFONO" VARCHAR2(50), 
	"USUARIO_DOMICILIO_BARRIO" VARCHAR2(50), 
	"USUARIO_USUARIO" VARCHAR2(50), 
	"USUARIO_CONTRASENIA" VARCHAR2(20), 
	"USUARIO_ROL" VARCHAR2(20), 
	"USUARIO_OBRA_SOCIAL" VARCHAR2(20), 
	"USUARIO_EDAD" VARCHAR2(3), 
	"USUARIO_MATRICULA" VARCHAR2(10), 
	"USUARIO_ESPECIALIDAD" VARCHAR2(20), 
	"USUARIO_HORA_ATENCION_MIN" DATE, 
	"USUARIO_HORA_ATENCION_MAX" DATE, 
	"FECHA_CREACION" DATE, 
	"FECHA_MODIFICACION" DATE, 
	"USUARIO_CREACION" VARCHAR2(100), 
	"USUARIO_MODIFICACION" VARCHAR2(100), 
	"USUARIO_DOMICILIO_CALLE" VARCHAR2(50), 
	"USUARIO_DOMICILIO_NUMERO" VARCHAR2(50)
   ) ;
--------------------------------------------------------
--  Constraints for Table ANTECEDENTE_GENERAL
--------------------------------------------------------

  ALTER TABLE "ANTECEDENTE_GENERAL" ADD CONSTRAINT "ANTECEDENTE_GRAL_ID" PRIMARY KEY ("ANTECEDENTE_GRAL_ID") ENABLE;
 
  ALTER TABLE "ANTECEDENTE_GENERAL" MODIFY ("ANTECEDENTE_GRAL_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ANTECEDENTE_PER_PATOLOGICO
--------------------------------------------------------

  ALTER TABLE "ANTECEDENTE_PER_PATOLOGICO" ADD CONSTRAINT "ANTECEDENTE_PER_PAT_ID" PRIMARY KEY ("ANTECEDENTE_PER_PAT_ID") ENABLE;
 
  ALTER TABLE "ANTECEDENTE_PER_PATOLOGICO" MODIFY ("ANTECEDENTE_PER_PAT_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CONSULTA
--------------------------------------------------------

  ALTER TABLE "CONSULTA" ADD CONSTRAINT "CONSULTA_ID" PRIMARY KEY ("CONSULTA_ID") ENABLE;
 
  ALTER TABLE "CONSULTA" MODIFY ("CONSULTA_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table DETALLE_PATOLOGIA
--------------------------------------------------------

  ALTER TABLE "DETALLE_PATOLOGIA" ADD CONSTRAINT "DETALLE_PAT_ID" PRIMARY KEY ("DETALLE_PAT_ID") ENABLE;
 
  ALTER TABLE "DETALLE_PATOLOGIA" MODIFY ("DETALLE_PAT_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table DIAGNOSTICO
--------------------------------------------------------

  ALTER TABLE "DIAGNOSTICO" ADD CONSTRAINT "DIAGNOSTICO_ID" PRIMARY KEY ("DIAGNOSTICO_ID") ENABLE;
 
  ALTER TABLE "DIAGNOSTICO" MODIFY ("DIAGNOSTICO_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table HISTORIA_CLINICA
--------------------------------------------------------

  ALTER TABLE "HISTORIA_CLINICA" ADD CONSTRAINT "HISTORIA_CLINICA_ID" PRIMARY KEY ("HISTORIA_CLINICA_ID") ENABLE;
 
  ALTER TABLE "HISTORIA_CLINICA" MODIFY ("HISTORIA_CLINICA_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MEDICAMENTO
--------------------------------------------------------

  ALTER TABLE "MEDICAMENTO" ADD CONSTRAINT "MEDICAMENTO_ID" PRIMARY KEY ("MEDICAMENTO_ID") ENABLE;
 
  ALTER TABLE "MEDICAMENTO" MODIFY ("MEDICAMENTO_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PACIENTE
--------------------------------------------------------

  ALTER TABLE "PACIENTE" ADD CONSTRAINT "PACIENTE_ID" PRIMARY KEY ("PACIENTE_ID") ENABLE;
 
  ALTER TABLE "PACIENTE" MODIFY ("PACIENTE_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PATOLOGIA
--------------------------------------------------------

  ALTER TABLE "PATOLOGIA" ADD CONSTRAINT "PATOLOGIA_ID" PRIMARY KEY ("PATOLOGIA_ID") ENABLE;
 
  ALTER TABLE "PATOLOGIA" MODIFY ("PATOLOGIA_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PERMISO
--------------------------------------------------------

  ALTER TABLE "PERMISO" ADD CONSTRAINT "PERMISO_ID" PRIMARY KEY ("PERMISO_ID") ENABLE;
 
  ALTER TABLE "PERMISO" MODIFY ("PERMISO_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TRATAMIENTO
--------------------------------------------------------

  ALTER TABLE "TRATAMIENTO" MODIFY ("TRATAMIENTO_ID" NOT NULL ENABLE);
 
  ALTER TABLE "TRATAMIENTO" ADD CONSTRAINT "TRATAMIENTO_ID" PRIMARY KEY ("TRATAMIENTO_ID") ENABLE;
--------------------------------------------------------
--  Constraints for Table TRATAMIENTO_MEDICAMENTO
--------------------------------------------------------

  ALTER TABLE "TRATAMIENTO_MEDICAMENTO" MODIFY ("TRATAMIENTO_MEDICAMENTO_ID" NOT NULL ENABLE);
 
  ALTER TABLE "TRATAMIENTO_MEDICAMENTO" ADD CONSTRAINT "TRATAMIENTO_MEDICAMENTO_PK" PRIMARY KEY ("TRATAMIENTO_MEDICAMENTO_ID") ENABLE;
--------------------------------------------------------
--  Constraints for Table TURNO
--------------------------------------------------------

  ALTER TABLE "TURNO" MODIFY ("TURNO_ID" NOT NULL ENABLE);
 
  ALTER TABLE "TURNO" ADD CONSTRAINT "TURNO_ID" PRIMARY KEY ("TURNO_ID") ENABLE;
--------------------------------------------------------
--  Constraints for Table USUARIO
--------------------------------------------------------

  ALTER TABLE "USUARIO" MODIFY ("USUARIO_ID" NOT NULL ENABLE);
 
  ALTER TABLE "USUARIO" MODIFY ("PERMISO_ID" NOT NULL ENABLE);
 
  ALTER TABLE "USUARIO" ADD CONSTRAINT "USUARIO_ID" PRIMARY KEY ("USUARIO_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ANTECEDENTE_GENERAL
--------------------------------------------------------

  ALTER TABLE "ANTECEDENTE_GENERAL" ADD CONSTRAINT "ANTECEDENTE_GENERAL_HISTO_FK1" FOREIGN KEY ("HISTORIA_CLINICA_ID")
	  REFERENCES "HISTORIA_CLINICA" ("HISTORIA_CLINICA_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ANTECEDENTE_PER_PATOLOGICO
--------------------------------------------------------

  ALTER TABLE "ANTECEDENTE_PER_PATOLOGICO" ADD CONSTRAINT "ANTECEDENTE_PER_PATOLOGIC_FK1" FOREIGN KEY ("HISTORIA_CLINICA_ID")
	  REFERENCES "HISTORIA_CLINICA" ("HISTORIA_CLINICA_ID") ENABLE;
 
  ALTER TABLE "ANTECEDENTE_PER_PATOLOGICO" ADD CONSTRAINT "ANTECEDENTE_PER_PATOLOGIC_FK2" FOREIGN KEY ("DETALLE_PAT_ID")
	  REFERENCES "DETALLE_PATOLOGIA" ("DETALLE_PAT_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CONSULTA
--------------------------------------------------------

  ALTER TABLE "CONSULTA" ADD CONSTRAINT "CONSULTA_HISTORIA_CLINICA_FK1" FOREIGN KEY ("HISTORIA_CLINICA_ID")
	  REFERENCES "HISTORIA_CLINICA" ("HISTORIA_CLINICA_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table DETALLE_PATOLOGIA
--------------------------------------------------------

  ALTER TABLE "DETALLE_PATOLOGIA" ADD CONSTRAINT "DETALLE_PATOLOGIA_PATOLOG_FK1" FOREIGN KEY ("PATOLOGIA_ID")
	  REFERENCES "PATOLOGIA" ("PATOLOGIA_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table DIAGNOSTICO
--------------------------------------------------------

  ALTER TABLE "DIAGNOSTICO" ADD CONSTRAINT "DIAGNOSTICO_CONSULTA_FK1" FOREIGN KEY ("CONSULTA_ID")
	  REFERENCES "CONSULTA" ("CONSULTA_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table HISTORIA_CLINICA
--------------------------------------------------------

  ALTER TABLE "HISTORIA_CLINICA" ADD CONSTRAINT "HISTORIA_CLINICA_PACIENTE_FK1" FOREIGN KEY ("PACIENTE_ID")
	  REFERENCES "PACIENTE" ("PACIENTE_ID") ENABLE;
 
  ALTER TABLE "HISTORIA_CLINICA" ADD CONSTRAINT "HISTORIA_CLINICA_USUARIO_FK1" FOREIGN KEY ("USUARIO_ID")
	  REFERENCES "USUARIO" ("USUARIO_ID") ENABLE;




--------------------------------------------------------
--  Ref Constraints for Table TRATAMIENTO
--------------------------------------------------------

  ALTER TABLE "TRATAMIENTO" ADD CONSTRAINT "TRATAMIENTO_DIAGNOSTICO_FK1" FOREIGN KEY ("DIAGNOSTICO_ID")
	  REFERENCES "DIAGNOSTICO" ("DIAGNOSTICO_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TRATAMIENTO_MEDICAMENTO
--------------------------------------------------------

  ALTER TABLE "TRATAMIENTO_MEDICAMENTO" ADD CONSTRAINT "TRATAMIENTO_MEDICAMENTO_M_FK1" FOREIGN KEY ("MEDICAMENTO_ID")
	  REFERENCES "MEDICAMENTO" ("MEDICAMENTO_ID") ENABLE;
 
  ALTER TABLE "TRATAMIENTO_MEDICAMENTO" ADD CONSTRAINT "TRATAMIENTO_MEDICAMENTO_T_FK1" FOREIGN KEY ("TRATAMIENTO_ID")
	  REFERENCES "TRATAMIENTO" ("TRATAMIENTO_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TURNO
--------------------------------------------------------

  ALTER TABLE "TURNO" ADD CONSTRAINT "TURNO_PACIENTE_FK1" FOREIGN KEY ("PACIENTE_ID")
	  REFERENCES "PACIENTE" ("PACIENTE_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table USUARIO
--------------------------------------------------------

  ALTER TABLE "USUARIO" ADD CONSTRAINT "USUARIO_PERMISO_FK1" FOREIGN KEY ("PERMISO_ID")
	  REFERENCES "PERMISO" ("PERMISO_ID") ENABLE;
