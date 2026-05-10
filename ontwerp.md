# ONTWERP OV-SYSTEEM

---

## 1. WAT IS HET DOEL?
het doel van dit project is een simpel systeem maken voor de ov-chipkaart. het werkt nu alleen nog met tekst in de console. je kunt een kaart aanmaken, er geld op zetten en in- of uitchecken bij stations.

---

## 2. USER STORIES

### kaart & de pas
* **nieuwe kaart:** bij het opstarten wordt er meteen een kaart gemaakt met een nummer en een datum.
* **geld laden:** je kunt zelf kiezen hoeveel geld je op de kaart zet vanaf je bankpas.

### reizen
* **inchecken:** je kiest een station en de app checkt of je wel genoeg geld hebt (minimaal 4 euro).
* **uitchecken:** als je uitstapt wordt er 4 euro van je saldo afgehaald en ben je weer uitgecheckt.
* **status zien:** in het menu zie je altijd of je bent ingecheckt en hoeveel geld je nog over hebt.

---

## 3. USE CASES

### saldo opwaarderen
de gebruiker kiest optie 1 en typt een bedrag. de app kijkt of het bedrag wel boven de 0 is. als dat klopt, wordt het saldo van de kaart hoger.

### in- en uitchecken
* **inchecken:** de gebruiker typt de naam van het station. de app kijkt of de kaart nog geldig is en of er 4 euro op staat. als dat oké is, mag je reizen.
* **uitchecken:** de gebruiker typt waar hij is. de app haalt 4 euro van de kaart af en zet de status van de kaart weer op 'niet ingecheckt'.

---

## 4. UITLEG VAN DE CLASSES

ik heb de code verdeeld over drie verschillende bestanden om het overzichtelijk te houden:

* **Main:** dit is het hoofdbestand. hierin staat het menuutje en kun je de keuzes maken.
* **AnoniemeChipkaart:** dit bestand bewaart alle info van de kaart, zoals het kaartnummer en het saldo.
* **KaartLezer:** dit bestand regelt de acties. dus het rekenwerk voor het saldo en het checken of je mag inchecken.

---

## 5. KLASSEN DIAGRAM
dit is hoe de bestanden met elkaar praten:

![Class Diagram UML](./class_diagram.png)