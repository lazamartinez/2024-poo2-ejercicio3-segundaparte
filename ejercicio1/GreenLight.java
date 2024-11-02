public class GreenLight implements TrafficLightState {
    @Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("Cambiando a Amarillo. Reducir velocidad.");
        trafficLight.setState(new YellowLight());
    }
}
