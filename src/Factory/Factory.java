package Factory;

public class Factory {

    public Transport createCar(Brand brand) {
        Transport transport = null;

        switch (brand) {
            case PEUGEOT:
                transport = new Peugeot();
                break;
            case CITROEN:
                transport = new Citroen();
                break;
            case RENAULT:
                transport = new Renault();
                break;
        }
        return transport;
    }
}
