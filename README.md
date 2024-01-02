
# Trilha Backend - Java


## Desafio 1:
Realizar o entendimento do que é um 
sistema de controle de versão, quais são suas vantagens na prática e aprender os 
comandos básicos para entregar os próximos desafios.
__________________________________________

### Definição de Sistema de Controle de Versões (VCS):

Um Sistema de Controle de Versões (VCS) é como um histórico que salva as mudanças que fazemos em arquivos ao trabalhar em um projeto. Ele ajuda várias pessoas a trabalharem juntas, registrando quem fez, o quê, e quando. Com isso, podemos voltar para versões antigas, corrigir erros e juntar contribuições de diferentes pessoas. Isso torna o trabalho mais eficiente, ajuda a encontrar e corrigir problemas, e mostra como o projeto foi evoluindo ao longo do tempo.

__________________________________________

### Cinco vantagens em utilizar um VCS:

- Rastreamento de Mudanças: Possibilitar o acompanhamento e o registro de todas as modificações realizadas em um projeto, permitindo a revisão e restauração de versões anteriores.

- Trabalho em Equipe: Permitir que várias pessoas colaborem no mesmo projeto;

- Histórico: Oferecer um histórico fácil de entender, mostrando como o projeto evoluiu ao longo do tempo;

- Segurança: Mesmo em caso de falha de hardware, seus dados permanecem protegidos e salvos no VCS;

- Versões Estáveis: Poder manter uma versão estável do projeto enquanto trabalha em novas funcionalidades.

__________________________________________

### Três exemplos de VCS:

- Git;
- Mercurial;
- Subversion.

__________________________________________

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

__________________________________________

## Desafio 3:
Entender o básico a respeito do protocolo de comunicação mais utilizado da internet, e a partir desses princípios ser capaz de implementar suas próprias controllers a fim de se comunicar com uma aplicação de front-end, um micro serviço ou outros tipos de aplicações.
__________________________________________

#### O que é o protocolo de comunicação HTTP e como ele funciona:

O Protocolo de Transferência de Hipertexto (HTTP) é um protocolo de comunicação usado para a transferência de informações na World Wide Web. Funciona como um conjunto de regras que define como as mensagens são formatadas e transmitidas, permitindo a comunicação entre clientes (como navegadores web) e servidores.

__________________________________________


#### O que é REST, e qual é a sua relação com o protocolo HTTP:

REST é um estilo arquitetural para o design de sistemas distribuídos. Ele se baseia nos princípios de simplicidade, escalabilidade e statelessness. REST utiliza os métodos HTTP (GET, POST, PUT, DELETE) para realizar operações em recursos identificados por URLs. A relação com o protocolo HTTP está na utilização de seus métodos e na representação dos recursos através de URLs.

__________________________________________

#### O que é Web API, e qual é a sua relação com REST:

Uma Web API é uma interface que permite a comunicação e a interação entre sistemas pela internet. Ela utiliza os princípios do REST para expor funcionalidades e dados, sendo acessada por meio do protocolo HTTP. A relação entre Web API e REST está na implementação dos padrões RESTful para facilitar a comunicação e manipulação de recursos através da web.

__________________________________________

### Métodos de solicitações HTTP utilizados pelo padrão REST e suas respectivas finalidades:

- GET:
Finalidade: Recuperação de dados ou informações de um recurso especificado pela URL. O método GET não deve causar efeitos colaterais no servidor.

- POST:
Finalidade: Submissão de dados para serem processados a um recurso especificado pela URL. É frequentemente utilizado para criar um novo recurso no servidor.

- PUT:
Finalidade: Atualização de um recurso existente ou criação de um recurso se ele não existir. O corpo da requisição contém os dados atualizados.

- DELETE:
Finalidade: Remoção de um recurso identificado pela URL. Indica que o cliente deseja excluir o recurso especificado.


- PATCH:
Finalidade: Aplicação parcial de modificações a um recurso. É utilizado para atualizar apenas parte dos dados de um recurso.

__________________________________________

### O que é Swagger:

O Swagger é uma ferramenta que simplifica a documentação, teste e consumo de APIs. Ele gera automaticamente uma interface interativa na web, permitindo que desenvolvedores visualizem e testem endpoints de API diretamente no navegador. Isso facilita a compreensão e a colaboração em projetos que envolvem APIs RESTful.

__________________________________________

Desenvolvido por [Thaís Alencar](https://www.linkedin.com/in/alencartha)



