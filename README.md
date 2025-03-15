# Sistema de Gestão de Blocos Carnavalescos

Este projeto foi desenvolvido em **Java** e tem como objetivo gerenciar blocos de Carnaval, permitindo a criação, organização e recomendação de blocos para os foliões.

## Estrutura do Projeto

O projeto está organizado nas seguintes pastas e arquivos principais:

- `.vscode/`: Configurações específicas do Visual Studio Code.
- `bin/`: Arquivos compilados.
- `src/`: Código-fonte do projeto.
- `.prettierrc.yaml`: Configurações de formatação de código.
- `README.md`: Este arquivo de documentação.

## Classes Principais

- **Bloco**: Classe abstrata que representa qualquer tipo de bloco de Carnaval. Inclui atributos comuns como nome, horário e estimativa de público.
- **BlocoTradicional**, **BlocoTematico**, **BlocoInfantil**: Classes que estendem `Bloco`, adicionando atributos específicos para cada tipo de bloco.
- **Foliao**: Representa um folião, contendo informações como idade, estilo musical preferido e região de interesse. Essa classe permite que o sistema recomende blocos de forma personalizada.

## Uso de Herança

A herança é utilizada para evitar repetição de código e melhorar a organização. A classe abstrata `Bloco` define atributos e métodos comuns a todos os blocos, enquanto as subclasses específicas adicionam detalhes particulares. Sem herança, cada tipo de bloco precisaria repetir atributos e métodos, aumentando a complexidade e dificultando a manutenção.

## Implementação de Métodos

Métodos são implementados nas classes onde fazem mais sentido. Por exemplo, métodos específicos de recomendação de blocos para foliões são implementados na classe `Foliao`, enquanto métodos gerais de gestão de blocos estão na classe `Bloco` ou suas subclasses.

## Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/jplinharescosta/carnival-block-management-system.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd carnival-block-management-system
   ```

3. Compile o código:

   ```bash
   javac -d bin src/*.java
   ```

4. Execute o sistema:

   ```bash
   java -cp bin Main
   ```

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests com melhorias, correções de bugs ou novas funcionalidades.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

