package com.example.demo;

public abstract class AbstractFactory<T>
{
    public AbstractFactory()
    {

    }

    public abstract T create();

    public abstract T createFromRowset();

    public abstract T createAllFromRowset();



}
