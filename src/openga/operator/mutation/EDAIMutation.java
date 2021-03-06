package openga.operator.mutation;

/**
 * <p>Title: The OpenGA project which is to build general framework of Genetic algorithm.</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: Yuan-Ze University</p>
 * @author Chen, Shih-Hsin
 * @version 1.0
 */

public interface EDAIMutation extends MutationI{
  public void setEDAinfo(double container[][], int numberOfTournament);
  public void setEDAinfo(double[][] container, double[][] inter, int numberOfMutationTournament);
}