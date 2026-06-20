# praticando-java-alura

Repositório com exercícios desenvolvidos durante a série de cursos "Praticando Java" da Alura. O objetivo é registrar estudos e práticas em Java — não se trata de um único projeto ou aplicação completa, mas de várias atividades organizadas por curso.

**Cursos incluídos**:

- **Praticando Java: variáveis e tipos**
- **Praticando Java: condicionais if e else**
- **Praticando Java: laços for e while**
- **Praticando Java: data e hora**
- **Praticando Java: orientação a objetos com classes, atributos e métodos**

**Estrutura do repositório**:

- Cada curso possui uma pasta de nível superior com o nome do módulo (por exemplo `01-variaveis-e-tipos`).
- Dentro de cada curso há pastas `atividade-*` contendo os arquivos Java e um `README.md` explicando o exercício.
- Os arquivos Java usam packages que espelham a organização das pastas (ex.: `variaveis_e_tipos.atividade_1`, `orientacao_a_objetos.atividade_3`).

**Como executar um exercício (exemplo)**:

1. Compile o arquivo (coloque os .class em uma pasta `bin`):

```bash
javac -d bin 01-variaveis-e-tipos/atividade-1/DeclarandoValores.java
```

2. Execute a classe informando o package completo:

```bash
java -cp bin variaveis_e_tipos.atividade_1.DeclarandoValores
```

Observações:

- Para compilar/executar múltiplas classes, compile a pasta inteira do exercício com `javac -d bin <pasta>/**/*.java` (ou use um wildcard adequado ao seu shell) e execute a classe `main` desejada com seu package.
- Se estiver usando uma IDE (Eclipse, IntelliJ, VS Code), abra o diretório raiz do repositório como projeto Java para compilar e executar diretamente.

**Contribuições e uso pessoal**:

- Este repositório é um registro pessoal de estudos. Pode ser usado como referência por outras pessoas, mas não há garantia de cobertura completa ou arquitetura de produção.
- Sugestões são bem-vindas — abra issues ou PRs caso tenha melhorias ou correções.

**Licença**

- Sinta-se à vontade para adicionar uma licença se desejar (por exemplo, `MIT`) — por enquanto este repositório está sem licença explícita.

Arquivo criado automaticamente para organizar os exercícios e instruções básicas.