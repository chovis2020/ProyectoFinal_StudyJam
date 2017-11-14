Proyecto Final - Study Jam II 2017
===
<div align="center">
    <center>
        <img src="http://developerstudyjams.com/images/masthead.png" width="400px"/>
    </center>
</div>

Repositorio Proyecto Final del Study Jam Android Development for Beginners II 2017, llevado a cabo en la ciudad de La Paz, Bolivia a cargo del <a target="_blank" href="http://www.gdg.androidbolivia.com">GDG Android Bolivia</a> .

Nombre Aplicación.
---
El nombre de la aplicación es: Tours La Paz

Objetivo
---
Ofrecer una guia para turistas y para todos que quieran conocer mas de nuestra querida La paz ,conocer un poco de nuestra cultura los platos tipicos y tambien motivar a las visitas a museos.

Caracteristicas
---
* Lista de lugares turisticos con una breve descripcion.
* Lista de museos con una breve descripcion.
* Lista de platillos tipicos de La Paz con una breve descripcion.
* Un video musical que caracteriza a la ciudad de La Paz Grupo:Octavia.

Wireframes
---
Puedes visualizar los Wireframes de este proyecto.

https://ninjamock.com/Designer/Workplace/20945907/Page4

Compatibilidad
---
Esta aplicación es compatible con versiones de Android 5.1.1 (lollipop) o superior.

Uso
---------
Para probar este ejemplo clona este repositorio de la siguiente forma:
>
>     $ git clone https://github.com/chovis2020/ProyectoFinal_StudyJam

Luego de ello dentro de Android Studio:

* File --> New --> Import Project
* Seleccionas la ruta donde hiciste el `clone` del proyecto.
* Build --> Rebuild Project
* Run

Corrida previa
---
Aca te muestro cual es el funcionamiento de mi aplicación a grandes rasgos.
<div align="center">
    <center>
        <table border="0">
            <tr>
                <td> </td>
            </tr>
            <tr>
                <td><img src="/img/captura.gif" width="300"></td>
            </tr>
            <tr>
                <td> </td>
            </tr>
        </table>
    </center>
</div>
<br>

Descripción técnica
---
En este proyecto de utilizáron los siguientes componentes tanto en el `diseño` como en la `funcionalidad`:

**`Vista:`**
* LinearLayout para la alineación de las vistas principales.
* ListView, para el contener de los itemes.
* ImageView, para las imagenes de los lugares turisticos, museos y platos tipicos.
* TextView, para mostrar los titulos y las descripciones de los ludares turisticos y museos.
* VideoView para mostrar el video de sugerencia del Grupo Octavia.
.
.
.

**`Funcionalidad:`**
* MediaPlayer, para reproducir y el video.
* MediaController para los controles del video pause,reproducir.
* ArrayList para almacenar los objetos lugares turisticos, museos y platos tipicos.
* RecyclerView para mostrar la lista.
.
.
.

Autor(a)
---
Yolanda Cordero Huanca

Contactos
---
chovis2020@gmail.com<br>
Telf. +591 78995933<br>
La Paz - Bolivia<br>