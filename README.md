# ricardo-monitoring
ricardo-monitoring

Vous trouverez ci joint l'avancement de mes travaux,

N'ayant pas eu le bonheur d'utiliser mon pc de travail, du temps a été consommé sur l'installation des jre/jdk et IDE, j'étais d'abord partit pour travailler sur un couple Netbeans/Glassfish pour ensuite m'orienter vers Eclipse/Tomcat, les temps de configurations fut élevés.

Suite à quelques recherches l'API jax rs a été choisit (intégré par un .jar) pour implémenter les WebServices REST, cependant bien que le serveur TOMCAT fut correctemment démarré et l'application web bien présenté et démarré, je n'ai pu réussir a accéder (État HTTP 404 – Not Found) et donc tester les services.

Je vous joint tout de meme mon avancé et ce readme.

#src/dto
Contient les DTO du projet et implémentation de l'interface Cloneable

#src/enums
Contient les énumération du projet pour les bonnes pratiques

#src/services
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




