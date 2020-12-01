import 'package:flutter/material.dart';

class MyHomePage extends StatefulWidget {

  const MyHomePage({Key key, this.title = 'Home'}) : super(key: key);
   final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  final controlador = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        body: Column(
          children: [
            SizedBox(
              width: 300,
              height:300,
              child: Image.network("https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Overwatch_circle_logo.svg/1200px-Overwatch_circle_logo.svg.png")
            ),
            

        ],),),

    )
  }
}
