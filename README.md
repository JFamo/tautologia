# Tautologia
A program to minimize tautology (unnecessary repetition of words). Written mostly to help me learn Groovy.

## Installation
### Installing Groovy
I used the instructions found at http://mythruna.com/forum/index.php?topic=1001.0 for my Groovy install
This program uses **Groovy 2.5.2** and **JDK 1.8.0_121**

### Downloading Tautologia
It's not hard; use the download button on this page and unzip it.

## Using Groovy
*This section is mostly for my own reference*
### Starting the Console
Open a command prompt, and type groovyConsole

### Documentation
I referenced https://learnxinyminutes.com/docs/groovy/ and http://docs.groovy-lang.org/docs/groovy-2.4.6/html/documentation/#_adding_or_removing_elements_2 alot in making this.

## Running Tautologia
Through the Groovy Console, choose open file and select tautologia.groovy.
Use the console's run command to execute the program.

## Using Tautologia
The input will first ask for source text. This is your copy-pasted text body (probably an essay).
Next the program takes the maximum length of word to ignore. This must be an integer. If you choose 3, words like *I*, *it*, and *the* will be ignored, but *also* will not.
The final input is for the repetition threshold. This must also be an integer. This determines the number of repetitions necessary for a program to flag a word. If you choose 4 and the word *antidisestablishmentarianism* appears three times in your essay, it will not be flagged, but if it appears four times, it will.

## TO-DOs
*This section is also for me*
* Flag words in order by number of occurences
* Automatically suggest synonyms for a given word
* Have an option to ignore common words from a word bank, maybe even have a config file for this
