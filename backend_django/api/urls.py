from django.urls import path, include
from rest_framework.routers import DefaultRouter
from .views import PerfilViewSet, ProductoViewSet

# Creamos un enrutador y registramos nuestras vistas
router = DefaultRouter()
router.register(r'perfiles', PerfilViewSet, basename="perfil")
router.register(r'productos', ProductoViewSet, basename="producto")

urlpatterns = [
    path('', include(router.urls)),
]
