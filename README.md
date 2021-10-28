# TALLER03_SOLID

1.-	Clases Helado y Pastel. Tienen mucha similitud, se debería crear una clase padre llamada Postre.
    Si, ya que todos los atributos de ambas clases son los mismos y algunos métodos también, así optimizamos nuestro código.


2.- La clase OperacionesAderezo no es necesaria, ya que todos los métodos que están en la clase deberían de pertenecer a la clase Postre, ya que se le estarían agregando objetos a una colección de sus atributos y esta es la clase padre de los demás postres. Este punto violaba el Interface Segretation Principle (ISP) (Principio de segregación de interfaz), ya que los usuarios dependerian de una clase que no utilizarán.


3.- Debido a que las clases helado y pastel tienen unos metodos muy similares estos pueden ser mejor implementados en otra clase que maneje cualquier precio ya sea que se añada otro postre esta clase manejadora podra manejar el precio de esta sin la necesidad de crear otro metodo que haga lo mismo dentro de cada nuevo postre que se agregue, esto esta violando el Single Responsability Principle (SRP) (Principio de responsabilidad única) y la mejor manera de solucionarlo es crear una unica clase que cumpla .

4. En esta parte se puede incluir el Open/Closed Principle (OCP) (Principio abierto / cerrado) ya que se pudo extender a mas subclases como son los aderezos de crema y frutilla sin alterar la clase original de Aderezos tambien podriamos deducir que se esta utilizando el Liskov Substitution Principle (LSP) (Principio de substitución de Liskov) debido a que estamos convirtiendo a Aderezo en una superclase que tiene varias subclases y estas subclases heredan su comportamiento.


