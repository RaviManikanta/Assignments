package com.yash.util.ass_inheritance_polymor;

//********************************************************************
//DogTest.java
//A simple test class that creates a Dog and displays a funny picture.
//********************************************************************

import javax.swing.*;

public class DogTest
{
public static void main(String[] args)
{
//Create a panel to which different Dog class objects can be added
JPanel panel = new JPanel();
panel.setLayout (new BoxLayout (panel, BoxLayout.Y_AXIS));

//Create and add Dog object to panel
Dog dog = new Dog("SpikeD");
panel.add(dog);

//Create and add Labrador object to panel

//Create and add JLabel that displays weight of Labrador to the panel

//Create and add Yorkshire object to panel

//Create and add JLabel that displays weight of Yorkshire to the panel

//Create JFrame object and add panel to it
JFrame frame = new JFrame ("Exploring Inheritance");
frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(panel);
frame.pack();
frame.setVisible(true);

}
}