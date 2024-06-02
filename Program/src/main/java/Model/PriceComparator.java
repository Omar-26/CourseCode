/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Comparator;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

/**
 *
 * @author A.Ashraf
 */
public class PriceComparator implements Comparator<Node>
{

   @Override
   public int compare(Node n1, Node n2)
   {
      VBox v1 = (VBox) n1, v2 = (VBox) n2;
      return Integer.valueOf(v1.getAccessibleText()).compareTo(Integer.valueOf(v2.getAccessibleText()));
   }
}
