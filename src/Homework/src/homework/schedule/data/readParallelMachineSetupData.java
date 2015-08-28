package homework.schedule.data;
import java.io.*;
import java.util.*;
/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class readParallelMachineSetupData {
  public readParallelMachineSetupData() {
  }
  String type = "Balanced";//Balanced, DominantProcessing, DominantSetupTime
  String fileName = "", message = "";
  int numberOfMachines = 2;
  int numberOfJobs = 20;
  int processingTime[][];
  int processingSetupTime[][][];

  public void setData(String type, String fileName){
    this.type = type;
    this.fileName = fileName;

    this.fileName = fileName;
    if( fileName == null ){
        System.out.println( "Specify the file name please.");
        System.exit(1);
    }
  }

  public void getDataFromFile(){
    try
    {
        File file = new File( fileName );
        FileInputStream fis = new FileInputStream( file );
        FileReader fr = new FileReader(fileName);
        //System.out.println("Ū���ɮ�ok\n");

        //Ū���@�Ӧr��
        int c = fr.read();
        while(c != -1){                         //�O�_��F�̫�@��
           message += (char)c;                  //ANSI�ରchar
           c = fr.read();                       //�O�_�n����
        }//end while

        fr.close();
        //System.out.println(message);
        StringTokenizer tokens = new StringTokenizer(message);
        //set the coordinates of depot.
        int length = 0;

        //to set the coordination and demand of each customer
        numberOfMachines = Integer.parseInt(tokens.nextToken());
        int size = numberOfJobs = Integer.parseInt(tokens.nextToken());
        processingTime = new int[numberOfJobs][numberOfMachines];
        processingSetupTime = new int[numberOfMachines][numberOfJobs][numberOfJobs];

        //processing time of each job on each machine
        for(int i = 0 ; i < numberOfJobs ; i ++ ){//job
          for(int j = 0 ; j < numberOfMachines ; j ++ ){
            processingTime[i][j] = Integer.parseInt(tokens.nextToken());
          }
        }
        //processing time with setup of each job on each machine
        for(int i = 0 ; i < numberOfMachines ; i ++ ){
          for(int j = 0 ; j < numberOfJobs ; j ++ ){
            for(int k = 0 ; k < numberOfJobs ; k ++ ){
             processingSetupTime[i][j][k] = processingTime[k][i] + Integer.parseInt(tokens.nextToken());
            }
          }
        }
    }   //end try
    catch( Exception e )
    {
        e.printStackTrace();
        System.out.println(e.toString());
    }   // end catch
    //System.out.println( "done" );
  }

  public int[][][] getProcessingSetupTime(){
    return processingSetupTime;
  }

  public int getSize(){
    return numberOfJobs;
  }

}