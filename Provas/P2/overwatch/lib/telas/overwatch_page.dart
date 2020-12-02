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
            Container(
              child: Text("Seu Nivel é: " +
                  ((widget.dadosProfile.prestige * 100) +
                          widget.dadosProfile.level)
                      .toString()),
            ),
            Container(
              child: Text("SR: " + widget.dadosProfile.rating.toString()),
            ),

            // mostra o Rank referente a Battletag escrita
            Container(
              child: Image.network(widget.dadosProfile.ratingIcon),
            ),
            Container(
              child: Text("jogos Venciidos: " +
                  widget.dadosProfile.gamesWon.toString()),
            ),
            Container(
              child: Text("Em um jogo voce deu " +
                  widget.dadosBest.allDamageDoneMostInGame.toString() +
                  " de dano."),
            ),

            Container(),
            Container(),
            Container(),
            Container(),
            Container(),
            Container(),
            Container(),
            Container()
          ],
        ));
  }
}
