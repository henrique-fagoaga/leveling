#!/bin/bash
case $1 in
  "--v")
    JDK_VERSION=$1
    shift $1
    ;;
  *)
    JDK_VERSION="jdk1.8.0_171"
    ;;
esac

exec 'C:\Program Files\Java\'$JDK_VERSION'\bin\javac.exe' $@
