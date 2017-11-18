package com.Pierrot31.insa;

public class BigPackage extends Package {
    public BigPackage(int volume, double weight){
        this.volume = volume;
        this.weight = weight;
    }
    @Override
    public double calculateLocalShippingCost(){
        double volume_dm = (double)  this.volume/1000000;
        double tarif_volume = volume_dm * prixdmCube;
        double tarif_poids =this.weight *prixKg;
        double tarif;

        if(tarif_poids < tarif_volume){
           tarif = tarif_volume;
        }else{
            tarif = tarif_poids;
        }
        return tarif;
    }
}
