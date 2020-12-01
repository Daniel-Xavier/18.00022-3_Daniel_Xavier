import 'package:flutter/material.dart';
import 'package:flutter/cupertino.dart';
import 'package:overwatch/models/profile.dart';

class OverwatchPage extends StatefulWidget {
  final Profile dados;
  const OverwatchPage({Key key, @required this.dados}) : super(key: key);
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
            // mostra o Rank referente a Battletag escrita
            SizedBox(
              child: Image.network(widget.dados.ratingIcon),
            )
          ],
        ));
  }
}
