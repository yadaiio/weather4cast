Unser Ziel ist es, eine Wetterabfrage im Terminal zu gestalten,
die sich die verschiedenen Infomrationen von Gradzahl in Celsius
bis hin zur Luftfeuchtigkeit aus dem Internet holt und sie anzeigen
soll. Zusätzlich würden wir gerne eine visuelle Unterstützung mit
einbauen, um den aktuellen Wetterstand anzuzeigen.

Mit jeder erneuten Abfrage, sollte sich die Wettervorhersage
aktualisieren. Die genauen Standorte sollen sich auf den Raum 
Aachen und Umgebung beziehen. Für uns wären Eschweiler, Alsdorf
und Würselen eine gute Wahl.

Skalierbar betrachtet für dieses Projekt wäre eine Anzeige für
einen Magic-Mirror erwünschenswert, aber nicht Hauptziel.
Eventuell kann ma später für eine App-Lösung schauen.

Die Sprache für dieses Projekt wird Java sein, da wir diese
Programmiersprache auch in der Berufsschule lernen.

Das Userinterface (Anzeige) soll im Terminal sein, d.h. eine TUI (Terminal User Interface)

Die Rahmen sollen die selben Rahmen sein wie zu DOS-Zeiten.
Die ASCII Arts für Wolken, Sonne, Regen, Gewitter werden separat in einem String gespeichert.
Die API, für die Wetterdaten soll "Open-Meteo" sein, da diese kostenlos ist.

Da das UI im Terminal stattfindet, kann man das Programm auf einem Raspberry Pi laufen lassen
und mit einem einfachen mobilen Display, in ein Magic Mirror oder mittels 3D-Druck
in eine Multi-App eingebaut werden, die Uhrzeit und Wecker sein kann.
