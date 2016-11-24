#/bin/bash
# add this script to your .bashrc to get the legendary cowscript
RANGE=13

number=$RANDOM
let "number %= $RANGE"
case $number in
    0)
        cow="apt"
        ;;
    1)
        cow="tux"
        ;;
    2)
        cow="koala"
        ;;
    3)
        cow="head-in"
        ;;
    4)
        cow="gnu"
        ;;
    5)
        cow="ghostbusters"
        ;;
    6)
        cow="flaming-sheep"
        ;;
    7)
        cow="elephant"
        ;;
    8)
        cow="duck"
        ;;
    9)
        cow="eyes"
        ;;
    10)
        cow="dragon-and-cow"
        ;;
    11)
        cow="bong"
        ;;
    12)
        cow="kosh"
        ;;
esac

fortune | cowsay -f $cow
