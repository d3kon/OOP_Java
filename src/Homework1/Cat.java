package Homework1;

public class Cat {

    private String name;
    private int age;
    private String nameOwner;

    public String setNameOwner(Owner owner) {
        nameOwner = owner.getName();
        return nameOwner;
    }

    public String getNameOwner() {
        return nameOwner;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public void greet(){
        System.out.println("Мяу! Меня зовут "+ name + ". Мне " + age + " года(лет). Мой владелец - "
                + getNameOwner() + ".");

    }
}