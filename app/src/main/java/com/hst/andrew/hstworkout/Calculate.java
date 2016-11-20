package com.hst.andrew.hstworkout;

/**
 * Created by Stuff on 17/10/2016.
 */

public class Calculate {


    //Todo : split values from text boxes and sort into arrays for calculation -- done
    //Todo : calculate the 5 previous workout values  for the cycle for each rep range -- done
    public int[] work(int[] val){
        int[] ex1 = new int[3];
        int[] ex2 = new int[3];
        int[] ex3 = new int[3];
        int[] ex4 = new int[3];
        int[] ex5 = new int[3];
        int[] ex6 = new int[3];
        int[] ex7 = new int[3];
        int[] ex8 = new int[3];
        int[] ex9 = new int[3];

        int[] fin = val;
        int flag = 0;
      for(int i=0;i<=val.length-1;i++){
          if(flag ==3)
              flag =0;
        if(i<=3){
            ex1[flag] = val[i];
        }
          else if(i>3 && i <= 7){
            ex2[flag] = val[i];

        }
        else if(i>7 && i <= 11){
            ex3[flag] = val[i];

        }
        else if(i>11 && i <= 15){
            ex4[flag] = val[i];

        }
        else if(i>15 && i <= 19){
            ex5[flag] = val[i];

        }
        else if(i>19 && i <= 23){
            ex6[flag] = val[i];

        }
        else if(i>23 && i <= 27){
            ex7[flag] = val[i];

        }
        else if(i>27 && i <= 31){
            ex8[flag] = val[i];

        }
        else if(i>31 && i <= 35){
            ex9[flag] = val[i];

        }


      }

        return fin;

    }

    public int minus(int a, int decrement){
        return a - decrement;
    }

    public int[] reps(int [] ex){
        //int index = ex.length -1;
        int decrement =ex[ex.length-1];
       int[] fifteenrep = new int[5];
        int[] tenrep = new int[5];
        int[] fiverep = new int[5];

        int currentfiteen = ex[0], currentten=ex[1],currentfive =ex[2];
        for(int i=4;i>=0;i--){

            fifteenrep[i] = minus(currentfiteen, decrement);
            tenrep[i] = minus(currentten, decrement);
            fiverep[i] = minus(currentfive, decrement);

            currentfiteen = minus(currentfiteen,decrement);
            currentten = minus(currentten, decrement);
            currentfive = minus(currentfive, decrement);
        }
        fifteenrep[5] = ex[0];
        tenrep[5] = ex[1];
        fiverep[5] = ex[2];
        int[] finalreps = new int[fifteenrep.length + tenrep.length + fiverep.length];

        //kinda dodgy
        System.arraycopy(fifteenrep,0,finalreps,0,fifteenrep.length);
        System.arraycopy(tenrep,0,finalreps,fifteenrep.length, tenrep.length);
        System.arraycopy(fiverep,0,finalreps,fifteenrep.length + tenrep.length, fiverep.length);


        return finalreps;
    }



}
