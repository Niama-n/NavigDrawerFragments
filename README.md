# LAB 10 : Démo Navigation Drawer et Fragments

## Réalisé par:
**Niama Naftaoui**  

## 🎬Vidéo de démonstration

Vous pouvez visualiser le test de l'application ici :
---


https://github.com/user-attachments/assets/2633a767-d884-47eb-a2c3-e4768de99488


## 🎯 Objectifs du Projet

Ce projet a pour but de concevoir une interface Android moderne et ergonomique en utilisant un **Navigation Drawer** (menu latéral). L'accent est mis sur la **navigation modulaire**, permettant une gestion fluide de plusieurs écrans au sein d'une activité unique.

À travers ce développement, les concepts clés suivants ont été explorés :
- **Architecture Modulaire** : Isolation des vues via des Fragments pour une meilleure maintenabilité.
- **Gestion Dynamique** : Manipulation des transactions de fragments et utilisation du `FragmentManager`.
- **UX/UI Customization** : Personnalisation esthétique des menus, des icônes et du tiroir de navigation.
- **Jetpack Navigation** : Mise en œuvre du composant de navigation pour simplifier le routage entre les interfaces.

## 🚀 Fonctionnalités Implémentées

- **Tiroir de Navigation Interactif** : Accès rapide aux différentes sections de l'application.
- **Système de Fragments Multi-Vues** :
    - `HomeFragment` / `BlankFragment` : Interfaces de bienvenue et de contenu statique.
    - `FragmentList` : Une implémentation de `ListFragment` affichant une série de travaux pratiques (LAB1 à LAB10).
- **Navigation Fluide** : Utilisation de `NavController` pour des transitions transparentes entre les composants.
- **Design Adaptatif** : Support des thèmes clair et sombre (Dark Mode).

## 🛠️ Stack Technique & Architecture

Le projet repose sur une structure solide respectant les standards de développement Android :

- **Activité Principale (`MainActivity`)** : Pivot central de l'application gérant la barre d'outils (`Toolbar`) et la synchronisation du menu latéral.
- **Graphe de Navigation (`mobile_navigation.xml`)** : Définition visuelle et logique des destinations et des actions de navigation.
- **Conteneur de Fragments** : Utilisation de `FragmentContainerView` dans `content_main.xml` pour l'hébergement dynamique des vues.
- **Composants UI** : Intégration de Material Design 3 pour une interface premium.

## 📦 Installation et Test

Pour explorer ce projet localement :

1. **Clonage** : Récupérez les sources depuis le dépôt.
2. **Importation** : Ouvrez le dossier racine dans **Android Studio**.
3. **Synchronisation** : Laissez Gradle charger les dépendances et configurer l'environnement.
4. **Déploiement** : Compilez et lancez sur un émulateur (Pixel 5 ou supérieur recommandé) ou un terminal physique.

---

> [!NOTE]
> Ce projet constitue une base solide pour la création d'applications professionnelles nécessitant une navigation hiérarchique claire et une structure logicielle évolutive.
