package openga.objectiveFunction;

/**
 * <p>Title: The OpenGA project</p>
 * <p>Description: The project is to build general framework of Genetic algorithm and problem independent.</p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: Yuan-Ze University</p>
 * @author Chen, Shih-Hsin
 * @version 1.0
 */


public class objClass {
  public objClass() {
  }
  int numberOfObjectives;

  /**
   * @param num The number of objectives. The componet
   */
  public void setNumberOfObjectives(int num){
    this.numberOfObjectives = num;
  }

  public static void main(String[] args) {
    objClass objClass1 = new objClass();
  }

}