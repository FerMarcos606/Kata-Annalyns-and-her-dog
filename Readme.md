La Infiltración de Annalyn

Descripción del proyecto

Este proyecto es una kata de programación diseñada para ejercitar la lógica. A través de la historia de Annalyn, el objetivo es resolver una serie de desafíos de complejidad creciente para ayudarla a liberar a su mejor amigo, que ha sido secuestrado.

Tecnología utilizada
Lenguaje: Java

Gestor de dependencias: Maven (mvn)

Pruebas: Se han implementado tests para validar la lógica de cada método.

La misión de Annalyn: Cuatro desafíos lógicos
El desafío consiste en implementar cuatro métodos que resuelven las siguientes situaciones, basándose en el estado del caballero, el arquero, el prisionero y la presencia del perro de Annalyn.

Ataque Rápido: Implementa la lógica para determinar si Annalyn puede realizar un ataque rápido. Solo es posible si el caballero está dormido.

Espiar: Implementa la lógica para decidir si Annalyn puede espiar el campamento. Esto es posible si al menos uno de los tres personajes está despierto.

Hacer Señales al Prisionero: Implementa la lógica para ver si Annalyn puede comunicarse con el prisionero. Esto solo funciona si el arquero está dormido Y el prisionero está despierto.

Liberar al Prisionero: Este es el desafío más complejo. La lógica para liberar al prisionero varía en función de si Annalyn está acompañada por su perro o no:

Con el perro: La misión tiene éxito si el arquero está dormido.

Sin el perro: La misión tiene éxito si el caballero y el arquero están dormidos, Y el prisionero está despierto.
