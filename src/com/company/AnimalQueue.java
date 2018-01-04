package com.company;

/**
 * author chmyy
 * created on 2018/1/4
 * email fat_chao@163.com.
 */

import java.util.ArrayList;

/**
 * 采用集合来实现
 */
public class AnimalQueue {

    private ArrayList<Pet> mArrayList;
    private long catCount = 0L;
    private long dogCount = 0L;


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

    public AnimalQueue() {
        mArrayList = new ArrayList<>();
    }

    public void add(Pet pet) {
        mArrayList.add(pet);
        if (pet instanceof Cat)
            catCount++;
        else
            dogCount++;

    }


    public void pollCat() {
        for (int i = mArrayList.size() - 1; i >= 0; i--) {
            Pet pet = mArrayList.get(i);
            if (pet instanceof Cat) {
                mArrayList.remove(i);
                catCount--;
            }
        }
    }


    public void pollDog() {
        for (int i = mArrayList.size() - 1; i >= 0; i--) {
            Pet pet = mArrayList.get(i);
            if (pet instanceof Dog) {
                mArrayList.remove(i);
                dogCount--;
            }
        }
    }


    public void pollAll() {
        for (int i = mArrayList.size() - 1; i >= 0; i--) {
            Pet pet = mArrayList.get(i);
            mArrayList.remove(i);
            if (pet instanceof Dog) {
                dogCount--;
            } else {
                catCount--;
            }
        }
    }

    public boolean isEmpty() {
        return mArrayList.isEmpty();
    }

    public boolean isDogEmpty() {
        return dogCount == 0;
    }

    public boolean isCatEmpty() {
        return catCount == 0;
    }


}
