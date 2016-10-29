package com.hst.andrew.hstworkout;



import java.io.Serializable;

/**
 * Created by Stuff on 16/10/2016.
 */
@org.parceler.Parcel
public class Excercise implements Serializable{
     String name;

     int [] fifteenrm;
     int [] tenrm;
     int [] fiverm;

    public Excercise(String name, int[] fifteenrm, int[] tenrm, int[] fiverm) {
        this.name = name;
        this.fifteenrm = fifteenrm;
        this.tenrm = tenrm;
        this.fiverm = fiverm;
    }
    public Excercise(){}

    /*public static final Parcelable.Creator<Excercise> CREATOR
            = new Parcelable.Creator<Excercise>() {
        public Excercise createFromParcel(Parcel in) {
            return new Excercise(in);
        }
        public Excercise[] newArray(int size) {
            return new Excercise[size];
        }
    };

    private Excercise(Parcel in) {

        name = in.readString();
        fifteenrm = in.createIntArray();
        tenrm = in.createIntArray();
        fiverm = in.createIntArray();
    }
    */
    public Excercise(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getFifteenrm() {
        return fifteenrm;
    }

    public void setFifteenrm(int[] fifteenrm) {
        this.fifteenrm = fifteenrm;
    }

    public int[] getTenrm() {
        return tenrm;
    }

    public void setTenrm(int[] tenrm) {
        this.tenrm = tenrm;
    }

    public int[] getFiverm() {
        return fiverm;
    }

    public void setFiverm(int[] fiverm) {
        this.fiverm = fiverm;
    }

    /*@Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeIntArray(fifteenrm);
        dest.writeIntArray(tenrm);
        dest.writeIntArray(fiverm);
    }
    */
}
