import 'package:flutter/material.dart';
import 'package:overwatch/models/profile.dart';
import 'package:overwatch/telas/overwatch_page.dart';
import 'package:overwatch/utilities/network_helper.dart';

class MyHomePage extends StatefulWidget {
  const MyHomePage({Key key, this.title = 'Home'}) : super(key: key);
  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  final controlador = TextEditingController();

  Profile dados_profile = new Profile();
  CompetitiveStats dados_compstats = new CompetitiveStats();
  CareerStats dados_careerstats = new CareerStats();
  AllHeroes dados_allheroes = new AllHeroes();
  Assists dados_assists = new Assists();
  Best dados_best = new Best();
  Combat dados_combat = new Combat();
  Game dados_game = new Game();
  Games dados_games = new Games();
  Ratings dados_ratings = new Ratings();

  // Função que bunsca a informacao na API
  Future fetchInfo() async {
    var requisicao = NetworkHelper(
        url: 'https://ow-api.com/v1/stats/pc/us/${controlador.text}/complete');
    dados_profile = Profile.fromJson(await requisicao.getData());
    dados_compstats = CompetitiveStats.fromJson(await requisicao.getData());
    dados_careerstats = CareerStats.fromJson(await requisicao.getData());
    dados_allheroes = AllHeroes.fromJson(await requisicao.getData());
    dados_assists = Assists.fromJson(await requisicao.getData());
    dados_best = Best.fromJson(await requisicao.getData());
    dados_combat = Combat.fromJson(await requisicao.getData());
    dados_game = Game.fromJson(await requisicao.getData());
    dados_games = Games.fromJson(await requisicao.getData());

    dados_ratings = Ratings.fromJson(await requisicao.getData());
  }

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        body: Column(
          children: [
            AppBar(
              backgroundColor: Colors.orange[400],
              title: Text(
                "Overwatch Status",
                style: TextStyle(
                  color: Colors.grey[850],
                  fontSize: 25,
                ),
              ),
            ),
            SizedBox(
              height: 30.0,
            ),
            SizedBox(
                width: 200,
                height: 200,
                child: Image.network(
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Overwatch_circle_logo.svg/1200px-Overwatch_circle_logo.svg.png")),
            SizedBox(
              height: 30.0,
            ),
            //TextFild que le a BattleTag  e armazena no controlador.text
            TextField(
              controller: controlador,
              decoration: InputDecoration(
                  hintText: " Use o formato: User-1234 ",
                  labelText: "Informe sua batlletag: ",
                  icon: Icon(Icons.drive_file_rename_outline)),
            ),
            SizedBox(
              height: 45,
            ),
            //Botao que manda a battletag para a url da API e passa para a tela overwatch_page
            RaisedButton(
              color: Colors.orange[400],
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(8),
                side: BorderSide(color: Colors.black),
              ),
              child: Text(
                '     Mostar Status     ',
                style: TextStyle(fontSize: 24),
              ),
              textColor: Colors.grey[800],
              onPressed: () async {
                await fetchInfo();
                Navigator.push(
                  context,
                  MaterialPageRoute(
                      builder: (context) => OverwatchPage(
                            dadosProfile: dados_profile,
                            dadosCompstats: dados_compstats,
                            dadosCareerstats: dados_careerstats,
                            dadoAllheroes: dados_allheroes,
                            dadosAssists: dados_assists,
                            dadosBest: dados_best,
                            dadosCombat: dados_combat,
                            dadosGame: dados_game,
                            dadosGames: dados_games,
                            dadosRatings: dados_ratings,
                          )),
                );
              },
            ),
          ],
        ),
      ),
    );
  }
}
