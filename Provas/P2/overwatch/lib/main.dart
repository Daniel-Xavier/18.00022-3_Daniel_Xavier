import 'package:flutter/material.dart';
import 'package:overwatch/telas/my_home_page.dart';
import 'package:overwatch/telas/overwatch_page.dart';

void main() {
  runApp(
    MaterialApp(
      initialRoute: 'HomePage',
      //initialRoute: 'OverwatchPage',

      routes: {
        'HomePage': (context) => MyHomePage(),
        'OverwatchPage': (context) => OverwatchPage(),
      },
    ),
  );
}
