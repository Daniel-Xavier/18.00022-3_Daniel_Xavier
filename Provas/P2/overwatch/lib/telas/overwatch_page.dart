import 'package:flutter/material.dart';
import 'package:flutter/cupertino.dart';
import 'package:overwatch/models/profile.dart';

class OverwatchPage extends StatefulWidget {
  final Profile dadosProfile;
  final CompetitiveStats dadosCompstats;
  final CareerStats dadosCareerstats;
  final AllHeroes dadoAllheroes;
  final Assists dadosAssists;
  final Best dadosBest;
  final Combat dadosCombat;
  final Game dadosGame;
  final Games dadosGames;
  final Ratings dadosRatings;

  const OverwatchPage({
    Key key,
    @required this.dadosProfile,
    @required this.dadosCompstats,
    @required this.dadosCareerstats,
    @required this.dadoAllheroes,
    @required this.dadosAssists,
    @required this.dadosBest,
    @required this.dadosCombat,
    @required this.dadosGame,
    @required this.dadosGames,
    @required this.dadosRatings,
  }) : super(key: key);
  _OverwatchPageState createState() => _OverwatchPageState();
}

class _OverwatchPageState extends State<OverwatchPage> {
  TextEditingController controlador;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text(
            " Seu Perfil ",
          ),
          backgroundColor: Colors.orange[300],
        ),
        body: Column(
          
          children: [
            SizedBox(
              height: 45,
            ),
            Container(
              child: Text("Seu Nivel é: " +
                  ((widget.dadosProfile.prestige * 100) +
                          widget.dadosProfile.level)
                      .toString()),
            ),
            SizedBox(
              height: 15,
            ),
            Container(
              child: Text("SR: " + widget.dadosProfile.rating.toString()),
            ),
            SizedBox(
              height: 5,
            ),
            // mostra o Rank referente a Battletag escrita
            SizedBox(
              width: 80,
              height: 80,
              child: Image.network(widget.dadosProfile.ratingIcon),
            ),
            SizedBox(
              height: 5,
            ),
            Container(
              child: Text(
                "Status of Competitive Career",
                style: TextStyle(fontSize: 20),
              ),
            ),
            SizedBox(
              height: 5,
            ),
            Container(
              child: Text("Tempo de Jogo: " +
                  widget.dadosProfile.competitiveStats.careerStats.allHeroes
                      .game.timePlayed
                      .toString()),
            ),
            SizedBox(
              height: 10,
            ),
            Container(
              child: Text("Numero de Jogos: " +
                  widget.dadosProfile.competitiveStats.careerStats.allHeroes
                      .game.gamesPlayed
                      .toString()),
            ),
            SizedBox(
              height: 10,
            ),
            Container(
              child: Text("Numero de vitorias " +
                  widget.dadosProfile.competitiveStats.careerStats.allHeroes
                      .game.gamesWon
                      .toString()),
            ),
            SizedBox(
              height: 10,
            ),

            Container(
              child: Text("Dano total Causado: " +
                  widget.dadosProfile.competitiveStats.careerStats.allHeroes
                      .combat.damageDone
                      .toString()),
            ),
            SizedBox(
              height: 10,
            ),
            Container(
              child: Text("Cura total: " +
                  widget.dadosProfile.competitiveStats.careerStats.allHeroes
                      .assists.healingDone
                      .toString()),
            ),
            SizedBox(
              height: 10,
            ),
            Container(
              child: Text("Dano maximo causado em um jogo: " +
                  widget.dadosProfile.competitiveStats.careerStats.allHeroes
                      .best.allDamageDoneMostInGame
                      .toString()),
            ),
            SizedBox(
              height: 10,
            ),
            Container(
              child: Text("Cura maxima causado em um jogo: " +
                  widget.dadosProfile.competitiveStats.careerStats.allHeroes
                      .best.healingDoneMostInGame
                      .toString()),
            ),
            SizedBox(
              height: 10,
            ),

            Container(
              child: Text("Total de kills: " +
                  widget.dadosProfile.competitiveStats.careerStats.allHeroes
                      .combat.eliminations
                      .toString()),
            ),
            SizedBox(
              height: 10,
            ),
            Container(
              child: Text("Morreu: " +
                  widget.dadosProfile.competitiveStats.careerStats.allHeroes
                      .combat.deaths
                      .toString()),
            ),
            SizedBox(
              height: 10,
            ),
            Container(
              child: Text("Kill no Melee: " +
                  widget.dadosProfile.competitiveStats.careerStats.allHeroes
                      .combat.meleeFinalBlows
                      .toString()),
            ),

            SizedBox(
              height: 10,
            ),
            Container(
              child: Text("Eliminacoes em um jogo: " +
                  widget.dadosProfile.competitiveStats.careerStats.allHeroes
                      .best.eliminationsMostInGame
                      .toString()),
            ),
          ],
        ));
  }
}
