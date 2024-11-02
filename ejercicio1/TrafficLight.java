public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        // Estado inicial: Rojo
        this.state = new RedLight();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void changeState() {
        this.state.changeState(this);
    }
}
