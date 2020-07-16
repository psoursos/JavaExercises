/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family;

import java.util.List;

/**
 *
 * @author petros
 */
public class Person {
    
    private String name;
    private byte age;
    private List <Pet> pets;

    public Person() {
    }

    public Person(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, byte age, List<Pet> pets) {
        this.name = name;
        this.age = age;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", pets=" + pets + '}';
    }
    
    
    
}
