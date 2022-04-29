package org.example;

@Singleton
public class RecommendatorImpl implements Recommendator {
    @InjectProperty("wisky")
    private String alcohol;

    public RecommendatorImpl() {
        System.out.println("recomendator was created");
    }

    @Override
    public void recomend() {
        System.out.println("to protect from covid-2019 drink, " + alcohol);
    }
}
