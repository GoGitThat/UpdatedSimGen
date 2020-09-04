This is a read me for the generatorCode.txt (which is the meat of my masters project). Unfortunately to see the code with markdown/syntax highlighting etc, there are
other tools required, so I've done my best here to guide you through it (Might write a blog post on my website sometime in the future).

The workflow of the tool is as follows:

User provides simulation properties -> generatorCode reads the properties -> generates code that can be run in Unity.

The file format of the workflow is as follows:
User provided input (.txt/regular file) -> generated code (.cs aka C#)

You've mostly likely already realized the syntax is a bit too much to take in (took me months to figure out as well), so I've annotated it with ('*****')
just search the generatorCode.txt with '*****' to find the main functions.

The generator overview is as follows:

Main generator Class:
	->Generate all the parent class definitions of all the objects the user wants
	->Generate all the class files that inherit from their parent class definitions
	->Generate the networking class depending on user need
	->Generate supporting file content (read me, variable settings file)
	->actually write out the files (IO)

The languages used are: Java (with special syntax) and C#