package com.Pierrot31.insa;

public class petitPackage extends Package{
    public petitPackage(int height, int width, int depth, double weight){
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
    }
    @Override
    public double calculateLocalShippingCost(){
        return prixDimensionGabarit;
    }
}
