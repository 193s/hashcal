build: src
	scalac -d bin src/HashCal.scala

install: bin
	cp -r out/* /usr/local/bin/hashcal
	cp -r bin/* /usr/local/bin/hashcal_

clean: bin
	rm -rf bin
	mkdir bin
