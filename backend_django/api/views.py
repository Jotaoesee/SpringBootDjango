import requests
from rest_framework import viewsets
from rest_framework.response import Response
from rest_framework.decorators import action, api_view
from django.shortcuts import get_object_or_404
from .models import Perfil, Producto
from .serializers import PerfilSerializer, ProductoSerializer

# Vista para CRUD de Perfiles
class PerfilViewSet(viewsets.ModelViewSet):
    queryset = Perfil.objects.all()
    serializer_class = PerfilSerializer

    @action(detail=True, methods=['get'])
    def perfil(self, request, pk=None):
        perfil = get_object_or_404(Perfil, uid=pk)
        serializer = self.get_serializer(perfil)
        return Response(serializer.data)

    @action(detail=False, methods=['get'])
    def perfiles(self, request):
        edad_min = request.GET.get('edad_min', None)
        if edad_min:
            perfiles = Perfil.objects.filter(edad__gte=edad_min)
        else:
            perfiles = Perfil.objects.all()
        serializer = self.get_serializer(perfiles, many=True)
        return Response(serializer.data)

# Vista para CRUD de Productos
class ProductoViewSet(viewsets.ModelViewSet):
    queryset = Producto.objects.all()
    serializer_class = ProductoSerializer

# 📌 Integración con Stripe
@api_view(['GET'])
def stripe_servicio1(request):
    url = "https://api.stripe.com/v1/charges"
    headers = {"Authorization": "Bearer TU_CLAVE_DE_STRIPE"}
    
    response = requests.get(url, headers=headers)
    return Response(response.json())

@api_view(['GET'])
def stripe_servicio2(request):
    url = "https://api.stripe.com/v1/customers"
    headers = {"Authorization": "Bearer TU_CLAVE_DE_STRIPE"}
    
    response = requests.get(url, headers=headers)
    return Response(response.json())

# 📌 Integración con Deepseek
@api_view(['GET'])
def deepseek_servicio1(request):
    url = "https://api.deepseek.com/example-endpoint1"
    
    response = requests.get(url)
    return Response(response.json())

@api_view(['GET'])
def deepseek_servicio2(request):
    url = "https://api.deepseek.com/example-endpoint2"
    
    response = requests.get(url)
    return Response(response.json())
