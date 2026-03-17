# Plan de cours — Design Patterns (BAC+2)

> **Durée totale : 14h — 2 jours de 7h**
> **Public :** étudiants BAC+2 informatique
> **Langage :** Java
> **Approche :** pour chaque sujet → métaphore → problème concret → code naïf → pattern → schéma UML → exercice

---

## Vue d'ensemble des 2 jours

### Jour 1 — 7h — Fondations + patterns de création + Composite

| Horaire | Durée | Bloc | Contenu |
|---|---:|---|---|
| 09h00 – 09h15 | 15 min | Bloc 1 | Accueil |
| 09h15 – 09h45 | 30 min | Bloc 2 | Introduction aux design patterns |
| 09h45 – 11h00 | 1h15 | Bloc 3 | Rappels POO |
| 11h00 – 11h30 | 30 min | Bloc 4 | Rappels UML |
| 11h30 – 12h00 | 30 min | Bloc 5 | `Singleton` |
| *12h00 – 13h00* | | | *Pause méridienne* |
| 13h00 – 14h15 | 1h15 | Bloc 6 | `Factory Method` |
| 14h15 – 14h45 | 30 min | Bloc 7 | `Abstract Factory` |
| 14h45 – 16h30 | 1h45 | Bloc 8 | `Composite` |
| 16h30 – 17h00 | 30 min | Bloc 9 | 🧠 Quiz de fin de Jour 1 |

### Jour 2 — 7h — Patterns structurels + comportementaux + synthèse

| Horaire | Durée | Bloc | Contenu |
|---|---:|---|---|
| 09h00 – 09h15 | 15 min | Bloc 1 | Réactivation du Jour 1 |
| 09h15 – 11h15 | 2h00 | Bloc 2 | `Iterator` |
| 11h15 – 12h15 | 1h00 | Bloc 3 | `Decorator` (partie 1) |
| *12h15 – 13h15* | | | *Pause méridienne* |
| 13h15 – 14h15 | 1h00 | Bloc 4 | `Decorator` (partie 2) |
| 14h15 – 15h00 | 45 min | Bloc 5 | `Observer` |
| 15h00 – 15h45 | 45 min | Bloc 6 | `Visitor` |
| 15h45 – 16h30 | 45 min | Bloc 7 | Synthèse finale |
| 16h30 – 17h00 | 30 min | Bloc 8 | 🧠 Quiz de fin de Jour 2 |

---

# JOUR 1

---

## Bloc 1 — Accueil
**Durée : 15 min** · 09h00 – 09h15

### Objectifs
- créer un cadre de travail détendu ;
- annoncer le programme des 2 jours ;
- donner le ton : on code, on dessine, on discute.

### À faire
- se présenter rapidement ;
- tour de table flash : *« prénom + un truc que vous aimez coder »* ;
- présenter la structure des 2 jours ;
- annoncer qu'il y aura un quiz en fin de chaque journée.

---

## Bloc 2 — Introduction aux design patterns : le pourquoi
**Durée : 30 min** · 09h15 – 09h45

### Objectifs
- comprendre ce qu'est un design pattern ;
- comprendre pourquoi ça existe ;
- savoir les situer dans l'histoire du développement logiciel.

### Contenu à présenter

#### Qu'est-ce qu'un design pattern ?
- une **solution éprouvée** à un problème de conception **récurrent** ;
- pas une bibliothèque, pas un framework, pas du code copié-collé ;
- plutôt un **schéma de pensée** réutilisable.

#### Métaphore à utiliser en cours
> *« Un design pattern, c'est comme un plan d'architecte pour une maison. Tu ne recopies pas la maison du voisin, mais tu réutilises le même plan de base (cuisine à côté du salon, salle de bain à l'étage) parce qu'on sait que ça marche bien. »*

#### Pourquoi les design patterns existent
- le code grandit → il devient difficile à maintenir ;
- on se retrouve souvent face aux **mêmes types de problèmes** ;
- les développeurs expérimentés ont identifié des **solutions communes** ;
- le Gang of Four (GoF) les a formalisés en 1994 dans *Design Patterns: Elements of Reusable Object-Oriented Software*.

#### Les 3 familles de patterns
Présenter au tableau :

| Famille | Rôle | Exemples du module |
|---|---|---|
| **Création** | comment créer des objets | `Singleton`, `Factory Method`, `Abstract Factory` |
| **Structure** | comment organiser les objets entre eux | `Composite`, `Decorator` |
| **Comportement** | comment les objets communiquent | `Iterator`, `Observer`, `Visitor` |

#### Ce qu'un pattern n'est PAS
- une règle absolue ;
- une solution à appliquer partout ;
- un moyen de rendre le code « plus beau » sans raison.

#### Question à poser aux étudiants
> *« Est-ce que vous avez déjà eu du code qui marchait mais qui devenait ingérable quand il fallait ajouter une fonctionnalité ? »*

---

## Bloc 3 — Rappels POO
**Durée : 1h15** · 09h45 – 11h00

### Objectifs
- remettre tout le monde au même niveau sur les fondamentaux POO ;
- installer le vocabulaire qui sera utilisé pendant tout le module ;
- montrer que les design patterns s'appuient directement sur ces concepts.

### Comment présenter ce bloc
Ne pas faire un cours magistral exhaustif. Plutôt :
1. rappeler le concept ;
2. montrer un bout de code du projet ;
3. poser une question ;
4. passer au suivant.

---

### 3.1 Classes, objets et encapsulation
**Durée indicative : 15 min**

#### Ce que les étudiants doivent savoir
- une **classe** = un plan de fabrication ;
- un **objet** = une instance concrète de ce plan ;
- l'**encapsulation** = protéger les données internes (`private`) et exposer des méthodes contrôlées.

#### Métaphore
> *« Une classe, c'est un moule à gâteau. L'objet, c'est le gâteau. Tu peux faire 10 gâteaux à partir du même moule, mais chacun a sa propre garniture. »*

#### Code à montrer
`src/_1poo/_03heritage/Personne.java` :
- attributs `private` (`nom`, `prenom`, `age`) ;
- accesseurs `getNom()`, `setNom()` ;
- faire remarquer : on ne touche jamais directement aux attributs depuis l'extérieur.

#### Question à poser
> *« Si `nom` était `public`, qu'est-ce qui pourrait mal se passer dans un programme avec 200 classes ? »*

---

### 3.2 Héritage
**Durée indicative : 15 min**

#### Ce que les étudiants doivent savoir
- une sous-classe **hérite** des attributs et méthodes de sa classe parente ;
- elle peut ajouter ses propres attributs / méthodes ;
- relation « est-un » : un `Professeur` **est une** `Personne`.

#### Métaphore
> *« L'héritage, c'est comme un arbre généalogique. Tu hérites des traits de tes parents, mais tu as aussi tes propres caractéristiques. »*

#### Code à montrer
- `src/_1poo/_03heritage/Personne.java` → parent ;
- `src/_1poo/_03heritage/Professeur.java` → ajoute `specialite` ;
- `src/_1poo/_03heritage/Etudiant.java` → pourrait ajouter `numEtudiant` ;
- `src/_1poo/_03heritage/Main.java` → `List<Personne>` qui contient des profs et des étudiants.

#### Point de vigilance
Faire remarquer dans `Main.java` le problème du `instanceof` :
```java
if (personne instanceof Professeur) { ... }
```
→ c'est exactement ce genre de code que les patterns aideront à éviter.

---

### 3.3 Polymorphisme
**Durée indicative : 15 min**

#### Ce que les étudiants doivent savoir
- on peut manipuler un objet via sa **référence parente** ;
- le comportement réel dépend du **type concret** de l'objet ;
- c'est le moteur de la plupart des design patterns.

#### Métaphore
> *« Imagine une télécommande universelle. Tu appuies sur "allumer", et le comportement dépend de l'appareil branché : une télé s'allume, une radio aussi, mais chacun fait ça à sa manière. »*

#### Code à montrer
- `src/_1poo/_04polymorphisme/Animal.java` → classe abstraite avec `faireCrier()` ;
- `src/_1poo/_04polymorphisme/Chat.java` → implémente `faireCrier()` à sa manière ;
- `src/_1poo/_04polymorphisme/Chien.java` → idem.

#### Schéma au tableau
```
       Animal (abstract)
       ┌──────────┐
       │faireCrier│
       └────┬─────┘
            │
     ┌──────┴──────┐
     │             │
   Chat          Chien
  "Miaou"       "Wouf"
```

#### Question à poser
> *« Si je rajoute un `Canard`, est-ce que je dois modifier la classe `Animal` ? »*
> → Non, il suffit de créer une nouvelle sous-classe. C'est exactement l'idée des patterns.

---

### 3.4 Abstraction et interfaces
**Durée indicative : 15 min**

#### Ce que les étudiants doivent savoir
- une **classe abstraite** = un plan incomplet, à compléter par les sous-classes ;
- une **interface** = un contrat pur, sans implémentation ;
- « programmer contre une interface » = dépendre du contrat, pas de l'implémentation.

#### Différence entre les deux
Résumer au tableau :

| | Classe abstraite | Interface |
|---|---|---|
| Peut avoir du code ? | Oui | Non (avant Java 8) |
| Héritage multiple ? | Non | Oui |
| Quand l'utiliser ? | Quand on a du code commun à partager | Quand on veut juste un contrat |

#### Code à montrer
- `src/_1poo/_05abstraction/Animal.java` → **interface** avec `faireCrier()` ;
- `src/_1poo/_03impl/notif/Notifier.java` → interface de notification ;
- `src/_1poo/_03impl/notif/NotifierMail.java` et `NotifierSms.java` → 2 implémentations.

#### Pont vers les patterns
> *« Quand on parlera de `Decorator`, `Observer`, `Factory Method`… vous verrez qu'on programme toujours contre une interface. C'est ce qui rend le code souple. »*

---

### 3.5 Composition
**Durée indicative : 10 min**

#### Ce que les étudiants doivent savoir
- un objet peut **contenir** d'autres objets ;
- relation « a-un » (vs « est-un » pour l'héritage) ;
- souvent préférable à l'héritage pour la flexibilité.

#### Métaphore
> *« Une voiture n'est pas un moteur, mais elle a un moteur. Si le moteur casse, on le remplace sans jeter la voiture. »*

#### Code à montrer
- `src/_1poo/_05composition/Voiture.java` → contient un attribut `private Moteur moteur` ;
- `src/_1poo/_05composition/Moteur.java` → classe indépendante.

#### Lien avec les patterns
La composition est le mécanisme central de `Composite` et `Decorator`.

---

### 3.6 Le mot-clé `static`
**Durée indicative : 5 min**

#### Ce que les étudiants doivent savoir
- un membre `static` appartient à la **classe**, pas à une instance ;
- on y accède via `NomClasse.methode()`, pas via un objet ;
- utile pour les utilitaires, les constantes, et… `Singleton`.

#### Code à montrer
- `src/_1poo/_06static/Exemple.java` → `methodDynamique()` vs `methodStatic()` ;
- `src/_1poo/_06static/Main.java` → appel des deux.

---

### 3.7 SOLID — les principes essentiels
**Durée indicative : 15 min**

Ne pas passer 1h sur SOLID. Présenter uniquement les 3 principes les plus utiles pour les patterns.

#### S — Single Responsibility Principle
> *« Une classe = une raison de changer. »*

#### O — Open/Closed Principle
> *« Ouvert à l'extension, fermé à la modification. »*

**Code à montrer :**
- `src/_1poo/_13solid/_2openclose/mauvais/ProcessusPaiement.java` → `if/else` pour chaque moyen de paiement ;
- `src/_1poo/_13solid/_2openclose/bon/PaiementCB.java` → une classe par moyen.

**Question à poser :**
> *« Si je veux ajouter Apple Pay, je dois toucher à combien de fichiers dans la version mauvaise ? Et dans la bonne ? »*

#### D — Dependency Inversion Principle
> *« Dépendre d'abstractions, pas d'implémentations concrètes. »*

**Code à montrer :**
- `src/_1poo/_13solid/_5dependencyinversion/mauvais/FenetrePrincipale.java` → dépend directement de `ServiceEnregistementSql` et `ServiceEnregistementFichier` ;
- `src/_1poo/_13solid/_5dependencyinversion/bon/FenetrePrincipale.java` → dépend de l'interface `ServiceEnregistement` ;
- `src/_1poo/_13solid/_5dependencyinversion/bon/Main.java` → l'injection se fait au `main`.

**Pont vers les patterns :**
> *« L'inversion de dépendance, c'est exactement le principe que vous retrouverez dans `Factory Method`, `Decorator`, `Observer`… Les patterns ne font que pousser ce principe plus loin. »*

---

## Bloc 4 — Rappels UML : lire et dessiner les design patterns
**Durée : 30 min** · 11h00 – 11h30

### Objectifs
- savoir lire un diagramme de classes UML ;
- savoir dessiner un schéma simple au tableau ou sur papier ;
- avoir le vocabulaire pour lire les diagrammes de [refactoring.guru](https://refactoring.guru).

### Ce qu'il faut présenter (et pas plus)

#### La classe en UML
```
┌──────────────────┐
│    NomClasse      │
├──────────────────┤
│ - attribut: Type  │   (- = private)
│ + attribut: Type  │   (+ = public)
├──────────────────┤
│ + methode(): Type │
│ - methode(): Type │
└──────────────────┘
```

#### Les relations essentielles

| Relation | Symbole UML | Signification | Exemple du projet |
|---|---|---|---|
| **Héritage** | flèche pleine ▷ | « est un » | `Professeur` ▷ `Personne` |
| **Implémentation** | flèche pointillée ▹ | « respecte le contrat » | `NotifierMail` ▹ `Notifier` |
| **Composition** | losange plein ◆→ | « possède, ne vit pas sans » | `Voiture` ◆→ `Moteur` |
| **Agrégation** | losange vide ◇→ | « contient, peut vivre sans » | `Dossier` ◇→ `Fichier` |
| **Dépendance** | flèche pointillée → | « utilise temporairement » | `Main` → `Logger` |

#### Exercice rapide (10 min)
Demander aux étudiants de dessiner sur papier le diagramme UML de `_03heritage/` :
- `Personne` (parent)
- `Professeur`, `Etudiant`, `PersonnelAdministratif` (enfants)

Puis corriger ensemble au tableau.

#### Ressource à donner
Indiquer que les diagrammes de chaque pattern sont disponibles sur : https://refactoring.guru/fr/design-patterns

---

## Bloc 5 — Pattern 1 : Singleton
**Durée : 30 min** · 11h30 – 12h00

### Le problème que ça résout
Parfois, on veut **une et une seule instance** d'une classe dans tout le programme. Exemples : un logger, une connexion à la base de données, un fichier de configuration.

### Métaphore
> *« Dans un pays, il y a un seul président. Si tu demandes "le président", tu obtiens toujours la même personne, pas un nouveau président à chaque demande. »*

### Déroulé

#### 1. Poser le problème (5 min)
- que se passe-t-il si on crée 5 `Logger` différents ?
- les messages de log arrivent dans le désordre, chacun écrit dans son propre fichier, etc.

#### 2. Montrer le code (10 min)
`src/singleton/bon/Logger.java` :
- constructeur `private` → personne ne peut faire `new Logger()` ;
- attribut `static` → une seule instance, stockée dans la classe elle-même ;
- méthode `getLogger()` → point d'accès unique.

`src/singleton/bon/Client.java` :
- `logger1` et `logger2` pointent vers **le même objet**.

#### 3. Dessiner le diagramme UML (5 min)
```
┌──────────────────────────┐
│        Logger             │
├──────────────────────────┤
│ - logger: Logger (static) │
├──────────────────────────┤
│ - Logger()                │
│ + getLogger(): Logger     │
└──────────────────────────┘
```

#### 4. Discussion : limites et abus (5 min)
- rend le code difficile à tester (état global) ;
- crée un couplage fort (tout dépend du Singleton) ;
- à utiliser avec parcimonie.

#### 5. Questions flash (5 min)
> *« Donnez-moi un exemple de la vraie vie où il y a une seule instance de quelque chose. »*
> *« Si je veux tester mon code avec un faux Logger, comment je fais ? »*

---

## *Pause méridienne — 12h00 – 13h00*

---

## Bloc 6 — Pattern 2 : Factory Method
**Durée : 1h15** · 13h00 – 14h15

### Le problème que ça résout
Le code client doit créer des objets, mais **il ne devrait pas savoir quelle classe concrète** instancier. On veut pouvoir changer le type d'objet créé sans toucher au code qui l'utilise.

### Métaphore
> *« Imagine une pizzeria. Le client commande "une pizza", mais c'est le cuisinier qui décide comment la préparer. Le client ne rentre pas en cuisine pour choisir la pâte, la sauce, le four. Il délègue. Si demain le cuisinier change de recette, le client ne change rien à sa commande. »*

### Déroulé

#### 1. Montrer le problème (20 min)
`src/factorymethod/theme/mauvais/FenetreChat.java` :
- la fenêtre de chat doit créer des boutons ;
- elle vérifie le thème avec un `if/else` :
  ```java
  if (theme.equalsIgnoreCase("clair")) {
      boutonSend = new BoutonClair();
  } else {
      boutonSend = new BoutonSombre();
  }
  ```

**Questions à poser :**
> *« Si j'ajoute un thème "pastel", combien de `if` je dois modifier ? »*
> *« Et si en plus du bouton, j'ai un input et un historique dans le même `if/else` ? »*

#### 2. Présenter le pattern (15 min)
`src/factorymethod/theme/bon/FenetreChat.java` :
- la fenêtre est maintenant **abstraite** ;
- elle délègue la création via `creerBouton()` ;
- les sous-classes (`FenetreChatClaire`, `FenetreChatSombre`) décident de quoi créer.

**Message clé :**
> *« La classe parente sait QUOI faire avec le bouton, mais pas LEQUEL créer. Elle délègue cette décision aux sous-classes. »*

#### 3. Dessiner le diagramme UML (10 min)
```
   FenetreChat (abstract)
   ┌─────────────────────┐
   │ + initFenetre()     │
   │ + creerBouton()     │ ◁─── factory method
   └────────┬────────────┘
            │
   ┌────────┴─────────┐
   │                  │
FenetreChatClaire  FenetreChatSombre
  return new         return new
  BoutonClair()      BoutonSombre()
```

Bien insister sur les 2 hiérarchies :
- la hiérarchie des **créateurs** (les fenêtres) ;
- la hiérarchie des **produits** (les boutons).

#### 4. Deuxième exemple : la logistique (10 min)
`src/factorymethod/logistic/` :
- `Logistics` (abstract) → `planDelivery()` appelle `createTransport()` ;
- `TruckLogistics` → crée un `Truck` ;
- `ShipLogistics` → crée un `Ship`.

Même structure, domaine totalement différent → le pattern est générique.

#### 5. Mini exercice oral (10 min)
> *« Vous gérez une application de messagerie. Vous avez un `MessageSender` qui envoie des messages. Selon le type (email, SMS, push), le message est différent. Proposez à l'oral une structure de classes qui utilise Factory Method. »*

Corriger au tableau ensemble.

---

## Bloc 7 — Pattern 3 : Abstract Factory
**Durée : 30 min** · 14h15 – 14h45

### Le problème que ça résout
On doit créer des **familles d'objets cohérents entre eux**. Par exemple : un thème clair doit produire un bouton clair, un input clair, un historique clair. On ne veut pas mélanger.

### Métaphore
> *« C'est comme un catalogue de meubles IKEA. Tu choisis la collection "MALM" et tu sais que le lit, la commode et la table de nuit vont ensemble. Tu ne mélanges pas MALM et KALLAX. »*

### Déroulé

#### 1. Différence avec Factory Method (10 min)
| Factory Method | Abstract Factory |
|---|---|
| une seule méthode de création | plusieurs méthodes de création |
| un seul type de produit | une famille de produits |
| sous-classes du créateur | sous-classes de la fabrique |

#### 2. Montrer le code (10 min)
- `src/abstractfactory/widget/bon/theme/mauvais/` → tout mélangé avec des `if/else` ;
- `src/abstractfactory/widget/bon/theme/bon/` → `ComponentAbstractFactory` avec `ComponentClaireConcreteFactory` et `ComponentSombreConcreteFactory`.

#### 3. Dessiner le diagramme UML (10 min)
```
    ComponentAbstractFactory (interface)
    ┌──────────────────────┐
    │ + creerBouton()      │
    │ + creerInput()       │
    │ + creerHistory()     │
    └────────┬─────────────┘
             │
    ┌────────┴──────────┐
    │                   │
  Claire              Sombre
  Factory             Factory
```

**Message clé :**
> *« Factory Method crée UN produit. Abstract Factory crée UNE FAMILLE de produits cohérents. »*

---

## Bloc 8 — Pattern 4 : Composite
**Durée : 1h45** · 14h45 – 16h30

### Le problème que ça résout
On veut traiter **un objet simple** et **un groupe d'objets** exactement de la **même manière**. Par exemple : calculer la taille d'un fichier ou d'un dossier entier de la même façon.

### Métaphore
> *« Une boîte de Lego peut contenir des pièces individuelles ou d'autres boîtes. Mais pour calculer le poids total, tu additionnes tout pareil : pièce par pièce ou boîte par boîte. »*

### Déroulé

#### 1. Montrer le problème (20 min)
`src/composite/fichier/mauvais/Dossier.java` :
- 2 listes séparées : `List<Fichier>` et `List<Dossier>` ;
- 2 méthodes `add()` surchargées ;
- `calculerTaille()` doit parcourir les 2 listes différemment.

**Question à poser :**
> *« Et si je veux ajouter un `Raccourci` ? Combien de listes je dois ajouter ? Combien de boucles dans `calculerTaille()` ? »*

#### 2. Présenter le pattern (15 min)
`src/composite/fichier/bon/IFile.java` :
- une **interface commune** : `calculerTaille()` ;
- `Fichier` implémente `IFile` → feuille ;
- `Dossier` implémente `IFile` → contient une `List<IFile>` → composite.

`src/composite/fichier/bon/Dossier.java` :
- une seule liste `List<IFile>` ;
- une seule méthode `add(IFile)` ;
- `calculerTaille()` itère uniformément.

**Message clé :**
> *« Grâce à l'interface commune, le Dossier ne sait pas s'il contient des fichiers ou d'autres dossiers. Il s'en fiche. Il les traite tous pareil. »*

#### 3. Dessiner le diagramme UML (10 min)
```
        IFile (interface)
        ┌────────────────┐
        │calculerTaille()│
        └───────┬────────┘
                │
       ┌────────┴────────┐
       │                 │
    Fichier           Dossier
   (feuille)        (composite)
                    List<IFile>
```

#### 4. Exercice : la recette de pizza 🍕 (45 min)
`src/composite/recette/`

**Contexte donné aux étudiants :**
On a des `Ingredient` (avec un prix unitaire) et des `Recette` (qui contiennent des ingrédients et des sous-recettes). On veut calculer le prix total d'une pizza.

**Étape 1 (20 min) — Calcul naïf :**
Compléter `calculerPrixRecette()` dans `Main.java` sans modifier les classes.
→ Ils vont devoir parcourir `getIngredients()` et `getSousRecettes()` séparément. C'est lourd.

**Étape 2 (25 min) — Appliquer Composite :**
Refactorer pour que `Ingredient` et `Recette` implémentent une interface commune avec `calculerPrix()`.
→ Le calcul devient récursif et élégant.

#### 5. Correction (15 min)
Corriger ensemble au tableau, montrer le diagramme UML de la solution.

---

## Bloc 9 — 🧠 Quiz de fin de Jour 1
**Durée : 30 min** · 16h30 – 17h00

### Format proposé
10 à 15 questions, mélange de QCM, vrai/faux et questions ouvertes courtes.
Peut être fait sur papier, à l'oral ou via un outil comme Kahoot / Wooclap.

### Thèmes à couvrir

#### POO (3-4 questions)
- *Quelle est la différence entre une classe abstraite et une interface ?*
- *Vrai ou faux : la composition est une relation "est-un".*
- *Quel principe SOLID dit qu'on doit dépendre d'abstractions ?*

#### Singleton (2 questions)
- *Pourquoi le constructeur est-il `private` dans un Singleton ?*
- *Citez un inconvénient du pattern Singleton.*

#### Factory Method (2-3 questions)
- *Quel problème résout Factory Method ?*
- *Dans l'exemple du thème, pourquoi la version avec `if/else` est problématique ?*
- *Vrai ou faux : dans Factory Method, c'est la sous-classe qui décide quel objet créer.*

#### Abstract Factory (1-2 questions)
- *Quelle est la différence principale entre Factory Method et Abstract Factory ?*

#### Composite (2-3 questions)
- *Quel est le rôle de l'interface commune dans Composite ?*
- *Vrai ou faux : dans Composite, une feuille et un composite s'utilisent de la même façon.*
- *Dessinez en 30 secondes le diagramme UML de Composite.*

---

# JOUR 2

---

## Bloc 1 — Réactivation du Jour 1
**Durée : 15 min** · 09h00 – 09h15

### À faire
- corriger rapidement le quiz de la veille si ce n'est pas fait ;
- demander : *« Qui peut me résumer en une phrase chacun des 4 patterns vus hier ? »* ;
- afficher au tableau les 4 diagrammes UML de la veille ;
- demander s'il y a des questions.

---

## Bloc 2 — Pattern 5 : Iterator
**Durée : 2h00** · 09h15 – 11h15

### Le problème que ça résout
On a une structure de données complexe (arbre, graphe, liste chaînée…) et on veut pouvoir la **parcourir avec un simple `foreach`**, sans que le code client ait besoin de savoir comment elle est construite.

### Métaphore
> *« Un distributeur de bonbons. Tu tournes la manivelle et tu obtiens un bonbon. Tu n'as pas besoin de savoir comment les bonbons sont empilés à l'intérieur. Tu demandes juste "le suivant". »*

### Déroulé

#### 1. Poser le problème (15 min)
`src/iterator/arbre/Main.java` :
- on a un `Arbre` avec des enfants récursifs ;
- 2 manières de le parcourir :
  - **récursif** → `parcourirRecurssif()` : simple mais impossible à mettre dans un `foreach` ;
  - **itératif** → `parcourirIteratif()` : logique de parcours mélangée au code client.

**Question à poser :**
> *« Et si je veux parcourir ce même arbre en profondeur et en largeur ? Est-ce que le code client doit connaître la différence ? »*

#### 2. Rappel : comment `foreach` fonctionne en Java (10 min)
Expliquer au tableau :
```java
for (String x : maCollection) { ... }
```
→ Java appelle en coulisses :
1. `maCollection.iterator()` → retourne un `Iterator<String>` ;
2. `iterator.hasNext()` → est-ce qu'il reste des éléments ? ;
3. `iterator.next()` → donne l'élément suivant.

→ Donc pour qu'un objet soit parcourable avec `foreach`, il doit implémenter `Iterable<T>`.

#### 3. Montrer l'exemple des collections (20 min)
`src/iterator/collection/` :
- `Pair`, `Triplet` → structures simples ;
- `PairIterator`, `TripletIterator` → itérateurs dédiés ;
- `Tuple` → interface commune.

Montrer comment chaque structure implémente `Iterable` et retourne son propre `Iterator`.

#### 4. Dessiner le diagramme UML (10 min)
```
    Iterable<T>              Iterator<T>
    ┌──────────┐             ┌──────────┐
    │iterator()│             │hasNext() │
    └─────┬────┘             └─────┬────┘
          │                  ┌──────┴──────┐
          │                  │             │
       Arbre              ArbreIterator
   implements              implements
   Iterable<String>        Iterator<String>
```

#### 5. Exercice : rendre l'Arbre itérable 🌳 (45 min)
`src/iterator/arbre/`

**Consigne donnée aux étudiants :**
> Appliquer le design pattern Iterator sur la classe `Arbre` afin de pouvoir écrire :
> ```java
> for (String x : a1) {
>     System.out.println(x);
> }
> ```

**Ce qu'ils doivent faire :**
1. faire implémenter `Iterable<String>` à `Arbre` ;
2. créer une classe `ArbreIterator` qui implémente `Iterator<String>` ;
3. gérer le parcours (en largeur ou en profondeur, au choix).

#### 6. Correction (20 min)
Corriger au tableau, comparer les solutions, dessiner le diagramme final.

---

## Bloc 3 — Pattern 6 : Decorator (partie 1 — cours)
**Durée : 1h00** · 11h15 – 12h15

### Le problème que ça résout
On veut **ajouter des comportements** à un objet **sans modifier sa classe** et **sans créer une sous-classe pour chaque combinaison**.

### Métaphore
> *« Un café. Tu commences avec un café simple. Tu veux ajouter du lait ? On enveloppe le café dans "avec lait". Du sucre en plus ? On enveloppe encore. Chaque ajout est une couche, mais au final, tu bois toujours un café. »*

### Déroulé

#### 1. Montrer le problème (15 min)
`src/decorator/datasource/Demo.java` :
- on veut sauvegarder des données ;
- on veut pouvoir compresser ET chiffrer ;
- dans la version sans pattern, on doit appeler manuellement chaque étape :
  ```java
  String compressed = compressor.compress(data);
  String encrypted = encryptor.encode(compressed);
  dataSource.writeData(encrypted);
  ```
- et pour la lecture, il faut faire l'inverse dans le bon ordre.

**Question à poser :**
> *« Si je veux ajouter un "logger" qui écrit un log à chaque lecture/écriture, combien d'endroits je dois modifier ? »*

#### 2. Présenter le pattern (15 min)
Principe : chaque décorateur **enveloppe** l'objet décoré et **respecte la même interface**.

`src/decorator/notifier/` :
- `Notifier` → interface avec `notifier(int utilisateurId)` ;
- `EmptyNotifier` → implémentation de base ;
- `AbstractNotifierDecorator` → contient un `Notifier` et délègue ;
- `SlackNotifierDecorator`, `FacebookNotifierDecorator` → ajoutent chacune un comportement avant/après la délégation.

**Message clé :**
> *« Le décorateur a la même interface que l'objet décoré. Le code client ne voit aucune différence. C'est transparent. »*

#### 3. Dessiner le diagramme UML (10 min)
```
       Notifier (interface)
       ┌────────────────┐
       │notifier(id)    │
       └───────┬────────┘
               │
     ┌─────────┴──────────┐
     │                    │
 EmptyNotifier    AbstractNotifierDecorator
                  ┌─────────────────────┐
                  │ - notifier: Notifier │
                  └────────┬────────────┘
                           │
                ┌──────────┴──────────┐
                │                     │
          SlackDecorator      FacebookDecorator
```

#### 4. Montrer l'empilement (20 min)
Dessiner au tableau comment les décorateurs s'emboîtent :
```
FacebookDecorator
  └─ SlackDecorator
       └─ EmptyNotifier

Appel de notifier(42) :
  1. FacebookDecorator.notifier(42)  → envoie sur Facebook, puis délègue ↓
  2. SlackDecorator.notifier(42)     → envoie sur Slack, puis délègue ↓
  3. EmptyNotifier.notifier(42)      → ne fait rien (ou envoie un email de base)
```

---

## *Pause méridienne — 12h15 – 13h15*

---

## Bloc 4 — Pattern 6 : Decorator (partie 2 — exercice)
**Durée : 1h00** · 13h15 – 14h15

### Exercice : transformer la DataSource 💾
`src/decorator/datasource/`

**Consigne donnée aux étudiants :**
> Le fichier `DemoAvecDecorator.java` contient un TODO. L'objectif est de refactorer le code de `Demo.java` en utilisant le pattern Decorator, pour pouvoir écrire :
> ```java
> DataSource source = new EncryptorDecorator(
>     new CompressorDecorator(
>         new FileDataSource("output.txt")
>     )
> );
> source.writeData(data);
> String result = source.readData();
> ```

**Ce qu'ils doivent faire :**
1. créer un `DataSourceDecorator` abstrait qui implémente `DataSource` et contient un `DataSource` ;
2. créer `CompressorDecorator` qui compresse avant d'écrire et décompresse après lecture ;
3. créer `EncryptorDecorator` qui chiffre avant d'écrire et déchiffre après lecture ;
4. vérifier que l'empilement fonctionne.

**Durée indicative :** 40 min de travail + 20 min de correction.

---

## Bloc 5 — Pattern 7 : Observer
**Durée : 45 min** · 14h15 – 15h00

### Le problème que ça résout
Quand un objet change d'état, **plusieurs autres objets** doivent en être informés automatiquement, sans que le premier ne connaisse les détails des autres.

### Métaphore
> *« Un groupe WhatsApp. Quand quelqu'un envoie un message, tous les membres du groupe le reçoivent. On peut rejoindre ou quitter le groupe à tout moment, et l'envoyeur ne sait même pas qui est dans le groupe. »*

### Déroulé

#### 1. Poser le problème (10 min)
Un `Magasin` reçoit un nouveau modèle de téléphone. Plusieurs acteurs veulent être prévenus :
- un `Client` qui attend le produit ;
- un `Reparateur` qui doit se former ;
- le `SiteAppleCom` qui doit mettre à jour sa page.

Sans pattern : le magasin devrait connaître chaque acteur individuellement.

#### 2. Montrer le code (15 min)
`src/observator/stock/` :
- `Subscriber` → interface avec `update()` ;
- `Magasin` → liste de `Subscriber`, méthode `subscribe()`, méthode `recevoirNoueauModele()` qui appelle `update()` sur chaque abonné ;
- `Client`, `Reparateur` → implémentent `Subscriber` ;
- `Main.java` → on abonne les acteurs, on déclenche l'événement.

**Message clé :**
> *« Le Magasin ne sait pas ce que font les abonnés quand ils reçoivent la notification. Il sait juste qu'ils ont une méthode `update()`. C'est le découplage. »*

#### 3. Dessiner le diagramme UML (10 min)
```
    Subscriber (interface)
    ┌──────────┐
    │update()  │
    └─────┬────┘
          │
   ┌──────┼──────┐
   │      │      │
 Client  Répar. SiteApple

    Magasin
    ┌─────────────────────────────┐
    │ - subscribers: List         │
    │ + subscribe()               │
    │ + recevoirNouveauModele()   │
    └─────────────────────────────┘
```

#### 4. Question ouverte (10 min)
> *« Donnez-moi 3 exemples concrets de la vie de développeur où vous utiliseriez Observer. »*
>
> Réponses attendues : événements d'interface graphique (bouton cliqué), notifications push, websockets, systèmes de messagerie, etc.

---

## Bloc 6 — Pattern 8 : Visitor
**Durée : 45 min** · 15h00 – 15h45

### Le problème que ça résout
On a une collection d'objets de **types différents**, et on veut pouvoir leur appliquer **plusieurs traitements** sans modifier leurs classes à chaque fois.

### Métaphore
> *« Un guide touristique qui visite une ville. Il passe devant un musée, un restaurant, une mairie. Chaque lieu est différent, mais le guide sait quoi faire avec chacun : le touriste regarde les horaires du musée, le prix du restaurant, et ignore la mairie. Si demain un nouveau type de visiteur arrive (un inspecteur sanitaire), on crée un nouveau visitor sans toucher aux lieux. »*

### Déroulé

#### 1. Montrer le problème (10 min)
`src/visitor/Main.java` — version sans pattern :
```java
for (Lieu lieu : lieux) {
    if (lieu instanceof Restaurant) { ... }
    else if (lieu instanceof Mairie) { ... }
    else if (lieu instanceof Musee) { ... }
}
```

**Question :**
> *« Et si j'ajoute un type de lieu (`Cinema`) et un type de visiteur (`InspecteurSanitaire`) ? Combien de `if/else` je dois toucher ? »*

#### 2. Présenter le pattern (15 min)
- `Visitable` → interface avec `accept(Visitor v)` ;
- `Visitor` → interface avec une méthode `visit` par type de lieu ;
- `EmptyVisitor` → implémentation par défaut qui ne fait rien ;
- `TouristeVisitor` → surcharge uniquement `visitRestaurant()` et `visitMusee()`.

La version avec pattern :
```java
TouristeVisitor visitor = new TouristeVisitor();
for (Lieu lieu : lieux) {
    lieu.accept(visitor);
}
```

**Message clé :**
> *« Le lieu sait comment se faire visiter (`accept`). Le visiteur sait quoi faire avec chaque type de lieu. Personne n'a besoin de `instanceof`. »*

#### 3. Dessiner le diagramme UML (10 min)
```
   Visitable               Visitor
   ┌──────────┐            ┌──────────────────┐
   │accept(v) │            │visitMairie()      │
   └─────┬────┘            │visitRestaurant()  │
         │                 │visitMusee()       │
    ┌────┼────┐            └────────┬──────────┘
    │    │    │                     │
  Musee Rest. Mairie         TouristeVisitor
```

#### 4. Discussion (10 min)
- pattern plus abstrait et plus difficile ;
- utile quand la structure change rarement mais les traitements changent souvent ;
- pas nécessaire de savoir le recoder entièrement à ce stade : savoir le **lire et le reconnaître** suffit.

---

## Bloc 7 — Synthèse finale
**Durée : 45 min** · 15h45 – 16h30

### Activité 1 — Carte mentale des patterns (15 min)
Construire ensemble au tableau :

```
                    Design Patterns
                         │
          ┌──────────────┼──────────────┐
          │              │              │
       Création       Structure     Comportement
       │              │              │
    Singleton      Composite      Iterator
    Factory M.     Decorator      Observer
    Abstract F.                   Visitor
```

### Activité 2 — « Quel pattern choisir ? » (15 min)
Poser des situations, les étudiants répondent :

| Situation | Pattern attendu |
|---|---|
| *« Je veux une seule connexion BDD dans toute l'appli. »* | `Singleton` |
| *« Je veux ajouter du logging et du caching à mes requêtes HTTP sans le modifier. »* | `Decorator` |
| *« J'ai un système de fichiers avec des dossiers et des fichiers, et je veux calculer la taille totale. »* | `Composite` |
| *« Je veux que mes composants d'interface soient tous du même thème. »* | `Abstract Factory` |
| *« Je veux être prévenu quand un produit est de nouveau en stock. »* | `Observer` |
| *« Je veux parcourir un arbre avec un `foreach`. »* | `Iterator` |
| *« Je veux appliquer différents traitements à une liste d'objets de types variés sans `instanceof`. »* | `Visitor` |

### Activité 3 — Ressources pour aller plus loin (5 min)
- [refactoring.guru](https://refactoring.guru/fr/design-patterns) → fiches illustrées de tous les patterns ;
- les patterns non vus mais intéressants à explorer seul : `Adapter`, `Facade`, `Strategy`, `Command` (mentionnés dans le `README.md`) ;
- rappeler que les patterns viennent avec l'expérience : on ne force pas un pattern dans du code qui n'en a pas besoin.

### Mot de fin (10 min)
> *« Vous ne devez pas connaître 23 patterns par cœur. Vous devez savoir reconnaître un problème de design, savoir qu'une solution existe, et savoir où la trouver. C'est ça qui vous rendra meilleurs. »*

---

## Bloc 8 — 🧠 Quiz de fin de Jour 2
**Durée : 30 min** · 16h30 – 17h00

### Format proposé
10 à 15 questions, même format que le quiz du Jour 1.

### Thèmes à couvrir

#### Iterator (3 questions)
- *Quelles interfaces Java faut-il implémenter pour utiliser `foreach` ?*
- *Vrai ou faux : l'itérateur connaît la structure interne de la collection.*
- *Quel est l'avantage principal du pattern Iterator ?*

#### Decorator (3-4 questions)
- *Quelle est la différence entre Decorator et héritage classique ?*
- *Dans l'exemple DataSource, dans quel ordre s'exécutent les décorateurs à l'écriture ?*
- *Vrai ou faux : un décorateur doit implémenter la même interface que l'objet décoré.*
- *Dessinez en 30 secondes un empilement de 2 décorateurs.*

#### Observer (2 questions)
- *Quel est le rôle de l'interface `Subscriber` ?*
- *Citez un exemple concret d'utilisation du pattern Observer.*

#### Visitor (2 questions)
- *Quel problème le pattern Visitor permet-il d'éviter ?*
- *Vrai ou faux : dans Visitor, c'est l'objet visité qui appelle la bonne méthode du visitor.*

#### Transverse (2-3 questions)
- *À quelle famille appartient `Composite` : création, structure ou comportement ?*
- *Quel pattern utiliseriez-vous pour ajouter un cache à un service existant sans le modifier ?*
- *Quel pattern est le plus proche de l'idée "je m'abonne à une chaîne YouTube" ?*

---

## Annexe — Récapitulatif des exercices du module

| # | Pattern | Support | Consigne | Durée |
|---|---|---|---|---:|
| 1 | `Composite` | `src/composite/recette/` | Calculer le prix d'une pizza d'abord naïvement, puis avec Composite | 45 min |
| 2 | `Iterator` | `src/iterator/arbre/` | Rendre un `Arbre` itérable avec `foreach` | 45 min |
| 3 | `Decorator` | `src/decorator/datasource/` | Refactorer `Demo.java` avec des décorateurs empilables | 40 min |

---

## Annexe — Correspondance prérequis POO → patterns

| Prérequis POO | Patterns préparés |
|---|---|
| Classes / objets / encapsulation | tous |
| Héritage | `Factory Method`, `Visitor` |
| Polymorphisme | tous |
| Abstraction / interfaces | `Factory Method`, `Abstract Factory`, `Decorator`, `Observer`, `Visitor` |
| Composition | `Composite`, `Decorator` |
| `static` | `Singleton` |
| SOLID (O, D) | tous |
