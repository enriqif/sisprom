from django.db import models

from django.contrib.auth.models import User

class Persona(models.Model):
    nombre = models.CharField(max_length = 30)
    apellido = models.CharField(max_length = 30)
    dni = models.CharField(max_length = 10)
    direccion = models.CharField(max_length = 50)
    telefono = models.CharField(max_length = 20)
    provincia = models.CharField(max_length = 30)
    localidad = models.CharField(max_length = 30)

class Medico(Persona):
    #codigoMedico = models.CharField(max_length = 20, primary_key= True) 
    #se borra para que django genere un id para cada medico

    matricula = models.CharField(max_length = 10)
    especialidad = models.CharField(max_length = 20)
    horarioAtencionMin = models.TimeField()
    horarioAtencionMax = models.TimeField()
    
    def __unicode__(self, ):
        return self.nombre + " " +self.apellido

class Paciente(Persona):
    #codigoPaciente = models.IntegerField(max_length = 20, primary_key = True)
    edad = models.CharField(max_length = 3)
    obraSocial = models.CharField(max_length = 20)
    
    def __unicode__(self, ):
        return self.nombre + " " +self.apellido

class Secretaria(Persona):
    #codigoSecretaria = models.CharField(max_length = 20, primary_key = True)
    horarioAtencionMin = models.TimeField()
    horarioAtencionMax = models.TimeField()
    
    def __unicode__(self, ):
        return self.nombre + " " +self.apellido