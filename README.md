# Java Versions - a migration strategy

Java 17 was recently released, yet moving from a previous version of Java is not as trivial as one would think. In this
presentation we will talk about challenges that one needs to be aware of and a strategy of how to safely move from one
version of Java to the next. The strategy discussed in this talk can be used with other programming languages or major
frameworks.

## Meetups

1. Remote - 23rd of November 2021 ([recording](https://thoughtworks.zoom.us/rec/play/))

## Slides

- [Java Versions - a migration strategy.pptx](/presentation/Java%20Versions%20-%20a%20migration%20strategy.pptx)
- [Java Versions - a migration strategy.pdf](/presentation/Java%20Versions%20-%20a%20migration%20strategy.pdf)

## Examples

- Is Java backwards compatible?
    - [Example of a removed Java API](/examples/is-java-backwards-compatible-api)
    - [Example of incompatible library](/examples/is-java-backwards-compatible-lib)
- A newer dependency version may not play well with other dependencies
    - [Example of incompatible libraries](/examples/newer-dependency-version-may-not-play-well-together)
- Are the tests really running?
    - [Example of tests not running by the test framework](/examples/are-the-tests-running)
- Code coverage should not change
    - [Example of false sense of security when using code coverage](/examples/code-coverage)

## Demo

- Java versions - a migration strategy
    - [The application used to migrate from Java 8 to Java 11](/examples/java-version-migration-demo)

## Feedback

Feedback makes us better. Please send any feedback to: `albert.attard@thoughtworks.com`
