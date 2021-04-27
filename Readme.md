# Revan
Learn a build tool, not a build crutch, by making our own using just bash and the jdk.

## Highlights
- `rvn` script that cleans, verifies, compiles, tests, and packages our application, among other tasks
- `dependencies.txt` listing URLs of required jars.
- Debug run setting appropriate log level
- Executable jar

## Usage
```bash
# set rvn as an executable
chmod +x rvn

# verify dependencies
./rvn verify

# compile and lint
./rvn compile

# run unit tests
./rvn test

# create jar manifest and executable jar
./rvn package

# clean bin folder
./rvn clean

# run bin files with debug log level
./rvn debug

# run executable jar
./rvn runjar
```

Subcommands `package`, `compile`, `test`, and `verify` are part of a build lifecycle and call each other in order. For example, `./rvn package` will `verify`, `compile`, then `test` first. Other commands can be called at the same time as the build lifecycle:

```bash
# cleans, compiles, and runs in debug mode
./rvn clean compile debug

# clean, package, and run the jar
./rvn clean package runjar
```