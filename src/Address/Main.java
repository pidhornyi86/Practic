package Address;

public class Main {
    public static void main(String[] args) {

Address address = new Address();
address.setIndex(37000);
address.setCountry("Ukraine");
address.setCity("Kiyv");
address.setStreet("Drahomanova");
address.setHouse(6);
address.setApartment(130);
        System.out.println("Index: " + address.getIndex());
        System.out.println("Country " + address.getCountry());
        System.out.println("City " + address.getCity());
        System.out.println("Street " + address.getStreet());
        System.out.println("House " + address.getHouse());
        System.out.println("Apartment " + address.getApartment());

    }
}
