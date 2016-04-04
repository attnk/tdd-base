# tdd-base
Projeto utilizado como base, para treinar o conhecimento e uso do TDD no desenvolvimento.
___
Como base para esse projeto temos o seguinte enunciado:
<br/>
Foi solicitado p desevolvimento de uma espécie de mini dicionário, onde inicialmente temos algumas palavras que contém apenas alguns detalhes referênte as mesmas. Dentre as informações de cada palavra temos:
<br/>
<br/>
1) Uma breve definição;
<br/>
2) URL de uma imagem;
<br/>
3) URL da WIKEPEDIA;
<br/>
4) Quantidade de letras na palavra;
<br/>
5) Uma frase com a palavra em questão.
<br/>
<br/>
Inicialmente esse mini dicionário contém 6 palavras em sua base, sendo uma delas somente um comando no qual o sistema entende que o mesmo indica a solicitação de retorno de todas as palavras juntamente com suas informações.
As palavras existentes na base do sistema são:
<br/>
* POMBO;
* TDD;
* BATMAN;
* SUPERMAN;
* IRONMAN;
* CAPTAIN_AMERICA;
* ALL.

Todos os dados referentes as palavras já estão devidamente cadastrados no sistema, porém somente a informação referênte as QUANTIDADES DE PALAVRAS não se encontra na base.
<br/>
___
Como objetivo inicial e principal, foi exigido que esse sistema seja atualizado para a forma de serviço REST que dado uma palavra sejam retornadas as informações coerentes a mesma no formato de JSON.
<br/>
<br/>
<b>OBS<b/>: 
* O serviço deve responder a uma requisição GET;
* A mesma URL que responde os dados de uma palavra será a mesma para o comando ALL;
* Localmente o serviço deve responder na seguinte URL: localhoast:8080/tdd-base/words/data/<PALAVRA>

___
# Técnologias utilizadas
+ Java 8;
+ Spring Boot 1.3.3;
+ JUnit + Mockito.
