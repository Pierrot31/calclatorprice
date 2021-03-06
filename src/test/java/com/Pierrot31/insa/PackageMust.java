package com.Pierrot31.insa;

import org.junit.Before;

import org.junit.Test;



import java.io.ByteArrayOutputStream;

import java.io.PrintStream;





import static com.Pierrot31.insa.Test.testParameters;

import static org.hamcrest.CoreMatchers.containsString;

import static org.hamcrest.MatcherAssert.assertThat;
public class PackageMust {

    private ByteArrayOutputStream out;



    @Before

    public void setUp(){

        out = new ByteArrayOutputStream();

        System.setOut(new PrintStream(out));

    }

    @Test

    public void premiereLigne(){

        Object [ ] laPremiereLigneDuTableau = testParameters[0];



        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();

        int laLongueur = Integer.parseInt(laLongueurAsText);



        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();

        int laProfondeur = Integer.parseInt(laProfondeurAsText);



        String laLargeurAsText = laPremiereLigneDuTableau[1].toString();

        int laLargeur = Integer.parseInt(laLargeurAsText);



        String lePoidsAsText = laPremiereLigneDuTableau[3].toString();

        Double lePoids = Double.parseDouble(lePoidsAsText);



        String laDestinationAsText = laPremiereLigneDuTableau[4].toString();

        Destination laDestination= Destination.valueOf(laDestinationAsText);



        String lePrixAsText = laPremiereLigneDuTableau[5].toString();



        PackageFactory paquetAtester = new PackageFactory(laLongueur,laProfondeur,laLargeur,lePoids);



        ShippingCostsCalculator scc = new ShippingCostsCalculator();

        double calculate = scc.calculateShippingCost(paquetAtester.monPackage, laDestination);

        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");

        String nbArrondi = df.format(calculate);

        System.out.print(nbArrondi);



        String expectedOutput = lePrixAsText ;

        assertThat(standardOutput(), containsString(expectedOutput));

    }

    @Test

    public void deuxiemeLigne(){

        Object [ ] laPremiereLigneDuTableau = testParameters[1];



        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();

        int laLongueur = Integer.parseInt(laLongueurAsText);



        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();

        int laProfondeur = Integer.parseInt(laProfondeurAsText);



        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();

        int laLargeur = Integer.parseInt(laLargeurAsText);



        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();

        Double lePoids = Double.parseDouble(lePoidsAsText);



        String laDestinationAsText = laPremiereLigneDuTableau[4].toString();

        Destination laDestination= Destination.valueOf(laDestinationAsText);



        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();



        PackageFactory paquetAtester = new PackageFactory(laLongueur,laProfondeur,laLargeur,lePoids);



        ShippingCostsCalculator scc = new ShippingCostsCalculator();

        double calculate = scc.calculateShippingCost(paquetAtester.monPackage,laDestination);



        java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");

        String nbArrondi = df.format(calculate);

        System.out.println(nbArrondi);



        String expectedOutput = lePrixAsText ;

        assertThat(standardOutput(), containsString(expectedOutput));

    }



    @Test

    public void troisièmeLigne(){

        Object [ ] laPremiereLigneDuTableau = testParameters[2];



        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();

        int laLongueur = Integer.parseInt(laLongueurAsText);



        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();

        int laProfondeur = Integer.parseInt(laProfondeurAsText);



        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();

        int laLargeur = Integer.parseInt(laLargeurAsText);



        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();

        Double lePoids = Double.parseDouble(lePoidsAsText);



        String laDestinationAsText = laPremiereLigneDuTableau[4].toString();

        Destination laDestination= Destination.valueOf(laDestinationAsText);



        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();

        PackageFactory paquetAtester = new PackageFactory(laLongueur,laProfondeur,laLargeur,lePoids);



        ShippingCostsCalculator scc = new ShippingCostsCalculator();

        double calculate = scc.calculateShippingCost(paquetAtester.monPackage,laDestination);

        java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");

        String nbArrondi = df.format(calculate);

        System.out.println(nbArrondi);



        String expectedOutput = lePrixAsText ;

        assertThat(standardOutput(), containsString(expectedOutput));

    }



    @Test

    public void quatrièmeLigne(){

        Object [ ] laPremiereLigneDuTableau = testParameters[3];



        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();

        int laLongueur = Integer.parseInt(laLongueurAsText);



        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();

        int laProfondeur = Integer.parseInt(laProfondeurAsText);



        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();

        int laLargeur = Integer.parseInt(laLargeurAsText);



        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();
        Double lePoids = Double.parseDouble(lePoidsAsText);
        String laDestinationAsText = laPremiereLigneDuTableau[4].toString();
        Destination laDestination= Destination.valueOf(laDestinationAsText);
        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();
        PackageFactory paquetAtester = new PackageFactory(laLongueur,laProfondeur,laLargeur,lePoids);
        ShippingCostsCalculator scc = new ShippingCostsCalculator();
        double calculate = scc.calculateShippingCost(paquetAtester.monPackage, laDestination);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");
        String nbArrondi = df.format(calculate);
        System.out.println(nbArrondi);
        String expectedOutput = lePrixAsText ;
        assertThat(standardOutput(), containsString(expectedOutput));

    }



    @Test

    public void cinquiemeLigne(){

        Object [ ] laPremiereLigneDuTableau = testParameters[4];



        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();

        int laLongueur = Integer.parseInt(laLongueurAsText);



        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();

        int laProfondeur = Integer.parseInt(laProfondeurAsText);



        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();

        int laLargeur = Integer.parseInt(laLargeurAsText);



        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();

        double lePoids = Double.parseDouble(lePoidsAsText);



        String laDestinationAsText = laPremiereLigneDuTableau[4].toString();

        Destination laDestination= Destination.valueOf(laDestinationAsText);



        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();



        PackageFactory paquetAtester = new PackageFactory(laLongueur,laProfondeur,laLargeur,lePoids);



        ShippingCostsCalculator scc = new ShippingCostsCalculator();

        double calculate = scc.calculateShippingCost(paquetAtester.monPackage,laDestination);

        java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");

        String nbArrondi = df.format(calculate);

        System.out.println(nbArrondi);



        String expectedOutput = lePrixAsText ;

        assertThat(standardOutput(), containsString(expectedOutput));

    }



    @Test

    public void sixiemeLigne(){

        Object [ ] laPremiereLigneDuTableau = testParameters[5];



        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();

        int laLongueur = Integer.parseInt(laLongueurAsText);



        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();

        int laProfondeur = Integer.parseInt(laProfondeurAsText);



        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();

        int laLargeur = Integer.parseInt(laLargeurAsText);



        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();

        Double lePoids = Double.parseDouble(lePoidsAsText);



        String laDestinationAsText = laPremiereLigneDuTableau[4].toString();

        Destination laDestination= Destination.valueOf(laDestinationAsText);



        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();



        PackageFactory paquetAtester = new PackageFactory(laLongueur,laProfondeur,laLargeur,lePoids);



        ShippingCostsCalculator scc = new ShippingCostsCalculator();

        double calculate = scc.calculateShippingCost(paquetAtester.monPackage,laDestination);

        java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");

        String nbArrondi = df.format(calculate);

        System.out.println(nbArrondi);



        String expectedOutput = lePrixAsText ;

        assertThat(standardOutput(), containsString(expectedOutput));

    }



    @Test

    public void septiemeLigne(){

        Object [ ] laPremiereLigneDuTableau = testParameters[6];



        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();

        int laLongueur = Integer.parseInt(laLongueurAsText);



        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();

        int laProfondeur = Integer.parseInt(laProfondeurAsText);



        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();

        int laLargeur = Integer.parseInt(laLargeurAsText);



        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();

        Double lePoids = Double.parseDouble(lePoidsAsText);



        String laDestinationAsText = laPremiereLigneDuTableau[4].toString();

        Destination laDestination= Destination.valueOf(laDestinationAsText);



        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();





        PackageFactory paquetAtester = new PackageFactory(laLongueur,laProfondeur,laLargeur,lePoids);



        ShippingCostsCalculator scc = new ShippingCostsCalculator();

        double calculate = scc.calculateShippingCost(paquetAtester.monPackage,laDestination);

        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");

        String nbArrondi = df.format(calculate);

        System.out.println(nbArrondi);



        String expectedOutput = lePrixAsText ;

        assertThat(standardOutput(), containsString(expectedOutput));

    }

    @Test

    public void huitiemeLigne(){

        Object [] laPremiereLigneDuTableau = testParameters[7];


        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();
        int laLongueur = Integer.parseInt(laLongueurAsText);



        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();

        int laProfondeur = Integer.parseInt(laProfondeurAsText);



        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();

        int laLargeur = Integer.parseInt(laLargeurAsText);



        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();

        Double lePoids = Double.parseDouble(lePoidsAsText);



        String laDestinationAsText = laPremiereLigneDuTableau[4].toString();

        Destination laDestination= Destination.valueOf(laDestinationAsText);



        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();



        PackageFactory paquetAtester = new PackageFactory(laLongueur,laProfondeur,laLargeur,lePoids);



        ShippingCostsCalculator scc = new ShippingCostsCalculator();

        double calculate = scc.calculateShippingCost(paquetAtester.monPackage,laDestination);

        java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");

        String nbArrondi = df.format(calculate);

        System.out.println(nbArrondi);



        String expectedOutput = lePrixAsText ;

       assertThat(standardOutput(), containsString(expectedOutput));

    }

    @Test

    public void neuviemeLigne(){

        Object [ ] laPremiereLigneDuTableau = testParameters[8];



        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();

        int laLongueur = Integer.parseInt(laLongueurAsText);



        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();

        int laProfondeur = Integer.parseInt(laProfondeurAsText);



        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();

        int laLargeur = Integer.parseInt(laLargeurAsText);



        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();

        Double lePoids = Double.parseDouble(lePoidsAsText);



        String laDestinationAsText = laPremiereLigneDuTableau[4].toString();

        String[] part = laDestinationAsText.split("/");

        Destination laDestination= Destination.valueOf(part[0]+"_"+part[1]);





        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();



        PackageFactory paquetAtester = new PackageFactory(laLongueur,laProfondeur,laLargeur,lePoids);



        ShippingCostsCalculator scc = new ShippingCostsCalculator();

        double calculate = scc.calculateShippingCost(paquetAtester.monPackage,laDestination);

        java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");

        String nbArrondi = df.format(calculate);

        System.out.println(nbArrondi);



        String expectedOutput = lePrixAsText ;

        assertThat(standardOutput(), containsString(expectedOutput));

    }

    @Test

    public void dixiemeLigne(){

        Object [ ] laPremiereLigneDuTableau = testParameters[9];



        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();

        int laLongueur = Integer.parseInt(laLongueurAsText);



        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();

        int laProfondeur = Integer.parseInt(laProfondeurAsText);



        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();

        int laLargeur = Integer.parseInt(laLargeurAsText);



        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();

        Double lePoids = Double.parseDouble(lePoidsAsText);



        String laDestinationAsText = laPremiereLigneDuTableau[4].toString();

        String[] part = laDestinationAsText.split("/");

        Destination laDestination= Destination.valueOf(part[0]+"_"+part[1]);



        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();



        PackageFactory paquetAtester = new PackageFactory(laLongueur,laProfondeur,laLargeur,lePoids);



        ShippingCostsCalculator scc = new ShippingCostsCalculator();

        double calculate = scc.calculateShippingCost(paquetAtester.monPackage,laDestination);

        java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");

        String nbArrondi = df.format(calculate);

        System.out.println(nbArrondi);



        String expectedOutput = lePrixAsText ;

        assertThat(standardOutput(), containsString(expectedOutput));

    }

    @Test

    public void onziemeLigne(){

        Object [ ] laPremiereLigneDuTableau = testParameters[10];



        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();

        int laLongueur = Integer.parseInt(laLongueurAsText);



        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();

        int laProfondeur = Integer.parseInt(laProfondeurAsText);



        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();

        int laLargeur = Integer.parseInt(laLargeurAsText);
        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();
        Double lePoids = Double.parseDouble(lePoidsAsText);
        String laDestinationAsText = laPremiereLigneDuTableau[4].toString();
        String[] part = laDestinationAsText.split("/");
       Destination laDestination= Destination.valueOf(part[0]+"_"+part[1]);
       String lePrixAsText =  laPremiereLigneDuTableau[5].toString();
        PackageFactory paquetAtester = new PackageFactory(laLongueur,laProfondeur,laLargeur,lePoids);
        ShippingCostsCalculator scc = new ShippingCostsCalculator();
       double calculate = scc.calculateShippingCost(paquetAtester.monPackage,laDestination);
       java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");
       String nbArrondi = df.format(calculate);
        System.out.println(nbArrondi);
        String expectedOutput = lePrixAsText ;
        assertThat(standardOutput(), containsString(expectedOutput));

    }

    @Test

    public void douziemeLigne(){
        Object [ ] laPremiereLigneDuTableau = testParameters[11];
        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();
        int laLongueur = Integer.parseInt(laLongueurAsText);
        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();
        int laProfondeur = Integer.parseInt(laProfondeurAsText);
        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();
        int laLargeur = Integer.parseInt(laLargeurAsText);
        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();
        Double lePoids = Double.parseDouble(lePoidsAsText);
        String laDestinationAsText = laPremiereLigneDuTableau[4].toString();
        String[] part = laDestinationAsText.split("/");
        Destination laDestination= Destination.valueOf(part[0]+"_"+part[1]);
        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();
        PackageFactory paquetAtester = new PackageFactory(laLongueur,laProfondeur,laLargeur,lePoids);
        ShippingCostsCalculator scc = new ShippingCostsCalculator();
        double calculate = scc.calculateShippingCost(paquetAtester.monPackage,laDestination);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");
        String nbArrondi = df.format(calculate);
        System.out.println(nbArrondi);
        String expectedOutput = lePrixAsText ;
        assertThat(standardOutput(), containsString(expectedOutput));
    }

    private String standardOutput(){

        return out.toString();

    }

}