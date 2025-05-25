# Projeto Factory Method para Fábricas de Produtos Esportivos

Este projeto em Java demonstra a aplicação do **Padrão de Projeto Factory Method** para simular a criação de camisas esportivas por diferentes fabricantes (Nike, Adidas, Puma, Umbro e Kappa). O usuário pode escolher a marca e o time desejado, e o sistema utiliza a fábrica correspondente para criar o produto.

## Estrutura do Projeto

O projeto está organizado nas seguintes interfaces e classes:

* **`CamisaEsportiva` (Interface):** Define o contrato para todos os tipos de camisas esportivas.
* **`CamisaNike` (Classe):** Implementação concreta de `CamisaEsportiva` para camisas Nike.
* **`CamisaAdidas` (Classe):** Implementação concreta de `CamisaEsportiva` para camisas Adidas.
* **`CamisaPuma` (Classe):** Implementação concreta de `CamisaEsportiva` para camisas Puma.
* **`CamisaUmbro` (Classe):** Implementação concreta de `CamisaEsportiva` para camisas Umbro.
* **`CamisaKappa` (Classe):** Implementação concreta de `CamisaEsportiva` para camisas Kappa.
* **`FabricaEsportiva` (Interface):** Define o contrato para todas as fábricas de produtos esportivos.
* **`FabricaNike` (Classe):** Implementação concreta de `FabricaEsportiva` para a fábrica da Nike.
* **`FabricaAdidas` (Classe):** Implementação concreta de `FabricaEsportiva` para a fábrica da Adidas.
* **`FabricaPuma` (Classe):** Implementação concreta de `FabricaEsportiva` para a fábrica da Puma.
* **`FabricaUmbro` (Classe):** Implementação concreta de `FabricaEsportiva` para a fábrica da Umbro.
* **`FabricaKappa` (Classe):** Implementação concreta de `FabricaEsportiva` para a fábrica da Kappa.
* **`Main` (Classe):** Classe principal que interage com o usuário para escolher a marca e o time, e utiliza as fábricas para criar as camisas.

## Como Executar o Projeto

1.  **Pré-requisitos:** Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.
2.  **Compilação:** Abra um terminal ou prompt de comando, navegue até o diretório onde os arquivos `.java` estão salvos e execute o seguinte comando para compilar os arquivos:
    ```bash
    javac *.java
    ```
3.  **Execução:** Após a compilação bem-sucedida, execute a classe `Main` com o seguinte comando:
    ```bash
    java Main
    ```
4.  **Interação:** O programa solicitará que você digite a marca da camisa desejada (Nike, Adidas, Puma, Umbro, Kappa) e, em seguida, o time desejado. Digite as opções e pressione Enter. O programa exibirá as informações da camisa criada (se a combinação de marca e time for válida).

## Padrão Factory Method

Este projeto ilustra o Padrão Factory Method, um padrão de projeto criacional que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

**Benefícios neste projeto:**

* **Flexibilidade:** Adicionar novas marcas de fábricas ou novos tipos de camisas requer apenas a criação de novas classes, sem modificar o código cliente principal.
* **Baixo Acoplamento:** A classe `Main` não depende das classes concretas das camisas, mas sim da interface `FabricaEsportiva`.
* **Encapsulamento da Criação:** A lógica de criação dos objetos é encapsulada nas classes de fábrica.

## Diagrama UML

O diagrama UML deste projeto pode ser encontrado no arquivo `diagrama_uml.pdf`

## Contribuições

Contribuições para este projeto são bem-vindas. Sinta-se à vontade para abrir issues para relatar bugs ou sugerir melhorias, ou enviar pull requests com suas alterações.

