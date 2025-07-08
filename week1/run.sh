#!/bin/bash
SRC="src"
BIN="bin"
MAIN="Main"

mkdir -p "$BIN"

# Compile semua file .java dari src
find "$SRC" -name "*.java" | xargs javac -d "$BIN" &&
java -cp "$BIN" "$MAIN"
