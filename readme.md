Projet : Bollywood
Auteurs : Cyril et Jean
Version : 0.3

Ce projet permet de choisir son acteur de Bollywood pr�f�r� et affiche sa fiche (nom pr�nom et photo)

Nous avions commenc� � nettoyer et travailler en parrall�le sur le repository https://github.com/JeanDEGLAIRE/CyrilJeanBollywood ( git@github.com:JeanDEGLAIRE/CyrilJeanBollywood.git )
Mais on a voulu renommer les packages Java (passer de fr.jean.bollywood � fr.jeancyril.bollywood). malheureusement nous avons commit sans ajouter les nouveaux packages...

A partir de l� nous avons essay� de nous d�battre � essayer de revenir sur une ancienne version stable sans succ�s.

Finalement, nous avons recr�� le projet dans Eclipse en faisant des copier-coller depuis l'interface web de github et nous avons cr�� un nouveau repository ( git@github.com:JeanDEGLAIRE/CyrilJeanBollywood2.git)

Le projet n'est pas fonctionnel : les �l�ments traductibles n'apparaissent pas.

Fix� les probl�mes :
- On avait pas sp�cifi� le fichier des trads dans faces-config.xml
- Les boutons de traduction ne marchaient pas, parce qu'ils n'�taient pas dans une balise <h:form/>
- remarque int�ressante : les petites ic�nes dans le file explorer d'Eclipse indiquent les dossiers surveill�s ou non par Git... Si j'avais ouvert mes yeux, j'aurai jamais d� commit.
- il y avait une erreur dans eclipse sur le classpath : il suffisait d'�diter le fichier .classpath a la racine du projet pour retirer la ligne qui posait probl�me puis de relancer Eclipse.