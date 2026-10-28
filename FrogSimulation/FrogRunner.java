package FrogSimulation;

public class FrogRunner {
    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(dist: 24, numHops: 5);
        System.out.println(sim.simulate());
        System.out.println(sim.simulate());
        System.out.println(sim.simulate());
        System.out.println(sim.simulate());
        System.out.println(sim.simulate());
    }
}
