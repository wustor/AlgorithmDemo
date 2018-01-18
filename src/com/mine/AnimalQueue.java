package com.mine;

/**
 * author chmyy
 * created on 2018/1/4
 * email fat_chao@163.com.
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1.用两个队列分别来存储猫跟狗
 * 2.然后给每个type加一个数量的标志
 */
public class AnimalQueue {

    private long count = 0L;
    private Queue<Animal> catQueue;
    private Queue<Animal> dogQueue;


    public static class Pet {
        private String type;

        public Pet(String type) {
            this.type = type;
        }

        public String getPetType() {
            return this.type;
        }
    }

    public static class Dog extends Pet {
        public Dog() {
            super("dog");
        }
    }

    public static class Cat extends Pet {
        public Cat() {
            super("cat");
        }
    }


    public class Animal {
        Pet pet;
        Long position;

        public Animal(Pet pet, long position) {
            this.pet = pet;
            this.position = position;
        }

        public Pet getPet() {
            return pet;
        }

        public Long getPosition() {
            return position;
        }
    }

    public AnimalQueue() {
        catQueue = new LinkedList<>();
        dogQueue = new LinkedList<>();

    }

    public void add(Pet pet) {
        if (pet == null)
            throw new RuntimeException("add 动物类型为空");
        else {
            Animal animal = new Animal(pet, count++);
            if ("cat".equals(pet.getPetType())) {
                catQueue.add(animal);
            } else if ("dog".equals(pet.getPetType())) {
                dogQueue.add(animal);
            }
        }


    }


    public void pollCat() {
        while (!isCatEmpty()) {
            Animal pet = catQueue.poll();
            System.out.println(pet.getPosition());

        }
    }


    public void pollDog() {
        while (!isDogEmpty()) {
            Animal pet = dogQueue.poll();
            System.out.println(pet.getPosition());

        }
    }


    public void pollAll() {
        if (!isCatEmpty() && isDogEmpty()) {
            //有猫无狗,只弹猫
            pollCat();
        } else if (!isDogEmpty() && isCatEmpty()) {
            //有狗无猫
            pollDog();
        } else if (!isCatEmpty() && !isDogEmpty()) {
            //有猫有狗
            Long catPosition = catQueue.peek().getPosition();
            Long dogPosition = dogQueue.peek().getPosition();
            if (catPosition.compareTo(dogPosition) < 0) {
                //猫在前
                Animal pet = catQueue.poll();
                System.out.println(pet.getPosition());
            } else {
                //狗在前
                Animal pet = dogQueue.poll();
                System.out.println(pet.getPosition());

            }
            //递归调用
            pollAll();
        }


    }

    public boolean isEmpty() {
        return isDogEmpty() && isCatEmpty();
    }

    public boolean isDogEmpty() {
        return dogQueue.isEmpty();
    }

    public boolean isCatEmpty() {
        return catQueue.isEmpty();
    }


    public static void main(String[] args) {
        AnimalQueue animalQueue = new AnimalQueue();
        animalQueue.add(new Cat());//0
        animalQueue.add(new Dog());//1
        animalQueue.add(new Dog());//2
        animalQueue.add(new Cat());//3
        animalQueue.add(new Cat());//4
        animalQueue.add(new Cat());//5
        animalQueue.add(new Cat());//6
        animalQueue.add(new Cat());//7
        animalQueue.add(new Cat());//8
        // animalQueue.pollAll();
         animalQueue.pollCat();
        //animalQueue.pollDog();


    }

}
