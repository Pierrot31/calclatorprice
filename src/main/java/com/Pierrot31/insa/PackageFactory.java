package com.Pierrot31.insa;

public class PackageFactory {
    protected static int DIMENSIONSGABARIT = 229 * 162 * 25;
    protected static double weightGabaritlimite = 1.800;

    protected Package monPackage;


    public PackageFactory(int height, int depth, int width, double weight) {
        int volume = height * depth * width;

        if (volume <= DIMENSIONSGABARIT) {
            this.monPackage = new petitPackage(height, depth, width, weight);
        } else if (weight <= weightGabaritlimite) {
            this.monPackage = new moyenPackage(height, depth, width, weight);
        } else {
            this.monPackage = new BigPackage(volume, weight);
        }
    }
}
