# Teste

## Teste Unitários

O teste unitário è uma verificação feita com uma pequena porção de código, uma unidade dde um software. Ou seja, se difere do teste geral, que se dedica a atestar o fluxo do sistema, com as funcionalidades principais.

#### Estudo de caso

Imagine poe exemplo, se um avião só fosse testado após a conclusão da sua construção, con certeza isso seria um cerdadeiro desastre, é nesse poto que a engenharia aeronáutica é uma boa referência em processos de construções de projetos de software, principalmente em sistemas de missão crítica, pois durante a construção e montagem de um aivão todos os seus componentes são testados isoladamente até a exaustão, e depois cada etapa de integração também é devidamente testada e homologada.

#### Vantagens

- Prevenção contra o aparecimento de "BUG'S"
- Código testado é mais confiável
- Premite alterações sem medo
- Testa situações de sucesso e de falha
- Gera e preserva um "Conhecimento" sobre as regras de negócios do projeto.

##### Desvantagens?

- Maior tempo gasto no desenvolvimento?
- Maior tempo gasto com a manutenção?

#### Quem faz os testes?

- `Test Case` (Para cada classe): Desenvolvedor(Projeta, escreve e roda).
- `Test Suite` (Roda vários test cases): Desenvolvedor e Testers.
- **Teste de aceitação** (Homologação) é feito junto ao cliente.

Outra visão é a aproximação da responsabilidade dos testes ao programador, o que em algumas outras abordagens metodológicas é feito somente por equipes separadas, como, por exemplo, uma equipe de teste / homologação.

Porém, esse contexto é a base de qualquer metodologia ágil, pois dessa forma, o própro programador, ao criar e executar os testes, adquiri um controle maior e imediato na prevenção e correçaão de bugs, contribuindo subtancialmente para redução do tempo de vida de um projeto.

##### O que testar?

- A principal regra para saber o que testar é: ***"Tenha criatividade para imaginar as possibilidades de testes"***
- Comece pelas mais simples e deixe os testes "complexos" para p final;
- Não teste métodos triviais (*get e set*);
- Achou um bug? Não conserte sem antes escrever um teste que o pegue (se você não o fizer, ele volta).

## JUnit

*JUnit* é um framework que facilita o desenvolvimento e execução de testes unitários em código Java.

Ele fornece uma completa API(conjunto de calsses) para construir os testes e Aplicações gráficas e em modo console para executar os criados.

## Cobertura de testes

São métricas que indicam a efetividade dos testes. É expressado em percentual de cobertura total onde o código foi testado.

## Mocks

São objetos Fake(falsos) que simulam objetos reais.

Precisamos fazer testes unitários, com os componentes isoladamente e em alguns casos as classes possuem dependências entre si. Como, por exemplo, uma camada de serviços acessa a camada de DAO para ter acesso aos dados. Neste caso precisamos testar isoladamente cada camada, sem uma depender da outra.

Para estas situações utilizamos objetos **Mock**.

## TDD - Test driven Development

TDD significa: Desemvolvimento guiado a testes.

Basicamente o TDD se baseia em pequenos ciclos de repetições, onde para cada funcionalidade do sistema um teste é criado antes. Este novo teste criado inicialmente falha, já que ainda não temos a implementação da fincionalidade em questão e, em seguida, implementamos a funcionalidade para fazer o teste passar.

**Observação**: TDD não é uma forma de escrever teste, ele é uma metodologia para desenvolvimento e escrita de códigos.

### Ciclo TDD

- Escreva um teste unitário que inicialmente irá falhar, tendo em vista que o código ainda não foi implementado;
- Crie o código que satisfaça este teste. Essa primeira implentação deverá satisfazer imediatamente o teste que foi escrito no ciclo anterior;
- Quando o código estiver implementado e o teste satisfeito, refatore o código para melhorar pontos como legibilidade. Logo após, execute o teste novamente. A nova versão do código também deverá passar sem que seja necessário modificar o teste escrito inicialmente.

#### Vantagens

- Feedback rápido sobre a nova funcionalidade.
- Código mais limpo, já que escrevemos códigos simples para o teste passar
- Segurança no *Refectoring*, pois podemos ver o que estamos ou não afetando.
- Segurança na correção de bugs.
- Códigos da aplicação mais flexível, já que para escrever teste temos que separar em pequenos "pedaços" o nosso código, para serem testáveis, ou seja, o nosso código estará menos acoplado.