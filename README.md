# Comprobación Binaria

Este codigo requiere de unas funciones externas que no se incluyen en el repositorio:

- [Ordenador de Arrays](https://github.com/dsaub/OrdenadorDeArrays)

# Como compilar este software con Intellij IDEA
Mueva el archivo Ordenador.jar (debe de compilarlo del repositorio de Ordenador de Arrays) a la carpeta libs (si no existe, creela), y genere el artifact del proyecto

# Como compilar con javac
Descomprima el JAR en el src y luego haga en la carpeta src:
```javac me/elordenador/checkear/Checkear.java```

Luego ejecute con
```java me.elordenador.checkear.Checkear```
desde la carpeta src.


# No encuentra unas clases al ejecutar el JAR/CLASS.
El JAR del Ordenador de Arrays debe de estar en la misma carpeta del jar de Comprobación Binaria ya que la libreria no este integrada.

Si no descargó el JAR/Compiló desde IDEA y usó la manera de javac, habrás borrado los .class de la libreria despues de compilar el programa, sigue siendo necesario.
