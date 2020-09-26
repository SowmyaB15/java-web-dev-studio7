package org.launchcode.studio7;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int currentStorage;

    public BaseDisc(int storage, String name){
        this.storageCapacity = storage;
        this.currentStorage = storage;
        this.name = name;
    }
    public int getStorageCapacity()
    {
        return storageCapacity;
    }

    public int getCurrentStorage()
    {
        return currentStorage;
    }

    public void setCurrentStorage(int currentStorage)
    {
        this.currentStorage = currentStorage;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

//    public void load() {
//
//    }

}
