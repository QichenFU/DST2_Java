DEL obj/*
javac src/*.java -d obj/
CD obj/
jar cvfe Hello.jar Main_Advanced *.class
MOVE /Y Hello.jar ..
CD ..
java -jar Hello.jar