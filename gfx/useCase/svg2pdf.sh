#!/bin/bash

for i in *.svg
do
    #trasformo l'immagine
    p=`echo $i | sed s/\.svg/.pdf/`;
    echo $i "->" $p;
    inkscape -z "$i" -A "$p"    
done
