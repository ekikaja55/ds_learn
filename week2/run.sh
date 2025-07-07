#!/bin/bash
SRC="src"
BIN="bin"
MAIN="Main"

mkdir -p "$BIN"
javac -d "$BIN" "$SRC/$MAIN.java" && java -cp "$BIN" "$MAIN"
