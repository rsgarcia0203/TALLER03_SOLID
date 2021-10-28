# TALLER03_SOLID

1.-	Clases Helado y Pastel. Tienen mucha similitud, se debería crear una clase padre llamada Postre.
    Si, ya que todos los atributos de ambas clases son los mismos y algunos métodos también, así optimizamos nuestro código.


2.- La clase OperacionesAderezo no es necesaria, ya que todos los métodos que están en la clase deberían de pertenecer a la clase Postre, ya que se le estarían agregando objetos a una colección de sus atributos y esta es la clase padre de los demás postres.


3.- Debido a que las clases helado y pastel tienen unos metodos muy similares estos pueden ser mejor implementados en otra clase que maneje cualquier precio ya sea que se añada otro postre esta clase manejadora podra manejar el precio de esta sin la necesidad de crear otro metodo que haga lo mismo dentro de cada nuevo postre que se agregue 


