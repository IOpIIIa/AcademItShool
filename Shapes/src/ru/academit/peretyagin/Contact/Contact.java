package ru.academit.peretyagin.Contact;

public class Contact {
    public static void main(String[] args) {

        Person person = new Person("Ivanov", "Ivan", "+79123456789");
        person.print();

        person.setFirstName("Yuriy");
        person.setLastName("Peretyagin");
        person.setPhone("+79513629090");

        person.print();
        System.out.println();

        person.setFirstName("Margo");
        person.setLastName("Peretyagina");
        person.setPhone("+79513628989");

        person.print();

    }
}
