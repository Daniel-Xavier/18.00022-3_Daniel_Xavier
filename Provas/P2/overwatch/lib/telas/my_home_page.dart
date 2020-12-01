import 'package:flutter/material.dart';

class MyHomePage extends StatefulWidget {
  const MyHomePage({Key key, this.title = 'Home'}) : super(key: key);
  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  final controlador = TextEditingController();
  Profile dados_1 = new Profile();

  Future fetchImagem() async {
    var requisicao = NetworkHelper(
        url: 'https://ow-api.com/v1/stats/pc/us/${controlador.text}/complete');
    dados_1 = Profile.fromJson(await requisicao.getData());
  }

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        body: Column(
          children: [
            SizedBox(
                width: 300,
                height: 300,
                child: Image.network(
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Overwatch_circle_logo.svg/1200px-Overwatch_circle_logo.svg.png")),
            TextField(
              controller: controlador,
              decoration: InputDecoration(
                  hintText: " Use o formato: User-1234 ",
                  labelText: "Informe sua batlletag: ",
                  icon: Icon(Icons.drive_file_rename_outline)),
            ),
            RaisedButton(
                color: Colors.grey[500],
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(50),
                    side: BorderSide(color: Colors.black)),
                child: Text('Mostar Perfil'),
                textColor: Colors.white,
                onPressed: () async {
                  await fetchImagem();
                  Navigator.push(
                    context,
                    MaterialPageRoute(
                        builder: (context) => OverwatchPage(dados: dados_1)),
                  );
                }),
          ],
        ),
      ),
    );
  }
}
