## Estrés en primavera :scream:

![Alguien estresado](http://blogs.jpmsonline.com/wp-content/uploads/2017/11/stress.jpg)

****

**¿Alguna vez te haz sentido estresado pero no estabas seguro y te importa tan poco tu salud y las emociones de tus seres queridos que decidiste darle poca importancia y buscar algun _smarthack_ en línea para determinar tu estado de salud? Si respondiste que sí, esto es para ti...**

****

Este repositorio contiene mi primer práctica con Spring y el patrón de diseño MVC. Consiste en un formulario con una serie de preguntas cerradas con las cuales se pretende determinar si una persona esta estresada o no. 

##### El proyecto contiene 3 **vistas**:
 * formulario
 * estresado
 * relax.
 
(Creo que el nombre de cada vista es bastante descriptivo)

En la vista de formulario es un formulario generado "dínamicamente" con un arreglo de ```String```, cada pregunta tiene asociada un ```select``` con 3 posibles opciones. Cuando se selecciona "Sí" se incrementa un contador que almacena el total de preguntas respondidas con indicios de estrés por parte del usuario. Finalmente, en el evento ```submit``` del formulario donde se guardan todas las preguntas se envia el párametro ```preguntas``` en la petición al controlador que determinará que vista debe mostrarse.

****

_Por ahora el proyecto no tiene persistencia de datos, pero estoy seguro que con un par de Rigo Clases podré hacerlo ¡ Ayudame_ @RigoBono _!_

Eso es todo de mi parte por ahora. Gracias por tu visita mis repositorios de novato, vuelve pronto :wink:

P.D: No olvides seguirme en twitter: [@ilichh1](https://twitter.com/ilichh1)
