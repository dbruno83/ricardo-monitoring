# ricardo-monitoring

# Architecture

* src/dto
Contient les DTO du projet et implémentation de l'interface Cloneable
la classe RowDTO correspond à une table d'historisation, une amélioration est à prévoir pour séparer l'id dans un autre DTO avec une relation 1 1 entre RowDTO et la nouvelle classe. Dans le but d'éviter la redondance de données.

* src/enums
Contient les énumération du projet pour les bonnes pratiques

* src/services
Contient deux webservices
Affichages des changements dans le CRUD :
/displayRows
example : localhost:8080/ricardo-monitoring/displayRows
Insertion dans la base de donnée
/updateRows
example : localhost:8080/ricardo-monitoring/updateRows?id=2

#src/utils
Contient des Utilitaires d'affichage pour éviter la duplication de code

#src/mockbdd
Simule une base de donnée avec une liste de rows
Contient deux méthodes
Insérer une ligne
Obtenir une ligne à partir de son id et non taggé à "supprimé"

# Usage

## Build

Se placer dans le repertoire tools et executer le build.bat

## Run

Upload le war généré dans le repertoire target dans un serveur d'application (ex : Tomcat)

# Reste à faire : 

- Amélioration du package DTO (redondance id)
- Création d'autres services du CRUD (uniquement update pour le moment)
- Pousser le testing
