![GitHub top language](https://img.shields.io/github/languages/top/mathsmnz/academiaCapgemini) 
![Repo Size](https://img.shields.io/github/languages/code-size/mathsmnz/academiaCapgemini) 
![License](https://img.shields.io/github/license/mathsmnz/academiaCapgemini)
![Testes](https://github.com//mathsmnz/academiaCapgemini/actions/workflows/maven.yml/badge.svg)
![JDK11](https://img.shields.io/badge/jdk%20version-11-red.svg)
![Maven](https://img.shields.io/badge/tool-maven-0440af.svg)
![badge-junit-jupiter](https://img.shields.io/badge/junit-jupiter-green.svg)

>Acesso ao desafio 01 - [Desafio 01](https://github.com/mathsmnz/academiaCapgemini/tree/desafio-01)

# Desafio de programação Academia Capgemini — 02

## 1. Questões

### Questão 01

A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. 
Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.
#### Exemplo:<br>
Entrada:
```
arr = [9, 2, 1, 4, 6]
```
Saída:
```
4
```

### Questão 02

Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.

#### Exemplo:<br>
Entrada:
```

n = [1, 5, 3, 4, 2]
```
Saída: 
```
3
```
Explicação:<br>
Existem 3 pares de inteiros no vetor com uma diferença de 2: `[5, 3]`, `[4, 2]` e `[3, 1]`.

### Questão 03

Um texto precisa ser encriptado usando o seguinte esquema. 
Primeiro, os espaços são removidos do texto. 
Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:

`sqrt(T) <= linha <= coluna <= sqrt(T)`

#### Exemplos:<br>

##### Exemplo 1)
Entrada:
```
s = tenha um bom dia
```
Saída: 
```
taoa eum nmd hbi
```
Explicação:<br>

Depois de remover os espaços, a string tem 13 caracteres.`sqrt(13)` está entre 3 e 4, então a string é rescrita na forma de um grid com 4 linhas e 4 colunas:
```
tenh
aumb
omdi
a
```
O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto. 
A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.
##### Exemplo 2)
Entrada: 
```
s = ola mundo
````
Saída: 
```
omd luo an
```
Explicação:<br>

Depois de remover os espaços a string tem 8 caracteres.`sqrt(8)`está entre 2 e 3, então a string é reescrita na forma de um grid com 3 linhas e 3 colunas:
```
ola
mun
do
```
## 2. Instalação
1. Verifique a instalação do Maven em sua máquina usando o comando a baixo, caso dê erro, verifique a instalação e tente novamente
```shell
mvn -version
```
2. Faça uma cópia deste repositório com 
```shell
git clone -b desafio-02 https://github.com/mathsmnz/academiaCapgemini.git
```
3. Navege até o diretório do respositório
```shell
cd "academiaCapgemini"
```
4. Execute o comando de instalação do Maven, aguarde a Build e a execução dos testes
```shell
mvn clean instal
```
5. Navegue até o diretório onde foi realizada a criação do .jar
```shell
cd "target"
```
6. Execute o arquivo criado e use o programa a partir do terminal
```shell
java -jar DesafioCapgemini-1.0.jar
```
