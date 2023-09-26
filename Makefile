 antlrjar = antlr-4.13.0-complete.jar

###### FOR LINUX AND MAC -- comment the following line if you use Windows:
classpath = '$(antlrjar):.'

###### FOR WINDOWS -- uncomment the following line if you use Windows:
#classpath = '$(antlrjar);.'

antlr4 = java org.antlr.v4.Tool
grun = java org.antlr.v4.gui.TestRig
GENERATED = hdlListener.java hdlBaseListener.java hdlParser.java hdlLexer.java

all:	
	make grun

hdlLexer.java:	hdl.g4
	$(antlr4) -visitor hdl.g4

hdlLexer.class:	hdlLexer.java
	javac $(GENERATED)
	
main.class:	hdlLexer.java main.java
	javac  $(GENERATED) main.java

	
run:	main.class
	java main hdl.txt


grun:	hdlLexer.class hdl.txt
	$(grun) hdl start -gui -tokens hdl.txt 
