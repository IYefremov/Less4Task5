// Hide all the field and methods which allow to change the inner state of the class(Encapsulation).

package com.less4Task5Package;

public class Task {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzic", 4, 5);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;

        private Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public int getAge() {

            return age;
        }

        public void setAge(int age) {

            this.age = age;
        }
    }

}
