package Rubbish;

public enum ConversionFactorPlastic {

    HDPE ("HDPE", 2.45),
    PET1 ("PET1", 3.45);

    private String plasticType;
    private double conversionFactor;

    ConversionFactorPlastic(String plasticType, double conversionFactor) {
        this.plasticType = plasticType;
        this.conversionFactor = conversionFactor;
    }

    public String getPlasticType() {
        return plasticType;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}
