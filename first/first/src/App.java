public class App {
    public static void main(String[] args) throws Exception {
        PersonServices personServices = new PersonServices();

        Person person = new Person();
        person.id = 0;
        person.name ="Hakan";
        person.surName = "SarıBaş";
        person.identityNymber = "11111111111";
        person.phoneNumber = "00000000000";

        personServices.PersonAdd(person);

        personServices.PersonDisplay();
    }
}
