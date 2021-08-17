package com.yash.util.ass_inheritance_polymor;

//****************************************************************
//Labrador.java
//A class derived from Dog that holds information about
//a labrador retriever. Overrides Dog speak method and includes
//information about avg weight for this breed.
//****************************************************************

public class Labrador extends Dog
{
private String color; //black, yellow, or chocolate?


public Labrador(String name, String color, String fileName)
{
this.color = color;
}

//------------------------------------------------------------
//Big bark -- overrides speak method in Dog
//------------------------------------------------------------
public String speak()
{
return "WOOF";
}

//------------------------------------------------------------
//Returns weight
//------------------------------------------------------------


}
