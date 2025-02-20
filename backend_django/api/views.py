from rest_framework import viewsets
from rest_framework.response import Response
from rest_framework.decorators import action
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
