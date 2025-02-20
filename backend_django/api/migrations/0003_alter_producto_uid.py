# Generated by Django 5.1.6 on 2025-02-20 11:32

import uuid
from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('api', '0002_alter_perfil_uid'),
    ]

    operations = [
        migrations.AlterField(
            model_name='producto',
            name='uid',
            field=models.UUIDField(default=uuid.uuid4, editable=False, primary_key=True, serialize=False, unique=True),
        ),
    ]
