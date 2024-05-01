## Interfaces JAVA

En el mundo de la programación orientada a objetos en Java, una interfaz se define como una colección de métodos abstractos y constantes públicas.

## Características de las clases abstractas en Java:

- Métodos abstractos: Las interfaces solo declaran la firma de los métodos (nombre, tipo de retorno y parámetros), pero no su implementación. La lógica y el comportamiento específico de cada método se definen en las clases que implementan la interfaz.
- Constantes públicas: Las interfaces pueden definir variables constantes con valores fijos que son accesibles para todas las clases que las implementan.
- Herencia múltiple: A diferencia de las clases en Java, que solo pueden heredar de una única clase padre, las interfaces permiten la herencia múltiple. Esto significa que una clase puede implementar varias interfaces a la vez, heredando los métodos y constantes de cada una de ellas.
- Enfoque en el "qué" y no en el "cómo": Las interfaces se centran en definir qué funcionalidades debe ofrecer una clase, sin especificar cómo se implementan esas funcionalidades. Esto promueve la flexibilidad y la reutilización del código, ya que las clases pueden implementar las interfaces de diferentes maneras según sus necesidades específicas.

## Beneficios de usar interfaces en Java:

- Organización del código: Las interfaces ayudan a organizar el código de manera modular y clara, separando la definición de las interfaces de su implementación concreta en las clases.
- Polimorfismo: Las interfaces facilitan la implementación del polimorfismo, permitiendo que diferentes clases respondan al mismo mensaje de manera distinta. Esto se logra gracias a que las clases que implementan una misma interfaz pueden definir implementaciones diferentes para los métodos abstractos.
- Reutilización del código: Las interfaces promueven la reutilización del código, ya que las clases pueden implementar múltiples interfaces y compartir métodos y constantes comunes.
- Desacople: Las interfaces fomentan el desacople entre clases, permitiendo que las clases interactúen entre sí a través de interfaces en lugar de depender de implementaciones específicas. Esto mejora la modularidad y la mantenibilidad del código.