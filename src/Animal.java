class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
    public int sound(Integer arg){
        return arg;
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
