# Quake
Teste realizado para CloudWalk

> Este projeto visa lêr o conteúdo do arquivo games.log,
> identificando e categorizando suas informações.
> Para cada jogo encontrado ele exibirá algo como:
```
game_20: {
	total_kills: 3;
	players: ["Dono da Bola", "Oootsimo", "Isgalamido", "Assasinu Credi", "Zeh", "Mal"]
	kills: {
		"Dono da Bola": 2,
		"Oootsimo": 1,
		"Isgalamido": 0,
		"Assasinu Credi": 0,
		"Zeh": 0,
		"Mal": 0
	}
```
---

## Setup
- Inicializando o projeto: <br />
__Passo 1__ <br />
Inicialize o projeto através da classe principal: `Main.java` <br />
Após a inicialização será criado um arquivo denominado __games_parse.txt__ na pasta raiz do projeto com todos os jogos identificados. <br />
Dentro do `Main.java` há duas funções sendos elas `getGameById`, que busca um game por id e `showAllGamesScore` que mostra todos os jogos com ranking por jogador
