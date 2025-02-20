from django.contrib import admin
from django.urls import path, include
from rest_framework.response import Response
from rest_framework.decorators import api_view

@api_view(['GET'])
def api_root(request, format=None):
    return Response({"message": "Bienvenido a la API", "endpoints": ["/api/"]})

urlpatterns = [
    path('admin/', admin.site.urls),
    path('api/', include('api.urls')),
    path('', api_root),  # Ruta para la raíz con respuesta JSON
]
