## Abstracción JAVA

En la programación orientada a objetos (POO) de Java, la abstracción de clases es un concepto fundamental que permite definir una plantilla o modelo para crear clases concretas. Esta plantilla establece las características comunes que comparten un conjunto de clases relacionadas, evitando la redundancia de código y promoviendo la reutilización.

##Características de las clases abstractas en Java:

- No se pueden instanciar: A diferencia de las clases concretas, las clases abstractas no se pueden utilizar directamente para crear objetos. Esto significa que no podemos utilizar la palabra clave new con una clase abstracta.
- Contienen métodos abstractos: Los métodos abstractos son métodos que solo se declaran en la clase abstracta pero no se implementan. Las clases concretas que hereden de la clase abstracta deben implementar estos métodos abstractos para proporcionarles una definición específica.
- Pueden contener métodos concretos: Las clases abstractas también pueden contener métodos concretos, que son métodos que se implementan en la propia clase abstracta y no en las clases concretas que hereden de ella.
- Sirven como superclase: Las clases abstractas pueden ser utilizadas como superclase para otras clases. Esto significa que las clases concretas pueden heredar de la clase abstracta y reutilizar sus métodos y atributos.
## Beneficios de usar clases abstractas en Java:

- Promueve la reutilización de código: Al definir una clase abstracta, se evita la necesidad de escribir el mismo código repetidamente en diferentes clases. Esto hace que el código sea más modular y fácil de mantener.
- Mejora la organización del código: Las clases abstractas ayudan a organizar el código de manera jerárquica, agrupando las clases relacionadas en una sola superclase.
- Facilita la extensibilidad del código: Las clases abstractas permiten que el código se extienda fácilmente creando nuevas clases concretas que hereden de la clase abstracta.
- Promueve el polimorfismo: Las clases abstractas son esenciales para el polimorfismo, que es la capacidad de que diferentes objetos respondan al mismo mensaje de manera diferente.