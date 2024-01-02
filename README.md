# Trilha Backend - Java


## Desafio 2:
Durante o desafio 2 deve ser entender o conceito de POO, entender cada um de seus pilares e também as possibilidades que eles nos proporcionam no desenvolvimento de API’s. Além do entendimento desses conceitos, o foco deve estar em saber criar as suas próprias classes de entidade.
__________________________________________

### O que é programação orientada a objetos (POO) e  seus pilares:

 Programação Orientada a Objetos (POO) é um paradigma de programação que organiza o código em objetos, unidades que contêm dados e funcionalidades. Seus pilares são:

- Abstração;
- Encapsulamento;
- Herança;
- Polimorfismo.

Esses pilares ajudam a criar código modular, reutilizável e mais compreensível.

__________________________________________

### Exemplo e explicação de um cenário de abstração:

Significa focar nos detalhes importantes e ignorar os desnecessários ao projetar objetos. É como simplificar as coisas, tornando o código mais compreensível e eficiente.

Vamos considerar um controle remoto de TV. Na abstração, você apenas pressiona os botões para mudar de canal ou ajustar o volume, sem precisar entender como exatamente os sinais são transmitidos ou como a TV decodifica esses sinais. A abstração permite que você use o controle remoto para realizar a tarefa desejada (controlar a TV) sem se preocupar com os detalhes complexos do funcionamento interno do aparelho. Isso simplifica a interação e torna o uso mais intuitivo.
__________________________________________

### Exemplo e explicação de um cenário de encapsulamento:

É como esconder detalhes complicados, mostrando apenas o que é necessário.

Vamos imaginar um cofre. O cofre é um exemplo de encapsulamento, pois protege seu conteúdo por meio de uma camada externa. Os detalhes internos, como a combinação ou chave necessária para abri-lo, são ocultos do usuário. Assim, você pode usar o cofre para armazenar objetos de valor sem precisar conhecer todos os detalhes de como ele funciona internamente. O cofre fornece uma interface simples (a fechadura) para interagir, enquanto mantém os detalhes complexos encapsulados, proporcionando segurança e facilitando o uso.

__________________________________________

### Exemplo e explicação de um cenário de herança:

É como criar coisas novas baseadas em coisas que já existem, pegando características e ações emprestadas.

Considere a classe base "Veículo" com propriedades gerais. Ao criar classes derivadas, como "Carro" e "Bicicleta", herdamos as características gerais do "Veículo" e adicionamos comportamentos específicos a cada tipo. Isso simplifica o código, pois evita repetição e facilita a extensão de funcionalidades. Em resumo, a herança permite criar uma hierarquia de classes, proporcionando eficiência e flexibilidade no desenvolvimento de software.

__________________________________________

### Exemplo e explicação de um cenário de polimorfismo:

Permite que objetos de diferentes classes sejam tratados de maneira uniforme, facilitando a flexibilidade do código.

Imagine uma situação em que temos uma classe base chamada "Forma" com um método chamado "calcular_area". Agora, derivamos classes específicas como "Círculo" e "Quadrado", cada uma implementando seu próprio método para calcular a área.

No polimorfismo, podemos ter uma lista de diferentes formas (instanciadas como Círculo, Quadrado, etc.) e, ao chamar o método "calcular_area" para cada uma delas, o comportamento específico de cálculo de área da forma correspondente será executado.

Assim, mesmo tratando todas as formas de maneira uniforme como "Formas", o polimorfismo permite que o método realize a operação adequada com base no tipo específico de forma, oferecendo flexibilidade e simplificação no código.

__________________________________________

### Cinco vantagens da POO:

Reusabilidade do Código: A Programação Orientada a Objetos (POO) permite a criação de classes e objetos, promovendo a reutilização do código. Classes existentes podem ser estendidas para criar novas classes, economizando tempo e esforço no desenvolvimento.

Encapsulamento: A capacidade de encapsular dados e métodos em um objeto ajuda a ocultar a complexidade interna e a proteger os dados, tornando o código mais seguro e fácil de entender. Alterações internas podem ser feitas sem afetar outros partes do código.

Flexibilidade e Extensibilidade: A herança e o polimorfismo, dois princípios fundamentais da POO, oferecem flexibilidade no design do software. Novas classes podem ser facilmente adicionadas, e o código pode ser estendido para acomodar novos requisitos sem alterar o código existente.

Manutenção Simplificada: A modularidade inerente à POO facilita a manutenção do software. Cada objeto é responsável por uma parte específica do sistema, tornando mais fácil isolar e corrigir problemas sem afetar o restante do código.

Organização e Estruturação: A POO fornece uma maneira natural de organizar e estruturar o código. O uso de classes e objetos reflete a estrutura do mundo real, tornando o software mais intuitivo para os desenvolvedores entenderem e colaborarem no desenvolvimento de sistemas complexos.

__________________________________________


Desenvolvido por [Thaís Alencar](https://www.linkedin.com/in/alencartha)
