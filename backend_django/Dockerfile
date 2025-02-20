# Usamos la imagen oficial de Python
FROM python:3.12

# Establecer el directorio de trabajo en el contenedor
WORKDIR /app

# Copiar los archivos de la aplicación al contenedor
COPY . /app/

# Instalar dependencias
RUN pip install --no-cache-dir -r requirements.txt

# Exponer el puerto 8000
EXPOSE 8000

# Comando para ejecutar el servidor de Django
CMD ["python", "manage.py", "runserver", "0.0.0.0:8000"]
