build: src
	scalac -d bin src/HashCal.scala

install: bin
	cp out/hashcal /usr/local/bin/hashcal
	cp -r bin /usr/local/bin/hashcal_
