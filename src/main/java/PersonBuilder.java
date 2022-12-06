public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age <=0 || age>150){
            throw new IllegalStateException("Возраст указан некорректно");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name==null || name.equals("")){
            throw new IllegalStateException("Имя не заполнено");
        }
        if (surname==null || surname.equals("")){
            throw new IllegalStateException("Фамилия не заполнена");
        }
        return new Person(name, surname, age, address);
    }
}