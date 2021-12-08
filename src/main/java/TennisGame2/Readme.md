# TennisGame2


1) Création des classes player => nom, point et res du joueur
   => SetP1Score et SetP2Score sont supprimées car inutiles
2) Refacto de la classe TennisGame2 en ajoutant 2 joueurs (et non pas une liste ce coup-ci, on varie les plaisirs)
   1) res => getRes, P1Score et P2Score mutualisés dans la classe Player
   2) player == "player1" => equals car une string
3) On rejoue les tests pour voir que tout est OK
4) Extract de la méthode getScore() en sous méthodes dans une nouvelle classe ScoreUtils car trop de duplication de code
   1) Mutualisation des if communs (ex p1.point === p2.point) pour gérer l'égalité
   2) Supprimer au maximum la duplication de code

C'était assez long car les if étaient imbriqués .. c'était complètement illisible
