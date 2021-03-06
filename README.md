[//]: # (Note!, for adding margin to images it goes- top margin, bottom margin, right margin, left margin)
<!-- omit in toc -->
# Java 2 Final Project
This is a 2D-platform fan-game inspired by the likes of *Sonic the Hedgehog* and *Metal Slug*.

![Java version](https://img.shields.io/badge/java%20ver-12-brightgreen)
![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/GeoDash897/Java-2-Final-Project?color=light&include_prereleases)
![GitHub commits since latest release (by date including pre-releases)](https://img.shields.io/github/commits-since/GeoDash897/Java-2-Final-Project/latest?include_prereleases&logo=GitHub)
![GitHub repo size](https://img.shields.io/github/repo-size/GeoDash897/Java-2-Final-Project?logo=GitHub)
<img src = "/GitHub Resources/Gameplay.gif" width = 1100 height = "500"/>

<!-- omit in toc -->
## Table of Contents
- [Things of Note](#things-of-note)
- [Installation](#installation)
  - [Things to Look Out For](#things-to-look-out-for)
- [Origins of Project](#origins-of-project)
- [Characteristics of the Project](#characteristics-of-the-project)
  - [Animation System](#animation-system)
  - [Title Screen](#title-screen)
  - [Continue Screen](#continue-screen)
  - [Timer](#timer)
  - [Power-Ups](#power-ups)
  - [Music](#music)
- [Controls](#controls)

## Things of Note 
When I created this project, I had very little understanding of the concepts of coding- including the concepts of objects, classes, the difference between public and private variables, the usage of static variables, etc. This is reflected in the code of this project- shown by how I had the genius idea of programming the entire game in a *single* class. 

Note that if I had done the project more recently, I would have done it in a much more coherent way (actually using the proper modifiers for variables, using classes, objects, etc). Keep this in mind as you view the project and its code.

## Installation
1. **Download** the zip, including the **exe** file in binaries.
2. **Unzip** the file.
3. Move the **exe** into the unzipped folder- it should be located in the same folder as the **src** folder

### Things to Look Out For
1. The only files that you really need in order to play the game are the files in the src folder and the exe itself. The other folders are just remnants of working on the project in NetBeans- so you can delete these files/folders if you want to.
2. Make sure that the exe file is located in the same folder as the src folder- this is so that the program can have access to correct images and sounds.
3. Your anti-virus might flag the exe as being malware/a virus- this is normal. If this happens, just accept the exe.

## Origins of Project
I originally started this project back in early 2019 as my final project for my high school's Java 2 Gaming course. We were tasked with a game using the skills/concepts we learned throughout the school year. Being a Sonic fan, I decided to create 2D Sonic platformer similar to the original Sonic games on the [Sega Genesis](https://sonic.fandom.com/wiki/Category:Sega_Mega_Drive_games), [Master System](https://sonic.fandom.com/wiki/Category:Sega_Master_System_games), and [Game Gear](https://sonic.fandom.com/wiki/Category:Game_Gear_games). 

I started to develop the game in early March in my spare time (yeah, I started it before I was even *assigned* the project). 
This was the first project that I worked full time on (actually put time and effort into it). I was so dedicated to the project in fact that I worked on it during my lunch period instead of eating. Furthermore, it was the one of the first projects that 

Prior to programming the project, I was required to create a summary of the game and its components (story, game mechanics, etc). I pitched the game as being a crossover of [Sonic the Hedgehog](https://en.wikipedia.org/wiki/Sonic_the_Hedgehog) and [Metal Slug](https://en.wikipedia.org/wiki/Metal_Slug). 

**Going into the project, I had a few goals I wanted to accomplish/implement**: animations with multiple frames, system to store multiple levels, music system to play and change music, different kinds of enemies, a title screen, multiple characters, etc. Despite not having the time to implement to all of these systems, I still managed to get an 100 on the assignment. 

Even though they are far from perfect (I probably would it have done it much differently if I worked on it now), here are some of the highlights of the project:

## Characteristics of the Project
### Animation System
<img src ="/GitHub Resources/Sonic Intro Gif.gif" width= "1100" height = "500"/>

*Apparently Sonic doesn't like being grayscale.*

One of the topics that we covered in the Java 2 course was drawing Images, specifically using the method below:
```java
Image temp = Toolkit.getDefaultToolkit().getImage("insert path to source here");
```
However, we never went over how to create and display animations in Java. This caused me to start messing around with Toolkit to try and achieve that effect myself. After working on the issue for a few days, I was the first person in my class to implement them in Java as well as one of the few who actually had animations in their final project.

One of the highlights of this system was when I got Sonic's waiting animation to play correctly for the first time.

### Title Screen
<img src ="/GitHub Resources/Sonic Title Gif.gif" width= "1100" height = "500"/>

*Look at Sonic go!*

This is one of the aspects that I am *still* the most proud of when it comes to this project. The title screen is made of 2 main compontents- the palmtrees, and the ground. Implementing the scrolling consisted of 2 steps: shifting over the images a certain distance and then resetting them back to their original position. I added the parallax effect by shifting over the palmtrees at a slower rate.

### Continue Screen

*Try again*
<img src ="/GitHub Resources/Continue Screen Gif.gif" width= "1100" height = "500"/>

Another highlight for the project in terms of animation. Instead of having the program quit after the player died like in many of the other
projects that I saw, I decided to try and add a continue screen to allow the player to try again. The cutscene that I made takes inspiration
from other games- the part where Sonic falls down was inspired by the *Super Smash Bros* continue screen and the hand that wakes Sonic up
was influenced by the continue screen from *Kirby's Adventure*. 

### Timer
<img src = "GitHub Resources/Timer.png" width = "600" height = "250"/>

*It says what it does*

Toward the end of development, I decided to add a time and ring bonuses to the game. This meant that I needed to create a timer in order to keep track of that time. While the timer works in-game, it is not 100% accurate as its speed is based on how fast the program is being run.

### Power-Ups
<img src = "/GitHub Resources/Power Up.png" width = "351" height = "561"/> <img src = "/GitHub Resources/Shotgun.gif" width = "550" height = "250" style="margin: 0px 0px 0px 25px;"/>

<img src = "/GitHub Resources/Heavy Machine Gun.gif" width = "550" height = "250"/> 

*You probably should collect these*

Just like most other 2D platformers, this one includes a selection of power ups that Sonic can use to his advantage. They are stored in 
item monitors (just like in the *Genesis* Sonic platformers) and have to be broken in order to be accessed. In this project they include
ones from both *Sonic the Hedgehog* series and the *Metal Slug* series:
1. **Heavy Machine Gun** - taken from *Metal Slug*, allows Sonic to shoot small bullets in the direction that he is facing.
2. **Shotgun** - taken from *Metal Slug*, allows Sonic to shoot a shotgun blast in the directiont that he is facing.
3. **Ring Monitor** - taken from *Sonic the Hedgehog*, adds rings to Sonic's ring counter

### Music
One of the things that we did not go over in the Java 2 Gaming course was playing audio. These meant that the games we often created did
not have any sound to them at all. As a result, I decided to research ways I could do it on my own. 

In the end, I decided to use the 
[javax.sound.sampled](https://docs.oracle.com/javase/7/docs/api/javax/sound/sampled/package-summary.html) package, more specifically the [Clip](https://docs.oracle.com/javase/7/docs/api/javax/sound/sampled/Clip.html) class, [AudioInputStream](https://docs.oracle.com/javase/7/docs/api/javax/sound/sampled/AudioInputStream.html) class, and the [AudioSystem](https://docs.oracle.com/javase/7/docs/api/javax/sound/sampled/AudioSystem.html) class.

```java
    File musicPath = new File(music);//creates File object which has path of music file
    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
    //for bringing the music from the music file to the Java application (gets that from the musicPath object)
    clip = AudioSystem.getClip();//use clip class to play music, gets clip from AudioSystem class
    clip.open(audioInput);//opens music to clip
    clip.start();//Starts the music
```

## Controls
This game has very similar controls to most other 2D platformers. They are:
* **Left Arrow Key** - Move left
* **Right Arrow Key** - Move right
* **Down Arrow Key** - Duck
* **Z Key** - Jump
* **X Key** - Shoot Weapon (if available)
* **Y / N Key** - Select choice
* **Enter Key** - Start game (after title screen theme plays) 
