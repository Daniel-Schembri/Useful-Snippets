#!/bin/bash

# An installation script for a raw Ubuntu to install necessary coding stuff
# Can be extended

sudo apt-get update
sudo apt-get upgrade 


#Todo Yes to all!
sudo apt-get install git 
sudo apt-get install gitg 
sudo apt-get install meld
sudo apt-get install vlc 
sudo apt-get install gtk2-engines-equinox 
sudo apt-get install wireshark
sudo apt-get install vim 
sudo apt-get install vim-gtk 
sudo apt-get install cmake
sudo apt-get install zlib #Todo zlib maybe needs apt-update before or external src?
sudo apt-get install libtinyxml-dev
sudo apt-get install libtinyxml2-dev

sudo apt-get install deluge 

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

#Todos Xilinx ise, cable driver

