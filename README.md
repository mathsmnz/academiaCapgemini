![GitHub top language](https://img.shields.io/github/languages/top/mathsmnz/academiaCapgemini) 
![Repo Size](https://img.shields.io/github/languages/code-size/mathsmnz/academiaCapgemini) 
![License](https://img.shields.io/github/license/mathsmnz/academiaCapgemini)
![Testes](https://github.com//mathsmnz/academiaCapgemini/actions/workflows/maven.yml/badge.svg)
![JDK11](https://img.shields.io/badge/jdk%20version-11-red.svg)
![Maven](https://img.shields.io/badge/tool-maven-0440af.svg)
![badge-junit-jupiter](https://img.shields.io/badge/junit-jupiter-green.svg)


# Desafio de programação Academia Capgemini — 01

## 1. Questões

### Questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. <br>A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço. <br>

#### Exemplo:<br>
Entrada:
```
n = 6
```
Saída:
```
     *
    **
   ***
  ****
 *****
******
```

### Questão 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. <br> 
A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. <br> 
O site considera uma senha forte quando ela satisfaz os seguintes critérios:<br>

* Possui no mínimo 6 caracteres.
* Contém no mínimo 1 digito.
* Contém no mínimo 1 letra em minúsculo.
* Contém no mínimo 1 letra em maiúsculo.
* Contém no mínimo 1 caractere especial. Os caracteres especiais são: `!@#$%^&*()-+`


Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. <br> 
Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.<br>

#### Exemplo:<br>
Entrada:
```
Ya3
```
Saída: 
```
3
```
Explicação:<br>
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. <br>
2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.

### Questão 03

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. <br>
Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.<br>

#### Exemplo:<br>

##### Exemplo 1)
Entrada:
```
ovo
```
Saída: 
```
3
```
Explicação:<br>

A lista de todos os anagramas pares são: `[o, o], [ov, vo]` que estão nas posições `[[0, 2], [0, 1], [1, 2]]` respectivamente.<br>
##### Exemplo 2)
Entrada: 
```
ifailuhkqq
````
Saída: 
```
3
```
Explicação:<br>

A lista de todos os anagramas pares são: `[i, i], [q, q]` e `[ifa, fai]` que estão nas posições `[[0, 3]], [[8, 9]] e [[0, 1, 2], [1, 2, 3]]`.

## 2. Instalação
1. Verifique a instalação do Maven em sua máquina usando o comando a baixo, caso dê erro, verifique a instalação e tente novamente
```shell
mvn -version
```
2. Faça uma cópia deste repositório com 
```shell
git clone https://github.com/mathsmnz/academiaCapgemini.git
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
