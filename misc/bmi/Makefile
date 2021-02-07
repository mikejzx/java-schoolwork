PROJECT = BMI

JAVAC = javac
SRC = $(wildcard *.java)
CLASSES = $(SRC:.java=.class)

all: run

run: $(CLASSES)
	@java $(PROJECT)

clean:
	rm -f *.class

%.class: %.java
	@$(JAVAC) $<

.PHONY: all clean
