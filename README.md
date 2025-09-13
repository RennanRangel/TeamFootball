#  Sistema de Escalação de Time em Java

Este projeto implementa um sistema simples para **gerenciar jogadores de um time de futebol**, utilizando conceitos de **Programação Orientada a Objetos (POO)** em Java.  
O programa permite **contratar jogadores, escalar titulares e reservas, remover da escalação e listar os escalados**.

---

##  Estrutura do Projeto

### **Classe `Jogador`**
- Atributos:
  - `nome`
  - `numeroCamisa`
  - `situacaoEscalacao` (titular, reserva ou não escalado)
- Métodos:
  - Getters
  - `setSituacaoEscalacao()`
  - `toString()` para exibir informações do jogador

---

### **Classe `Time`**
- Atributos:
  - `nome` do time
  - `nomeTecnico`
  - Lista de `jogadores` contratados
  - Lista de `jogadoresEscalados`
- Métodos principais:
  - `contratarJogador(String nome, int numeroCamisa)`
  - `escalarJogador(String nomeJogador, SituacaoEscalacao situacao)`
  - `removerJogadorEscalacao(String nomeJogador)`
  - `obterEscalacao()` (retorna os jogadores escalados)
  - Métodos auxiliares (`encontrarJogador`, `calcularQtdJogadores`)

---

### **Enum `SituacaoEscalacao`**
- Valores possíveis:
  - `TITULAR` → máximo de **11**
  - `RESERVA` → máximo de **12**

---

### **Classe `Principal`**
- Cria um time
- Contrata jogadores
- Permite escalar e listar os jogadores
- Exemplo de execução

---

##  Exemplo de Uso

### Código:
```java
public class Principal {
    public static void main(String[] args) {
        Time time = new Time("Vitória", "Thiago Carpini");

        time.contratarJogador("Lionel Messi", 10);
        time.contratarJogador("Neymar", 11);
        time.contratarJogador("Luis Suárez", 9);
        time.contratarJogador("Matheusinho", 30);
        time.contratarJogador("Iniesta", 8);

        // Escalar jogadores
        time.escalarJogador("Lionel Messi", SituacaoEscalacao.TITULAR);
        time.escalarJogador("Neymar", SituacaoEscalacao.TITULAR);
        time.escalarJogador("Luis Suárez", SituacaoEscalacao.TITULAR);

        // Listar escalados
        listarJogadoresEscalados(time);
    }

    private static void listarJogadoresEscalados(Time time) {
        System.out.println("Jogadores Escalados:");
        for (Jogador jogador : time.obterEscalacao()) {
            System.out.println(jogador);
        }
    }
}
