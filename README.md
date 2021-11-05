# Java versions - a migration strategy

Java 17 was recently released, and it reminds us that moving from a previous version of Java is not as trivial as we
might think. In this presentation, we will talk about some of the challenges, and propose a strategy for safely moving
from one version of Java to the next.

## Meetups

[![Meetup Cover](/presentation/Cover.png)](https://www.meetup.com/ThoughtWorks_Koeln/events/281888457/)

- [Remote - 23rd of November 2021 at 6:00pm (CET)](https://www.meetup.com/ThoughtWorks_Koeln/events/281888457/)

## Slides

- [Java Versions - a migration strategy.pptx](/presentation/Java%20Versions%20-%20a%20migration%20strategy.pptx)
- [Java Versions - a migration strategy.pdf](/presentation/Java%20Versions%20-%20a%20migration%20strategy.pdf)

## Examples

- Isn't Java backwards compatible?
    - [Example of a removed Java API](/examples/is-java-backwards-compatible-api)
    - [Example of incompatible library](/examples/is-java-backwards-compatible-lib)
- A newer version of a dependency may not play well with other dependencies
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
