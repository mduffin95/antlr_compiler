all:
	./antlr3 Lex.g
	./antlr3 Syn.g
	javac TokenConv.java
	java TokenConv Syn.tokens Irt.java
	./antlr3 *.java
	./antlr3 camle testsk.w
	./antlr3 camle test1.w
	./antlr3 camle test2.w
	./antlr3 camle test3.w
	./antlr3 camle test4.w
	./antlr3 camle test5.w
	./antlr3 camle test6.w
	./antlr3 camle test7.w
	./assmule testsk.ass
	./assmule test1.w
	./assmule test2.w
	./assmule test3.w
	./assmule test4.w
	./assmule test5.w
	./assmule test6.w
	./assmule test7.w

clean:
	rm -f *.class
	rm -f *.txt
	rm -f *.tokens
	rm -f *.ass
	rm -f Lex.java
	rm -f Syn.java
