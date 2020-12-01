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
            //
            Container(
              child: Image.network(
                  "https://pbs.twimg.com/media/Eh0cbo1VgAAc1zr.jpg"),
            ),
            SizedBox(
              child: Text(widget.dadosProfile.rating.toString()),
            ),

            // mostra o Rank referente a Battletag escrita
            SizedBox(
              child: Image.network(widget.dadosProfile.ratingIcon),
            ),
            SizedBox(),
          ],
        ));
  }
}
