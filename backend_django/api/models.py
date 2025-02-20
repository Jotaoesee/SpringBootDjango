from django.db import models
import uuid

class Perfil(models.Model):
    uid = models.UUIDField(default=uuid.uuid4, unique=True, primary_key=True, editable=False)
    nombre = models.CharField(max_length=100)
    edad = models.IntegerField()
    tarjeta_credito = models.CharField(max_length=19)
    caducidad = models.CharField(max_length=7)
    cvv = models.CharField(max_length=3)

    def __str__(self):
        return self.nombre

class Producto(models.Model):
    uid = models.UUIDField(default=uuid.uuid4, unique=True, primary_key=True, editable=False)
    nombre = models.CharField(max_length=100)
    precio = models.DecimalField(max_digits=10, decimal_places=2)

    def __str__(self):
        return self.nombre
