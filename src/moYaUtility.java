/*Diese Klasse dient als Ansammlung verschiedener Funktionen, die wir
 * für das Projekt benötigen. MOYA steht für Moritz und Yada, und utility
 * steht für "Werkzeug". Diese Klasse ist also unser Werkzeugkoffer.
 */

public class moYaUtility {

    //Funktion namens changeCursor, wo wir jeweils zwei Integer reingeben
    public static void changeCursor(int row, int column){

        //binärer Code für die Escape-Sequenz, ASCII 27 oder ESC, nicht sichtbar
        char escCode = 0x1B;

        //c% fügt einen variablen Char ein, d fügt Digit ein, f beendet die escape-Sequenz
        System.out.print(String.format("%c[%d;%df",escCode,row,column)); 
    }
}