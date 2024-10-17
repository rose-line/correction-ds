package fr.pgah;

import java.util.Scanner;
import java.util.Random;

public class App {

  // Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.
  // Entrez un nombre:36
  // Vous proposez:36
  // Le nombre auquel je pensais était:47
  // Vous étiez à 11 de la bonne réponse.

  public static void main(String[] args) {
    // Initialiser les coordonnées du centre
    int cx = 100;
    int cy = 100;
    // Demander le rayon
    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez le rayon : ");
    int rayon = clavier.nextInt();
    // Générer le nombre entre 0 et 2
    Random rand = new Random();
    int nbAleatoire = rand.nextInt(3);
    // Déterminer la couleur à partir de l'entier généré
    String couleur;
    if (nbAleatoire == 0) {
      couleur = "red";
    } else if (nbAleatoire == 1) {
      couleur = "green";
    } else {
      couleur = "black";
    }
    String svg = "<svg width='100' height='100'><circle cx='" + cx + "' cy='" + cy + "' r='" + rayon
        + "' fill='" + couleur + "' /></svg>";
    System.out.println(svg);
  }
}
