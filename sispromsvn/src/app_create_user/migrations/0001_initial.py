# -*- coding: utf-8 -*-
from south.utils import datetime_utils as datetime
from south.db import db
from south.v2 import SchemaMigration
from django.db import models


class Migration(SchemaMigration):

    def forwards(self, orm):
        # Adding model 'Persona'
        db.create_table(u'app_create_user_persona', (
            (u'id', self.gf('django.db.models.fields.AutoField')(primary_key=True)),
            ('nombre', self.gf('django.db.models.fields.CharField')(max_length=30)),
            ('apellido', self.gf('django.db.models.fields.CharField')(max_length=30)),
            ('dni', self.gf('django.db.models.fields.CharField')(max_length=10)),
            ('direccion', self.gf('django.db.models.fields.CharField')(max_length=50)),
            ('telefono', self.gf('django.db.models.fields.CharField')(max_length=20)),
            ('provincia', self.gf('django.db.models.fields.CharField')(max_length=30)),
            ('localidad', self.gf('django.db.models.fields.CharField')(max_length=30)),
        ))
        db.send_create_signal(u'app_create_user', ['Persona'])

        # Adding model 'Medico'
        db.create_table(u'app_create_user_medico', (
            (u'persona_ptr', self.gf('django.db.models.fields.related.OneToOneField')(to=orm['app_create_user.Persona'], unique=True, primary_key=True)),
            ('matricula', self.gf('django.db.models.fields.CharField')(max_length=10)),
            ('especialidad', self.gf('django.db.models.fields.CharField')(max_length=20)),
            ('horarioAtencionMin', self.gf('django.db.models.fields.TimeField')()),
            ('horarioAtencionMax', self.gf('django.db.models.fields.TimeField')()),
        ))
        db.send_create_signal(u'app_create_user', ['Medico'])

        # Adding model 'Paciente'
        db.create_table(u'app_create_user_paciente', (
            (u'persona_ptr', self.gf('django.db.models.fields.related.OneToOneField')(to=orm['app_create_user.Persona'], unique=True, primary_key=True)),
            ('edad', self.gf('django.db.models.fields.CharField')(max_length=3)),
            ('obraSocial', self.gf('django.db.models.fields.CharField')(max_length=20)),
        ))
        db.send_create_signal(u'app_create_user', ['Paciente'])

        # Adding model 'Secretaria'
        db.create_table(u'app_create_user_secretaria', (
            (u'persona_ptr', self.gf('django.db.models.fields.related.OneToOneField')(to=orm['app_create_user.Persona'], unique=True, primary_key=True)),
            ('horarioAtencionMin', self.gf('django.db.models.fields.TimeField')()),
            ('horarioAtencionMax', self.gf('django.db.models.fields.TimeField')()),
        ))
        db.send_create_signal(u'app_create_user', ['Secretaria'])


    def backwards(self, orm):
        # Deleting model 'Persona'
        db.delete_table(u'app_create_user_persona')

        # Deleting model 'Medico'
        db.delete_table(u'app_create_user_medico')

        # Deleting model 'Paciente'
        db.delete_table(u'app_create_user_paciente')

        # Deleting model 'Secretaria'
        db.delete_table(u'app_create_user_secretaria')


    models = {
        u'app_create_user.medico': {
            'Meta': {'object_name': 'Medico', '_ormbases': [u'app_create_user.Persona']},
            'especialidad': ('django.db.models.fields.CharField', [], {'max_length': '20'}),
            'horarioAtencionMax': ('django.db.models.fields.TimeField', [], {}),
            'horarioAtencionMin': ('django.db.models.fields.TimeField', [], {}),
            'matricula': ('django.db.models.fields.CharField', [], {'max_length': '10'}),
            u'persona_ptr': ('django.db.models.fields.related.OneToOneField', [], {'to': u"orm['app_create_user.Persona']", 'unique': 'True', 'primary_key': 'True'})
        },
        u'app_create_user.paciente': {
            'Meta': {'object_name': 'Paciente', '_ormbases': [u'app_create_user.Persona']},
            'edad': ('django.db.models.fields.CharField', [], {'max_length': '3'}),
            'obraSocial': ('django.db.models.fields.CharField', [], {'max_length': '20'}),
            u'persona_ptr': ('django.db.models.fields.related.OneToOneField', [], {'to': u"orm['app_create_user.Persona']", 'unique': 'True', 'primary_key': 'True'})
        },
        u'app_create_user.persona': {
            'Meta': {'object_name': 'Persona'},
            'apellido': ('django.db.models.fields.CharField', [], {'max_length': '30'}),
            'direccion': ('django.db.models.fields.CharField', [], {'max_length': '50'}),
            'dni': ('django.db.models.fields.CharField', [], {'max_length': '10'}),
            u'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'localidad': ('django.db.models.fields.CharField', [], {'max_length': '30'}),
            'nombre': ('django.db.models.fields.CharField', [], {'max_length': '30'}),
            'provincia': ('django.db.models.fields.CharField', [], {'max_length': '30'}),
            'telefono': ('django.db.models.fields.CharField', [], {'max_length': '20'})
        },
        u'app_create_user.secretaria': {
            'Meta': {'object_name': 'Secretaria', '_ormbases': [u'app_create_user.Persona']},
            'horarioAtencionMax': ('django.db.models.fields.TimeField', [], {}),
            'horarioAtencionMin': ('django.db.models.fields.TimeField', [], {}),
            u'persona_ptr': ('django.db.models.fields.related.OneToOneField', [], {'to': u"orm['app_create_user.Persona']", 'unique': 'True', 'primary_key': 'True'})
        }
    }

    complete_apps = ['app_create_user']