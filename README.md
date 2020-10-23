<!-- omit in toc -->
# Java 2 Final Project
This is the official README that I created for this project.

<!-- omit in toc -->
## Table of Contents
- [Origins of Project](#origins-of-project)
- [Characteristics of the Project](#characteristics-of-the-project)
  - [Animation System](#animation-system)

### Origins of Project
I originally started this project back in early 2019 as my final project for my high school's Java 2 Gaming course. We were tasked with a game using the skills/concepts we learned throughout the school year. Being a Sonic fan, I decided to create 2D Sonic platformer similar to the original Sonic games on the [Sega Genesis](https://sonic.fandom.com/wiki/Category:Sega_Mega_Drive_games), [Master System](https://sonic.fandom.com/wiki/Category:Sega_Master_System_games), and [Game Gear](https://sonic.fandom.com/wiki/Category:Game_Gear_games). 

I started to develop the game in early March in my spare time (yeah, I started it before I was even *assigned* the project). 
This was the first project that I worked full time on (actually put time and effort into it). I was so dedicated to the project in fact that I worked on it during my lunch period instead of eating.

Prior to programming the project, I was required to create a summary of the game and its components (story, game mechanics, etc). I pitched the game as being a crossover of [Sonic the Hedgehog](https://en.wikipedia.org/wiki/Sonic_the_Hedgehog) and [Metal Slug](https://en.wikipedia.org/wiki/Metal_Slug). Going into the project, I had a few goals I wanted to accomplish/implement: animations with multiple frames, system to store multiple levels, music system to play and change music, different kinds of enemies, a title screen, multiple characters, etc. I wanted to highlight some of the systems/code that I created:

### Characteristics of the Project
#### Animation System
<img src ="/GitHub Resources/Sonic Intro Gif.gif" width= "1100" height = "500"/>

*Apparently Sonic doesn't like being grayscale.*

One of the topics that we covered in the Java 2 course was drawing Images, specifically using the method below:
```java
Image temp = Toolkit.getDefaultToolkit().getImage("insert path to source here");
```
However, we never went over how to create and display animations in Java. This caused me to start messing around with Toolkit to try and achieve that effect myself. After working on the issue for a few days, I was the first person in my class to implement them in Java as well as one of the few who actually had animations in their final project.

One of the highlights of this system was when I got Sonic's waiting animation to play correctly for the first time.