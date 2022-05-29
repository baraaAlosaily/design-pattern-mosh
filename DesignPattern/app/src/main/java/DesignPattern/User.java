package DesignPattern;

public class User  {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("My name is"+name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}