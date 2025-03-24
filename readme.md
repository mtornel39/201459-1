# Pasos para subir un archivo a un repositorio en GitHub

## 1. Clonar el repositorio (si aún no lo tienes en tu computadora)
Abre una terminal y ejecuta el siguiente comando:
```sh
git clone https://github.com/usuario/repositorio.git
```
Reemplaza `usuario` y `repositorio` con los valores correspondientes.

## 2. Mover el archivo al repositorio
Copia el archivo que deseas subir dentro de la carpeta del repositorio clonado.

## 3. Navegar al repositorio en la terminal
```sh
cd repositorio
```

## 4. Añadir el archivo al control de versiones
Si deseas agregar un solo archivo, usa:
```sh
git add nombre_del_archivo
```
Si deseas agregar todos los archivos nuevos/modificados, usa:
```sh
git add .
```

## 5. Realizar un commit con un mensaje descriptivo
```sh
git commit -m "Agregado archivo nombre_del_archivo"
```

## 6. Subir los cambios al repositorio remoto
```sh
git push origin rama
```
Si estás trabajando en la rama `main` o `master`, reemplaza `rama` con `main` o el nombre de la rama en la que estás contribuyendo.

