package com.Pierrot31.insa;

public class moyenPackage  extends Package{
    public moyenPackage(int height, int width, int depth, double weight){
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
    }
    @Override
    public double calculateLocalShippingCost(){
       return (prixPoidsGabarit*this.weight) + frais_fixes;
    }

}
