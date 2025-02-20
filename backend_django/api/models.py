from django.db import models

class Perfil(models.Model):
    nombre = models.CharField(max_length=255)
    edad = models.IntegerField()
    tarjeta_credito = models.CharField(max_length=19)  # Formato: XXXX XXXX XXXX XXXX
    caducidad = models.CharField(max_length=5)  # Formato: MM/YY
    cvv = models.CharField(max_length=3)

    def __str__(self):
        return self.nombre

class Producto(models.Model):
    nombre = models.CharField(max_length=255)
    precio = models.DecimalField(max_digits=10, decimal_places=2)

    def __str__(self):
        return self.nombre
