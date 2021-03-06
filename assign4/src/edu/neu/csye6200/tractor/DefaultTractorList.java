package edu.neu.csye6200.tractor;

import java.util.ArrayList;

public class DefaultTractorList {
    private ArrayList<Tractor> tractorArrayList = new ArrayList<>();
    private static DefaultTractorList instance = null;
    private DefaultTractorList() {
        tractorGenerator();
    }
    public static DefaultTractorList getInstance(){
        if (instance == null) instance = new DefaultTractorList();
        return instance;
    }
    private void tractorGenerator(){
        // Tractor 1
        Tractor tr1 = new Tractor();
        tr1.make = "Kubota";
        tr1.model = "B2320";
        tr1.power = 17.2;
        tr1.fuelType = "diesel";
        tr1.fuelCap = 26.1;
        tr1.fuelLoad = 0.9 * tr1.fuelCap;
        tr1.fuelEff = 4.4;
        tr1.setRange(tr1.estRange());
        tr1.setPrice(16000);
        tr1.setOwnerID("Paul");

        // Tractor 2
        Tractor tr2 = new Tractor();
        tr2.make = "Ford";
        tr2.model = "1920";
        tr2.power = 24.8;
        tr2.fuelCap = 37.1;
        tr2.fuelEff = 3.2;
        tr2.setRange(tr2.estRange());
        tr2.setPrice(13000);
        tr2.setOwnerID("James");

        // Tractor 3
        Tractor tr3 = new Tractor();
        tr3.make = "Fiat";
        tr3.model = "500";
        tr3.power = 37.3;
        tr3.fuelCap = 54.1;
        tr3.fuelLoad = 54.1;
        tr3.fuelEff = 2.7;
        tr3.setRange(tr3.estRange());
        tr3.setPrice(5000);
        tr3.setOwnerID("Mark");

        // Tractor 4
        Tractor tr4 = new Tractor();
        tr4.setMake("New Holland");
        tr4.setModel("T4.75");
        tr4.setPower(55.2);
        tr4.setFuelCap(90.1);
        tr4.setFuelEff(3.8);
        tr4.setRange(tr4.estRange());
        tr4.setPrice(39000);
        tr4.setOwnerID("Mia");

        // Tractor 5
        Tractor tr5 = new Tractor();
        tr5.setMake("John Deere");
        tr5.setModel("3303R");
        tr5.setPower(24.6);
        tr5.setFuelCap(44.7);
        tr5.setFuelLoad(44.7);
        tr5.setFuelEff(5.2);
        tr5.setRange(tr5.estRange());
        tr5.setPrice(29900);

        // FrontLoader 1
        FrontLoader fl1 = new FrontLoader();
        fl1.setOwnerID("Mark");

        // FrontLoader 2
        FrontLoader fl2 = new FrontLoader();
        fl2.setMake("Cat");
        fl2.setModel("880T");
        fl2.setPower(40);
        fl2.setFuelCap(58);
        fl2.setFuelEff(5.0);
        fl2.setRange(fl2.estRange());
        fl2.setPrice(14500);
        fl2.setLoaderCap(100000);
        fl2.setLoaderWidth(200);
        fl2.setOwnerID("Mia");

        tractorArrayList.add(tr1);
        tractorArrayList.add(tr2);
        tractorArrayList.add(tr3);
        tractorArrayList.add(tr4);
        tractorArrayList.add(tr5);
        tractorArrayList.add(fl1);
        tractorArrayList.add(fl2);

    }

    public ArrayList<Tractor> getTractorArrayList() {
        return tractorArrayList;
    }

    /**
     * Iterate the tractor list and print each one of it
     * Output error message if the list is empty
     * @param tractorList is an array list created to store the tractor info
     */
    public void listPrint(ArrayList<Tractor> tractorList) {
        // Check if empty
        if (tractorList.isEmpty()) System.out.println("The tractor list is empty\n\n\n");
        else {
            System.out.println("********************************************************************     TRACTOR LIST     ********************************************************************\n");
            for (Tractor tr : tractorList)
                if (tr instanceof FrontLoader) {
                    FrontLoader fl = (FrontLoader) tr;
                    System.out.println(fl);
                } else
                    System.out.println(tr);
            System.out.println("\n*************************************************************************************************************************************************************\n\n\n");
        }
    }
}
