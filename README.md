# ProjetoFX01

Aplicação com interface gráfica em **JavaFX**, desenvolvida durante o curso **Programação Oracle - Java Foundations**, certificado pelo SENAI-SP — o primeiro projeto onde saí do terminal e construí telas reais.

O projeto reúne um pequeno menu de utilitários, cada um em uma tela própria: dois conversores de moeda (em versões diferentes, mostrando a evolução da solução) e uma calculadora de média escolar.

## Telas

- **Menu principal** (`main-view.fxml`): ponto de entrada, dá acesso às demais telas
- **Conversor de moedas v1** (`conversor-view.fxml` / `ConversorController`): converte Real para Dólar, Euro ou Libra através de botões fixos, com validação de valores nulos ou negativos
- **Conversor de moedas v2** (`conversor-view2.fxml` / `ConversorController2`): evolução do conversor, com um `ComboBox` para escolher a direção da conversão (BRL→USD, USD→BRL, BRL→EUR, EUR→BRL) em vez de botões separados
- **Calculadora de média** (`media-view.fxml` / `MediaController`): calcula a média entre duas notas e exibe o resultado colorido — azul se a média for suficiente para aprovação (≥ 7), vermelho caso contrário

Esse projeto foi a base para o [ProjetoFX2](https://github.com/LucasPereirax/ProjetoFX2), que evolui a interface com funcionalidades interativas adicionais, incluindo emissão de som.

## Conceitos praticados

- Criação de telas e componentes gráficos com JavaFX (FXML + Controllers)
- Validação de entrada de dados
- Lógica condicional aplicada à interface (feedback visual)
- Comparação entre duas abordagens diferentes para o mesmo problema (conversor v1 vs v2)

## Tecnologias

- Java
- JavaFX
- CSS (estilização das telas)
- Maven

## Estrutura do código

```
ProjetoFX01/
├── src/main/java/com/senai/
│   ├── controller/
│   │   ├── MainController.java
│   │   ├── ConversorController.java     # conversor v1 (botões fixos)
│   │   ├── ConversorController2.java    # conversor v2 (ComboBox)
│   │   └── MediaController.java          # calculadora de média
│   └── MainApp.java
└── src/main/resources/com/senai/
    ├── style/ (media.css, style.css)
    ├── main-view.fxml
    ├── conversor-view.fxml
    ├── conversor-view2.fxml
    └── media-view.fxml
```

## Rodando o projeto localmente

```bash
git clone https://github.com/LucasPereirax/ProjetoFX01.git
cd ProjetoFX01
mvn compile exec:java
```
