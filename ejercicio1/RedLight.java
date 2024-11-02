public class RedLight implements TrafficLightState {
    @Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("Cambiando a Verde. Los autos pueden avanzar.");
        trafficLight.setState(new GreenLight());
    }
}
