package com.example.randomactsofkindness.data

import com.example.randomactsofkindness.data.goodDeedProperties.RequiredMoney
import com.example.randomactsofkindness.data.goodDeedProperties.Difficulty
import com.example.randomactsofkindness.data.goodDeedProperties.SocialInteraction
import com.example.randomactsofkindness.data.goodDeedProperties.TimeRequired

val goodDeeds = listOf(
    GoodDeed(
        title = "Jemandem ein Lächeln schenken",
        description = "Zeige einem fremden Menschen dein schönstes Lächeln.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Einen lieben Kommentar hinterlassen",
        description = "Hinterlasse einen netten Kommentar unter einem sozialen Medienpost.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Einem Freund zuhören",
        description = "Nimm dir Zeit, einem Freund zuzuhören und ihm bei einem Problem zu helfen.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),
    GoodDeed(
        title = "Einem Obdachlosen etwas zu essen kaufen",
        description = "Kaufe einem Obdachlosen eine Mahlzeit.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.LOW_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Einem Kollegen ein Kompliment machen",
        description = "Sage einem Kollegen ein ehrliches Kompliment.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),
    GoodDeed(
        title = "Jemandem beim Tragen helfen",
        description = "Hilf einer Person, die schwere Taschen trägt, beim Tragen.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Ein nettes Zitat teilen",
        description = "Teile ein inspirierendes Zitat mit deinen Freunden oder Followern.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Wasser für eine Pflanze gießen",
        description = "Gieße eine Pflanze in deinem Haushalt oder Büro.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.SOLO
    ),
    GoodDeed(
        title = "Eine gute Tat im Supermarkt",
        description = "Halte die Tür für jemanden im Supermarkt offen.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Eine kleine Spende tätigen",
        description = "Spende etwas Geld an eine Wohltätigkeitsorganisation deiner Wahl.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.LOW_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Ein freundliches Telefonat führen",
        description = "Rufe jemanden an, den du lange nicht mehr gesprochen hast, und frage, wie es ihm geht.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),
    GoodDeed(
        title = "Einem alten Freund eine Nachricht senden",
        description = "Sende einem alten Freund eine Nachricht, um dich zu melden.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),
    GoodDeed(
        title = "Einen Nachbarn begrüßen",
        description = "Gehe zu deinem Nachbarn und sage einfach „Hallo“ oder frage, wie es ihm geht.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),
    GoodDeed(
        title = "Mit einem Hund spazieren gehen",
        description = "Spaziere mit dem Hund deines Nachbarn, wenn er keine Zeit hat.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Mit jemandem gemeinsam frühstücken",
        description = "Lade jemanden zum Frühstück ein und genießt die Zeit zusammen.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.MEDIUM_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),
    GoodDeed(
        title = "Ein Gebrauchsgegenstand spenden",
        description = "Spende einen Gebrauchsgegenstand, den du nicht mehr benötigst, an eine wohltätige Organisation.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Ein fremdes Auto von Schnee befreien",
        description = "Befreie das Auto eines Nachbarn oder Kollegen von Schnee.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Einem Freund eine kleine Überraschung bringen",
        description = "Bringe einem Freund eine kleine Überraschung wie ein Lieblingssnack oder ein nettes Geschenk.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.LOW_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),
    GoodDeed(
        title = "Jemandem eine Liste von guten Büchern senden",
        description = "Teile eine Liste von Büchern, die du empfiehlst, mit jemandem, der gerne liest.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Mit einem Freund spazieren gehen",
        description = "Verbringe Zeit im Freien und gehe mit einem Freund spazieren.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),
    GoodDeed(
        title = "Ein ungelesenes Buch verschenken",
        description = "Schenke ein Buch, das du nicht mehr liest, an jemand anderen.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Jemandem eine handschriftliche Notiz hinterlassen",
        description = "Hinterlasse jemandem eine nette handschriftliche Notiz oder Karte.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Eine Woche ohne Plastik leben",
        description = "Versuche eine Woche lang so wenig Plastik wie möglich zu verbrauchen.",
        difficulty = Difficulty.HARD,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.LONG,
        socialInteraction = SocialInteraction.SOLO
    ),
    GoodDeed(
        title = "Dem Kellner ein großzügiges Trinkgeld geben",
        description = "Gib dem Kellner oder der Kellnerin ein großzügiges Trinkgeld für einen guten Service.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.MEDIUM_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Einen Freund bei der Arbeit unterstützen",
        description = "Biete deinem Freund oder Kollegen an, ihm bei einer schwierigen Aufgabe zu helfen.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),
    GoodDeed(
        title = "Die Wohnung aufräumen",
        description = "Verbringe 10 Minuten damit, deine Wohnung oder dein Zimmer aufzuräumen und es gemütlicher zu machen.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.SOLO
    ),
    GoodDeed(
        title = "Jemandem mit den Kindern helfen",
        description = "Biete an, mit den Kindern eines Freundes zu spielen, damit er oder sie eine Pause hat.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Sich mit einem Familienmitglied versöhnen",
        description = "Setze dich mit einem Familienmitglied zusammen und löse ein Missverständnis oder einen Streit.",
        difficulty = Difficulty.HARD,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.LONG,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),
    GoodDeed(
        title = "Für einen guten Zweck laufen gehen",
        description = "Mache bei einem Wohltätigkeitslauf mit oder starte einen Lauf, um Geld zu sammeln.",
        difficulty = Difficulty.HARD,
        requiredMoney = RequiredMoney.MEDIUM_COST,
        timeRequired = TimeRequired.LONG,
        socialInteraction = SocialInteraction.SOLO
    ),
    GoodDeed(
        title = "Jemandem ein Lächeln schenken",
        description = "Zeige einem fremden Menschen ein ehrliches, herzliches Lächeln.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Einen lieben Kommentar hinterlassen",
        description = "Hinterlasse unter einem Social-Media-Post einen netten, aufrichtigen Kommentar.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Einem Freund zuhören",
        description = "Nimm dir bewusst Zeit, um jemandem bei einem Anliegen wirklich zuzuhören.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Einem Obdachlosen etwas zu essen kaufen",
        description = "Kaufe einem Menschen ohne Obdach eine warme Mahlzeit oder etwas zu trinken.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.LOW_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Einem Kollegen ein Kompliment machen",
        description = "Sage einem Kollegen oder einer Kollegin etwas Wertschätzendes.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Jemandem beim Tragen helfen",
        description = "Hilf einer Person mit schweren Einkaufstaschen oder Gepäckstücken.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Ein nettes Zitat teilen",
        description = "Teile ein inspirierendes Zitat mit einem Menschen, der es gebrauchen kann.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Wasser für eine Pflanze gießen",
        description = "Gieße eine durstige Zimmerpflanze oder eine Pflanze im öffentlichen Raum.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.SOLO
    ),

    GoodDeed(
        title = "Eine gute Tat im Supermarkt",
        description = "Lass jemanden mit weniger Artikeln vor oder hilf beim Einpacken.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Eine kleine Spende tätigen",
        description = "Spende einen kleinen Betrag an eine gemeinnützige Organisation.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.MEDIUM_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Ein freundliches Telefonat führen",
        description = "Rufe jemanden an, den du lange nicht gesprochen hast, und frage, wie es ihm geht.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Einem alten Freund eine Nachricht senden",
        description = "Schreibe einem alten Freund eine nette Nachricht, um den Kontakt wiederherzustellen.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Einen Nachbarn begrüßen",
        description = "Begrüße deinen Nachbarn freundlich und wünsche ihm einen schönen Tag.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Mit einem Hund spazieren gehen",
        description = "Gehe mit dem Hund deines Nachbarn oder Freundes eine Runde spazieren.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Mit jemandem gemeinsam frühstücken",
        description = "Lade jemanden zum Frühstück ein und verbringe gemeinsam Zeit.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.MEDIUM_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Ein Gebrauchsgegenstand spenden",
        description = "Spende einen gut erhaltenen Alltagsgegenstand an eine gemeinnützige Organisation.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Ein fremdes Auto von Schnee befreien",
        description = "Befreie ein fremdes Auto von Schnee oder Eis – einfach so.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Einem Freund eine kleine Überraschung bringen",
        description = "Überrasche einen Freund mit einem Lieblingssnack oder einer lieben Geste.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.LOW_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Jemandem eine Liste von guten Büchern senden",
        description = "Empfiehl einer lesebegeisterten Person Bücher, die dich berührt haben.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Mit einem Freund spazieren gehen",
        description = "Verbringe achtsame Zeit beim Spazierengehen mit einem guten Freund.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),
    GoodDeed(
        title = "Ein ungelesenes Buch verschenken",
        description = "Verschenke ein Buch aus deinem Regal, das du nicht mehr brauchst oder doppelt hast.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Jemandem eine handschriftliche Notiz hinterlassen",
        description = "Hinterlasse jemandem eine liebevolle, handgeschriebene Nachricht oder Karte.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Eine Woche ohne Plastik leben",
        description = "Versuche eine Woche lang, auf Plastikverpackungen im Alltag zu verzichten.",
        difficulty = Difficulty.HARD,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.LONG,
        socialInteraction = SocialInteraction.SOLO
    ),

    GoodDeed(
        title = "Dem Kellner ein großzügiges Trinkgeld geben",
        description = "Gib bei deinem nächsten Restaurantbesuch ein besonders großzügiges Trinkgeld.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.MEDIUM_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Einen Freund bei der Arbeit unterstützen",
        description = "Hilf einem Freund oder Kollegen bei einer Herausforderung am Arbeitsplatz.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Die Wohnung aufräumen",
        description = "Widme 10 Minuten dem Aufräumen deiner Wohnung oder deines Zimmers.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.SOLO
    ),

    GoodDeed(
        title = "Jemandem mit den Kindern helfen",
        description = "Spiele mit den Kindern einer Freundin oder Nachbarin, damit sie eine Pause hat.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Sich mit einem Familienmitglied versöhnen",
        description = "Gehe auf ein Familienmitglied zu und löse einen alten Konflikt.",
        difficulty = Difficulty.HARD,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.LONG,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Für einen guten Zweck laufen gehen",
        description = "Organisiere oder nimm teil an einem Spendenlauf für eine gemeinnützige Sache.",
        difficulty = Difficulty.HARD,
        requiredMoney = RequiredMoney.MEDIUM_COST,
        timeRequired = TimeRequired.LONG,
        socialInteraction = SocialInteraction.SOLO
    ),

    GoodDeed(
        title = "Jemandem den Vortritt lassen",
        description = "Lass jemanden an der Kasse, beim Einsteigen oder im Straßenverkehr vor.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Einem Straßenmusiker etwas Kleingeld geben",
        description = "Unterstütze einen Straßenkünstler mit einem kleinen Geldbetrag oder Applaus.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.LOW_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Einer Person ein Kompliment schreiben",
        description = "Schreibe einer Person eine Nachricht mit einem aufrichtigen Kompliment.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Ein selbstgemachtes Geschenk überreichen",
        description = "Bereite ein kleines DIY-Geschenk vor und überreiche es jemandem persönlich.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.LOW_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Müll im Park aufsammeln",
        description = "Sammle achtlos weggeworfenen Müll in deiner Umgebung und entsorge ihn richtig.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.SOLO
    ),

    GoodDeed(
        title = "Eine positive Rezension schreiben",
        description = "Hinterlasse einem kleinen Unternehmen oder Dienstleister eine positive Bewertung.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Einem Fremden die Tür aufhalten",
        description = "Halte einem Menschen im Alltag bewusst freundlich die Tür auf.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Ein Care-Paket packen",
        description = "Stelle ein kleines Paket mit nützlichen Dingen für Bedürftige zusammen.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.MEDIUM_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Einen Vogel füttern",
        description = "Stelle Körner oder Futterhäuschen für Vögel im Winter auf.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.LOW_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.SOLO
    ),

    GoodDeed(
        title = "Eine Liste mit Dingen erstellen, für die du dankbar bist",
        description = "Schreibe eine Liste mit Dingen, für die du in deinem Leben dankbar bist.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.SOLO
    ),

    GoodDeed(
        title = "Einem älteren Menschen den Sitzplatz anbieten",
        description = "Biete einer älteren oder schwächeren Person deinen Sitzplatz an.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),
    GoodDeed(
        title = "Jemandem einen Kaffee spendieren",
        description = "Bezahle einem Freund oder sogar einem Fremden einen Kaffee.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.LOW_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Einem Kind beim Überqueren der Straße helfen",
        description = "Biete einem Kind oder einer älteren Person Hilfe beim sicheren Überqueren an.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Eine Fahrgemeinschaft organisieren",
        description = "Finde Menschen, mit denen du Wege teilen und Sprit sparen kannst.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Jemanden zum Lachen bringen",
        description = "Erzähle einen Witz oder teile etwas Lustiges, um jemandem den Tag zu verschönern.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Jemanden beim Lernen unterstützen",
        description = "Hilf einem Mitschüler, Kollegen oder Kind beim Lernen oder Verstehen eines Themas.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Eine Blume verschenken",
        description = "Schenke jemandem spontan eine Blume – selbst gepflückt oder gekauft.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.LOW_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Jemandem ein warmes Essen kochen",
        description = "Koche eine liebevolle Mahlzeit für jemanden, der es gerade gebrauchen kann.",
        difficulty = Difficulty.MEDIUM,
        requiredMoney = RequiredMoney.MEDIUM_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Einen Streit schlichten",
        description = "Hilf zwei Menschen dabei, wieder friedlich zueinander zu finden.",
        difficulty = Difficulty.HARD,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.LONG,
        socialInteraction = SocialInteraction.WITH_OTHERS
    ),

    GoodDeed(
        title = "Ein Kleidungsstück spenden",
        description = "Sortiere deinen Schrank aus und spende gut erhaltene Kleidung.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.MEDIUM,
        socialInteraction = SocialInteraction.FOR_OTHERS
    ),

    GoodDeed(
        title = "Einen positiven Gedanken teilen",
        description = "Teile einen motivierenden oder hoffnungsvollen Gedanken mit jemandem.",
        difficulty = Difficulty.EASY,
        requiredMoney = RequiredMoney.NO_COST,
        timeRequired = TimeRequired.SHORT,
        socialInteraction = SocialInteraction.WITH_OTHERS
    )
)
