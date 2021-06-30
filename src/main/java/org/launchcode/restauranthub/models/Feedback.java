package org.launchcode.restauranthub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Feedback {
   @Id
   @GeneratedValue
   private int id;
   private String nameOfRestaurant;
   private String review;

   public Feedback() {
   }

   public Feedback(String nameOfRestaurant, String review) {
      this.nameOfRestaurant = nameOfRestaurant;
      this.review = review;
   }

   public String getNameOfRestaurant() {
      return nameOfRestaurant;
   }

   public String getReview() {
      return review;
   }

   public void setReview(String review) {
      this.review = review;
   }

   public void setNameOfRestaurant(String nameOfRestaurant) {
      this.nameOfRestaurant = nameOfRestaurant;
   }

   public int getId() {
      return id;
   }
}
