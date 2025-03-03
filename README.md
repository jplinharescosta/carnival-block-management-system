Por que criar determinadas classes?

Bloco (Classe Abstrata) representa qualquer tipo de bloco de Carnaval.
Ela foi criada para evitar repetições de código nas subclasses.

BlocoTradicional, BlocoTematico e BlocoInfantil cada um deles estende a classe Bloco e adiciona atributos específicos. Isso melhora a organização e permite diferenciar os blocos.

Foliao representa um folião que pode indicar sua idade, estilo musical preferido e região de interesse. Essa classe foi criada para que o sistema possa recomendar blocos de forma personalizada.

Por que usar ou não herança?

Foi usado herança porque todos os blocos têm características em comum, como nome, horário e estimativa de público. Como Bloco é abstrata, forçamos as subclasses a implementar seus próprios detalhes específicos.

Se não tivéssemos usando herança, cada tipo de bloco precisaria repetir atributos e métodos, aumentando a complexidade e dificultando a manutenção do código.

Por que implementar determinado método em uma classe e não em outra?

recommendBlocks(List<Bloco> blocos) foi implementado em Foliao porque é o foliao que busca blocos compatíveis com seu gosto musical.

sortBlockByPublic(List<Bloco> blocos) foi colocado na classe Bloco porque ele precisa comparar vários blocos e ordená-los pela estimativa de público.

A verificação de conflito de horários foi feita em Bloco porque todos os blocos precisam dessa funcionalidade.
