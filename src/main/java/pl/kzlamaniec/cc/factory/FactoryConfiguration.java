package pl.kzlamaniec.cc.factory;

public class FactoryConfiguration {
    public static Boss getResponsible() {
        return new Boss("Tonny", new Worker());
    }
}
