package com.test.cucumber.runner;

import io.cucumber.core.cli.Main;
import io.cucumber.core.snippets.SnippetType;
import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

@Slf4j
public class CucumberTestRunner {

    private static final String[] DEFAULT_OPTIONS = {
            "--glue", "com.test.cucumber.config",
            "--glue", "com.test.cucumber.steps",
            "--plugin", "pretty",
            "--plugin", "json:target/cucumber-reports/cucumber.json",
            "--snippets", SnippetType.CAMELCASE.name().toLowerCase()
    };

    public static void main(String[] args) {
        Stream<String> cucumberOptions = Stream.concat(Stream.of(DEFAULT_OPTIONS), Stream.of(args));

        log.info("-------------------------------------- START -----------------------------------------");

        byte exitCode = Main.run(cucumberOptions.toArray(String[]::new), Thread.currentThread().getContextClassLoader());

        log.info("--------------------------------------- END ------------------------------------------");

        System.exit(exitCode);
    }
}
