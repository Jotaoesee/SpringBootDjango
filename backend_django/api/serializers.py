from rest_framework import serializers
from .models import Perfil, Producto

class PerfilSerializer(serializers.ModelSerializer):
    class Meta:
        model = Perfil
        fields = '__all__'  # Incluir todos los campos

class ProductoSerializer(serializers.ModelSerializer):
    class Meta:
        model = Producto
        fields = '__all__'  # Incluir todos los campos
