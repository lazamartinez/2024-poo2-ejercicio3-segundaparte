public class YellowLight implements TrafficLightState {
    @Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("Cambiando a Rojo. Prepararse para detenerse.");
        trafficLight.setState(new RedLight());
    }
}
