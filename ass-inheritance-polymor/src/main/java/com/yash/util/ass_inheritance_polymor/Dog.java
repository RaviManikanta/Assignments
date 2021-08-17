package com.yash.util.ass_inheritance_polymor;

//****************************************************************
//Dog.java
//A class that holds a dog's name, picture, and breed name.
//****************************************************************

import javax.swing.*;

public class Dog extends JPanel
{
protected String name;
private ImageIcon image;
private JLabel namelabel;
private JLabel imglabel;
private JLabel breedlabel;
private JLabel speaklabel;

//------------------------------------------------------------
//Constructor for Dog
//------------------------------------------------------------
public Dog(String name)
{
//sets breed name and displays it
breedlabel = new JLabel("Sample Dog");
add(breedlabel);

JLabel dash = new JLabel (" - ");
add(dash);

//sets user provided value to name and displays it
this.name = name;
namelabel = new JLabel(name);
add(namelabel);

//sets Dog image and displays it
image = new ImageIcon ("dog1.gif");
imglabel = new JLabel(image);
add(imglabel);

//sets speaks JLabel
speaklabel = new JLabel(speak());
add(speaklabel);
}

//------------------------------------------------------------
//Returns the dog's name
//------------------------------------------------------------
public String getName()
{
return name;
}

//------------------------------------------------------------
//Returns a string with the dog's comments
//------------------------------------------------------------
public String speak()
{
return "Woof";
}

//------------------------------------------------------------
//Set Dog's Image to user provided Image
//------------------------------------------------------------
public void setImage(String fileName)
{
image = new ImageIcon (fileName);
imglabel.setIcon(image);
}

//------------------------------------------------------------
//Set Dog's Breed to user provided name
//------------------------------------------------------------
public void setBreed(String breedName)
{
breedlabel.setText(breedName);
}

}
