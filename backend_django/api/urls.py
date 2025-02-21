from django.urls import path, include
from rest_framework.routers import DefaultRouter
from .views import (
    PerfilViewSet,
    ProductoViewSet,
    stripe_servicio1,
    stripe_servicio2,
    deepseek_servicio1,
    deepseek_servicio2
)

# Creamos un enrutador y registramos nuestras vistas
router = DefaultRouter()
router.register(r'perfiles', PerfilViewSet, basename="perfil")
router.register(r'productos', ProductoViewSet, basename="producto")

urlpatterns = [
    path('', include(router.urls)),
    path('stripe/servicio1/', stripe_servicio1, name='stripe_servicio1'),
    path('stripe/servicio2/', stripe_servicio2, name='stripe_servicio2'),
    path('deepseek/servicio1/', deepseek_servicio1, name='deepseek_servicio1'),
    path('deepseek/servicio2/', deepseek_servicio2, name='deepseek_servicio2'),
]
