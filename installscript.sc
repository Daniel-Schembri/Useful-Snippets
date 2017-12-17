#!/bin/bash

#Note: You can call the script by yes | ./installscript.sc to avoid pressing y all the time

# An installation script for a raw Ubuntu to install necessary coding stuff
# Can be extended

#These commands may take long (up to 1hour). After 30min or so you have to retype your password. Maybe try in sudo su mode?

#sudo apt-get update #Do this before you do install all the other stuff
#sudo apt-get upgrade #Do this before you do install all the other stuff

#Todo Yes to all!
sudo apt-get install tree
sudo apt-get install git 
sudo apt-get install gitg 
sudo apt-get install meld
sudo apt-get install vlc 
sudo apt-get install gtk2-engines-equinox 
sudo apt-get install vim 
sudo apt-get install vim-gtk 
sudo apt-get install cmake
sudo apt-get install zlib #Todo zlib maybe needs apt-update before or external src?
sudo apt-get install libtinyxml-dev
sudo apt-get install libtinyxml2-dev

#Documentation tools
sudo apt-get install graphviz
sudo apt-get install doxygen
sudo apt-get install plantuml 
sudo apt-get install asciidoc  #needs 1.1GByte!
sudo apt-get install zlib1g-dev 

sudo apt-get install libglu-dev libxi-dev
sudo apt-get install xorg-dev
sudo apt-get install freeglut3-dev
sudo apt-get install build-essential
sudo apt-get install libx11-6:i386

sudo apt-get install deluge

#latex
sudo apt-get install latex-full
sudo apt-get install texlive-full
sudo apt-get install texmaker

echo -e '\n ----- Installing coding stuff-----\n'
sudo apt-get install qt5-default 
sudo apt-get install qtcreator
sudo apt-get install eclipse eclipse-cdt 

echo -e '\n ----- Installing Miscellani (Fortune and Cowsay)-----\n'
sudo apt-get install fortune
sudo apt-get install cowsay 
echo -n > cowscript.sc
chmod +x cowscript.sc
echo -e '\n ----- Installing Miscellani-----\n'
sudo apt-get install wireshark #This program at last, because you have to select a option and it waits!

#Todos Xilinx ise, cable driver

